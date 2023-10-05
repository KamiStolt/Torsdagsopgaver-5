import java.util.ArrayList;

public class Building {

   private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    private ArrayList<Room> rooms;
    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding, ArrayList<Room> rooms){
        this.numberOfBathrooms=numberOfBathrooms;
        this.numberOfFloors=numberOfFloors;
        this.isOfficeBuilding=isOfficeBuilding;
        this.rooms=rooms;
}
    public int getNumberOfBathrooms(){
        return this.numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }
    public boolean getIsOfficeBuilding(){
        return this.isOfficeBuilding;
    }
    public ArrayList<Room> getRooms(){
        return this.rooms;
    }
}
