package com.betteryanwo.util;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.exception.OrderException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Create by 六
 * Date:18-6-12
 */
public class OrderUtil {
    private static Logger logger = LoggerFactory.getLogger(OrderUtil.class);

    public static String getOrderId() {
        String head = "SYY-";
        return head + getNowDate() + getUUIDHasCode();
    }

    public static String getNowDate() {

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
        return formatter.format(currentTime);
    }

    public static String getUUIDHasCode() {

        Integer uuid = UUID.randomUUID().toString().hashCode();
        if (uuid < 0)
            uuid = -uuid;
        return uuid.toString();
    }
    public static String getUUID32() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String doubleTrans(Double num) {
        DecimalFormat decimalFormat = new DecimalFormat("###################.###########");
        return decimalFormat.format(num);
    }

    public static BigDecimal calculateCart(List<CartItem> cartItemList){
        try {
            if (null == cartItemList || cartItemList.size() == 0) {
                return null;
            }
            BigDecimal totalPrice = new BigDecimal(0);
            for (CartItem ci : cartItemList) {
                totalPrice = ci.getPrice().add(totalPrice);
            }
            return totalPrice;
        } catch (Exception e) {
            e.printStackTrace();
            throw new OrderException("计算购物车总价出错", e);
        }
    }


}
