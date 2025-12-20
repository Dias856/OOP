public class Agent {

    private String name;
    private double cR;

    public Agent(String name, double cR) {
        this.name = name;
        this.cR = cR;
    }


    public String getName() {
        return name;
    }

    public double calcComm(double price) {
        return price * cR;
    }
}
