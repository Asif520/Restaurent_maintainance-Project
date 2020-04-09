
package restaurent_management;

public class Continental_Food extends Meal{
    public String available;

    public Continental_Food(String available, String ingrd, String name, int id, double price) {
        super(ingrd, name, id, price);
        this.available = available;
    }

    @Override
    public void show_Menu() {
        super.show_Menu();
        System.out.println(available);
    }

    @Override
    public String toString() {
        return super.toString()+available;
    }


    
   
    
}
