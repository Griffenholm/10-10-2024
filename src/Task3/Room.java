package Task3;

public class Room {
    private int numberOfLamps;

    private int numberOfWindows;

    public Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // get & set methods for numberOfLamps
    int getNumberOfLamps(){
        return numberOfLamps;
    }
    void setNumberOfLamps (int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }

    // get & set methods for numberOfWindows
    int getNumberOfWindows(){
        return numberOfWindows;
    }
    void setNumberOfWindows (int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }

}
