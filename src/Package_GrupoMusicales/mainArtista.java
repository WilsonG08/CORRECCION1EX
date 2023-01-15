package Package_GrupoMusicales;

import java.util.ArrayList;
import java.util.List;

public class mainArtista {
    public static void main(String[] args) {
        List listaArtistas = new ArrayList();

        try{

            listaArtistas.add(new Artista("Romeo Santos","21/06/1981"));
            listaArtistas.add(new tipoArtista("Arcangel","23/12/1985","Urbano-Latino"));
            listaArtistas.add(new Discos("Marqués","10/04/1986","Romanticas","Un brindis"));

            imprimirListas((ArrayList)listaArtistas );


        }catch (Exception error){
            System.out.println("Error al momento de compilar");
        }
    }

    private static void imprimirListas(ArrayList lista){
        for (int i = 0; i < lista.size();i++){
            Artista art= (Artista) lista.get(i);

            art.imprimirAtributo();
            System.out.println("  ");
        }
    }
}
