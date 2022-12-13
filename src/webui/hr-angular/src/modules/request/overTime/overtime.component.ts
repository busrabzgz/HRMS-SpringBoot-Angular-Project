import {Component, EventEmitter, Input, OnInit, Output} from "@angular/core";
import {Overtime} from "../../../models/overtime.model";
import {OvertimeService} from "../../../services/overtime.service";


@Component({
  selector:"overtime",
  templateUrl:"overtime.component.html",
  styleUrls:["overtime.component.css"]
})
export class OvertimeComponent implements OnInit{
  displayBasic = false;
  date7: any;
  value1: any;
  @Input() createRequest: string;
  @Output() createdRequestDone = new EventEmitter<string>();
  duration: any;
  startOfDate: any;
  description: any;

  constructor(private overtimeService: OvertimeService ) {

  }



  ngOnInit(): void {
  }
  showBasicDialog() {
    this.displayBasic=!this.displayBasic;

  }

  createOvertime(){
    const overtime: Overtime = {
      // type:this.selectedovertimeType,
      duration:this.duration,
      startOfDate:new Date(this.startOfDate),
      description:this.description,
      userId:52


    };
    this.overtimeService.createOvertime(overtime).subscribe(res => {
      console.log(res.body);
    });
    this.createdRequestDone.emit('');
  }

  ngOnChanges(changes: any) {
    debugger;
    console.log(changes);
    if (changes.createRequest.currentValue == 'send') {
      console.log('changes');
      this.createOvertime();
    }
  }



}
