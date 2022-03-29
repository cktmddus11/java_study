package javaStudy.ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitBoxEx4 {
    public static void main(String[] args){
        FruitBox2<Apple2> appleBox = new FruitBox2<>();
        FruitBox2<Grape2> grapeBox =new FruitBox2<>();

        appleBox.add(new Apple2("GreenApple", 300));
        appleBox.add(new Apple2("GreenApple", 100));
        appleBox.add(new Apple2("GreenApple", 200));

        grapeBox.add(new Grape2("GreenGrape", 300));
        grapeBox.add(new Grape2("GreenGrape", 100));
        grapeBox.add(new Grape2("GreenGrape", 200));

        System.out.println(appleBox);
        System.out.println(grapeBox);
//        Box{list=[GreenApple(300), GreenApple(100), GreenApple(200)]}
//        Box{list=[GreenGrape(300), GreenGrape(100), GreenGrape(200)]}

        Collections.sort(appleBox.getList(), new AppleCom());
        Collections.sort(grapeBox.getList(), new GrapeCom());

        System.out.println(appleBox);
        System.out.println(grapeBox);
//        Box{list=[GreenApple(300), GreenApple(200), GreenApple(100)]}
//        Box{list=[GreenGrape(300), GreenGrape(200), GreenGrape(100)]}


        /*
           public static <T> void sort(List<T> list, Comparator<? super T> c) { 
           // ? super T : 하한제한,T와 그 조상들만 가능
           // FruitCom<T> : T => Fruit2 걸려있으므로 FruitComp()만이 가능하고 
           // List<T> : T => Apple2이므로 apple 리스트만 가능
                list.sort(c);
            }
         */
        System.out.println("+========================");
        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
class Box2<T> {
    List<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    List<T> getList(){
        return list;
    }
    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }
}
class FruitBox2<T extends Fruit2> extends Box2<T>{

}
class Fruit2 {
    String name;
    int weight;

    public Fruit2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name +"("+weight+")";
    }
}
class Apple2 extends Fruit2{

    public Apple2(String name, int weight) {
        super(name, weight);
    }
}
class Grape2 extends Fruit2{

    public Grape2(String name, int weight) {
        super(name, weight);
    }
}
class AppleCom implements Comparator<Apple2> {

    @Override
    public int compare(Apple2 t1, Apple2 t2) {
        return t2.weight - t1.weight;
    }
}
class GrapeCom implements Comparator<Grape2> {

    @Override
    public int compare(Grape2 t1, Grape2 t2) {
        return t2.weight - t1.weight;
    }
}
class FruitComp implements Comparator<Fruit2> {

    @Override
    public int compare(Fruit2 t1, Fruit2 t2) {
        return t1.weight - t2.weight;
    }
}