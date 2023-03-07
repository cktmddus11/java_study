package effectiveJava.chapter8.item55;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Item55_2Main {
    public static void main(String[] args){
        Optional<List<String>> list = getList();
       String word = list.isPresent() ? list.get().get(0) : "N/A";

        String word2 = list.map(h -> h.get(0)).orElse("N/A");
       // String word3 = Stream.

        System.out.println(word);
        System.out.println(word2);

        int a = OptionalInt.of(3).getAsInt();
    }

    private static Optional<List<String>> getList() {
//        List<String> list =  Arrays.asList("sdf", "sdffds", "sdf");
        List<String> list =  null;

        return Optional.ofNullable(list);
    }


}
