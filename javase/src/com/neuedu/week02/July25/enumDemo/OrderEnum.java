package com.neuedu.week02.July25.enumDemo;

public enum OrderEnum {
    START_PAY(0,"交易开始"),
    NO_PAY(1,"未支付"),
    YES_PAY(2,"已支付"),
    OVER_PAY(3,"交易完成");


    private Integer code;
    private String inform;

    OrderEnum(Integer code, String inform){
        this.code = code;
        this.inform = inform;
    }

    public Integer getCode() {
        return code;
    }

    public String getInform() {
        return inform;
    }

    public static OrderEnum getorderEnum(Integer code){
        OrderEnum[] orderEnums = OrderEnum.values();
        for (OrderEnum orderEnum : orderEnums) {
            if(orderEnum.code.equals(code)){
                return orderEnum;
            }
        }
        return  null;
    }
}
