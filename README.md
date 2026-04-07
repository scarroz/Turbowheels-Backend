# 🚗 TurboWheels - NominaBackend

Backend del módulo de nómina del sistema **TurboWheels**, desarrollado con Spring Boot.  
Este servicio gestiona empleados, pagos y lógica asociada a la administración de nómina.

---

## 🧠 Descripción

NominaBackend es una API REST que permite:

- Gestión de empleados
- Procesamiento de nómina
- Persistencia de datos en múltiples bases (relacional y NoSQL)
- Integración con servicios externos (correo, almacenamiento, etc.)

Este proyecto hace parte de una recopilación de soluciones desarrolladas como práctica profesional en backend.

---

## ⚙️ Tecnologías

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- MongoDB
- Maven


---

## 🏗️ Arquitectura
El proyecto sigue una arquitectura en capas:
controller → service → repository → database

- **Controller**: expone endpoints REST
- **Service**: contiene lógica de negocio
- **Repository**: acceso a datos
- **Config**: configuración de la aplicación

---

El proyecto sigue una arquitectura en capas:
controller → service → repository → database


- **Controller**: expone endpoints REST
- **Service**: contiene lógica de negocio
- **Repository**: acceso a datos
- **Config**: configuración de la aplicación

---

## 🔐 Configuración

Las credenciales NO están incluidas en el repositorio.  
Debes configurar variables de entorno.

---

## 👥 Autores

Este proyecto fue desarrollado en el marco de la asignatura **Bases de Datos II**  
en la **Universidad El Bosque**.

- Sebastián Ernesto Carroz Añez  
- Andrés Camilo Guerrero Mateus
