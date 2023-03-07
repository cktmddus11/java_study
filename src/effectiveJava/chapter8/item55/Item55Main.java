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
        Score requireMaxScore = Item55Main.max(scoreList).get(); // 항상 값이 채워져있다고 가정하면 get을 사용해서 값을 바로 꺼내씀.








    }

    // 컬렉션에서 최대값을 구한다.(컬렉션이 비었으면 예외를 던진다.)
   /* public static <E extends Comparable<E>> E max(Collection<E> c){
        if(c.isEmpty()) {
            throw new IllegalArgumentException("빈 컬렉션");
        }
        E result = null;
        for(E e : c){
            if(result == null || e.compareTo(result) > 0){
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }*/
    // 컬렉션에서 최대값을 구해 Optional<E> 로 반환한다.
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
    // 컬렉션에서 최대값을 구해 Optional<E> 로 반환한다. - 스트림 버전
    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c){
        return c.stream().max(Comparator.naturalOrder()); // javaStudy.stream().max() 메서드가 Optional<T> 를 리턴해줌.
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
