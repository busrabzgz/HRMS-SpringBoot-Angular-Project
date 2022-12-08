import {Component, OnInit} from "@angular/core";
import {MegaMenuItem} from "primeng/api";
import {ActivatedRoute, Router} from "@angular/router";


@Component({
  selector: 'dashboard',
  templateUrl: 'dashboard.component.html',
  styleUrls: ['dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  items: MegaMenuItem[];

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
                    this.route.navigate(['/leave']);
                  }
                },
                {
                  label: 'Avans',
                  icon: 'pi pi-money-bill'
                },
                {
                  label: 'Harcama',
                  icon:'pi pi-cart-plus'
                },
                {
                  label: 'Fazla Mesai',
                  icon:'pi pi-chart-pie'
                },
              ]
            }
          ]
        ]
      },
      {
        label: 'Anasayfa', icon: 'pi pi-fw pi-th-large',
        items: [
          [
            {
              label: 'User 1',
              items: [{label: 'User 1.1'}, {label: 'User 1.2'}]
            },
            {
              label: 'User 2',
              items: [{label: 'User 2.1'}, {label: 'User 2.2'}]
            },
          ],
          [
            {
              label: 'User 3',
              items: [{label: 'User 3.1'}, {label: 'User 3.2'}]
            },
            {
              label: 'User 4',
              items: [{label: 'User 4.1'}, {label: 'User 4.2'}]
            }
          ],
          [
            {
              label: 'User 5',
              items: [{label: 'User 5.1'}, {label: 'User 5.2'}]
            },
            {
              label: 'User 6',
              items: [{label: 'User 6.1'}, {label: 'User 6.2'}]
            }
          ]
        ]
      },
      {
        label: 'Çalışanlar', icon: 'pi pi-fw pi-users',
      },
    ];
  }

}
