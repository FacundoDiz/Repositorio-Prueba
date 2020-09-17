package Ejercicio2;
import java.util.Random;

public class GrillaEnteros{

    // Atributos de instancia

    private int[][] S;
    private String s;
    private int e,a;
    private char u;

    // Constructores

    public GrillaEnteros(int n, int m){
        S = new int[n][m];
        Random gen = new Random();
        for (int i=0; i<n ; i++){
            for (int j=0; j<m ;j++){
                S[i][j] = gen.nextInt(10)+1;
            }
        }                
    }

    // Comandos

    public void intercambiar (int f1, int f2){
        if (f1<=S.length && f2<=S.length){
            int aux;
            for (int j=0; j<S[0].length ; j++){
                aux = S[f1-1][j];
                S[f1-1][j] = S[f2-1][j];
                S[f2-1][j] = aux;                
            }
        }
    }

    public void reemplazar (int v1, int v2){
        for (int i=0; i<S.length ; i++){
            for (int j=0; j<S[0].length ;j++){
                if (S[i][j] == v1)
                    S[i][j] = v2;
            }
        }     
    }

    public void reemplazarPrimera(int v1, int v2){
        boolean encontro;
        for (int i=0; i<S.length; i++ ) {
            encontro = false;
            int j = 0;
            while (!encontro && j<S.length){
                if (S[i][j] == v1){
                    S[i][j] = v2;
                    encontro = true;
                }                
                j++;
            }            
        }
    }

    // Consultas

    public int obtenerFilas(){
        return S.length;
    }

    public int obtenerColumnas(){
        return S[0].length;
    }

    public int obtener(int f, int c){
        return S[f-1][c-1];
    }

    private boolean esta(int elemento, int fila){
        boolean encontro = false;
        int j = 0;
        while (!encontro && j<S[0].length){
            if (S[fila][j]==elemento)
                encontro = true;
            j++;
        }
        return encontro;
    }

    public int contarFilas(int v){
        int cont = 0;
        for (int i=0; i<S.length ;i++ ) {
            if (esta(v,i))
                cont++;            
        }
        return cont;
    }
 }       
