package effectiveJava.chapter1.item2;

public class NutritionFacts3 {
    private final int servingSize; // final 객체 생성시 필수 초기화 해야함.
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static class Builder {
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings){ // 각 값들을 유효성 검사하는 부분을 추가해도됨.
            // 어떤 매개변수가 잘못됐는지 IllegalArgumentException 을 던지면됨.
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;

        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts3 build(){
            return new NutritionFacts3(this);
        }
    }
    private NutritionFacts3(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
