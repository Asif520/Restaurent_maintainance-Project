
package restaurent_management;

public class Person {
    private String name,contact;
    private int age,id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    void display()
    {
        System.out.println("Name: "+name + "Age: "+age + "Contact: "+contact + "Id: "+id);
    }
}
