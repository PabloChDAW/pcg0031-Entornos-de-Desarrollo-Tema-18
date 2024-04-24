/**
 * ENTORNOS DE DESARROLLO, TEMA 18 - CONTROL DE VERSIONES
 * Aplicación de ejemplo para practicar con Git
 */

 import java.util.Scanner;

 public class App {
     //Mensajes al usuario
     private static final String MENU = "\tMenú:\n1.Nueva página " +
     "2.Modificar página 3.Mostrar página 4.Mostrar todo 5.Borrar página "
         + "6.Salir\nElige un número: ";
     private static final String ANADIR_PAG_NUM = "Introduce el número " +
         "de página: ";
     private static final String ANADIR_PAG_CONTENIDO = "Introduce el " +
         "contenido: ";
     private static final String ANADIR_PAG_ERROR = "No se ha podido crear " +
         "la nueva página. Ya existe una página con el número ";
     private static final String MOD_PAG_NUM = "número de página que quieres "
         + "modificar: ";
     private static final String MOD_PAG_CONTENIDO = "Introduce el nuevo "
         + "contenido: ";
     private static final String MOD_PAG_ERROR = "No se ha podido realizar " + 
         "el cambio. No hay ninguna página con el número ";
     private static final String MOSTRAR_PAG_NUM = "número de página que " +
             "quieres ver: ";
     private static final String MOSTRAR_PAG_ERROR = "No hay ninguna página " +
         "con el número ";
     private static final String MOSTRAR_TODO = "Contenido del libro: ";
     private static final String BORRAR_PAG_NUM = "Número de página que " +
         "quieres borrar: ";
     private static final String BORRAR_PAG_ERROR = "No hay ninguna página " +
         "con el número ";
     private static final String SALIR = "Saliendo del sistema...";
     private static final String OPCION_NO_VALIDA = "Opción no válida. Por " +
         "favor, introduce un número del 1 al 6.";
 
     public static void main(String[] args) throws Exception {
         Libro libro = new Libro();
 
         Scanner entrada = new Scanner(System.in);
         int opcion = 0;
 
         /**
          * Este bucle atrapa la ejecución en el menú de opciones a través
          * del cual se puede accecer a cada método, hasta que el usuario
          * introduzca el número 6 para salir.
          * En cada opción se comprueba una condición (que depende del
          * valor booleano que lanza cada método) para controlar el caso
          * en el que se quiera actuar sobre una página inexistente.
          */
         do {
             System.out.println(MENU);
             opcion = entrada.nextInt();
             switch (opcion) {
                 case 1:
                     // Añadir página.
                     System.out.println(ANADIR_PAG_NUM);
                     int nuevoNum = entrada.nextInt();
                     System.out.println(ANADIR_PAG_CONTENIDO);
                     String nuevoContenido = entrada.next();
                     //Si no existe una página con ese número, se añade.
                     if (!libro.anadirPagina(nuevoNum, nuevoContenido)) {
                         System.out.println(ANADIR_PAG_ERROR + nuevoNum);
                     }
                     break;
                 case 2:
                     // Modificar página.
                     System.out.println(MOD_PAG_NUM);
                     int numPag = entrada.nextInt();
                     System.out.println(MOD_PAG_CONTENIDO);
                     String contenidoMod = entrada.next();
                     // Si existe la página, se modifica su contenido.
                     if (!libro.modificarPagina(numPag, contenidoMod)) {
                         System.out.println(MOD_PAG_ERROR + numPag);
                     }
                     break;
                 case 3:
                     // Mostrar página.
                     System.out.println(MOSTRAR_PAG_NUM);
                     int verNum = entrada.nextInt();
                     // Si existe la página, se muestra.
                     if (!libro.mostrarPagina(verNum)) {
                         System.out.println(MOSTRAR_PAG_ERROR + verNum);
                     }
                     break;
                 case 4:
                     // Mostrar todo el libro
                     System.out.println(MOSTRAR_TODO);
                     libro.concatenarToString();
                     break;
                 case 5:
                     // Borrar página.
                     System.out.println(BORRAR_PAG_NUM);
                     int borrarNum = entrada.nextInt();
                     // Si la página existe, se borra.
                     if (!libro.borrarPagina(borrarNum)) {
                         System.out.println(BORRAR_PAG_ERROR + borrarNum);
                     }
                     break;
                 case 6:
                     System.out.println(SALIR);
                     break;
                 default:
                     System.out.println(OPCION_NO_VALIDA);
             }
         } while (opcion != 6);
 
         entrada.close();
     }
 }
 