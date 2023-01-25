package effectiveJava.chapter1.item2;

public class NutritionFacts3 {
    private final int servingSize; // final ��ü ������ �ʼ� �ʱ�ȭ �ؾ���.
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static class Builder {
        // �ʼ� �Ű�����
        private final int servingSize;
        private final int servings;

        // ���� �Ű�����
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings){ // �� ������ ��ȿ�� �˻��ϴ� �κ��� �߰��ص���.
            // � �Ű������� �߸��ƴ��� IllegalArgumentException �� �������.
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
