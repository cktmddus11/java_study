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
        // cheesesInStock �� ġ�� 10�� �߰�
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
        //return new ArrayList<>(cheesesInStock); // �̸� ���ؼ� ���÷����� ������ �� ������ �Ź� ��ü�� ���� �����ϰ� ��.
        return cheesesInStock.isEmpty() ? Collections.emptyList() : cheesesInStock; // �Һ���ü ����. ����Ʈ
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
