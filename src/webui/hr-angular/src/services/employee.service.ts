import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {User} from "../models/user.model";

@Injectable({providedIn: 'root'})
export class EmployeeService {
  baseUrl = 'http://localhost:8080/api/users';
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

  createUser(user: User) {
    const options = this.createRequestOption();
    return this.http.post(this.baseUrl + '/create', user, {params: options, observe: 'response'});
  }
}
