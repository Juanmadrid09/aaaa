import java.util.Scanner;

public class Main {


    static Scanner sc = new Scanner(System.in);
    static BST<Citizen> list = new BST();

    public static void main(String[] args) {
        int option = -1;

        while (option != 0) {

            System.out.println("\ndijite una opcion");
            System.out.println("1.  Inscribir un ciudadano");
            System.out.println("2.Consultar por cédula");
            System.out.println("3. Eliminar ciudadano por cédula");
            System.out.println("4. salir");
            option = sc.nextInt();


            switch (option) {

                case 1:
                    inscrip();
                    break;

                case 2:
                    search();
                    break;

                case 3:
                   delete();
                    break;

                case 0:
                    break;

            }


        }

    }

    public static void inscrip () {

        System.out.println("Ingrese su nombre");
        String name = sc.next();
        System.out.println("Ingrese su numero de cedula");
        String id = sc.next();
        System.out.println("Ingrese su fecha de nacimiento");
        String bd = sc.next();
        System.out.println("Ingrese su ciudad de nacimiento");
        String cb = sc.next();

        list.insert(new Node<>(id, new Citizen(id, name, bd, cb)));


    }

    public static void search () {

        System.out.println("Ingrese la cedula del ciudadano que busca");
        String id = sc.next();

        System.out.println(list.search(id));


    }

    public static void delete () {
        System.out.println("Ingrese la cedula del ciudadano que desea eliminar");
        String id = sc.next();

        list.delete(id);
    }




}
