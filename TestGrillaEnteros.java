package Ejercicio2;

public class TestGrillaEnteros{

    private static void mostrarGrilla(GrillaEnteros grilla){
        int filas = grilla.obtenerFilas();
        int columnas = grilla.obtenerColumnas();
        for (int i=0; i<filas ;i++ ) {
            for (int j=0; j<columnas ; j++) {
                if (j!=0)
                    System.out.print("  ");
                System.out.print(""+grilla.obtener(i+1,j+1));                
            }
            System.out.println();            
        }
    }

    public static void main(String[] args) {
        GrillaEnteros grilla1 = new GrillaEnteros(5,6);
        mostrarGrilla(grilla1);
        grilla1.intercambiar(2,4);
        System.out.println("Se intercambio la fila 2 con la 4");
        mostrarGrilla(grilla1);
        grilla1.reemplazar(3,6); 
        System.out.println("Se reemplazaron todas las apariciones del elemento 3 por el elemento 6");    
        mostrarGrilla(grilla1);   
        grilla1.reemplazar(2,5); 
        System.out.println("Se reemplazaron todas las apariciones del elemento 2 por el elemento 5");    
        mostrarGrilla(grilla1);    
        grilla1.reemplazarPrimera(1,7); 
        System.out.println("Se reemplazo la primera aparicion del elemento 1 por el elemento 7");    
        mostrarGrilla(grilla1);    
        grilla1.reemplazarPrimera(6,9); 
        System.out.println("Se reemplazo la primera aparicion del elemento 6 por el elemento 9");    
        mostrarGrilla(grilla1); 
        System.out.println("El elemento 6 aparece en "+grilla1.contarFilas(6)+" filas");
        System.out.println("El elemento 5 aparece en "+grilla1.contarFilas(5)+" filas");
        System.out.println("El elemento 7 aparece en "+grilla1.contarFilas(7)+" filas");
        System.out.println("El elemento 9 aparece en "+grilla1.contarFilas(9)+" filas");        
    }
}