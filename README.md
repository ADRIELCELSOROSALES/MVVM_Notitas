El proyecto MVVM_Notitas es una aplicación Android desarrollada siguiendo el patrón de diseño de arquitectura Modelo-Vista-ViewModel (MVVM). Este patrón facilita la separación de la lógica de la interfaz de usuario (UI) de la lógica de negocio, lo que resulta en un código más limpio y fácil de mantener. La aplicación está diseñada para mostrar citas o notas, permitiendo al usuario ver una cita aleatoria cada vez que toca la pantalla.

Estructura del Proyecto
El proyecto se organiza en paquetes que separan las responsabilidades de la aplicación:

view: Contiene las actividades (MainActivity.kt) que interactúan directamente con la UI.

viewModel: Incluye los ViewModel (QuoteViewModel.kt) que manejan la lógica de negocio y se comunican con la capa de vista.
model: Define los modelos de datos utilizados en la aplicación (aunque no se muestra explícitamente en la información proporcionada, se infiere por la estructura MVVM).


Componentes Principales
MainActivity: Es la actividad principal que muestra las citas o notas. Utiliza ViewBinding para interactuar con los elementos de la UI definidos en activity_main.xml.

QuoteViewModel: Gestiona los datos de las citas y expone los mismos a la actividad a través de LiveData. Contiene la lógica para obtener una cita aleatoria.



Escalabilidad hacia Clean Architecture

Adoptar Clean Architecture: Refactoriza tu aplicación para seguir los principios de Clean Architecture, lo que implica separar la aplicación en capas de dominio, datos y presentación. Esto no solo facilitará el mantenimiento y la prueba de la aplicación sino que también permitirá una mejor separación de responsabilidades.

Capa de Dominio: Define las entidades y casos de uso de tu aplicación.
Capa de Datos: Implementa el acceso a los datos, ya sea a través de una base de datos local o servicios web.
Capa de Presentación: Utiliza ViewModel y Jetpack Compose para construir la UI basándose en los estados de la aplicación.
