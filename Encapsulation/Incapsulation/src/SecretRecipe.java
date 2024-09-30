class SecretRecipe {
    private String mainIngredient; // Our top-secret ingredient
    private int spiceLevel; // How spicy is it? 🔥

    // Getter for the main ingredient
    public String getMainIngredient() {
        return mainIngredient;
    }

    // Setter for the main ingredient
    public void setMainIngredient(String ingredient) {
        mainIngredient = ingredient;
    }

    // Getter for the spice level
    public int getSpiceLevel() {
        return spiceLevel;
    }

    // Setter for the spice level
    public void setSpiceLevel(int level) {
        if (level >= 0 && level <= 10) {
            spiceLevel = level;
        } else {
            System.out.println("Invalid spice level! Must be between 0 and 10.");
        }
    }
}