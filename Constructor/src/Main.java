//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Human human =  new Human("Rick",65, 70 );
     Human human2 =  new Human("Morty", 16, 50);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);


        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);

        human2.eat();
        human.drink();
    }
}