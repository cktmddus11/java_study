package effectiveJava.chapter1.item2;

public class NutritionFacts2 { // �ڹٺ��� ���� - �ϰ����� ������ �Һ����� ���� �� ����.
    private int servingSize = -1; // �⺻�� ���°� -1 ó��
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts2() {}

    // ���� �޼���
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
