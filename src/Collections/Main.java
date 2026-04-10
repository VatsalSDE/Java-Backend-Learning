package Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // this will store homogeneous data that is of only one type
        List<String> ls = new ArrayList<>();
        ls.add("vatsal");
        ls.add("Deepak");
        ls.add("Seema");

        for (String names : ls){
            System.out.println(names);
        }

        System.out.println(ls);

        // this will store heterogeneous data that is can be of multiple types
//        List name1= new ArrayList();
//        name1.add("vatsal");
//        name1.add("seema");
//        name1.add(45);
//        name1.add(5.7);
    }
}
