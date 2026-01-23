import java.sql.*;

public class ActionsDB {

    // ADD (CREATE)
    public void addProperty(Property p) {
        String sql = "INSERT INTO property VALUES (?, ?, ?, ?)";

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getAddress());
            ps.setDouble(3, p.getPrice());
            ps.setBoolean(4, p.isAvailable());

            ps.executeUpdate();
            System.out.println("Property added successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public void showAllProperties() {
        String sql = "SELECT * FROM property";

        try (Connection c = DBConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("address") + " | " +
                                rs.getDouble("price") + " | " +
                                rs.getBoolean("available")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteById(int id) {
        String sql = "DELETE FROM property WHERE id = ?";

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Property deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updatePrice(int id, double newPrice) {
        String sql = "UPDATE property SET price = ? WHERE id = ?";

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setDouble(1, newPrice);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Price updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}