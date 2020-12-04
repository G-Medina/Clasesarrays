
package universidad;

import java.util.Scanner;

public class Universidad {

    
    public static void main(String[] args) {
        
       Scanner rd=new Scanner(System.in);
       Alumno al=new Alumno();
       al.setNombre("German");
       Asignatura cla=new Asignatura();
               cla.setNombreclase("Programacion a objetos");
       
       
      /* System.out.println(al.getCuenta());
        
        ArrayList<Alumno> alumnos=new ArrayList<>();
        
 
      
        for(Alumno alumno: alumnos){
            System.out.println(alumno);
      }
        
        
        
        
        ArrayList<String> Nombres=new ArrayList<String>();
        Nombres.add("Victoria");
        Nombres.add("Vanessa");
        Nombres.add("German");
        System.out.println(Nombres.contains("Luis"));
        System.out.println(Nombres.indexOf("Vanessa"));
        Nombres.add(1, "Luis");
        
        for(String nombre: Nombres){
            System.out.println(nombre);
            
        }
        for(int x=0; x<Nombres.size();x++){
            System.out.println(Nombres.get(x));
        }
        
        */
      Alumno alumno[];
      alumno=new Alumno[5];
      
      alumno[0]=al;
      alumno[0].getNombre();
      System.out.println(alumno[0].toString());
      System.out.println(cla.toString());
      
    }
    
    public static void imprimirInfor(Alumno al){
        System.out.println("Cuenta: "+al.getCuenta()+" Nombre: "+al.getNombre());
        
    }
    
}
