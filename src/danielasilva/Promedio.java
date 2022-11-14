package danielasilva;

public class Promedio {
    static float promedioProductos;
    
    //creacion del metodo promedio:
    /* Para usarlo otra clase (ApoyoContable) debe colocar su nombre (promedio) y pasarle los valores
    enteros o dobles respectivos (en este caso productoUno, productoDos, etc)
    - producto1, producto2, etc -> referencia (no necesariamente debe llamarse igual)
    se le coloca otro nombre para no editar la variable inicial (en la otra clase) porque puede 
    que ese valor se use en otra clase */
    public float promedio(int producto1, int producto2, double producto3, double producto4, double producto5)
    {
        //se realiza la operación y se realiza el casting para entregar el dato como float
        promedioProductos = (float) ((producto1 + producto2 + producto3 + producto4 + producto5)/5);
        //se retorna
        return promedioProductos;
    }    
}
