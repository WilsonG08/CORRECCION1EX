package Package_Videojuegos;

public class Equipamiento extends Personaje {

    String[] arma;
    private  int cantidadBalas;

    public Equipamiento() {
        this.arma = arma;
        this.cantidadBalas = cantidadBalas;
    }

    public String[] getArma() {
        return arma;
    }

    public void setArma(String[] arma) {
        this.arma = arma;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }
}
