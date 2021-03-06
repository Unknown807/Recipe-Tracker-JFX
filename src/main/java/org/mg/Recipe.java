package org.mg;

public class Recipe {

    private String recipeName;
    private String categoryOption;
    private String recipeIngredients;
    private String recipeInstructions;
    private String imagePath;

    public Recipe(String recipeName, String categoryOption,
                  String recipeIngredients, String recipeInstructions, String imagePath) {

        this.recipeName = recipeName;
        this.categoryOption = categoryOption;
        this.recipeIngredients = recipeIngredients;
        this.recipeInstructions = recipeInstructions;
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(String recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public String getRecipeInstructions() {
        return recipeInstructions;
    }

    public void setRecipeInstructions(String recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getCategoryOption() {
        return categoryOption;
    }

    public void setCategoryOption(String categoryOption) {
        this.categoryOption = categoryOption;
    }
}
