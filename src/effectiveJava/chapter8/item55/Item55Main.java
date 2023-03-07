package effectiveJava.chapter8.item55;

import effectiveJava.chapter8.item54.Item54Main;

import javax.swing.text.html.Option;
import java.util.*;

public class Item55Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int rnd = (int) (Math.random() * 100) + 1;
            integerList.add(rnd);
        }
        System.out.println(integerList);
        System.out.println(Item55Main.max(integerList));


        List<Score> scoreList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int rnd = (int) (Math.random() * 100) + 1;
            scoreList.add(new Score(rnd, "name" + i));
        }
        System.out.println(scoreList);
        System.out.println(Item55Main.max(scoreList));
        System.out.println(Item55Main.max(scoreList).orElse(new Score(0, "emptyName")));
        Score maxScore = Item55Main.max(scoreList).orElseThrow(NoSuchElementException::new); // ()-> new NoSuchElementException()
        Score requireMaxScore = Item55Main.max(scoreList).get(); // �׻� ���� ä�����ִٰ� �����ϸ� get�� ����ؼ� ���� �ٷ� ������.








    }

    // �÷��ǿ��� �ִ밪�� ���Ѵ�.(�÷����� ������� ���ܸ� ������.)
   /* public static <E extends Comparable<E>> E max(Collection<E> c){
        if(c.isEmpty()) {
            throw new IllegalArgumentException("�� �÷���");
        }
        E result = null;
        for(E e : c){
            if(result == null || e.compareTo(result) > 0){
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }*/
    // �÷��ǿ��� �ִ밪�� ���� Optional<E> �� ��ȯ�Ѵ�.
 /*   public static <E extends Comparable<E>> Optional<E> max(Collection<E> c){
        if(c.isEmpty()) {
            return Optional.empty();
        }
        E result = null;
        for(E e : c){
            if(result == null || e.compareTo(result) > 0){
                result = Objects.requireNonNull(e);
            }
        }
        return Optional.of(result) ;
    }*/
  /*  public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return Optional.ofNullable(result);
    }*/
    // �÷��ǿ��� �ִ밪�� ���� Optional<E> �� ��ȯ�Ѵ�. - ��Ʈ�� ����
    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c){
        return c.stream().max(Comparator.naturalOrder()); // javaStudy.stream().max() �޼��尡 Optional<T> �� ��������.
    }
}
class Score implements Comparable<Score> {
    int score;
    String name;

    public Score(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Score{" +
                "score=" + score +
                ", name=" + name +
                '}'+'\n';
    }

    @Override
    public int compareTo(Score o) {
        return o.score < this.score ? 1 : -1;
    }
}
