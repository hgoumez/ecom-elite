import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { OrderService } from './services/order.service';
import { ProductService } from './services/product.service';
import { first } from 'rxjs/operators'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  products$: Observable<any>;
  orders$: Observable<any>;
  name$: Observable<any>;

  constructor(private readonly productService: ProductService,private readonly orderService: OrderService) {}

  ngOnInit() {
    this.products$ = this.productService.getProducts().pipe(first());
    this.orders$ = this.orderService.getOrders().pipe(first());
    this.name$ = this.orderService.getServerName().pipe(first());
  }
}
