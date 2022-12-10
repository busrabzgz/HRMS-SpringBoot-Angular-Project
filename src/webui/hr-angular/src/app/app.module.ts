import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {APP_PRIMENG_PROVIDERS, AppPrimengModule} from "../shared/app-primeng.module";
import {SidebarComponent} from "../modules/sidebar/sidebar.component";
import {MegaMenuModule} from "primeng/megamenu";
import {LeaveComponent} from "../modules/request/leave/leave.component";
import {TooltipModule} from "primeng/tooltip";
import {RequestComponent} from "../modules/request/request.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {AdvanceComponent} from "../modules/request/advance/advance.component";
import {InputNumberModule} from "primeng/inputnumber";
import {ExpenseComponent} from "../modules/request/expense/expense.component";
import {DashbordComponent} from "../modules/dashbord/dashbord.component";

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    LeaveComponent,
    RequestComponent,
    AdvanceComponent,
    ExpenseComponent,
    DashbordComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    AppPrimengModule,
    MegaMenuModule,
    TooltipModule,
    FormsModule,
    InputNumberModule,

  ],
  providers: [
    APP_PRIMENG_PROVIDERS
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
