package org.example.wallace;

import java.util.HashMap;
import java.util.Map;

public class DeliveryFactory {
    private static Map<String, Delivery> deliveryMap = new HashMap<>();

    public static Delivery getDelivery(String type) {
        Delivery delivery = deliveryMap.get(type);

        if (delivery == null) {
            if (type.equalsIgnoreCase("Fast")) {
                delivery = new FastDelivery();
                deliveryMap.put(type, delivery);
            } else if (type.equalsIgnoreCase("Normal")) {
                delivery = new NormalDelivery();
                deliveryMap.put(type, delivery);
            }
        }

        return delivery;
    }
}
