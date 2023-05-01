Estrutura do projeto - Padrão Flyweight Delivery em Java, logo abaixo.

1) Classe Flyweight - Define a interface para os objetos flyweight.
2) Classe Flyweight Concreto Fast - Implementa a interface Flyweight e armazena o estado intrínseco compartilhado.
3) Classe Flyweight Concreto Normal - Implementa a interface Flyweight e armazena o estado intrínseco compartilhado.
4) Classe Flyweight Factory - Cria e gerencia os objetos flyweight.
5) Classe Cliente - Utiliza os objetos flyweight.

Casos de Teste:

1) Testa um cliente com entrega rápida.
2) Testa um cliente com entrega normal.
3) Testa outro cliente com entrega rápida.
