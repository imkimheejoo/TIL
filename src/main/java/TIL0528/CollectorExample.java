package TIL0528;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1,2,3,4,5,6");
        List<Integer> convertList = list.stream().flatMapToInt(l -> {
            String[]arr = l.split(",");
            int[] intArr = new int[arr.length];
            for(int i = 0; i< arr.length; i++) {
                intArr[i] = Integer.parseInt(arr[i]);
            }
            return Arrays.stream(intArr);
        }).boxed().collect(Collectors.toList());

        list = Arrays.asList("1,1,2,3,4,5");
        convertList.stream().forEach(s-> System.out.println(s));

        Set<Integer> set =  list.stream().flatMapToInt(l -> {
            String[] arr = l.split(",");
            int[] intArr = new int[arr.length];
            for(int i=0; i<arr.length; i++){
                intArr[i] = Integer.parseInt(arr[i]);
            }
            return Arrays.stream(intArr);
        }).boxed().collect(Collectors.toSet());

        set.forEach(s -> System.out.println(s));

    }
}
