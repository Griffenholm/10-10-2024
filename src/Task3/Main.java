package Task3;

import java.util.ArrayList;
import java.util.Collection;


public class Main {

    public static void main (String [] args){

        // Create rooms
        Room SingleRoom = new Room (2,1);
        Room CouplesRoom = new Room (3,2);
        Room FamilyRoom = new Room (5,2);

        // Add rooms to a collection
        ArrayList<Room> theRooms = new ArrayList<>();
        theRooms.add(SingleRoom);
        theRooms.add(CouplesRoom);
        theRooms.add(FamilyRoom);

        //Instantiate a building
        Building theTower = new Building (theRooms, 3);

        // Test count methods
        System.out.println("Total lamps: " + countLampsInBuilding(theTower));
        System.out.println("Total windows: " + countWindowsInBuilding(theTower));
        System.out.println("Total rooms: " + countRoomsInBuilding(theTower));

        // Test isNormal method
        System.out.println("Is the Building normal? " + isNormal(theTower));

        // Test an abnormal building
        Building abnormalBuilding = new Building(theRooms, 1);
        System.out.println("Is the building normal? " + isNormal(abnormalBuilding));

    }

    public static int countLampsInBuilding(Building theTower) {
        int totalLamps = 0;
        for (Room room : theTower.getRooms()){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindowsInBuilding(Building theTower) {
        int totalWindows = 0;
        for (Room room : theTower.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countRoomsInBuilding(Building theTower) {
        return theTower.getRooms().size();
    }

    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() >= countRoomsInBuilding(building);
    }
}
