Estructura del Proyecto

Este proyecto es una aplicación Java SE para buscar estadísticas de escucha basadas en datos históricos de las 50 canciones más populares en varios países. 
Las funcionalidades principales incluyen cargar datos, realizar diversas consultas y utilizar estructuras de datos eficientes para el procesamiento.

Componentes Principales

Main.java: El punto de entrada de la aplicación donde reside el método principal.

Clases de Datos:

Artista.java: Representa a un artista.

Cancion.java: Representa una canción.

EntradaTop50.java: Representa una entrada en la lista de las 50 más populares.

DataStorage.java: Maneja el almacenamiento y la gestión de los datos cargados.

CargaDatos.java: Se encarga de cargar datos desde el archivo CSV.

Consultas:

primeraConsulta.java:

segundaConsulta.java: 

terceraConsulta.java:

cuartaConsulta.java:

quintaConsulta.java: 

Implementa la funcionalidad de las 5 consultas.

Clases Utilitarias:

Menu.java: Maneja el menú de usuario y las interacciones.

Estructuras de Datos (ubicadas bajo el paquete uy.edu.um.tads):

binarytree: Implementa funcionalidades de árbol binario.

hash: Implementa funcionalidades de tabla hash.

heap: Implementa funcionalidades de heap.

linkedlist: Implementa funcionalidades de lista enlazada.

ntree: Implementa funcionalidades de árbol N-ario.

queue: Implementa funcionalidades de cola.

stack: Implementa funcionalidades de pila.

Archivos Adicionales

pom.xml: Archivo de configuración de Maven para gestionar las dependencias del proyecto.

reduced_data.csv: Un conjunto de datos de muestra utilizado para cargar y probar las funcionalidades de la aplicación.


Cómo Ejecutar
Asegúrate de tener Java y Maven instalados.
Usa Maven para construir el proyecto: mvn clean install.
Ejecuta la aplicación: java -jar target/ObligatorioP2-main.jar.
