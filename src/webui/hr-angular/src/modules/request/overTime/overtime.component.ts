import {Component, OnInit} from "@angular/core";

@Component({
  selector:"overtime",
  templateUrl:"overtime.component.html",
  styleUrls:["overtime.component.css"]
})
export class OvertimeComponent implements OnInit{
  displayBasic = false;
  date7: any;
  value1: any;
  ngOnInit(): void{


  }
  showBasicDialog() {
    this.displayBasic=!this.displayBasic;

  }


}
