
package bol9.pkg1;
import javax.swing.JOptionPane;


/**
 *
 * @author Pablite5
 */
public class Comparar {
   
   public static void compararNumero(){
       int contador1=0;
       int contador2=0;
       int contador3=0;
       int i=0;
       while(i<10){
       int n = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
       if(n>0){
           System.out.println("positivo");
           contador1++;
       }
       else if(n<0){
           System.out.println("negativo");
           contador2++;
       }
       else{
           System.out.println("igual a cero");
           contador3++;
       }
       i++;
       }
       System.out.println("positivos: " + contador1);
       System.out.println("negativos: " + contador2);
       System.out.println("iguales a cero: " + contador3);
   }
   



       
   }
    
    
    

