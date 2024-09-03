public class Bike {
    String Model;
    String color;
    int cc;
    public void status(){
        if (cc<=160){
        System.out.println("Available!");
        } else System.out.println("Not Available!");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printModel(){
        System.out.println(this.Model);
    }
    public void printcc(){
        System.out.println(this.Model);
    }
}
