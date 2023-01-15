package Package_Comida;

public class Platillo {
    private String nombrePlatillo;

    public Platillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void imprimirPlato(){
        System.out.println("Nombre del platillo: "+nombrePlatillo);
    }
}
