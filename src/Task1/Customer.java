package Task1;

public class Customer{
    private String firstName;
    private  String lastName;
    private String userName;
    private int id;
    private static int counter = 1;

    public Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++; // ++ operator tæller 1 op så hver kunde får et unikt id.
    }
    public String toString(){
        return getFirstName () + " " + getLastName () + ", UserName: " + getUserName () + ", ID: " + getId ();
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName (){
        return this.firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public String getLastName (){
        return this.lastName;
    }

    public void setUserName (String userName){
        this.userName = userName;
    }
    public String getUserName (){
        return this.userName;
    }

    public void setId (int id) {
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}
