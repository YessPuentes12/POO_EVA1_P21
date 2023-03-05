/*

 */
package eva1_21_static_3;


public class EVA1_21_static_3 {

    
    public static void main(String[] args) {
   System.out.println(prueba.valor);
       
   prueba.valor++;
   System.out.println(prueba.valor);
      
      
 PruebaObj obj=new PruebaObj();
   System.out.println(obj.valor);
    obj.valor++;
   System.out.println(obj.valor);
    }
 //con clases se tienen mas variables     
}
class prueba{
    public static int valor=100;
}

class PruebaObj{
    public int valor=200;
}