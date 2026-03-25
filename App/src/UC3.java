import java.util.HashMap;
import java.util.Map;

class RoomInventory {
    // Centralized data structure to solve real-world state management
    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        this.roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}

public class UC3 {

    public static void main(String[] args) {
        RoomInventory inventory = new RoomInventory();


        Map<String, Integer> currentCounts = inventory.getRoomAvailability();


        System.out.println("Hotel Room Inventory Status\n");


        printRoomStatus("Single Room", 1, 250, 1500.0, currentCounts.get("Single Room"));
        printRoomStatus("Double Room", 2, 400, 2500.0, currentCounts.get("Double Room"));
        printRoomStatus("Suite Room", 3, 750, 5000.0, currentCounts.get("Suite Room"));
    }

    private static void printRoomStatus(String name, int beds, int size, double price, Integer available) {
        System.out.println(name + ":");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price per night: " + price);
        System.out.println("Available Rooms: " + (available != null ? available : 0));
        System.out.println();
    }
}