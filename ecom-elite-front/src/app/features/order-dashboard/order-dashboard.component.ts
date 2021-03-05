import { Component, OnInit } from '@angular/core';
import {OrderService} from 'src/app/core/services/order.service';

@Component({
  selector: 'app-order-dashboard',
  templateUrl: './order-dashboard.component.html',
  styleUrls: ['./order-dashboard.component.scss']
})
export class OrderDashboardComponent implements OnInit {

  rows: any = [];
  columns: any = [];

  public totalElements: number;
  public pageNumber: number;
  public size: number;

  constructor(private orderService: OrderService) {

  }

  id: number;
  price: number;
  name: string;
  description: string;
  hostName: string;

  ngOnInit(): void {

    this.initColumns();
    this.orderService.getOrders().subscribe(data => {
      this.rows = data.orderList;
      this.totalElements = data.orderList.length;
      this.size = 10;
      this.pageNumber = 0;
      this.hostName = data.hostName;
    })
  }

  initColumns() {
    this.columns = [
      {prop: 'id', name: 'id'},
      {prop: 'productId', name: 'Id du Produit'},
      {prop: 'customerLastName', name: 'Nom'},
      {prop: 'customerFirstName', name: 'Prénom'},
      {prop: 'amount', name: 'Quantité'}
    ]
  }


}
