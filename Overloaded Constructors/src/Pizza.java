public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza(String bread){
        this.bread = bread;
    }
    Pizza(String bread,String sauce,String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    Pizza(String bread,String sauce,String cheese,String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
