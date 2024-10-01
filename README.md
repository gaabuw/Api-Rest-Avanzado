# API REST Avanzada

Este proyecto implementa una API REST avanzada.

## Contenidos

### 1. Reutilización de código (@MappedSuperclass y código genérico)
Se implementan clases base usando la anotación `@MappedSuperclass` para la reutilización de atributos comunes entre entidades. Además, se utiliza código genérico para manejar entidades de forma eficiente sin duplicar lógica.

### 2. Repositorios y Servicios Genéricos
Se crean repositorios y servicios genéricos para manejar las operaciones CRUD comunes de manera abstracta, lo que facilita la reutilización de código entre diferentes entidades.

### 3. Controladores Genéricos
Se implementan controladores genéricos para proporcionar endpoints estándar (GET, POST, PUT, DELETE) para todas las entidades, aprovechando los servicios y repositorios genéricos.

### 4. Completando el Modelo de Datos: Creación de Relaciones
Se definen relaciones entre las entidades utilizando anotaciones como `@OneToMany`, `@ManyToOne`, `@ManyToMany` y `@OneToOne`, para modelar correctamente las dependencias entre las tablas.

### 5. Probando la API con Postman
Se configura Postman para realizar pruebas de los distintos endpoints de la API, verificando que las operaciones CRUD y las relaciones entre entidades funcionen correctamente.

### 6. JPA Queries: @Query & Query Methods
Se implementan consultas personalizadas utilizando la anotación `@Query` y los métodos de consulta proporcionados por JPA para realizar búsquedas avanzadas en las entidades.

### 7. Implementación y Prueba de Queries
Se prueba la implementación de las consultas personalizadas para validar que los datos retornados sean correctos y que las consultas estén optimizadas para rendimiento.

### 8. Paginación
Se añade paginación a los endpoints de la API para manejar grandes volúmenes de datos de manera eficiente. Se usa `Pageable` en los repositorios para este fin.

### 9. Probando la Paginación con Postman
Se realizan pruebas en Postman para verificar que la funcionalidad de paginación responde correctamente, retornando los datos en bloques controlados.

### 10. Patrón DTO
Se implementa el patrón DTO (Data Transfer Object) para mejorar la separación de preocupaciones entre las entidades de la base de datos y los datos que se exponen a través de la API.
