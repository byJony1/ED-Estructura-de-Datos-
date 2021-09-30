# ED (Estructura de Datos)
Repositorio de la asignatura Estructuda de Datos de segundo año de ingenieria informatica en la Escuela de Ingenieria Informatica (EII).

Se trata de un backup de todas las prácticas de laboratorio de la asignatura cursada en segundo. Todos los archivos seran visibles.

Las practicas constaran de recursividad en gran parte a parte de utilizar distintos tipos de estructuras de datos como grafos, arboles, tablas hash...

## Primera practica
En la primera practica se trata el tema de la recursividad vs iteratividad con diferentes cargas para varios algoritmos.

Se trabajaron 3 funciones principales:
* factorial(double n) --> Esta funcion calcula y devuelve el factorial de un numero n cualquiera (limite 170)
* potenciaBase2(double n) --> Esta funcion calcula y devuelve la potencia en base 2 de un exponente n (limite por comprobar)
* fibonacci(double n) --> Esta funcion calcula y devuelve el numero n de la serie de fibonnaci.

Estas funciones se encuentran implementadas tanto de forma recursiva como iterativa. Para llamar a la funciones en forma iterativa se llama de la misma forma que a las otras recursivas solo que se añade "Iterativo" al final del nombre de la funcion.

## Segunda practica
En la segunda practica hacemos uso de los algoritmos anteriormente creados para hacer un estudio de complejidades en el tiempo para diferentes cargas. El nuevo proyecto incorpora nuevas versiones de potencia en base 2, implementado en diferentes complejidades. Tambien se incluye nuevas funciones como lineal(), cuadratica(), cubica() y logaritmica() que representan a la perfeccion la complejidad teorica de los algoritmos. Estas 4 ultimas funciones tienen su version con el metodo doNothing(), que para el hilo principal de ejecucion durante 250 ms para asi poder calcular tiempos de ejecucion.

Dentro del propio proyecto se encuentran disponibles los resultados de medir los diferentes tiempos de ejecucion para los diferentes metodos con sus respectivas cargas (formato csv).

Tambien se encuentra un pdf y un excel con las diferentes graficas y sus diferentes tiempo de ejecucion y cargas.
