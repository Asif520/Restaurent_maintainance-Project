
package restaurent_management;

public class Local_Food extends Meal{
    public String Spicy;

    public Local_Food(String Spicy, String ingrd, String name, int id, double price) {
        super(ingrd, name, id, price);
        this.Spicy = Spicy;
    }

    @Override
    public void show_Menu() {
        super.show_Menu(); 
        System.out.println("Spicy :"+Spicy);
    }

    @Override
    public String toString() {
        return super.toString()+"Spicy :"+Spicy; 
    }
    
    
    
}
