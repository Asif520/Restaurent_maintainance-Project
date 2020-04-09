
package restaurent_management;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        LinkedList<Soft_Drinks> Soft= new LinkedList<> ();
        LinkedList<Local_Food> Local= new LinkedList<> ();
        LinkedList<Continental_Food> Cont= new LinkedList<> ();
        
                
        //Soft Drinks
        Soft_Drinks s1=  new Soft_Drinks("Black","Cocacola",101, 40);
        Soft_Drinks s2=  new Soft_Drinks("White","Mountain Dew",102, 30);
        Soft_Drinks s3=  new Soft_Drinks("Orange","Mirinda",103, 35);
        
        
        Soft.add(s1);
        Soft.add(s2);
        Soft.add(s3);
        
        //Local Foods
        Local_Food L1=new Local_Food("Normal","Bread,Beef,latus leaf","Burger",201, 180);
        Local_Food L2=new Local_Food("Spicy","Bread,Beef,Cheese,Suace","Pizza",202, 220.5);
        Local_Food L3=new Local_Food("Naga","Bread,Chilli,vegetables","Sub-Sandwich",203, 160);
        
        Local.add(L1);
        Local.add(L2);
        Local.add(L3);
        
        //Continental Food
        
        Continental_Food c1= new Continental_Food("Available","Cooked shredded chicken,Salsa,Hard taco shells","Cheesy Chicken Tacos",1001,1250);
        Continental_Food c2= new Continental_Food("Available"," chopped rosemary,cloves garlic, minced\n" +
        "kosher salt,Small lamb chops","Garlicky Lamb Chops",1002,2250);
        
        Cont.add(c1);
        Cont.add(c2);
        
        
        
        
        
        System.out.println("--------Welcome To Our Restaurent---------\n");
        System.out.println("1.View Menu\n2.Order\n3.Add\n4.Delete");
        Scanner input= new Scanner(System.in);
        int in,i;
        System.out.println("(Input 1 or 2 or 3 or 4)\n");
        in=input.nextInt();
        

        if(in==1){
        System.out.println("Fast Food :\n");
        L1.show_Menu();
        System.out.println();
        L2.show_Menu();
                
        System.out.println();
        L3.show_Menu();
        System.out.println();
        System.out.println("Soft Drinks :\n");
        s1.show_Menu();
        System.out.println();
        s2.show_Menu();
        System.out.println();
        s3.show_Menu();
        System.out.println();
        System.out.println("Continental Food :\n");
        c1.show_Menu();
        System.out.println();
        c2.show_Menu();
        System.out.println("\n");
        
        System.out.println("1.Order\n2.Add\n3.Delete");
        
        i=input.nextInt();
        
        if(i==1){
            Order ob3=new Order("29-3-2020","4:30 PM","Burger",101,40.5);
            ob3.Order_View();
        }
        else if(i==2)
        {
            Local_Food L4=new Local_Food("Spicy","Bread,Chilli,vegetables","Roll",204, 60);
            Local.add(L4);
             System.out.println("Updated Local Food List:\n");
            Local.forEach((L) -> {
                System.out.println("Name: "+L.name+"\nId: "+L.id+"\nPrice: "+L.price+"\nIngredients: "+L.ingrd+"\nSpicy: "+L.Spicy);
            });
        }
        else if(i==3){
            Cont.remove(c1);
            System.out.println("Updated Continental Food Menu: \n");
            Cont.forEach((C) -> {
                System.out.println("Name: "+C.name+"\nId: "+C.id+"\nPrice: "+C.price+"\nIngredients: "+C.ingrd+"\n"+C.available);
            });
        }
        
        }
        else if(in==2){
            Order ob3=new Order("29-3-2020","4:30 PM","Burger",101,40.5);
            ob3.Order_View();
        }
        else if(in==3)
        {
            Local_Food L4=new Local_Food("Spicy","Bread,Chilli,vegetables","Roll",204, 60);
            Local.add(L4);
            System.out.println("Updated Local Food List:\n");
            Local.forEach((L) -> {
                System.out.println("Name: "+L.name+"\nId: "+L.id+"\nPrice: "+L.price+"\nIngredients: "+L.ingrd+"\nSpicy: "+L.Spicy);
            });
        }
        else if(in==4){
            Cont.remove(c1);
            System.out.println("Updated Continental Food Menu: \n");
            Cont.forEach((C) -> {
                System.out.println("Name: "+C.name+"\nId: "+C.id+"\nPrice: "+C.price+"\nIngredients: "+C.ingrd+"\n"+C.available);
            });
        }
        
       
    }
}
