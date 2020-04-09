
package restaurent_management;

public class Order {
   public String date,time,name;
   public int id;
   public double price;

    public Order(String date, String time, String name, int id, double price) {
        this.date = date;
        this.time = time;
        this.name = name;
        this.id = id;
        this.price = price;
    }
   public void Order_View(){
 
       System.out.println("---------------------------------");
       System.out.print("|"); System.out.print("Date :"+date);System.out.println("|");
       System.out.println("---------------------------------");
      System.out.print("|"); System.out.print("Time :"+time);System.out.println("|");
      System.out.println("---------------------------------");
      System.out.print("|"); System.out.print("Name :"+name);System.out.println("|");
      System.out.println("---------------------------------");
     System.out.print("|"); System.out.print("Id :"+id);System.out.println("|");
     System.out.println("---------------------------------");
     System.out.print("|");  System.out.print("Price :"+price);System.out.println("|");
        System.out.println("---------------------------------");
       
       
       
   }
   
}
