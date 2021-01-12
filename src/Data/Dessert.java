package Data;

import java.util.List;

public class Dessert extends Dish{

    public Dessert(String name, List<IngredientAmmount> ingredients) {
        super(name, ingredients);
    }

    @Override
    public double getCost() {
        return 0;
    }
}
