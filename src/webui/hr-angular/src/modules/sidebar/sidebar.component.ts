import {Component, OnInit} from "@angular/core";
import {MegaMenuItem} from "primeng/api";
import {ActivatedRoute, Router} from "@angular/router";


@Component({
  selector: 'sidebar',
  templateUrl: 'sidebar.component.html',
  styleUrls: ['sidebar.component.css']
})
export class SidebarComponent implements OnInit {
  items: MegaMenuItem[];
  showPopUpRequest: boolean;
  selectedType: string;

  constructor(private route: Router) {

  }

  ngOnInit(): void {
    this.items = [
      {
        label: 'Talep', icon: 'pi pi-fw pi-plus',
        items: [
          [
            {
              label: 'Talepler',
              items: [
                {
                  label: 'İzin',
                  icon: 'pi pi-shopping-bag',
                  command: event => {
                    this.selectedType = 'İzin Talep Et';
                    this.showPopUpRequest = true;
                    console.log('selected', this.selectedType);
                  }
                },
                {
                  label: 'Avans',
                  icon: 'pi pi-money-bill',
                  command: event => {
                    this.selectedType = 'Avans Talep Et';
                    this.showPopUpRequest = true;
                    console.log('selected', this.selectedType);
                  }
                },
                {
                  label: 'Harcama',
                  icon: 'pi pi-cart-plus',
                  command: event => {
                    this.selectedType = 'Harcama Talep Et';
                    this.showPopUpRequest = true;
                    console.log('selected', this.selectedType);
                  }
                },
                {
                  label: 'Fazla Mesai',
                  icon: 'pi pi-chart-pie',
                  command: event => {
                    this.selectedType='Fazla Mesai Talep Et';
                    this.showPopUpRequest = true;
                    console.log('selected',this.selectedType);

                  }
                },
              ]
            }
          ]
        ]
      },
      {
        label: 'Anasayfa', icon: 'pi pi-fw pi-th-large',
        command: event => {
          this.route.navigate(['/']);
        }
      },
      {
        label: 'Çalışanlar', icon: 'pi pi-fw pi-users',
        command: event => {
          this.route.navigate(['/employee']);
        }
      },
      {
        label: 'Profilim', icon: 'pi pi-user',
        command: event => {
          this.route.navigate(['/profile']);
        }
      },
    ];
  }


}
