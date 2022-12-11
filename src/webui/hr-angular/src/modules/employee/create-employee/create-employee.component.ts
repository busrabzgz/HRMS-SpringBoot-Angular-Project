import {Component, EventEmitter, Output} from "@angular/core";
import {User} from "../../../models/user.model";
import {EmployeeService} from "../../../services/employee.service";

@Component({
  selector: 'create-employee',
  templateUrl: 'create-employee.component.html',
  styleUrls: ['create-employee.component.css']
})
export class CreateEmployeeComponent{
  displayBasic = true;
  @Output() closeTab = new EventEmitter<boolean> ();
  leaveType: any;
  selectedLeaveType: any;
  val1: string;
  val2: string;
  val5: string;
  val6: string;
  genderType=[{name: 'Kadın', json: 200}, {name: 'Erkek', json: 200}, {name: 'Cinsiyet Belirtmek İstemiyorum', json: 200},]
  positionType=[{name: 'Backend Developer', json: 200}, {name: 'Frontend Developer', json: 200}, {name: 'Ios Developer', json: 200}, {name: 'Android Developer', json: 200},]
  levelType=[{name: 'Junior', json: 200}, {name: 'Mid-Level', json: 200}, {name: 'Senior', json: 200},]
  departmentType=[{name: 'Yönetim', json: 200}, {name: 'Finans', json: 200}, {name: 'İnsan Kaynakları', json: 200}, {name: 'Bilişim Teknolojileri', json: 200},]
  department:string;
  email: string;
  firstName: string;
  lastName: string;
  citizenNumber: string;
  gender: string;
  birthDay: string;
  position: string;
  level: string;
  workStartDate: string;
  phoneNumber: string;
  address: string;
  salary: number;

  constructor(private userService: EmployeeService) {
  }

  createUser() {
    const user: User = {
      firstName: this.firstName,
      lastName: this.lastName,
      citizenNumber: this.citizenNumber,
      gender: this.gender,
      email: this.email,
      address: this.address,
      department: this.department,
      level: this.level,
      phoneNumber: this.phoneNumber,
      position: this.position,
      birthOfDate: this.birthDay,
      salary: this.salary,
      startToWork: this.workStartDate,
    };

    this.userService.createUser(user).subscribe(user => {
      console.log(user);
    });
    console.log();

    this.closeTab.emit(false);
  }
}
