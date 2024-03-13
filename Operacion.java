
package CLASESYOBJETOS;
import javax.swing.*;
public class Operacion
{
    //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int mod;
    
    //metodos
    
    //metodos para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros()
    {
        num1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:  "));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:  "));
        
        
    }
    // metodo para sumar ambos numeros
    public void sumar()
    {
        suma = num1+num2;
    }
    //metodo para restar ambos numeros
      public void restar()
    {
        resta = num1-num2;
    }
    //metodo para multiplicar ambos numeros
      public void multiplicacion()
    {
        multiplicacion = num1*num2;
    }
    //metodo para dividir ambos numeros
      public void dividir()
    {
        division = num1/num2;
    }
      //metodo para el mod de ambos numeros
      public void porcentaje()
    {
        mod = num1 % num2;
    }
   
     public void mostrarResultado()
     {
         System.out.println("La suma es :  "+suma);
         System.out.println("La resta es :  "+resta);
         System.out.println("La multiplicacion es :  "+multiplicacion);
         System.out.println("La division es :  "+division);
         System.out.println("El mod es:  "+mod);
     }
    
}
