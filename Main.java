import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ADD THE CAPA : ");
        int capacity = scanner.nextInt();
        Pharmacy pharmacy = new Pharmacy(capacity);

        int choice;
        do {
            System.out.println("\nCHOOOOOOSE!!");
            System.out.println("_________________________________");
            System.out.println("1 :ADD ");
            System.out.println("2 :REMOVE ");
            System.out.println("3 :ORDER ");
            System.out.println("4 :TOTAL SALES ");
            System.out.println("5 :EXIT ");//EXIT THE PROGRAM
            System.out.print("CHOOSE CASE : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ENTER NAME: ");
                    String name = scanner.next();
                    System.out.print("ENTER ID: ");
                    int id = scanner.nextInt();
                    System.out.print("ENTER PRICE: ");
                    double price = scanner.nextDouble();
                    System.out.print("ENTER CAT: ");
                    String category = scanner.next();
                    System.out.print("ENTER AVA QUAN: ");
                    int availableQuantity = scanner.nextInt();
                    System.out.print("PRESCRIPTION? (true/false): ");
                    boolean prescriptionRequired = scanner.nextBoolean();
                    pharmacy.addDrug(name, id, price, category, availableQuantity, prescriptionRequired);
                    break;
                case 2:
                    System.out.print("ENTER ID TO REMOVE : ");
                    int removeId = scanner.nextInt();
                    pharmacy.removeDrug(removeId);
                    break;
                case 3:
                    System.out.print("ENTER ID TO ORDER: ");
                    int orderId = scanner.nextInt();
                    pharmacy.placeOrder(orderId);
                    break;
                case 4:
                    System.out.println("TOTAL SALES = " + pharmacy.getTotalSales());
                    break;
                case 5:
                    System.out.println("EXIT PROGRAM");
                    break;
                default:
                    System.out.println("MUST CHOOSE FORM 1 : 5");
            }
        } while (choice != 5);

        scanner.close();
    }
}