
package restaurent_management;

public class Customer extends Person{
    private String choices;

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Choices: "+choices);
    }
    
}
