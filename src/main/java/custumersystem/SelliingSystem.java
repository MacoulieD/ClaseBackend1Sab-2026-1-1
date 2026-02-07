package custumersystem;

import java.util.Scanner;

public class SelliingSystem {

    static Scanner leer = new Scanner(System.in);

    //Product Attributes

    static int id;
    static String description;
    static double price;
    static int quantity;
    static boolean state;



    public static void main(String[] args) {
         createProducts();
         getProducts();
         int id = 1;
        UpdateProducts(id);

    }

    //Class Methods

    public static void createProducts() {
        System.out.println("Ingrese el id del producto");
        id = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el nombre del producto");
        description = leer.nextLine();
        System.out.println("Ingrese el precio del producto");
        price = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese la cantidad");
        quantity = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el estado del producto");
        state = leer.nextBoolean();
    }
    public static void getProducts(){
        System.out.println("id " + id + "\n" +
                "Description: " + description + "\n" +
                "Price: " + price + "\n" +
                "Quntity: " + quantity + "\n" +
                "State: " + state + "\n");
    }
    public static void UpdateProducts(int fineId){
        if (fineId == id){
            System.out.println("Ingrese el id del producto");
            id = leer.nextInt();
            leer.nextLine();
            System.out.println("ingrese el nombre del producto");
            description = leer.nextLine();
            System.out.println("Ingrese el precio del producto");
            price = leer.nextDouble();
            leer.nextLine();
            System.out.println("Ingrese la cantidad");
            quantity = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese el estado del producto");
            state = leer.nextBoolean();

        }else System.out.println("Producto no encontrado");

        System.out.println("Ingrese el id del producto");
        id = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el nombre del producto");
        description = leer.nextLine();
        System.out.println("Ingrese el precio del producto");
        price = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese la cantidad");
        quantity = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el estado del producto");
        state = leer.nextBoolean();
    }
    public static void deleteProducts(int fineid){
        if (fineid == id){
            id = 0;
            description = " ";
            price = 0.0;
            quantity = 0;
            state = false;
            System.out.println("Produecto id " + fineid + " eliiminado con exito");

        }else System.out.println("El id del producto no existe");

        System.out.println("Ingrese el id del producto");
        id = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el nombre del producto");
        description = leer.nextLine();
        System.out.println("Ingrese el precio del producto");
        price = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese la cantidad");
        quantity = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el estado del producto");
        state = leer.nextBoolean();
    }


}

