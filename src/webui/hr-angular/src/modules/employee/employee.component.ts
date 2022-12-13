import {Component, OnInit} from "@angular/core";
import {EmployeeService} from "../../services/employee.service";
import {User} from "../../models/user.model";


@Component({
  selector:"employee",
  templateUrl: "employee.component.html",
  styleUrls:["employee.component.css"]
})
export class EmployeeComponent implements OnInit{
  users: any;

  sortOptions: any[];

  sortOrder: number;

  sortField: string;
  sortKey: any;
  showCreateEmployeePopUp = false;

  constructor(private employeeService: EmployeeService) {
  }

  onSortChange($event: any) {

  }

  ngOnInit(): void {
    this.employeeService.getAllUsersByPageable({size: 10, page: 0}).subscribe(res => {
      this.users = res.body;
    })
  }

}
