package Reto4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

/**
 *
 * @Equipo: John Sebastian Gomez Gonzalez    c.c 1000084363
 *          Sebastian Aristizabal Castañeda  c.c 1000639678
 */
public class Empresa {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        boolean entrada = true;
        while (entrada) {    
            switch (menu()) {
                case "1":  
                    Panel panel = new Panel();
                    System.out.println("Ingrese el id del panel a registrar: ");
                    panel.setId(lector.nextInt());
                    System.out.println("Ingrese la serie del panel: ");
                    panel.setIdSerie(lector.nextLine());
                    System.out.println("Ingrese la descripción del panel: ");
                    panel.setDescripcion(lector.nextLine());
                    System.out.println("Ingrese el tipo de panel: ");
                    panel.setTipo(lector.nextLine());
                    System.out.println("Ingrese el modelo del panel: ");
                    panel.setModelo(lector.nextLine());
                    System.out.println("Ingrese le precio del panel");
                    panel.setPrecio(lector.nextInt());
                    break;
                case "2":
                    Venta venta = new Venta();
                    System.out.println("Ingrese el id del panel: ");
                    venta.setIdPanel(lector.nextInt());
                    System.out.println("La hora de la venta es: ");
                    venta.getFechaHoraVenta();
                    System.out.println("Ingrese el tipo de documento del comprador: ");
                    venta.setTipoDocumentoComprador(lector.nextLine());
                    System.out.println("Ingrese el número de documento del comprador: ");
                    venta.setNroDocumentoComprador(lector.nextInt());
                    System.out.println("Ingrese el nombre del comprador: ");
                    venta.setNombreComprador(lector.nextLine());
                    System.out.println("Ingrese el precio del panel");
                    venta.setValorPagar(lector.nextInt());  
                    System.out.println("Ingrese una breve descripción del uso que le dará al panel: ");
                    venta.setDescripcionUso(lector.nextLine());                     
                    break;
                case "3":
                    Seguro seguro = new Seguro();
                    System.out.println("Ingrese el nombre de la empresa de seguro: ");
                    seguro.setNombreEmpresa(lector.nextLine());
                    System.out.println("A continuación verá la fecha inicio del seguro: ");
                    seguro.getFechaInicio();
                    System.out.println("A continuación verá la fecha fin del seguro: ");
                    seguro.getFechaFin();
                    System.out.println("Ingrese la descripción: ");
                    seguro.setDescripcion(lector.nextLine());
                    System.out.println("Ingrese el id del panel: ");
                    seguro.setIdPanel(lector.nextInt());                    
                    break;
                case "4":

                    break;
                case "5":
                    Venta diasVenta = new Venta();
                    System.out.println("Los días que han pasado son: ");
                    diasVenta.getDiasVenta();
                    break;
                case "6":
                    Seguro diasSeguro = new Seguro();
                    System.out.println("Los días que tiene el seguro son: ");
                    diasSeguro.getDiasCobertura();
                    break;
                case "7":
                    entrada = false;
                    break;
                default: 
                    System.out.println("Opción no valida");
            }
            
        }
        
        //
        
        
    }
    
        public static String menu(){
        Scanner leer = new Scanner(System.in);
        String opcion;
        
        System.out.print("-------------BIENVENIDO------------- "
            + "¿Que operacion desea realizar? "
            + "1) Ingresar panel "
            + "2) Ingresar venta "
            + "3) Ingresar seguro "
            + "4) Ver paneles ingresados "
            + "5) Ver ventas ingresadas "  
            + "6) Ver seguros ingresados"   
            + "7) SALIR "
            + "INGRESE EL NUMERO DE LA OPERACION: ");
        opcion = leer.nextLine();
        
        return opcion;
    }

}

