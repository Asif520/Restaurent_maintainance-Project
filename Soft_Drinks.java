
package restaurent_management;


public class Soft_Drinks extends Menu{
    public String color;

    public Soft_Drinks(String color, String name, int id, double price) {
        super(name, id, price);
        this.color = color;
    }
    public Soft_Drinks(String color, String name, String id, String price) {
        super(name, id, price);
        this.color = color;

    @Override
    public void show_Menu() {
       
        super.show_Menu(); 
        System.out.println("Colorn :"+color);
    }

    @Override
    public String toString() {
        return super.toString()+"Colorn :"+color;
    }
    
}
