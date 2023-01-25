package effectiveJava.chapter1.item2;

public class NutritionFacts2 { // 자바빈즈 패턴 - 일관성이 깨지고 불변으로 만들 수 없다.
    private int servingSize = -1; // 기본값 없는거 -1 처리
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts2() {}

    // 세터 메서드
    public void setServingSize(int val){
        servingSize = val;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
