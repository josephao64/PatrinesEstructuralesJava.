# PatronesEstructuralesJava.
QUE ES PATRON ESTRUCTURAL ADAPTER
Un patrón estructural de adapter en programación es un patrón que permite convertir la interfaz de una clase en otra que es la que esperan los clientes. Permite que trabajen juntas clases que de otro modo no podrían por tener interfaces incompatibles. Hay dos tipos de adapter: de clase y de objeto. El adapter de clase adapta una clase concreta mediante la herencia, mientras que el adapter de objeto adapta una clase o sus subclases mediante la composición va a funcionar como un adaptador entre dos objetos, por un lado recibirá información de un objeto y por otro lado lo transformará y creará las interfaces necesarias para ser consumido por otro objeto.

•	Ventajas: hace que dos interfaces incompatibles, sean compatibles. Puede servir para encapsular clases que no controlamos, y que pueden cambiar.
•	Desventajas: como muchos patrones, añade complejidad al diseño. Hay quién dice que este patrón es un parche, utilizado en malos diseños.

Los componentes que conforman el patrón son los siguientes:
•	Client: Actor que interactua con el Adapter.
•	Target: Interface que nos permitirá homogenizar la forma de trabajar con las interfaces incompatibles, esta interface es utilizada para crear los Adapter.
•	Adapter: Representa la implementación del Target, el cual tiene la responsabilidad de mediar entre el Client y el Adaptee. Oculta la forma de comunicarse con el Adaptee.
•	Adaptee: Representa la clase con interface incompatible.

 
COMO APLICAR EL PATRON ESRUCTURAL ADAPTER
Para aplicar el patrón estructural adapter, debes seguir los siguientes pasos:
•	Define la interfaz que quieres usar como punto de entrada para transformar de un formato a otro. Esta interfaz será el Target.
•	Crea una clase que implemente la interfaz y que tenga una referencia al objeto que quieres adaptar. Esta clase será el Adapter.
•	Implementa los métodos de la interfaz usando la lógica necesaria para convertir los datos del objeto adaptado al formato esperado por el cliente. Esta lógica puede usar los métodos del objeto adaptado, que será el Adaptee.
•	Usa el adapter para comunicar al cliente con el adaptee, pasando la solicitud al segundo objeto en un formato y orden que ese segundo objeto espera.
•	El Client invoca al Adapter con parámetros genéricos.
•	El Adapter convierte los parámetros genéricos en parámetros específicos del Adaptee.
•	El Adapter invoca al Adaptee.
•	El Adaptee responde.
•	El Adapter convierte la respuesta del Adaptee a una respuesta genérica para el Client.
•	El Adapter responde al Client con una respuesta genérica.

 El patrón de diseño Bridge es un patrón estructural que se utiliza en programación para separar una abstracción de su implementación, permitiendo que ambas puedan variar de forma independiente. En términos más formales:

1. *Abstracción*: Representa una interfaz o clase abstracta que define las operaciones o funcionalidades que se esperan de un objeto.
2. *Implementación*: Define una interfaz separada que concreta cómo se llevarán a cabo las operaciones definidas en la abstracción.

Este patrón se utiliza cuando se tienen múltiples dimensiones de variación en un sistema y se desea evitar una explosión de clases derivadas. Puede utilizarse en situaciones donde:

- Tienes una abstracción (como un controlador) que necesita trabajar con múltiples implementaciones de detalles (como diferentes tipos de dispositivos).
- Quieres evitar una clase abrumadora con muchas subclases que se combinan en todas las posibles variaciones de abstracción e implementación.
- Deseas permitir que las abstracciones y las implementaciones evolucionen por separado sin afectar a la otra.


Patrón Composite
El patrón de diseño Composite (Composite Pattern) es uno de los 23 patrones de diseño “GoF” para el desarrollo de software que fueron publicados en 1994 por Erich Gamma, Richard Helm, Ralph Johnson, y John Vlissides, los llamados “Gang of Four” o la banda de los cuatro. Así como el patrón Facade y el patrón Decorator, se trata de un patrón de diseño que agrupa objetos complejos y clases en estructuras mayores.
El concepto básico del patrón Composite consiste en representar objetos simples y sus containers (o contenedores, también llamados colecciones en algunos lenguajes, o sea: grupos de objetos) en una clase abstracta de manera que puedan ser tratados uniformemente. Este tipo de estructura se conoce como jerarquía parte-todo (en inglés: part-whole hierarchy), en la que un objeto es siempre, o una parte de un todo, o un todo compuesto por varias partes.
La finalidad del patrón Composite es, como en todos los patrones “GoF”, mejorar la gestión de problemas de diseño recurrentes en la programación orientada a objetos. El resultado deseado es un software flexible, caracterizado por objetos fácilmente implementables, intercambiables, reutilizables y testeables. A tal efecto, el patrón de diseño Composite describe un método según el cual los objetos simples y complejos pueden ser tratados de la misma manera. De este modo, se puede crear una estructura de objetos fácilmente inteligible que permite al cliente un acceso altamente eficiente. Además, también se minimiza la probabilidad de error en el código.


Decorator 
El patrón de diseño decorator es un concepto clave en el mundo del diseño de software orientada a objetos. Pertenece a la categoría de patrones estructurales que se centran en la composición de clases y objetos para formar estructuras más grandes y flexibles
El patrón decorator permite agregar funcionalidad adicional a objetos de manera dinámica sin tener que modificar su estructura ni romper el principio de responsabilidad única, en otras palabras decorator permite personalizar y extender objetos sin la necesidad de alterar su código original 
Cómo funciona 
Este patrón se basa en la idea de envolver o decorar objetos con otras clases que añaden responsabilidades o características adicionales, esto se ogra utilizando una estructura de herencia o implementación de interfaces donde cada clase  de decorator se conecta a un componente base 
Los decoradores concretos heredan del decorador base y agregan comportamientos específicos. La calve aquí es que los decoradores siguen la misma interface o herencia que el comportamiento base lo que permite que se combinen de manera flexible y anidada 
Ejemplo decorando café en una cafetería 
1)	La interface café que define el componente base con el método costo()
2)	La clase concreta cafeSimple que implementa café y representa un café básico a precio base 
3)	La clase abstracta DecorarCafe que implementa de café y actúa como base para los decoradores concretos. Contiene una referencia al café original 
4)	Los decoradores concretos leche y crema que heredan de decorarCafe agregan costos adicionales por la leche y la crema 
Donde entra el patrón en el código
Este patrón se ve en como los objetos leche y crema se conectan con objetos café, estos decoradores heredan de decorarCafe y anulan el método costo() donde se llama a super.costo() para obtener el costo de café original y luego se agrega un costo adicional por la leche o la crema 
Esto permite que los objetos leche y crema se decoran en torno a un café base y extienden su funcionalidad
 
Facade 
El patrón de diseño facade es un patrón estructural que proporciona una interface simplificada para un conjunto mas grande y complejo de clases módulos o sistemas. Su objetivo principal es ocultar la complejidad interna y proporcionar una fachada única para que los clientes interactúen con el sistema de manera más sencilla. En resumen el patrón facade actúa como una capa intermedia que simplifica y abstrae la interacción con componentes mas complejos 
Funcionamiento del patron facade 
Se basa en la idea de que un sistema puede estar compuesto por numerosas clases y módulos interrelacionados. En lugar de permitir que los clientes interactúen directamente con todas estas partes, el patrón facade introduce una clase o interfaz de fachada que actúa como un punto de entrada único y centralizado. La fachada agrupa las operaciones mas comunes y relevantes para los clientes y coordina la interacción con las partes internas del sistema 

Ventajas del patron facade 
Simplicidad para el cliente: la fachada proporciona una interfaz sencilla y coherente que oculta la complejidad interna. Esto facilita que los clientes utilicen el sistema sin tener que preocuparse por los detalles internos 
Abstracción: los detalles internos y las relaciones complejas entre componentes se mantienen ocultos. Los clientes solo necesitan interactuar con la fachada, lo que fomenta una separación clara entre la implementación y el uso 
Modularidad y mantenibilidad: cambiar o actualizar la implementación interna no afecta la interfaz de la fachada lo que reduce el riesgo de introducir errores en los clientes 

Flyweight
El patrón Flyweight sirve para eliminar o reducir la redundancia cuando tenemos gran cantidad de objetos que contienen información idéntica, además de lograr un equilibrio entre flexibilidad y rendimiento.
Esto nos permite crear una gran cantidad de objetos sin la necesidad de que nos consuma mucha ram ya que siempre hay objetos que contienen una parte en común que podría ser compartida de esa manera ahorramos RAM
Cada objeto contiene elementos que los caracterizan y no varían en el caso anterior son el color y el Sprite   estos son datos Intrínsecos
Por otro lado, la posición estado o velocidad de cada uno son elementos que van cambiando a medida que el juego se desarrolla datos Extrínsecos

Proxy
"Proxy" se utiliza para proporcionar un sustituto o representante de otro objeto. Este sustituto controla el acceso al objeto original, permitiendo realizar acciones adicionales antes o después de acceder a él, como la carga diferida de recursos o la verificación de permisos.

si queremos temer la flexibilidad de cambiar alguna implementación en particular podemos apoyarnos en una interfaz

para que el intermediario delegue información
el cliente va a interactuar con ese intermediario con el envoltorio
encapsular la complejidad del objetivo en un envoltorio en una clase intermediaria
Lo que queremos es tener un envoltorio que permita tener el acceso al objto real que necesitamos manipular
