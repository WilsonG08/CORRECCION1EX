package Package_Comida;

import com.sun.security.jgss.GSSUtil;

public class Origen extends Platillo{
    private String paisOrigen;

    public Origen(String nombrePlatillo, String paisOrigen) {
        super(nombrePlatillo);
        this.paisOrigen = paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public void imprimirPlato() {
        super.imprimirPlato();
        System.out.println("Pais de origen : "+paisOrigen);
    }
}
