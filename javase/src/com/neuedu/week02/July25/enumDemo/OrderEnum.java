package com.neuedu.week02.July25.enumDemo;

/**
 * 订单状态的枚举类
 */
public enum OrderEnum implements TestInterface{
    START_PAY(0,"交易开始"),
    NO_PAY(1,"未支付"),
    YES_PAY(2,"已支付"),
    OVER_PAY(3,"交易完成");

//    编号
    private Integer code;
//    当前状态
    private String inform;

    /**
     * 构造方法
     * @param code      传入编号
     * @param inform    传入当前状态
     */
    OrderEnum(Integer code, String inform){
        this.code = code;
        this.inform = inform;
    }

    /**
     * 获取状态信息
     * @return
     */
    public String getInform() {
        return inform;
    }

    /**
     * getOrderEnum方法的重写，定义一个数组并进行遍历，<br></>
     * 判断如果枚举中的信息和传入的编号信息一致，则返回该枚举,<br></>
     * 否则返回null
     * @param code  传入编号信息
     * @return      返回值为OrderEnum
     */
    @Override
    public OrderEnum getOrderEnum(Integer code) {
        OrderEnum[] orderEnums = OrderEnum.values();
        for (OrderEnum orderEnum : orderEnums) {
            if(orderEnum.code.equals(code)){
                return orderEnum;
            }
        }
        return null;
    }
}