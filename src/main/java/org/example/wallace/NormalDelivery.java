package org.example.wallace;

public class NormalDelivery implements Delivery {
    private String deliveryType;

    public NormalDelivery() {
        this.deliveryType = "Normal Delivery";
    }

    @Override
    public void deliverPackage(String packageId) {
        // Lógica de entrega normal
    }
}
