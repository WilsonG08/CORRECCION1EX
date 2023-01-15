package Package_GrupoMusicales;

public class Discos extends tipoArtista{

    String nombreDisco;

    public Discos(String nombreArtista, String anioNac, String generoArtista, String nombreDisco) {
        super(nombreArtista, anioNac, generoArtista);
        this.nombreDisco = nombreDisco;
    }

    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    @Override
    public void imprimirAtributo() {
        super.imprimirAtributo();
        System.out.println("Nombre del disco: "+nombreDisco);
    }
}
