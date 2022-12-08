import {Component} from "@angular/core";

@Component({
  selector: 'request',
  templateUrl: 'request.component.html'
})
export class RequestComponent {
  displayBasic=false;

  showBasicDialog() {
    this.displayBasic = !this.displayBasic;
  }
}
