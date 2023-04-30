package org.example.wallace;

public class FastDelivery implements Delivery {
    private String deliveryType;

    public FastDelivery() {
        this.deliveryType = "Fast Delivery";
    }

    @Override
    public void deliverPackage(String packageId) {
        // Lógica de entrega rápida
    }
}
