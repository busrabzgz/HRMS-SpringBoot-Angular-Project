import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {APP_PRIMENG_PROVIDERS, AppPrimengModule} from "../shared/app-primeng.module";
import {DashboardComponent} from "../modules/dashboard/dashboard.component";
import {MegaMenuModule} from "primeng/megamenu";
import {LeaveComponent} from "../modules/request/leave/leave.component";
import {TooltipModule} from "primeng/tooltip";
import {RequestComponent} from "../modules/request/request.component";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    LeaveComponent,
    RequestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AppPrimengModule,
    MegaMenuModule,
    TooltipModule,
    FormsModule,

  ],
  providers: [
    APP_PRIMENG_PROVIDERS
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
