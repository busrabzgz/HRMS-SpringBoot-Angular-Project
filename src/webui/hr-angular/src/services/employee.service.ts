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
    const options = this.createRequestOption({});
    return this.http.post(this.baseUrl + '/create', user, {params: options, observe: 'response'});
  }

  getUserById(id: number) {
    const options = this.createRequestOption({});
    return this.http.get(this.baseUrl + '/' + id, {params: options, observe: 'response'});
  }

  getAllUsersByPageable(pageable: any) {
    const options = this.createRequestOption({pageable});
    return this.http.get(this.baseUrl + '/getAllUsers', {params: options, observe: 'response'});
  }

  getUserExpense(id: number) {
    const options = this.createRequestOption({id});
    return this.http.get(this.baseUrl + '/expense', {params: options, observe: 'response'});
  }

  getUserLeave(id: number) {
    const options = this.createRequestOption({id});
    return this.http.get(this.baseUrl + '/leave', {params: options, observe: 'response'});
  }

  getUserAdvance(id: number) {
    const options = this.createRequestOption({id});
    return this.http.get(this.baseUrl + '/advance', {params: options, observe: 'response'});
  }

  getUserOvertimeWork(id: number) {
    const options = this.createRequestOption({id});
    return this.http.get(this.baseUrl + '/overtimeWork', {params: options, observe: 'response'});
  }
}
