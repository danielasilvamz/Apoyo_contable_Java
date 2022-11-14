//La explicacion general del programa se encuentra en el archivo tipo README
package danielasilva;
//Se importa el paquete java.util
import java.util.Scanner;

public class ApoyoContable {
    //Atributos de contexto global (valida para todos los metodos)
    static int productoUno;
    static int productoDos;
    static double productoTres;
    static double productoCuatro;
    static double productoCinco;
    static float sumaProductos;
    static float multiplicacionProductos;
    static float promedioProductos;
    
    // metodo principal
    public static void main(String[] args) {
        //Atributos de contexto local (validos para el metodo en que los declaro)
        //Variables que atrapan datos del usuario:
        String entradaTecladoUno = ""; //es un string porque el dato de retorno de nextLine es string
        String entradaTecladoDos = "";
        String entradaTecladoTres = "";
        String entradaTecladoCuatro = "";
        String entradaTecladoCinco = "";
        
        //Solicitar al usuario datos de entrada:
        System.out.println("Por favor introduzca el valor del primer producto:");
        //Nuevo objeto de tipo Scanner: se instancia clase de libreria de java
        Scanner entradaEscanerUno = new Scanner (System.in);
        //Se atrapa lo que ingresa el usuario en una variable:
        entradaTecladoUno = entradaEscanerUno.nextLine (); //guarda valor string
        
        System.out.println("Por favor introduzca el valor del segundo producto:");
        Scanner entradaEscanerDos = new Scanner (System.in);
        entradaTecladoDos = entradaEscanerDos.nextLine (); 
        
        System.out.println("Por favor introduzca el valor del tercer producto:");
        Scanner entradaEscanerTres = new Scanner (System.in);
        entradaTecladoTres = entradaEscanerTres.nextLine ();
        
        System.out.println("Por favor introduzca el valor del cuarto producto:");
        Scanner entradaEscanerCuatro = new Scanner (System.in);
        entradaTecladoCuatro = entradaEscanerCuatro.nextLine ();
        
        System.out.println("Por favor introduzca el valor del quinto producto:");
        Scanner entradaEscanerCinco = new Scanner (System.in);
        entradaTecladoCinco = entradaEscanerCinco.nextLine (); 
        
        System.out.println("Los valores que ha ingresado son: " + entradaTecladoUno + ", " + entradaTecladoDos + ", "
        + entradaTecladoTres + ", " + entradaTecladoCuatro + ", " + entradaTecladoCinco);
        
        //Se realiza Casting para convertir los datos de string a entero o double respectivamente
        productoUno = Integer.parseInt (entradaTecladoUno);
        productoDos = Integer.parseInt (entradaTecladoDos);
        productoTres = Double.parseDouble (entradaTecladoTres);
        productoCuatro = Double.parseDouble (entradaTecladoCuatro);
        productoCinco = Double.parseDouble (entradaTecladoCinco);
        
        //Creacion de un objeto de la clase Suma: (se instancia clase Suma)
        Suma obteniendoSumaProductos = new Suma();
        sumaProductos = obteniendoSumaProductos.suma(productoUno, productoDos, productoTres, productoCuatro, productoCinco);
        //suma -> metodo de la otra clase
        System.out.println("La suma de los productos es: " + sumaProductos);
        
        //Creacion de un objeto de la clase Multiplicacion: (se instancia clase Multiplicacion)
        Multiplicacion obteniendoMultiplicacionProductos = new Multiplicacion();
        multiplicacionProductos = obteniendoMultiplicacionProductos.multiplicacion(productoUno, productoDos, productoTres, productoCuatro, productoCinco);
        System.out.println("La multiplicacion de los productos es: " + multiplicacionProductos);
        
        //Creacion de un objeto de la clase Promedio: (se instancia clase Promedio)
        Promedio obteniendoPromedioProductos = new Promedio();
        promedioProductos = obteniendoPromedioProductos.promedio(productoUno, productoDos, productoTres, productoCuatro, productoCinco);
        System.out.println("El promedio de los productos es: " + promedioProductos);
    }  
}
