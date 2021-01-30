import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private readonly http: HttpClient) { }

  getServerName(): Observable<any> {
    return this.http.get('/order-api/server-name');
  }

  getOrders(): Observable<any> {
    return this.http.get('/order-api/orders');
  }
}
