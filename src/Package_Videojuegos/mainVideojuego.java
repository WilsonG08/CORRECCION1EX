package Package_Videojuegos;
import java.util.Scanner;

public class mainVideojuego {

    static Scanner sc = new Scanner(System.in);

    // LLAMANDO
    static Videojuegos vdj =  new Videojuegos();

    public static void main(String[] args) {

        String name;
        int ele=0,a,opcion=0;

        //CONTROL DE ERRORES
        try{
            System.out.print("Cuantos elementos desea ingresar?: ");
            ele = sc.nextInt();

            String[] nombre = new String[ele];
            String[] nombrePer = new String[ele];
            String[] nombreArma = new String[ele];
            int[] anio= new int[ele];
            int[] vidaPer= new int[ele];
            int[] cantidad= new int[ele];


            System.out.println("\n [ V I D E O J U E G O S\n");
            //INGRESO DEL NOMBRE Y AÑO DEL VIDEOJUEGO
            ingresoVideojuego(ele,nombre,anio);

            //INGRESO DEL NOMBRE DEL PERSONAJE Y VIDA DEL PERSONAJE
            ingresoPersonaje(ele,nombrePer,vidaPer);

            //INGRESO DEL NOMBRE DEL ARMA Y CANTIDAD
            ingresoEquipamiento(ele,nombreArma,cantidad);

            //IMPRESION DEL RESULTADO
            impresionArray(ele,nombre,anio,nombrePer,vidaPer,nombreArma,cantidad);

        }catch (Exception error){

            System.err.println("Se produjo un error al ingresar los datos!!");
        }

    }

    private static void ingresoVideojuego(int ele, String[] nombre, int[] anio){
        for (int i = 0; i<ele;i++){
            System.out.print("\nIngrese el nombre ["+(i+1)+"] : ");
            sc.nextLine();// PARA PODER INGRESAR UNA CADENA DE TEXTO CON ESPACIOS
            String cadena = sc.nextLine();
            vdj.setNombreVideo(new String[]{nombre[i] = cadena});
            System.out.print("Ingrese el año ["+(i+1)+"] : ");
            vdj.setAnioFab( anio[i] = sc.nextInt());
        }
    }

    private static void ingresoPersonaje(int ele, String[] nombrePer, int[] vidaPer){
        for (int i = 0; i<ele;i++){
            System.out.print("\nIngrese el nombre del Personaje["+(i+1)+"] : ");
            sc.nextLine();// PARA PODER INGRESAR UNA CADENA DE TEXTO CON ESPACIOS
            String cadena = sc.nextLine();
            vdj.setNombreVideo(new String[]{nombrePer[i] = cadena});
            System.out.print("Ingrese la cantidad de vida ["+(i+1)+"] : ");
            vdj.setAnioFab( vidaPer[i] = sc.nextInt());
        }
    }

    private static void ingresoEquipamiento(int ele, String[] nombreArma, int[] cantidad){
        for (int i = 0; i<ele;i++){
            System.out.print("\nIngrese el nombre del equipamiento["+(i+1)+"] : ");
            sc.nextLine();// PARA PODER INGRESAR UNA CADENA DE TEXTO CON ESPACIOS
            String cadena = sc.nextLine();
            vdj.setNombreVideo(new String[]{nombreArma[i] = cadena});
            System.out.print("Ingrese la cantidad ["+(i+1)+"] : ");
            vdj.setAnioFab( cantidad[i] = sc.nextInt());
        }
    }

    private static void impresionArray(int ele, String[] nombre, int[]anio,String[] nombrePer,int[] vidaPer
    ,String[] nombreArma, int[] cantidad){
        for (int i = 0; i<ele;i++){
            System.out.println("\nImpresion del elemento \t["+(i+1)+"]\n");
            System.out.println("El nombre del ["+(i+1)+"]  es: "+nombre[i]+"\t\t\t"+
                    "Del Año: "+anio[i]);
            System.out.println("Nombre del Personaje: "+nombrePer[i]+"\t\t\t"+
                    "Cantidad de vida: "+vidaPer[i]);
            System.out.println("Nombre del Equipamiento: "+nombreArma[i]+
                    "\t\t\t"+"Cantidad: "+cantidad[i]);
        }
    }

}
