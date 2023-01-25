package effectiveJava.chapter8.item54;

import effectiveJava.chapter1.Item1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Item54Main {
    private final List<Cheese> cheesesInStock = new ArrayList<>();

    private Cheese[] cheesesInArray;
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];


    public static void main(String[] args){
        // cheesesInStock 에 치즈 10개 추가
        Item54Main item = new Item54Main();

        for(int i = 0;i<10;i++){
            //item.addCheese(i);
        }
       // System.out.println(item.getCheeses());
        System.out.println(item.getCheesesArray());

        
        

    }

    public void addCheese(int index){
        cheesesInStock.add(new Cheese("cheese"+index));
    }

    public List<Cheese> getCheeses(){
        //return cheesesInStock.isEmpty() ? null : cheesesInStock;
        //return new ArrayList<>(cheesesInStock); // 이를 통해서 빈컬렉션을 리턴할 수 있지만 매번 객체를 새로 생성하게 됨.
        return cheesesInStock.isEmpty() ? Collections.emptyList() : cheesesInStock; // 불변객체 리턴. 베스트
    }
    public Cheese[] getCheesesArray(){
       // return cheesesInStock.toArray(new Cheese[0]);
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
       // return cheesesInStock.toArray(new Cheese[cheesesInStock.size()]); // XXXXX
    }

}
class Cheese {
    private String c;

    public Cheese(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "c='" + c + '\'' +
                "}\n";
    }
}
