import {Component, EventEmitter, Input, Output} from "@angular/core";

@Component({
  selector: 'request',
  templateUrl: 'request.component.html'
})
export class RequestComponent {
  @Input() displayBasic = false;
  @Input() selectedType: string;
  @Output() closeTab = new EventEmitter<boolean> ();

  showBasicDialog() {
    this.displayBasic = !this.displayBasic;
  }
}
