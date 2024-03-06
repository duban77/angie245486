
package ClasesYObjetos;


public class coche
{
    //Atributos
   String color;
   String marca;
   String año;
   String motor;
   String bateria;
   String trasmicion;
    
   int km;
   
   //Metodo
   public static void main ( String [] args )
   {
       coche coche1 = new coche();
       
       coche1. color = " Blanco ";
       coche1. marca = " audi ";
       coche1.km = 0;
       
       System.out.println ( "El color del coche1 es: "+coche1.color);
       System.out.println ( "La marca del coche 1 es: "+coche1.marca);
       System.out.println ( "El kilometraje del coche1 es: "+coche1.km);
       
       coche coche2 = new coche ();
       
       coche2.color = "Rojo";
       coche2.marca= " Ferrari";
       coche2.km= 100;
       
        System.out.println ( "El color del coche2 es: "+coche2.color);
       System.out.println ( "La marca del coche 2 es: "+coche2.marca);
       System.out.println ( "El kilometraje del coche2 es: "+coche2.km);
       
       coche coche3 = new coche ();
       
       coche3.color = "azul";
       coche3.marca= " mazda";
       coche3.km= 25 ;
       coche3.año = "2022";

       System.out.println ( "El color del coche3 es: "+coche3.color);
       System.out.println ( "La marca del coche3 es: "+coche3.marca);
       System.out.println ( "El kilometraje del coche3 es: "+coche3.km);
       System.out.println ( "El año del coche3 es: "+coche3.año);
       
      
       
       coche coche4 = new coche ();
       
       coche4.color = "negro";
       coche4.marca= " mercedes";
       coche4.km= 400;
       coche4.año = "2024";
       coche4.motor = "gasolina";
      

       System.out.println ( "El color del coche4 es: "+coche4.color);
       System.out.println ( "La marca del coche4 es: "+coche4.marca);
       System.out.println ( "El kilometraje del coche4 es: "+coche4.km);
       System.out.println ( "El año del coche4 es: "+coche4.año);
       System.out.println ( "El motor del coche4 es: "+coche4.año);
       
       
       coche coche5 = new coche ();
       
       coche5.color = "gris";
       coche5.marca= " for ";
       coche5.km= 400;
       coche5.año = "2025";
       coche5.motor = "gasolina";
       coche5.bateria = "recargable";
      

       System.out.println ( "El color del coche5 es: "+coche5.color);
       System.out.println ( "La marca del coche5 es: "+coche5.marca);
       System.out.println ( "El kilometraje del coche5 es: "+coche5.km);
       System.out.println ( "El año del coche5 es: "+coche5.año);
       System.out.println ( "La bateria del coche5 es: "+coche5.bateria);
       
       
        coche coche6 = new coche ();
       
       coche6.color = "negro";
       coche6.marca= " chevrolet";
       coche6.km= 100;
       coche6.año = "2021";
       coche6.motor = "gasolina";
       coche6.bateria = "recargable";
       coche6.trasmicion = "manual";

       System.out.println ( "El color del coche6 es: "+coche6.color);
       System.out.println ( "La marca del coche6 es: "+coche6.marca);
       System.out.println ( "El kilometraje del coche6 es: "+coche6.km);
       System.out.println ( "El año del coche6 es: "+coche6.año);
       System.out.println ( "La bateria del coche6 es: "+coche6.trasmicion);
       
       
       
   }
    
}
