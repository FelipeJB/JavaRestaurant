package Data;

import java.util.List;

public class Drink extends Dish {

    public Drink(String name, List<IngredientAmmount> ingredients) {
        super(name, ingredients);
    }

    @Override
    public double getCost() {
        return 0;
    }

}
