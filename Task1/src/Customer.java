

public class Customer {
   private String firstName;
   private String lastName;
   private String userName;
   private int id;

   /* 1.b Klassen skal have en konstruktør,
    der tager kundens navn og brugernavn som parametre.
    Giv klassen en toString() metode, der printer kundens
    detaljer pænt ud. Gør alle klassens felter private, og tilføj getters().
*/
   public Customer(String firstName, String lastName, String userName){
       this.firstName = firstName;
       this.lastName = lastName;
       this.userName = userName;
   }
public String toString(){
    return "navn: "+ getFirstName()+" " + getLastName() +"\nusername: "+ getUserName();

}
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getUserName() {
        return this.userName;
    }
   }
