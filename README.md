# Aplicación Web de Gestión de Alumnado y Proyectos

## Descripción
Esta aplicación web permite la gestión de alumnado y proyectos en un entorno académico.  
Proporciona funcionalidades para listar, crear, editar y eliminar registros de alumnado y proyectos.  
Está desarrollada usando Spring Boot y Thymeleaf, con una base de datos MySQL. 

## Características
- Listado de Alumnos
- Creación de Nuevos Alumnos
- Edición de Datos de Alumnos
- Eliminación de Alumnos
- Listado de Proyectos
- Creación de Nuevos Proyectos
- Edición de Datos de Proyectos
- Eliminación de Proyectos

## Tecnologías Utilizadas
- **Backend:**
  - Spring Boot
  - Spring Data JPA
  - Spring MVC

- **Frontend:**
  - Thymeleaf
  - Bootstrap 5

- **Base de Datos:**
  - MySQL

- **Dependencias de Construcción:**
  - Maven

## Configuración del Proyecto
### Prerrequisitos
- JDK 17
- Maven 3.6+
- MySQL 8.0+

### Instalación
1. Clona el repositorio:
   ```bash
   git clone https://github.com/espemb/aplicacion_web_alumnado.git

### Configuración
spring.datasource.url= jdbc:mysql://localhost:3306/db_entrega  
spring.datasource.username=root  
spring.datasource.password=tu_password  
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
spring.jpa.hibernate.ddl-auto=create-drop  
logging.level.org.hibernate.SQL=debug  


## Uso
Rutas Principales
- Alumnos

  - Listado: /alumnos
  - Nuevo Alumno: /alumnos/new
  - Editar Alumno: /alumno/edit/{id}
  - Eliminar Alumno: /alumno/eliminar/{id}
- Proyectos

  - Listado: /vistaproyectos
  - Nuevo Proyecto: /proyectos/new
  - Editar Proyecto: /proyecto/edit/{id}
  - Eliminar Proyecto: /proyecto/eliminar/{id}
