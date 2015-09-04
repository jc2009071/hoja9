Usted es el encargado de venta de boletos en una empresa de autobuses extraurbanos de la República de Guatemala. Para apoyo de sus labores usted mantiene un grafo (con dirección), cuyos nodos son las cabeceras departamentales de Guatemala y los arcos son la distancia, expresada en KM, que existe entre un par de cabeceras.
Debido a los recientes estragos que ha causado el invierno en nuestra red vial, usted se ve en la necesidad de actualizar constantemente su grafo, para indicar que no existe conexión directa entre algún par de cabeceras. Al efectuar esa modificación, usted necesita que el programa le indique nuevamente la distancia más corta y la ruta a tomar para viajar entre cualquier par de cabeceras.
Su programa lee un archivo txt que representa el grafo. Cada línea tiene:
Cabecera1 cabecera2 Kilometraje
Esto indica los nombres de las cabeceras 1 y 2, y cuantos KM hay de la cabecera1 a la cabecera2. Recuerde este es un grafo con direcciones.
Luego de leer el archivo, se construye el grafo y se aplica el algoritmo de Floyd para calcular la distancia más corta entre cualquier par de cabeceras.
Las opciones de su programa, en una repetición, son:
1. Preguntar el nombre de la cabecera origen y cabecera destino. El programa mostrará el valor de la ruta más corta y los nombres de las cabeceras intermedias por donde pasa esa ruta.
2. Modificar el grafo indicando algunos de los siguientes datos: a)hay interrupción de tráfico entre un par de cabeceras o b)se establece una conexión entre cabecera1 y cabecera2 con valor de x KM de distancia. Al fin de estas modificaciones de recalculan las rutas más cortas.
3. Finalizar el programa.