import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {ProductDto} from '../models/product.model';


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private readonly http: HttpClient) {
  }

  getProducts(): Observable<ProductDto> {
    return this.http.get<ProductDto>('/product-api/products');
  }
}
