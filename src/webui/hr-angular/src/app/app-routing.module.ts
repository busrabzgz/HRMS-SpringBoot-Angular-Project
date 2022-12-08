import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LeaveComponent} from "../modules/request/leave/leave.component";

const routes: Routes = [
  {
    path: 'leave',
    component: LeaveComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
