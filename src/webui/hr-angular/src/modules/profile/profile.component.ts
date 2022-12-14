import {Component, OnInit} from '@angular/core';
import {User} from "../../models/user.model";
import {EmployeeService} from "../../services/employee.service";
import {MenuItem} from "primeng/api";
import {AdvanceService} from "../../services/advance.service";
import {ExpenseService} from "../../services/expence.service";

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit{
  user: any;
  activeItem: any;
  items: MenuItem[];
  leaves: any;
  advances: any;
  expenses: any;
  overtimes: any;

  constructor(private userService: EmployeeService,
              private advanceService: AdvanceService,
              private expenseService: ExpenseService,
              private employeeService: EmployeeService) {
  }

  ngOnInit(): void {
    this.userService.getUserById(1).subscribe(res => {
      this.user = res.body;
    });
    this.userService.getUserExpense(1).subscribe(res => {
      this.expenses = res.body;
    });
    this.userService.getUserOvertimeWork(1).subscribe(res => {
      this.overtimes = res.body;
    });
    this.userService.getUserAdvance(1).subscribe(res => {
      this.advances = res.body;
    });
    this.userService.getUserLeave(1).subscribe(res => {
      this.leaves = res.body;
    });
    this.items = [
      {label: 'Home', icon: 'pi pi-fw pi-home'},
      {label: 'Calendar', icon: 'pi pi-fw pi-calendar'},
      {label: 'Edit', icon: 'pi pi-fw pi-pencil'},
      {label: 'Documentation', icon: 'pi pi-fw pi-file'},
      {label: 'Settings', icon: 'pi pi-fw pi-cog'}
    ];
  }

  denem(event: any) {
    console.log(event)
    console.log(this.activeItem)
  }

  itemClick(param: any, index: any) {

  }
}
