export interface ProductModel {

  id: number;
  price: number;
  name: string;
  description: string;

}


export interface ProductDto {
  hostName: string;
  productList: ProductModel[];
}
