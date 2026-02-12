#  GoF Creational – Pizza Factory

Taller que implementa el patrón de diseño **Abstract Factory (GoF)** para modelar la preparación de distintos tipos de pizza sin acoplar la lógica cliente a clases concretas.

El sistema permite preparar:

- Pizza Delgada
- Pizza Gruesa
- Pizza Integral

Cada tipo de pizza pertenece a una **familia de productos** compuesta por:
- Amasador
- Moldeador
- Horneador

---

# Patrón de Diseño Implementado

## Abstract Factory

El patrón Abstract Factory proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas.

En este proyecto:

- La fábrica abstracta define los métodos de creación.
- Las fábricas concretas crean objetos específicos según el tipo de pizza.
- El cliente (PreparadorPizza) no conoce las clases concretas que utiliza.

Esto permite:

- Bajo acoplamiento
- Alta cohesión
- Fácil extensión del sistema

---

# 🏗️ Estructura del Proyecto

## 1️⃣ Fábrica Abstracta


Define los métodos:

- crearAmasador()
- crearMoldeador()
- crearHorneador()

Cada método devuelve una interfaz, no una implementación concreta.

---

## 2️⃣ Fábricas Concretas

- PizzaDelgadaFactory
- PizzaGruesaFactory
- PizzaIntegralFactory

Cada una implementa IPizzaFactory y crea los productos específicos correspondientes.

Ejemplo:

PizzaDelgadaFactory crea:
- AmasadorPizzaDelgada
- MoldeadorPizzaDelgada
- HorneadorPizzaDelgada

---

## 3️⃣ Interfaces de Producto

### IAmasadorPizza
Define:
- amasar()

### IMoldeadorPizza
Define:
- moldear()

### IHorneadorPizza
Define:
- hornear()

Estas interfaces permiten que el cliente trabaje con abstracciones.

---

## 4️⃣ Productos Concretos

Para cada tipo de pizza existen implementaciones específicas.

### Amasadores
- AmasadorPizzaDelgada
- AmasadorPizzaGruesa
- AmasadorPizzaIntegral

### Moldeadores
- MoldeadorPizzaDelgada
- MoldeadorPizzaGruesa
- MoldeadorPizzaIntegral

### Horneadores
- HorneadorPizzaDelgada
- HorneadorPizzaGruesa
- HorneadorPizzaIntegral

Cada uno implementa su respectiva interfaz.

---

## 5️⃣ Clase Cliente


Es la clase que orquesta el proceso:

1. Solicita la fábrica adecuada.
2. Crea los componentes mediante la fábrica.
3. Ejecuta el flujo de preparación:
   - Amasar
   - Moldear
   - Hornear

No depende de clases concretas.

---

## 6️⃣ Componentes Adicionales

### Ingredientes
Clase modelo que contiene:
- nombre
- cantidad

### Tamano (enum)
Valores:
- MEDIANO
- PEQUENO

### ExcepcionParametrosInvalidos
Clase para manejo de errores y validaciones.

---

# 🔁 Flujo de Ejecución

1. Se selecciona el tipo de pizza.
2. Se instancia la fábrica correspondiente.
3. PreparadorPizza recibe la fábrica.
4. Se crean los productos concretos.
5. Se ejecuta el proceso completo.

El cliente nunca conoce las clases concretas.

---

# 📂 Estructura Maven

src
└── main
└── java
└── edu.unisabana.pizzafactory

# 🎯 Ventajas del Diseño

- Separación clara de responsabilidades.
- Permite agregar nuevas familias de pizza sin modificar código existente.
- El cliente depende únicamente de interfaces.
- Facilita pruebas y mantenimiento.

---

# 🧠 Principios SOLID Aplicados

- SRP – Single Responsibility Principle
- OCP – Open/Closed Principle
- DIP – Dependency Inversion Principle

---

# 📚 Conclusión

Este proyecto demuestra la implementación práctica del patrón Abstract Factory para la creación de familias de objetos relacionados sin acoplar el código cliente a implementaciones concretas.

Se logra un diseño extensible, mantenible y alineado con buenas prácticas de ingeniería de software.

---


