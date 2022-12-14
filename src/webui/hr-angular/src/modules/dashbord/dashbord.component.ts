import {Component, OnInit} from '@angular/core';
import {DashboardService} from "../../services/dashboard.service";

@Component({
  selector: 'app-dashbord',
  templateUrl: './dashbord.component.html',
  styleUrls: ['./dashbord.component.css']
})
export class DashbordComponent implements OnInit{
  date14: any;
  upComingBirthDays: any;

  constructor(private dashboarsService: DashboardService) {
  }

  ngOnInit(): void {
    this.dashboarsService.getEmployeesBirthday().subscribe(res => {
      this.upComingBirthDays = res.body;
      console.log(this.upComingBirthDays)
    });
  }


}
