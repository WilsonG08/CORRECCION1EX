package Package_Videojuegos;

public class Personaje extends Videojuegos {

    String[] nombrePersonaje;
    private int cantidadVida;

    public Personaje() {
        this.nombrePersonaje = nombrePersonaje;
        this.cantidadVida = cantidadVida;
    }

    public String[] getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String[] nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

}
