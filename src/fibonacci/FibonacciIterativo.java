package fibonacci;

import java.io.PrintStream;

/**
 *
 * @author chiky
 */
public class FibonacciIterativo {

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
        
        
        Grafica g = new Grafica("n", "Tiempo", "Serie de Fibonacci con Iteratividad");
        g.agregarSerie(" ", tiempos);
        g.crearGrafica();
        g.muestraGrafica();
        
        
    }
    
   
    public FibonacciIterativo(String nombre, int tamaño){
        this.nombre = nombre; 
        this.tamaño = tamaño;
        
    }
    
    
    
    public void calcularFibonacci(int n){
    int num1 = 0, num2 = 1, suma = 1;
        // Muestro el valor inicial
        System.out.println(num1);
         
        for (int i = 1; i < n; i++) 
        {
            System.out.println(suma);
             
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;    
        }
    }
   // public void mostrarSerie(){
     //   System.out.println(this.nombre+" de tamaño "+this.tamaño+":");
     //   for(int i = 0; i < tamaño; i++){
     //       System.out.println(calcularFibonacci(i));
     //   }
     //   System.out.println();
   // }
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