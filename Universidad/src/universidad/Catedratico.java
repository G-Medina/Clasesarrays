
package universidad;


public class Catedratico {
    private String nombrecatedratico;
    private String codigocatedrarico; 
    private String Claseimpartidas; 
    private String horariosdeclase; 

    public String getNombrecatedratico() {
        return nombrecatedratico;
    }

    public void setNombrecatedratico(String nombrecatedratico) {
        this.nombrecatedratico = nombrecatedratico;
    }

    public String getCodigocatedrarico() {
        return codigocatedrarico;
    }

    public void setCodigocatedrarico(String codigocatedrarico) {
        this.codigocatedrarico = codigocatedrarico;
    }

    public String getClaseimpartidas() {
        return Claseimpartidas;
    }

    public void setClaseimpartidas(String Claseimpartidas) {
        this.Claseimpartidas = Claseimpartidas;
    }

    public String getHorariosdeclase() {
        return horariosdeclase;
    }

    public void setHorariosdeclase(String horariosdeclase) {
        this.horariosdeclase = horariosdeclase;
    }



    @Override
    public String toString() {
        return "Catedratico{" + "nombrecatedratico=" + nombrecatedratico + ", codigocatedrarico=" + codigocatedrarico + ", Claseimpartidas=" + Claseimpartidas + ", horariosdeclase=" + horariosdeclase + '}';
    }

    
    
    
    
}
