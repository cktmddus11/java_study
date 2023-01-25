package effectiveJava.chapter1.item2;

public class Item2 {
    public static void  main(String[] args){
        NutritionFacts1 nutritionFacts1 =
                new NutritionFacts1(10, 10, 20, 30, 40);

        NutritionFacts2 nutritionFacts2 = new NutritionFacts2();
        nutritionFacts2.setCalories(10);
        nutritionFacts2.setServings(3);

        NutritionFacts3 nutritionFacts3 = new NutritionFacts3
                .Builder(10, 20)
                .calories(20)
                .carbohydrate(30)
                .fat(3)
                .sodium(3)
                .build();

        String a = "¾È³ç";
        String b = "¾È³ç";
        System.out.println(a == b);


    }
}
