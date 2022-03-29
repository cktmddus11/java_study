package javaStudy.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args){
        // Suppiler<T>        | T get()    | 매개변수 X,  반환값 T
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        // Consumer<T>        | void accept(T t) | 매개변수 O, 반환값 X
        Consumer<Integer> c = i -> System.out.print(i+", ");
        // Function<T, R>     | R apply(T t) | 매개변수 O
        Function<Integer, Integer> f = i -> i / 10 * 10;
        // Predicate<T>       | boolean test(T t) | 매개변수 O, 반환값 boolean
        Predicate<Integer> p = i -> i % 2 == 0;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);

        System.out.println(list);

        printEvenNum(p, c, list);


        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);


    }

    private static  <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T>  newList = new ArrayList<T>(list.size());
        for(T i : list){
            newList.add(f.apply(i));
        }
        return newList;
    }

    private static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        /*list.removeIf(p);
        list.forEach(c);
        System.out.println();*/
        System.out.print("[");
        for(T i : list){
            if(p.test(i)){
                c.accept(i);
            }
        }
        System.out.println("]");

    }

    private static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for(int i = 0;i<10;i++){
            list.add(s.get());
        }
    }
}
