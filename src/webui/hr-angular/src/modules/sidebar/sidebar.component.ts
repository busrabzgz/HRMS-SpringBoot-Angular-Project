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
  showPopUpRequest = false;
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
                    this.showPopUpRequest = true;
                    this.selectedType = 'leave';
                    console.log('selected', this.selectedType);
                  }
                },
                {
                  label: 'Avans',
                  icon: 'pi pi-money-bill',
                  command: event => {
                    this.showPopUpRequest = true;
                    this.selectedType = 'advance';
                    console.log('selected', this.selectedType);
                  }
                },
                {
                  label: 'Harcama',
                  icon: 'pi pi-cart-plus',
                  command: event => {
                    this.showPopUpRequest = true;
                    this.selectedType = 'expense';
                    console.log('selected', this.selectedType);
                  }
                },
                {
                  label: 'Fazla Mesai',
                  icon: 'pi pi-chart-pie',
                  command: event => {
                    this.showPopUpRequest = true;

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
      },
    ];
  }


}
