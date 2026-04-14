package GenericProblem;

interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T meal;

    public Meal(T meal) {
        this.meal = meal;
    }
}

class MealUtil {
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Meal: " + meal.getClass().getSimpleName());
    }
}