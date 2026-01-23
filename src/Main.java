import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ActionsDB dao = new ActionsDB();

        while (true) {

            System.out.println("\nMENU:");
            System.out.println("1 - Add property");
            System.out.println("2 - Show all properties");
            System.out.println("3 - Delete property by ID");
            System.out.println("4 - Update property price");
            System.out.println("0 - Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Program finished");
                break;
            }

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine(); // clear buffer
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Available (true/false): ");
                    boolean available = scanner.nextBoolean();

                    dao.addProperty(new Property(id, address, price, available));
                }

                case 2 -> {
                    dao.showAllProperties();
                }

                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = scanner.nextInt();
                    dao.deleteById(id);
                }

                case 4 -> {
                    System.out.print("Enter ID to update: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter new price: ");
                    double price = scanner.nextDouble();

                    dao.updatePrice(id, price);
                }

                default -> System.out.println("Wrong option");
            }
        }

        scanner.close();
    }
}
