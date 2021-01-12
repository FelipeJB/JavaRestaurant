package Data;

import java.util.List;

public class Food extends Dish {

    public Food(String name, List<IngredientAmmount> ingredients) {
        super(name, ingredients);
    }

    @Override
    public double getCost() {
        return 0;
    }
}
