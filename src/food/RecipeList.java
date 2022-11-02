package food;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipie> recipies = new HashSet<>();


    public void addRecipe(Recipie recipie) {
        if (recipies.contains(recipie)) {
            throw new IllegalArgumentException("Такой рецепт уже существует");
        } else {
            recipies.add(recipie);
        }
    }
}
