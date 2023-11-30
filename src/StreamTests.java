import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTests {

    //Count the number of names starting with alphabet A in list
    @Test
    public void regular() {

        ArrayList<String> names = new ArrayList<>();
        names.add("Michael");
        names.add("Devon");
        names.add("Alan");
        names.add("Larry");
        names.add("Adam");

        int count = 0;
        for (int i = 0; i < names.size(); i++) {

            String actual = names.get(i);
            if (actual.startsWith("A")) {

                count++;
            }
        }
        System.out.println("Names starts with letter A: " + count);
    }

    @Test
    public void streamFilter() {

        ArrayList<String> names = new ArrayList<>();
        names.add("Michael");
        names.add("Devon");
        names.add("Alan");
        names.add("Larry");
        names.add("Adam");

        //Lambda expressions. Left side specifies the parameter required by the expression,
        // and the right side gives action witch we are going to perform on parameter
        /** Stream have 3 stages
         * Stage 1: Create stream
         * Stage 2: Perform intermediate operations
         * Stage 3: Perform terminal operation
         */
        long countNames = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println("Names count starting with letter A: " + countNames);

        //Print all the names of ArrayList
        //names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println("Ime: " + s));
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println("Ime: " + s));
    }

    @Test
    public void streamMap() {

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Michael");
        names1.add("Devon");
        names1.add("Alan");

        //Print the names which have last letter "n", with Uppercase
        Stream.of("Michael", "Devon", "Alan", "Larry", "Adam").filter(s -> s.endsWith("n")).map(String::toUpperCase)
                .forEach(System.out::println);

        //Print names which have first letter as a with uppercase and sorted
        List<String> names2 = Arrays.asList("Michael", "Devon", "Alan", "Larry", "Adam");
        names2.stream().filter(s -> s.startsWith("A")).sorted().map(String::toUpperCase).forEach(System.out::println);

        //Merging two different lists
        Stream<String> newStream = Stream.concat(names1.stream(), names2.stream());
        //newStream.forEach(System.out::println);

        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Devon"));
        System.out.println(flag);
        Assert.assertTrue(flag);
    }

    @Test
    public void streamCollect() {

        List<String> ls = Stream.of("Michael", "Devon", "Alan", "Larry", "Adam").filter(s -> s.endsWith("n"))
                .map(String::toUpperCase).toList();
        System.out.println(ls.get(0));

        //Print unique number from this array
        //Sort the array and extract third index
        List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
        values.stream().distinct().forEach(System.out::println);

        List<Integer> li = values.stream().distinct().sorted().toList();
        System.out.println(li.get(2));
    }
}