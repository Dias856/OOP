public class Main {

    public static void main(String[] args) {


        Property p1 = new Property(1, "Abay 10", 120000, true);
        Property p2 = new Property(2, "Tole Bi 45", 150000, false);

        Agent agent = new Agent("Dias", 0.03);


        p1.showInfo();
        p2.showInfo();

        if (p1.getPrice() > p2.getPrice()) {
            System.out.println("Property 1 is more expensive");
        } else {
            System.out.println("Property 2 is more expensive");
        }

        double commission = agent.calcComm(p1.getPrice());
        System.out.println("Agent " + agent.getName() + " commission: " + commission);
    }
}
