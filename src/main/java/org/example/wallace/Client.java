package org.example.wallace;

public class Client {
    private String packageId;
    private Delivery delivery;

    public Client(String packageId, String deliveryType) {
        this.packageId = packageId;
        this.delivery = DeliveryFactory.getDelivery(deliveryType);
    }

    public void sendPackage() {
        delivery.deliverPackage(packageId);
    }
}
