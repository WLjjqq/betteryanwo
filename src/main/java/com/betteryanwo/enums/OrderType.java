package com.betteryanwo.enums;

/**
 * Create by 六
 * Date:18-6-7
 */
public enum OrderType {
    CREATE(0,"订单创建"),
    MODIFY(1,"订单修改"),
    CONFIRM(2,"订单确认"),
    SUBMIT(3,"支付请求"),
    PAYMENT(4,"付款成功"),
    SHIPPING(5,"订单发货"),
    COMPLETE(6,"订单完成"),
    CANCEL(7,"订单取消"),
    FAIL(8,"支付失败"),
    OTHER(9,"其他");


    private int code;
    private String message;

    OrderType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

