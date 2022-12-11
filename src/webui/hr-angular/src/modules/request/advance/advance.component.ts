import {Component, OnInit} from "@angular/core";

@Component({
  selector:"advance",
  templateUrl:"advance.component.html",
  styleUrls:["advance.component.css"]
})
export class AdvanceComponent implements OnInit{
  displayBasic = false;
  value1: any;
  date7: any;

  ngOnInit(): void{

  }
  showBasicDialog() {
    this.displayBasic=!this.displayBasic;

  }


}
