import org.example.wallace.Client;

public class Main {
    public static void main(String[] args) {
        // Caso de teste 1: Entrega rápida
        Client client1 = new Client("123", "Fast");
        client1.sendPackage();

        // Caso de teste 2: Entrega normal
        Client client2 = new Client("456", "Normal");
        client2.sendPackage();

        // Caso de teste 3: Entrega rápida (reutilizando objeto flyweight)
        Client client3 = new Client("789", "Fast");
        client3.sendPackage();

        // Caso de teste 4: Entrega normal (reutilizando objeto flyweight)
        Client client4 = new Client("101112", "Normal");
        client4.sendPackage();
    }
}