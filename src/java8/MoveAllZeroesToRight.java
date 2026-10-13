package java8;

import java.util.List;
import java.util.stream.Stream;

public class MoveAllZeroesToRight {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,0,-3,0,5,-2,0,8,0,-4);
        System.out.println(Stream.concat(list.stream().filter(n -> n!= 0),list.stream().filter(n -> n== 0)).toList());
    }
}
