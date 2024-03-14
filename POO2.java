


package Triangulos;

import javax.swing.JOptionPane;

public class Triangulo
{
    
    //atributos 
    int lado1;
    int lado2;
    int lado3;
   int equilatero;
   int isoceles;
   int escalenos;
      
    
    public void leerNumeros ()
    {
  
    lado1=Integer.parseInt(JOptionPane.showInputDialog("Digite el pimer lado : "));
        lado2=Integer.parseInt(JOptionPane.showInputDialog("Digite el suegundo lado : "));
        lado3=Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer lado : "));
    }
    
    public void equilateros ()
    {
        if((lado1 == lado2 )&&(lado2 ==lado3)){
        }
            
        
    }
    public void isoceles()
    {
       if((lado1==lado2)&&(lado2 !=lado3)||(lado2==lado3)&&(lado3 !=lado1)||(lado1==lado3)&&(lado3!=lado1)){
           
       }
    }
    public void escalenos()
    {
       lado
    }
 
      
}

