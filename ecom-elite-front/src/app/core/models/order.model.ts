export interface OrderModel {
  id: number;
  productId: number;
  amount: number;
  customerFirstName: string;
  customerLastName: string;

}

export interface OrderDto {
  hostName: string;
  orderList: OrderModel[];
}
