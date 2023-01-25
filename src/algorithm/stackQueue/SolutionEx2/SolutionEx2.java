package algorithm.stackQueue.SolutionEx2;

import java.util.*;

// stream => int X => Integer변형
// https://mkyong.com/java8/java-8-how-to-convert-intstream-to-integer/

/*String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};

        List<String> nameList =
        IntStream.range(0, names.length)
        .filter(i -> names[i].length() <= i)
        .mapToObj(i -> names[i])
        .collect(Collectors.toList());

        for (String a : nameList){
        System.out.println(a);
        }*/

public class SolutionEx2 {
    public static void main(String[] args){
        Queue queue = new ArrayDeque();

        int [] priorities ={1, 1, 9, 1, 1, 1};
        int location = 0;
        int max = Arrays.stream(priorities).max().getAsInt();


        for(int i = 0;i<priorities.length;i++){
            queue.offer(priorities[i]);
        }
        System.out.println(queue);


//        Integer max = Arrays.stream(Arrays.stream(priorities).boxed().toArray(Integer[]::new))
//                .max(Comparator.comparing(a -> a)).get();

        System.out.println(max);
        for(int i = 0;i<priorities.length;i++){
            if(priorities[i] != max){
                int last = (int) queue.poll();
                queue.add(last);
            }
            if((int)queue.peek() == max){
                break;
            }
        }
        System.out.println(queue);

        int answer = 0;

        for(int i = 0;i<priorities.length;i++){
            if(priorities[location] == priorities[i]){
                answer = i+1;
                System.out.println(answer);
                break;
            }
        }



//        answer = (int) Arrays.stream(queue.toArray())
//                .map(a -> a.equals(priorities[location]))
//                .findFirst().orElse(0);
//        AtomicInteger index = new AtomicInteger();
//        answer = (int) Arrays.stream(queue.toArray())
//                        .map(a -> index.getAndIncrement())
//                                .filter(a -> a.)

//        answer = (int) IntStream.range(0, queue.size())
//                        .filter(a -> a == location)
//                                .mapToObj(a -> Arrays.stream(queue.toArray())
//                                        .filter(b -> b.equals(a)).findFirst().orElse(0))
//                                        .findFirst()
//                .orElse(0);



/*String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};

        List<String> nameList =
        IntStream.range(0, names.length)
        .filter(i -> names[i].length() <= i)
        .mapToObj(i -> names[i])
        .collect(Collectors.toList());

        for (String a : nameList){
        System.out.println(a);
        }*/


    }
}
