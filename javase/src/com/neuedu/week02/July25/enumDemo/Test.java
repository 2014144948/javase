package com.neuedu.week02.July25.enumDemo;

public class Test {
    public static void main(String[] args){
        Order order = new Order(0);
        OrderEnum orderEnum = OrderEnum.getorderEnum(order.getOrderStatus());
        System.out.println(orderEnum.getInform());
    }
}
