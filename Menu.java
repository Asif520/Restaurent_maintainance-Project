
package restaurent_management;

public  class Menu {
    public String name;
   public int id;
   public double price;

    public Menu(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public Menu(String name, String id, String price) {
        this.name = name;
        int Id=Integer.parseInt(id);
        this.id = Id;
        double Price=Double.parseDouble(price);
        this.price = Price;
    }
    public void show_Menu(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Price :"+price);
    }
 @Override   
    public String toString(){
    return "Name :"+name+"Id :"+id+"Price :"+price;
}
    
}
