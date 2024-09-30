public class CulinaryAdventure {
    public static void main(String[] args) {
        SecretRecipe secretDish = new SecretRecipe();
        secretDish.setMainIngredient("Unicorn tears"); // Shhh, don't tell anyone!
        secretDish.setSpiceLevel(9); // Oops, too spicy! 🌶️

        System.out.println("Secret ingredient: " + secretDish.getMainIngredient());
        System.out.println("Spice level: " + secretDish.getSpiceLevel());
    }
}
