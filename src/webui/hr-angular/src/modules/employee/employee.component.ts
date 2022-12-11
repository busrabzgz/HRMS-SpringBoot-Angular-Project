import {Component} from "@angular/core";


@Component({
  selector:"employee",
  templateUrl: "employee.component.html",
  styleUrls:["employee.component.css"]
})
export class EmployeeComponent {
  products: any[];

  sortOptions: any[];

  sortOrder: number;

  sortField: string;
  sortKey: any;
  showCreateEmployeePopUp = false;

  onSortChange($event: any) {

  }

}
