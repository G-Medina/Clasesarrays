
package universidad;

import java.util.ArrayList;


public class Asignatura {
    private String codigoclase;
    private String nombreclase;
    private String horarioclase;
    private int capacidad; 
    
   Alumno al=new Alumno();
   ArrayList<Alumno> alumnos=new ArrayList<>();
   
    

    public String getCodigoclase() {return codigoclase;}

    public void setCodigoclase(String codigoclase) {this.codigoclase = codigoclase;}

    public String getNombreclase() {return nombreclase;}

    public void setNombreclase(String nombreclase) {this.nombreclase = nombreclase; }

    public String getHorarioclase() {return horarioclase; }

    public void setHorarioclase(String horarioclase) { this.horarioclase = horarioclase; }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigoclase=" + codigoclase + ", nombreclase=" + nombreclase + ", horarioclase=" + horarioclase + ", capacidad=" + capacidad + '}';
    }
    
    
    
}
