package basicosdaniel;

//@author Daniel Guardia Marintez
 
public class BasicosDaniel {
    
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;
        elMasPeque=1;
        chiquitin=99;
        duplicaEntero=999999;
        grande=2;
                
        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.print("Valor entero ");
        System.out.println(entero);
        System.out.print("Valor doble ");
        System.out.println(doble);
        System.out.println("Valor byte " + elMasPeque);
        System.out.println("Valor short " + chiquitin);
        System.out.println("Valor long " + duplicaEntero);
        System.out.println("Valor float " + grande);
    }

    public static void cadenas(){
        char caracter;
        String cadena;
        
        cadena = "Daniel Guardia";
        caracter = 'M';
        
        System.out.println("Valor String " + cadena);
        System.out.println("Valor char " + caracter);
    }
    
    public static void main(String[] args) {
        numericos();
        cadenas();

    }
    
}
