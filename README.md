# Ejercicios Usando ShellSort y CountingSort

---

## Estudiante

Juan Andres Pulecio Delgado

---

## Asignatura

Estructura de datos

---

## Descripcion

Practica de dos metodos de ordenamiento no convencionales en Java: Shell Sort
y Counting Sort. Cada metodo incluye un ejemplo su complejidad Big O.

Los datos se generan con Random y se muestran antes y despues de ordenar.

---

## Estructura del repositorio
```
Taller-Ordenamiento/
├── src/
│   └── Ordenamiento/
│       ├── App.java
│       ├── Consola.java
│       ├── EjercicioEjecutable.java
│       └── MetodosOrdenamiento.java
└── README.md
```
---

## Metodos implementados

|Metodo       |Estrategia                |Complejidad promedio |Complejidad peor caso|
|-------------|--------------------------|---------------------|---------------------|
|Shell Sort   |Comparacion por intervalos|O(n log n)           | O(n^2)              |
|Counting Sort|Conteo de frecuencias     |O(n + k)             | O(n + k)            |

---

## Como funciona cada metodo

### Shell Sort

Mejora de Insertion Sort propuesta por Donald Shell en 1959. En lugar de
comparar elementos adyacentes, compara elementos separados por un intervalo
llamado gap. El gap empieza en la mitad del arreglo y se divide entre 2
en cada pasada hasta llegar a 1, momento en que el arreglo ya esta casi
ordenado y Insertion Sort lo termina rapidamente.

Ejemplo con [ 8, 3, 6, 1 ]:
  gap = 2: compara pos 0 con 2, pos 1 con 3 -> [ 6, 1, 8, 3 ]
  gap = 1: Insertion Sort sobre arreglo casi ordenado -> [ 1, 3, 6, 8 ]

### Counting Sort

Algoritmo no comparativo. En lugar de comparar elementos entre si, cuenta
cuantas veces aparece cada valor en el arreglo. Con esas frecuencias
reconstruye el arreglo ya ordenado. Es mas rapido que cualquier algoritmo
comparativo cuando el rango de valores es pequeno respecto al tamanio
del arreglo. Solo funciona con enteros positivos sin adaptacion adicional.

Ejemplo con [ 3, 1, 2, 1 ]:
  Conteo: 1 aparece 2 veces, 2 aparece 1 vez, 3 aparece 1 vez
  Resultado: [ 1, 1, 2, 3 ]

---

## Instrucciones para ejecutar

### Requisitos

- Java 17 o superior
- IntelliJ IDEA, Eclipse o VS Code con Extension Pack for Java

### Pasos

1. Clona el repositorio:

   git clone https://github.com/jpulecio-design/Algoritmo-ShellSort-Y-CountingSort-Java

2. Abre el proyecto en tu IDE.

3. Verifica que los archivos .java esten dentro del paquete Ordenamiento
   en la carpeta src/Ordenamiento/.

4. Ejecuta la clase App.java. No se requiere entrada por teclado,
   los datos se generan automaticamente.

5. La consola muestra el arreglo antes y despues de ordenar
   para cada metodo.