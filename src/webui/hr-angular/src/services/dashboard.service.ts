import {Injectable} from "@angular/core";
import {HttpClient, HttpParams} from "@angular/common/http";

@Injectable({providedIn: 'root'})
export class DashboardService {
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

  getEmployeesBirthday() {
    const option = this.createRequestOption();
    return this.http.get(this.baseUrl + '/getEmployeesBirthday', {params: option, observe: "response"})
  }
}
