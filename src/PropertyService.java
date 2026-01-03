import java.util.ArrayList;
import java.util.Comparator;

public class PropertyService {

    private ArrayList<Property> properties = new ArrayList<>();

    public void add(Property p) {
        properties.add(p);
    }

    public void showAll() {
        for (Property p : properties) {
            System.out.println(p);
        }
    }

    public void showAvailable() {
        for (Property p : properties) {
            if (p.isAvailable()) {
                System.out.println(p);
            }
        }
    }

    public Property searchById(int id) {
        for (Property p : properties) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void sortByPrice() {
        properties.sort(Comparator.comparingDouble(Property::getPrice));
    }
}
