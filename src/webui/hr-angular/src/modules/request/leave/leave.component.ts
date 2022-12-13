import {Component, EventEmitter, Input, OnInit, Output, SimpleChange} from "@angular/core";
import {TooltipModule} from 'primeng/tooltip';
import {RequestService} from "../../../services/request.service";
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
    {name: 'Babalık İzni', json: 200},
    {name: 'Doğum Günü İzni', json: 200},
    {name: 'Doğum Sonrası İzni', json: 200},
    {name: 'Evlik İzni', json: 200},
    {name: 'Hastalık İzni', json: 200},
    {name: 'İş Arama İzni', json: 200},
    {name: 'Mazaret İzni', json: 200},
    {name: 'Süt İzni', json: 200},
    {name: 'Ücretsiz İzin', json: 200},
    {name: 'Vefat İzni', json: 200},
    {name: ' Yıllık İzin', json: 200},
    {name: ' Yol İzni', json: 200},
    {name: 'Diğer', json: 200},
  ]
  selectedLeaveType: any;
  value3: any;
  startOfLeave: any;
  endOfLeave: any;
  dateOfReturn: any;
  description: any;

  constructor(private leaveService: RequestService ) {

  }

  ngOnInit(): void{
  }

  createLeave(){
    const leave: Leave = {
      type:this.selectedLeaveType,
      startOfLeave: new  Date (this.startOfLeave),
      endOfLeave: new Date(this.endOfLeave),
      dateOfReturn:new Date (this.dateOfReturn),
      userId: 52,
      totalDays: this.endOfLeave - this.startOfLeave,
      description:this.description
    };
    this.leaveService.createLeave(leave).subscribe(res => {
      console.log(res.body);
    });
    this.createdRequestDone.emit('');
  }

  ngOnChanges(changes: any) {
    debugger;
    console.log(changes);
    if (changes.createRequest.currentValue == 'send') {
      console.log('changes');
      this.createLeave();
    }
  }


}
