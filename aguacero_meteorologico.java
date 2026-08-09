import java.util.Scanner;
public class aguacero_meteorologico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] fechas = new String[10];
        String[] horasInicio = new String[10];
        int[] duraciones = new int[10];
        double[] lluvias = new double[10];
        String[] intensidades = new String[10];
        double[] temperaturas = new double[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //----------------------------------------------//
        //--|menu_principal_de_aguacero_meteorologico|--//
        //----------------------------------------------//
        do {
            System.out.println("menu principal de aguacero meteorologico");
            System.out.println("1) Registrar aguacero");
            System.out.println("2) Editar aguacero");
            System.out.println("3) Listar aguaceros");
            System.out.println("4) Buscar aguacero");
            System.out.println("5) Eliminar aguacero");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //------------------------//
                //--|registrar_aguacero|--//
                //------------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del aguacero");
                    System.out.println("id del aguacero a registrar: " + id);
                    System.out.print("fecha del aguacero: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("hora de inicio: ");
                    horasInicio[total] = entrada.nextLine();
                    System.out.print("duracion en minutos: ");
                    duraciones[total] = entrada.nextInt();
                    System.out.print("cantidad de lluvia en milimetros: ");
                    lluvias[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("intensidad de la lluvia: ");
                    intensidades[total] = entrada.nextLine();
                    System.out.print("temperatura registrada: ");
                    temperaturas[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("estado del evento: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Aguacero registrado correctamente.");
                    total++;
                    break;
                //---------------------//
                //--|editar_aguacero|--//
                //---------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen aguaceros registrados.");
                        break;
                    }
                    System.out.println("Datos de los aguaceros");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Fecha: " + fechas[i] + " | Inicio: " + horasInicio[i] + " | Duracion: " + duraciones[i] + " minutos | Lluvia: " + lluvias[i] + " mm | Intensidad: " + intensidades[i] + " | Temperatura: " + temperaturas[i] + " C | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del aguacero: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del aguacero");
                        System.out.print("Nueva fecha: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora de inicio: ");
                        horasInicio[posicion] = entrada.nextLine();
                        System.out.print("Nueva duracion en minutos: ");
                        duraciones[posicion] = entrada.nextInt();
                        System.out.print("Nueva cantidad de lluvia en milimetros: ");
                        lluvias[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nueva intensidad: ");
                        intensidades[posicion] = entrada.nextLine();
                        System.out.print("Nueva temperatura: ");
                        temperaturas[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Aguacero actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|listar_aguaceros|--//
                //----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen aguaceros registrados.");
                    } else {
                        System.out.println("Lista de aguaceros");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Fecha: " + fechas[i] + " | Inicio: " + horasInicio[i] + " | Duracion: " + duraciones[i] + " minutos | Lluvia: " + lluvias[i] + " mm | Intensidad: " + intensidades[i] + " | Temperatura: " + temperaturas[i] + " C | Estado: " + estados[i]);
                        }
                    }
                    break;
                //---------------------//
                //--|buscar_aguacero|--//
                //---------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen aguaceros registrados.");
                        break;
                    }
                    System.out.println("busqueda de aguacero");
                    System.out.print("ingresa la id para buscar aguacero: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del aguacero encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Fecha: " + fechas[posicion] + " | Inicio: " + horasInicio[posicion] + " | Duracion: " + duraciones[posicion] + " minutos | Lluvia: " + lluvias[posicion] + " mm | Intensidad: " + intensidades[posicion] + " | Temperatura: " + temperaturas[posicion] + " C | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|eliminar_aguacero|--//
                //-----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen aguaceros registrados.");
                        break;
                    }
                    System.out.println("Datos de los aguaceros");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Fecha: " + fechas[i] + " | Inicio: " + horasInicio[i] + " | Duracion: " + duraciones[i] + " minutos | Lluvia: " + lluvias[i] + " mm | Intensidad: " + intensidades[i] + " | Temperatura: " + temperaturas[i] + " C | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del aguacero a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            fechas[i] = fechas[i + 1];
                            horasInicio[i] = horasInicio[i + 1];
                            duraciones[i] = duraciones[i + 1];
                            lluvias[i] = lluvias[i + 1];
                            intensidades[i] = intensidades[i + 1];
                            temperaturas[i] = temperaturas[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Aguacero eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Aguacero Meteorologico.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}