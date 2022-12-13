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
  departmentType=[{name: 'Yönetim', json: "SOFTWARE_DEVELOPMENT"}, {name: 'Finans', json: 200}, {name: 'İnsan Kaynakları', json: 200}, {name: 'Bilişim Teknolojileri', json: 200},]
  department = 'bilgisay';
  email= 'bilgisay';
  firstName= 'bilgisay';
  lastName= 'bilgisay';
  citizenNumber= 'bilgisay';

  gender= 'bilgisay';
  birthDay= '13/12/2022';
  position= 'bilgisay';
  level= 'bilgisay';
  workStartDate= '01/12/1222';
  phoneNumber= 'bilgisay';
  address= 'bilgisay';
  salary= 12;

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
      birthOfDate: new Date(this.birthDay),
      salary: this.salary,
      startToWork: new Date(this.workStartDate),
    };

    this.userService.createUser(user).subscribe(user => {
      console.log(user);
    });
    console.log();

    this.closeTab.emit(false);
  }
}
