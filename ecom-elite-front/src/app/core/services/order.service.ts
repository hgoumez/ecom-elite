import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {OrderDto} from '../models/order.model';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private readonly http: HttpClient) {
  }

  getOrders(): Observable<OrderDto> {
    return this.http.get<OrderDto>('/order-api/orders');
  }
}
