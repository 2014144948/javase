package com.neuedu.week02.July25.enumDemo;

public class Test {
    public static void main(String[] args){
//        创建一个对象
        Order order = new Order(0);
//        获取编号对应的状态信息
        OrderEnum orderEnum = OrderEnum.START_PAY.getOrderEnum(order.getOrderStatus());
//        输出状态信息
        System.out.println(orderEnum.getInform());
    }
}
