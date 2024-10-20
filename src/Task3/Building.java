package Task3;
import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    public Building (ArrayList<Room> rooms, int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

// get & set methods for rooms
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    public void setRooms(ArrayList<Room> rooms){
        this.rooms = rooms;
    }

// get & set methods for numberOfFloors
    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public void setNumberOfFloors (int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }
}
