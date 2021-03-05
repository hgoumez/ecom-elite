package com.illishop.order;

import com.illishop.order.model.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderWithHostName {

    private List<Order> orderList;
    private String hostName;
}
