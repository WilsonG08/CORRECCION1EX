package Package_GrupoMusicales;

public class Artista {
    private String nombreArtista;
    private String anioNac;


    public Artista(String nombreArtista, String anioNac) {
        this.nombreArtista = nombreArtista;
        this.anioNac = anioNac;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public void setAnioNac(String anioNac) {
        this.anioNac = anioNac;
    }

    public void imprimirAtributo(){
        System.out.println("[ ]\n"+"Nombre del artista: "+nombreArtista+
                "\t\tAño de nacimiento: "+anioNac);
    }

}
