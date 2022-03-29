package algorithm.ex12933;

import java.util.Comparator;

public class SolutionEx5 {
    public static void main(String[] args) {
        long n = 118372;
        long answer = 0;
        String nStr = String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                // 새 StringBuilder만듦.       새 StringBuilder에 요소(String)을 추가,
                //                                 스트림을 병렬로 실행하면 여러 StringBuilder가 생성되는데 이를 합치기 위함.
                .toString();
        answer = Long.parseLong(nStr);
        System.out.println(answer);
        // collect() 는 Stream 의 아이템들을 우리가 원하는 자료형으로 변환해줌.
        // 3개의 인자를 받음.
        // collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner)

        /*
        *
        * Stream<String> fruits = Stream.of("banana", "apple", "mango", "kiwi", "peach", "cherry", "lemon");
            HashSet<String> fruitHashSet = fruits.collect(HashSet::new, HashSet::add, HashSet::addAll); // addAll hashset두개 합칠때
            for (String s : fruitHashSet) {
                System.out.println(s);
            }
        *
        * 위에 코드는 collect에 3개의 인자를 넣어야 하기 때문에 불편함.
        * Collectors 라는 라이브러리가 기본기능을 제공해줌
        *Collectors와 함께 collect로 HashSet 객체를 만드는 예제
        * Stream<String> fruits = Stream.of("banana", "apple", "mango", "kiwi", "peach", "cherry", "lemon");
        Set<String> fruitSet = fruits.collect(Collectors.toSet());
        for (String s : fruitSet) {
            System.out.println(s);
        }
        *
        * */



    }
}
