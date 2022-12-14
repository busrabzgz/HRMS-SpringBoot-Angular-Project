import {HttpClient, HttpParams} from "@angular/common/http";
import {Injectable, Query} from "@angular/core";

import {Expense} from "../models/expense.model";

@Injectable({providedIn: "root"})
export class ExpenseService {
  baseUrl = 'http://localhost:8080/api/expense';

  constructor(private http: HttpClient) {
  }

  createRequestOption = (req?: any): HttpParams => {
    let options: HttpParams = new HttpParams();
    if (req) {
      Object.keys(req).forEach((key) => {
        if (key !== 'sort') {
          options = options.set(key, req[key]);
        }
      });
      if (req.sort) {
        req.sort.forEach((val: any) => {
          options = options.append('sort', val);
        });
      }
    }
    return options;
  }

  createExpense(expense: Expense) {
    const options = this.createRequestOption({});
    return this.http.post(this.baseUrl + '/create', expense, {params: options, observe: 'response'});

  }
}
