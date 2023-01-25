package effectiveJava.chapter1.item2;

public class NutritionFacts1 { // 점증적 생성자 패턴 - 확장하기어렵다.
    private final int servingSize; // final 객체 생성시 필수 초기화 해야함.
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public NutritionFacts1(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts1(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts1(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts1(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }


    public NutritionFacts1(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }




}
