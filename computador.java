package ClasesYObjetos;

public class computador
{
    //atributos
    String fotogramas;
    String generacion;
    String marca;
    String tamaño;
    String color;
    String teclas;
    String fuentedepoder;
    String ventilador;
    String tipodeteclado;
    String pantalla;
    String base;
    String cubierta;
    String cable;
    String tiposdemouse;
    String tipodetorre;
    String resolucion;
    
    
    public static void main (String [] args)
    {
        computador monitor = new computador ();
        
        monitor.color=" gris";
        monitor.pantalla="LCD ";
        monitor.base=" mesa ";
        monitor.marca="asus";
        
        
        System.out.println("el color del monitor: "+monitor.color);
        System.out.println("la pantalla del monitor: "+monitor.pantalla);
        System.out.println("la base del monitor: "+monitor.base);
        System.out.println("la marca del monitor: "+monitor.marca);
                
                
        computador torre = new computador ();
        
        torre.color="negro";
        torre.tipodetorre="micro-ATX";
        torre.ventilador="CNC disparadores maquinados";
        torre.fuentedepoder="ATX ";
        
        System.out.println("el color de la torre es: "+torre.color);
        System.out.println("el tipo de la torre es: "+torre.tipodetorre);
        System.out.println("el ventilador de la torre es: "+torre.ventilador);
        System.out.println("la fuente de poder de la torre es: "+torre.fuentedepoder);
        
        
        
        computador raton = new computador ();
        
        raton.cable=" puertos PS/2";
        raton.color="negro con blanco";
        raton.cubierta="gaming";
        raton.tiposdemouse="gaming";
       
        System.out.println("el cable del raton es: "+raton.cable);
        System.out.println("el color del raton es: "+raton.color);
        System.out.println("la cubierta del raton es: "+raton.cubierta);
        System.out.println("el tipo de raton es: "+raton.tiposdemouse);
        
        computador teclado = new computador ();
        
        teclado.color="blanco";
        teclado.teclas="alfanumericas";
        teclado.generacion="";
        teclado.tamaño="17.5 pulgadas y 6 pulgadas de profundidad";
        teclado.marca="corsair";
        teclado.tipodeteclado=" proyeccion";
        
        
        System.out.println("el color del teclado es: "+teclado.color);
        System.out.println("las teclas del teclado son : "+teclado.teclas);
        System.out.println("la generacion del teclado es: "+teclado.generacion);
        System.out.println("el tamaño del teclado es: "+teclado.tamaño);
        System.out.println("la marca del teclado es: "+teclado.marca);
        System.out.println("el tipo de teclado es: "+teclado.tipodeteclado);
        
        
        computador camara = new computador ();
        
        camara.color="negro";
        camara.resolucion="5.0 megapixeles";
        camara.generacion="1991";
        camara.fotogramas="normal";
        
        System.out.println("el color de la camara es: "+camara.color);
        System.out.println("la resolucion de la camara es: "+camara.resolucion);
        System.out.println("la generacion de la camara es: "+camara.generacion);
        System.out.println("el fotograma de la camara es: "+camara.fotogramas);
        
        
        {
            String cantidaddediscosduros;
            String memoria;
            String marca;
            String 
        }
        
        
     
        
    }




    

}
