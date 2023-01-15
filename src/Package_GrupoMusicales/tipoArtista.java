package Package_GrupoMusicales;

public class tipoArtista extends Artista{

    private String generoArtista;

    public tipoArtista(String nombreArtista, String anioNac, String generoArtista) {
        super(nombreArtista, anioNac);
        this.generoArtista = generoArtista;
    }

    public void setGeneroArtista(String generoArtista) {
        this.generoArtista = generoArtista;
    }

    public String getGeneroArtista() {
        return generoArtista;
    }

    @Override
    public void imprimirAtributo() {
        super.imprimirAtributo();
        System.out.println("Genero: "+generoArtista);
    }
}
