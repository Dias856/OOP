import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Agent agent = new Agent("Dias", 0.03);
        System.out.println(agent);
        System.out.println("Role: " + agent.getRole());

        PropertyService service = new PropertyService();

        service.add(new Property(1, "Abay 10", 120000, true));
        service.add(new Property(2, "Tole Bi 45", 150000, false));
        service.add(new Property(3, "Satpaev 22", 100000, true));

        System.out.println("\nAll properties:");
        service.showAll();

        System.out.println("\nAvailable properties:");
        service.showAvailable();

        System.out.println("\nSorted by price:");
        service.sortByPrice();
        service.showAll();

        System.out.print("\nEnter property ID to search: ");
        int id = scanner.nextInt();

        Property found = service.searchById(id);
        if (found != null) {
            System.out.println("Found: " + found);
            System.out.println("Commission: " +
                    agent.calcComm(found.getPrice()));
        } else {
            System.out.println("Property not found");
        }
    }
}
