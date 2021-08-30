4. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.

5. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

6. Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().

7. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.

8. Crear un programa que dado un numero determine si es par o impar.

9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.

10. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

11. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

12. Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba”

13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.

14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.

15. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

16. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

17. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().

18. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

19. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

21. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

22. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.

23. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido

24. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

25. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas.

26. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).

27. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.

28. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
-------------------------------------------------------------------------------------------------------------------
EJERCICIOS EXTRA

1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas. 

2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.

3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.

4. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.

9. Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

11. Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.

12. Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

16. Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

17. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.

20. Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
