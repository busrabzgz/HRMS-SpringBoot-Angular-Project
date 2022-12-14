import {Component, EventEmitter, Input, OnInit, Output, SimpleChange} from "@angular/core";
import {TooltipModule} from 'primeng/tooltip';
import {AdvanceService} from "../../../services/advance.service";
import {Advance} from "../../../models/advance.model";

@Component({
  selector: "advance",
  templateUrl: "advance.component.html",
  styleUrls: ["advance.component.css"]
})
export class AdvanceComponent implements OnInit {
  displayBasic = false;
  value1: any;
  amount: any;
  date: any;
  description: any;
  @Input() createRequest: string;
  @Output() createdRequestDone = new EventEmitter<string>();


  constructor(private advanceService: AdvanceService) {

  }

  ngOnInit(): void {

  }
  createAdvance(){
    const advance: Advance = {
      // type:this.selectedadvanceType,
      amount:this.amount,
      date:new Date(this.date),
      description:this.description,
      userId:1


    };
    this.advanceService.createAdvance(advance).subscribe(res => {
      console.log(res.body);
    });
    this.createdRequestDone.emit('');
  }

  ngOnChanges(changes: any) {
    debugger;
    console.log(changes);
    if (changes.createRequest.currentValue == 'send') {
      console.log('changes');
      this.createAdvance();
    }
  }

  showBasicDialog() {
    this.displayBasic = !this.displayBasic;

  }


}
