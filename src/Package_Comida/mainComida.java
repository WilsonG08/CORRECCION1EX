package Package_Comida;

import java.util.ArrayList;
import java.util.List;

public class mainComida {
    public static void main(String[] args) {

        try{

            List listaComida = new ArrayList();

            listaComida.add(new Platillo("Encebollado"));
            listaComida.add(new Origen("Encocado","Ecuador"));
            listaComida.add(new ComidaPais("Seco de pollo","Ecuador","Plato fuerte"));

            // MAS DATOS QUEMADOS

            listaComida.add(new Platillo("Ramen"));
            listaComida.add(new Origen("Sushi","Japón"));
            listaComida.add(new ComidaPais("Mochi","Japón","Postre"));

            //IMPRESION A TRAVES DEL LLAMADO DE UNA FUNCION
            imprimirListasComida((ArrayList) listaComida);

        }catch (Exception error){
            System.out.println("Error al momento de ejecutar");
        }

    }

    private static void imprimirListasComida(ArrayList lista){
        for (int i = 0; i < lista.size();i++){
            System.out.println("[ "+(i+1)+" ]");
            Platillo plat= (Platillo) lista.get(i);

            plat.imprimirPlato();
            System.out.println("  ");
        }
    }
}
