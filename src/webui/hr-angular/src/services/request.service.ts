import {HttpClient, HttpParams} from "@angular/common/http";
import {Injectable, Query} from "@angular/core";
import {User} from "../models/user.model";
import {Leave} from "../models/leave.model";

@Injectable({providedIn: "root"})
export class RequestService {
  baseUrl = 'http://localhost:8080/api/leave';

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

  createLeave(leave: Leave) {
    const options = this.createRequestOption({});
    return this.http.post(this.baseUrl + '/create', leave, {params: options, observe: 'response'});

  }


}
