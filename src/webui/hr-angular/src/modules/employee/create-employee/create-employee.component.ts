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
  genderType=[{name: 'Kadın', json: "WOMEN"}, {name: 'Erkek', json: "MAN"}, {name: 'Cinsiyet Belirtmek İstemiyorum', json: "OTHER"},]
  positionType=[{name: 'Backend Developer', json: "BACKEND_DEVELOPER"}, {name: 'Frontend Developer', json: "FRONTEND_DEVELOPER"}, {name: 'Ios Developer', json: "IOS_DEVELOPER"}, {name: 'Android Developer', json: "ANDROID_DEVELOPER"},]
  levelType=[{name: 'Junior', json: "JUNIOR"}, {name: 'Mid-Level', json: "JUNIOR"}, {name: 'Senior', json: "JUNIOR"},]
  departmentType=[{name: 'Yönetim', json: "MANAGEMENT_DEPARTMENT"}, {name: 'Finans', json: "FINANCE_DEPARTMENT"}, {name: 'İnsan Kaynakları', json: "HUMAN_RESOURCES_DEPARTMENT"}, {name: 'Bilişim Teknolojileri', json: "INFORMATION_TECHNOLOGIES_DEPARTMENT"},]
  department = 'bilgisay';
  email= 'busrabozgoz@gmail.com';
  firstName= 'Büşra';
  lastName= 'Bozgöz';
  citizenNumber= '11724078190';

  gender= 'kadın';
  birthDay= '13/12/2022';
  position= 'backend';
  level= 'bilgisay';
  workStartDate= '01/12/1222';
  phoneNumber= '5370140702';
  address= 'Aksaray';
  salary= 10000;

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
