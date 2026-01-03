import java.util.Objects;

public class Agent extends Person {

    private double cR;

    public Agent(String name, double cR) {
        super(name);
        this.cR = cR;
    }

    public String getName() {
        return name;
    }

    public double calcComm(double price) {
        return price * cR;
    }

    @Override
    public String getRole() {
        return "Real Estate Agent";
    }

    @Override
    public String toString() {
        return "Agent{name='" + name + "', commission=" + cR + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agent)) return false;
        Agent agent = (Agent) o;
        return Objects.equals(name, agent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

