import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LeaveComponent} from "../modules/request/leave/leave.component";
import {DashbordComponent} from "../modules/dashbord/dashbord.component";
import {EmployeeComponent} from "../modules/employee/employee.component";

const routes: Routes = [
  {
    path: '',
    component: DashbordComponent
  },
  {
    path: 'employee',
    component: EmployeeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
