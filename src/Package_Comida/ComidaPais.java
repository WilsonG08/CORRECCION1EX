package Package_Comida;

public class ComidaPais extends Origen{
    private String tipo;

    public ComidaPais(String nombrePlatillo, String paisOrigen, String tipo) {
        super(nombrePlatillo, paisOrigen);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimirPlato() {
        super.imprimirPlato();
        System.out.println("Tipo de comida: "+tipo);
    }
}
