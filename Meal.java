
package restaurent_management;

public class Meal extends Menu {
    public String ingrd;

    public Meal(String ingrd, String name, int id, double price) {
        super(name, id, price);
        this.ingrd = ingrd;
    
    }

    @Override
    public void show_Menu() {
        super.show_Menu(); 
        System.out.println("Ingredients :"+ingrd);
    }

    @Override
    public String toString() {
        return super.toString()+"Ingredients :"+ingrd; 
    }
    
}
