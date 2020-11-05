/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.io.PrintStream;

/**
 *
 * @author chiky
 */
public class Fibonacci {

   public int tamaño;
   public String nombre;
   
   
    public static void main(String[] args) {
        
        long tInicio = 0;
        long tFinal = 0;
        long tTotal = 0;
        double[] tiempos = new double[20];
        int[] serie = new int[20];
        Fibonacci f1 = new Fibonacci("Serie Fibonacci", 40);
        
        for(int i = 0; i<20; i++){
            tInicio = System.currentTimeMillis();
            serie[i] = f1.calcularFibonacci(i);
            tFinal = System.currentTimeMillis();
            tTotal = tFinal - tInicio;
            tiempos[i] = tTotal;
            
        }
        
        
        Grafica g = new Grafica("n", "Tiempo", "Serie de Fibonacci con recursividad");
        g.agregarSerie(" ", tiempos);
        g.crearGrafica();
        g.muestraGrafica();
        
        
    }
    
   
    public Fibonacci(String nombre, int tamaño){
        this.nombre = nombre; 
        this.tamaño = tamaño;
        
    }
    
    
    
    int calcularFibonacci(int n){
    if (n>1){
       return calcularFibonacci(n-1) + calcularFibonacci(n-2);  //función recursiva
    }
    else if (n==1) {  // caso base
        return 1;
    }
    else if (n==0){  // caso base
        return 0;
    }
    else{ //error
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
    }
}
    public void mostrarSerie(){
        System.out.println(this.nombre+" de tamaño "+this.tamaño+":");
        for(int i = 0; i < tamaño; i++){
            System.out.println(calcularFibonacci(i));
        }
        System.out.println();
    }
    public String getNombre(){
        return nombre; 
    }
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public int getTamaño(){
        return tamaño;
    }
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    
}
