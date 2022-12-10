import {Component, OnInit} from "@angular/core";
import {TooltipModule} from 'primeng/tooltip';

@Component({
  selector: 'leave',
  templateUrl: 'leave.component.html',
  styleUrls: ['leave.component.css']
})
export class LeaveComponent implements OnInit{
  displayBasic = false;
  leaveDay = 2;
  leaveType = [

    {name: 'Askerlik İzni', json: 200},
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
  date7: any;


  ngOnInit(): void{


  }



  showBasicDialog() {
    this.displayBasic=!this.displayBasic;

  }


}
