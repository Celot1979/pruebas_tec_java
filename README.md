PRUEBA TÉCNICA REALIZADA EN JAVA
1ª PARTE
Crear un sistema de reserva de asientos para un anfiteatro. El teatro cuenta con 10 filas de 10 asientos cada una.Se necita desarrollar un sitema (sin uso de BD unicamente se pueden manipular de forma logica) que permita llevar acabo lo siguiente:

Cargar el "mapa" de las filas y asientos .Indicando con una X los asientos ocupados y una "L" los asientos libres .Al iniciar el programa , todos los asientos deben de estar libres.
Manejar la reserva de asientos contemplando que un asiento SOLO puerde ser reservado si se encuentra en estado "L" , en el caso de que esté en estado "X" ,se deberá permitir al comprador elegir otro asiento.Si se encuentra en estado "L".deberá pasar automáticamente al estado "X".
Para finalizar el programa se deberá ingresar un valor en particular. Contemplar que no existe una cantidad exacta de veces que el programa se pueda ejecutar.
Contemplar que solo existen 10 filas y 10 asientos.No se pueden vender asientos fuera de ese rango. No se permite "sobreventa".
CONSIDERACIONES No es necesario la implementación ni de GUI ni de BD.Se evaluará 100% el manejo lógico del desarrollo de la aplicación.
EXTRA En caso de que un cliente solicite visualizar cuáles son los asientos libres, el sistema deve permitr mostrar de forma gráfica el mapa de asientos.
2ª PARTE
Basada en el paradigma de programación orientada en objetos. Basándose en el mismo escenario del sistema de reserva de asientos para un anfiteatro, llegó el momento de plantear el "sistema de ticketes" que obtendrá cada persona al reservar su asiento. Para ello tener en cuenta lo siguiente:

Crear la "plantilla" necesaria para guardar los siguientes datos por ticket: numero,fila,fecha de compra,fecha de validez, precio.
Usar una "base de datos logica" mediante alguna estructura de datos que permita almacenar un número indeterminado de tickets. Cargar una serie de tickets a dicha estructura.
Crear un método que recorra la estructura seleccionada y sume los precios de todos los tickets. Mostrar por pantalla el total. No es necesario usar IGU para esto.
Solicitar al usuario que ingrese un número de fila. A partir de esto, mostrar por pantalla los datos de los tickets pertenecientes a esa fila. No es necesario usar IGU para esto.
CONSIDERACIONES No es necesaria implementación ni de IGU ni de BD. Se evaluarà 100% el manejo del desarrollo de la aplicación.
EXTRA En caso que se desee agregar una "plantilla" para clientes con los datos: id,dni,nombre,apellido,.¿Cómo se implementaría?¿De qué manera se relacionaria con ticket para que el mismo posea los datos del cliente que tiene asignado?.Realizar la implementación.
