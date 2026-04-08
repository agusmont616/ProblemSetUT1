# 📚 Proyecto Biblioteca – Checklist de Desarrollo

---

## 🔹 A. Base de estructuras (TDA Lista)

* [x] Implementar clase concreta `TDALista<T>`
* [x] Definir estructura interna (lista enlazada simple)
* [x] Implementar nodo

### Métodos

* [x] Inserción (inicio / final / posición)
* [x] Eliminación
* [ ] Búsqueda por criterio
* [ ] Recorrido (iteración)

### Criterios

* [ ] Definir criterio de comparación
* [ ] Permitir búsqueda por clave (código de libro)

---

## 🔹 B. Modelo de dominio (Libro)

### Clase

* [ ] Crear clase `Libro`
* [ ] Atributos: codigo, titulo, precioReposicion, stock

### Métodos

* [ ] Constructor
* [ ] Getters / Setters
* [ ] Método aumentar stock
* [ ] Método disminuir stock (con validación)
* [ ] Implementar `toString()`
* [ ] Comparación por título (para ordenamiento)

---

## 🔹 C. Clase Biblioteca

### Estructura

* [ ] Crear clase `Biblioteca`
* [ ] Atributo: `TDALista<Libro> catalogo`

### Operaciones

* [ ] Alta de libro
* [ ] Buscar libro por código
* [ ] Agregar ejemplares
* [ ] Registrar préstamo
* [ ] Registrar devolución
* [ ] Eliminar libro
* [ ] Consultar stock
* [ ] Listar libros ordenados por título

---

## 🔹 D. Ordenamiento

* [ ] Implementar ordenamiento por título
* [ ] Definir estrategia:

  * [ ] Ordenamiento interno de la lista
  * [ ] Estructura auxiliar + sort

---

## 🔹 E. Procesamiento de archivos

### adquisiciones.txt

* [ ] Leer archivo
* [ ] Parsear líneas
* [ ] Validar datos
* [ ] Alta o actualización de libros
* [ ] Calcular valor total agregado

### prestamos.txt

* [ ] Leer archivo
* [ ] Parsear líneas
* [ ] Diferenciar PRESTAMO / DEVOLUCION
* [ ] Ajustar stock
* [ ] Manejar stock insuficiente
* [ ] Calcular variación total

---

## 🔹 F. Integración

* [ ] Crear clase `Main`
* [ ] Inicializar biblioteca
* [ ] Procesar adquisiciones
* [ ] Procesar préstamos
* [ ] Mostrar resultados

---

## 🔹 G. Validaciones y edge cases

* [ ] Manejar libro inexistente
* [ ] Evitar stock negativo
* [ ] Limitar préstamos al stock disponible
* [ ] Evitar duplicados en alta

---

## 🔹 H. Testing básico

* [ ] Alta de libro
* [ ] Préstamo parcial
* [ ] Devolución
* [ ] Eliminación
* [ ] Ordenamiento

---

# 👥 Distribución del equipo

## 👤 Persona 1 – TDA Lista (core)

* [x] Implementación completa de `TDALista`
* [x] Nodo interno
* [x] Inserción
* [x] Eliminación
* [ ] Búsqueda
* [ ] Testing unitario

---

## 👤 Persona 2 – Modelo Libro

* [ ] Clase `Libro`
* [ ] Lógica de stock (aumentar/disminuir)
* [ ] Validaciones
* [ ] Comparadores (título / código)

---

## 👤 Persona 3 – Biblioteca (operaciones básicas)

* [ ] Alta de libro
* [ ] Buscar por código
* [ ] Eliminar libro
* [ ] Consultar stock

---

## 👤 Persona 4 – Biblioteca (operaciones dinámicas)

* [ ] Agregar ejemplares
* [ ] Registrar préstamo
* [ ] Registrar devolución
* [ ] Manejo de edge cases (stock insuficiente)

---

## 👤 Persona 5 – Archivos (Adquisiciones)

* [ ] Leer `adquisiciones.txt`
* [ ] Parseo
* [ ] Integración con Biblioteca
* [ ] Cálculo de valor total

---

## 👤 Persona 6 – Archivos (Préstamos + integración)

* [ ] Leer `prestamos.txt`
* [ ] Parseo
* [ ] Aplicar operaciones
* [ ] Calcular variación de stock
* [ ] Implementar `Main`
* [ ] Integración final

---

## 📌 Estado general

* [ ] Proyecto inicializado
* [ ] Todas las partes integradas
* [ ] Pruebas completas
* [ ] Listo para entrega

---
