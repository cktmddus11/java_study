package javaStudy.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

public class LambdaEx4 {
    public static void main(String[] args){
       // java.lang.Runnable | void run() | 매개변수 X , 반환값 X
       // Suppiler<T>        | T get()    | 매개변수 X,  반환값 T
       // Consumer<T>        | void accept(T t) | 매개변수 O, 반환값 X
       // Function<T, R>     | R apply(T t) | 매개변수 O
       // Predicate<T>       | boolean test(T t) | 매개변수 O, 반환값 boolean
       
       // 매개변수 Bi붙이기

       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0;i<10;i++){
           list.add(i);
       }
       // lterable | void forEach(Consumer<T> action) => 모든 요소에 작업 action을 수행
        list.forEach(i -> System.out.println(i+","));
        System.out.println();


        // Collection | boolean removeif(Predicate<E> filter) => 조건에 맞는 요소를 삭제
        list.removeIf(i -> i> 5);
        System.out.println(list);

        // UnaryOperator, BinaryOperator => Function 의 또다른 변형, 매개변수와 반환타입 이 모두 일치
        // List | void replaceAll(UnaryOperator<E> operator) 모든 요소를 반환하여 대체
        UnaryOperator<Integer> operator = i -> i * 10;
        list.replaceAll(operator);
        System.out.println(list);


        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        // map 의 모든 요소를 (k, v) 의 형식으로 출력한다.
        // Map | void forEach(BiConsumer<K, V> action | 모든 요소에 작업  action을 수행
        BiConsumer<String, String> action =  (k, v) -> System.out.println(k +","+v);
        map.forEach(action);

        // Map | void compute(K key, BiFunction(K, V, V> f) | 지정된 키의 값에 작업 f를 수행
        map.compute("2", (k, v) -> String.valueOf((Integer.parseInt(v) + 10)));
        System.out.println(map);


    }
}
