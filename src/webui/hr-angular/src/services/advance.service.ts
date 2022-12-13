import {HttpClient, HttpParams} from "@angular/common/http";
import {Injectable, Query} from "@angular/core";
import {Advance} from "../models/advance.model";


@Injectable({providedIn: "root"})
export class AdvanceService {
  baseUrl = 'http://localhost:8080/api/advance';

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

  createAdvance(advance: Advance) {
    const options = this.createRequestOption({});
    return this.http.post(this.baseUrl + '/create', advance, {params: options, observe: 'response'});

  }


}
