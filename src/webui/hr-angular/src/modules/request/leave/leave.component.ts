import {Component, OnInit} from "@angular/core";
import {TooltipModule} from 'primeng/tooltip';

@Component({
  selector: 'leave',
  templateUrl: 'leave.component.html',
  styleUrls: ['leave.component.css']
})
export class LeaveComponent implements OnInit{
  displayBasic = false;
  leaveType = [
    {name: 'Diğer', json: 200},
    {name: 'Askerlik İzni', json: 200},
    {name: 'Babalık İzni', json: 200},
    {name: 'Diğer', json: 200},
    {name: 'Diğer', json: 200},
  ]
  selectedLeaveType: any;

  ngOnInit(): void{


  }



  showBasicDialog() {
    this.displayBasic=!this.displayBasic;

  }


}
