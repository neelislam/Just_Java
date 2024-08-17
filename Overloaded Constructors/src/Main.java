//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Pizza pizza = new Pizza("Thick crust","Tomato","Mozzerella", "Chilli");
        System.out.println("Here are the ingredient of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        System.out.println("-------------------------------------------------------");
    Pizza pizza3 = new Pizza("Thick crust","Tomato","Mozzerella");
        System.out.println("Here are the ingredient of your pizza 3: ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.cheese);

        System.out.println("-------------------------------------------------------");
        Pizza pizza1 = new Pizza("Thin crust");
        System.out.println("Here are the ingredient of your pizza 1: ");
        System.out.println(pizza1.bread);

}
}