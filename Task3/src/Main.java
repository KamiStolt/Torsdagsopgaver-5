import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        Room r1 = new Room (2, 2, 3);
        Room r2 = new Room(1, 4, 2);
        Room r3 = new Room(3, 2, 4);

        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        Building build1 = new Building(0, 7, true, rooms);

        int i = countLampsInBuilding(build1);
        System.out.println(i);

        boolean k = isNormal(build1);
        System.out.println("What a building!");

    }
    public static int countLampsInBuilding(Building building) {
        int result = 0;
        for(Room rooms : building.getRooms()){
            result += rooms.getNumberOfLamps();
        }
        return result;
    }
    public static boolean isNormal(Building building){

        if(building.getNumberOfFloors() > building.getRooms().size()){
            return true;
        } else{
            return false;
        }
    }
}
