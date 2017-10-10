------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Vehiculo Rc
PURPOSE OF PROJECT: Exponer las estructura de clases que conforman el sistema
VERSION or DATE: 10/09/2017
HOW TO START THIS PROJECT: 
AUTHOR: Andres Felipe Rodriguez Castañeda
ID: C.C 1015420246
USER INSTRUCTIONS: 

1. Descargar Proyecto VehiculoRC del repositorio github.com/andresr5/calculadoraRC 
2. Ejecutar clase  ClienteVehiculoRC.java ubicada en el paquete  com.vehiculo.rc.cliente;
3. El sistema muestra el mensaje: " 1. Ingresar Tamaño Autopista en el formato[n,m]"
    -El usuario debe ingresar el comando que dara tamaño a la superficie con el siguiente formato: [n,m]
     Al inicializar la matriz el vehiculo se ubica automaticamente en la posición de la fila mayor y la columna 0;
    -Como ejemplo:  Es decir si el usuario desea iniciar la matriz con una dimensión [3,3] de ingresar el comando "3,3":
    - En este escenario el sistema muestra una matriz asi:
        
        0000
        0000
        0000
        V000
   
    la letra V representa la posicion del vehiculo en la matriz.
   
4. Posterior a esto el sistema muestra el mensaje: "2. Ingrese un Desplazamiento en el siguiente formato [Pasos][Cardinalidad]."
   - El usuario debe ingresar la cantidad de desplazamiento a realizar y la cardinalidad hacia donde se desplazara el vehiculo,
   - Como ejemplo: Si el usuario desea mover el vehiculo en dirección dos posiciones Este  debe ingresar el comando: "2E" 
   - En este escenario el sistema mostraria la matriz de la siguiente forma:
        
        0000
        0000
        0000
        00V0
        
        
5. En caso de ingresar mal cualquiera de los comandos el sistema muestra el siguiente error: "Error en formato de comando" 
6. En caso de ingresar un comando que exceda el limite del tamaño de la matriz muestra 
   el siguiente mensaje de error:"Se ha detenido el avance por salir de los límites".


7. -En el escenario de el ejemplo Al final el sistema muestra el mensaje:"La posicion Final del Elemento es : [3,2]"        





8- El proyecto  web es de nombre VehiculoRcWeb se debe descargar y desplegar en un servidor tomcat.

   - El cliente Angular No fue terminado. Se puede consumir via postman utilizando la URL "http://localhost:8080/VehiculoRCWeb/rest/vehiculoRC/desplazar".
