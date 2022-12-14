import {Component, EventEmitter, Input, OnInit, Output, SimpleChange} from "@angular/core";
import {TooltipModule} from 'primeng/tooltip';
import {LeaveService} from "../../../services/leave.service";
import {Leave} from "../../../models/leave.model";

@Component({
  selector: 'leave',
  templateUrl: 'leave.component.html',
  styleUrls: ['leave.component.css']
})
export class LeaveComponent implements OnInit{
  displayBasic = false;
  @Input() createRequest: string;
  @Output() createdRequestDone = new EventEmitter<string>();
  leaveDay = 0;
  leaveType = [

    {name: 'Askerlik İzni', json: "MILITARY_LEAVE"},
    {name: 'Babalık İzni', json: "PATERNITY_LEAVE"},
    {name: 'Doğum Günü İzni', json: "BIRTHDAY_LEAVE"},
    {name: 'Doğum Sonrası İzni', json: "MATERNITY_LEAVE"},
    {name: 'Evlik İzni', json: "MARRIAGE_lEAVE"},
    {name: 'Hastalık İzni', json: "MEDICAL_LEAVE"},
    {name: 'İş Arama İzni', json: "LOOKING_FOR_A_JOB_LEAVE"},
    {name: 'Mazaret İzni', json: "COMPASSIONATE_LEAVE"},
    {name: 'Hamilelik İzni', json: "PREGNANT_LEAVE"},
    {name: 'Ücretsiz İzin', json: "UNPAID_LEAVE"},
    {name: 'Vefat İzni', json: "DEATH_LEAVE"},
    {name: ' Yıllık İzin', json: "ANNUAL_LEAVE"},
    {name: ' Yol İzni', json: "ROAD_LEAVE"},
    {name: 'Diğer', json: "OTHER_LEAVE"},
  ]
  selectedLeaveType: any;
  value3: any;
  startOfLeave: any;
  endOfLeave: any;
  dateOfReturn: any;
  description: any;

  constructor(private leaveService: LeaveService ) {

  }

  ngOnInit(): void{
  }

  createLeave(){
    const leave: Leave = {
      type:this.selectedLeaveType,
      startOfLeave: new  Date (this.startOfLeave),
      endOfLeave: new Date(this.endOfLeave),
      dateOfReturn:new Date (this.dateOfReturn),
      userId: 1,
      totalDays: this.endOfLeave - this.startOfLeave,
      description:this.description
    };
    this.leaveService.createLeave(leave).subscribe(res => {
      console.log(res.body);
    });
    this.createdRequestDone.emit('');
  }

  ngOnChanges(changes: any) {
    console.log(changes);
    if (changes.createRequest.currentValue == 'send') {
      console.log('changes');
      this.createLeave();
    }
  }


}
