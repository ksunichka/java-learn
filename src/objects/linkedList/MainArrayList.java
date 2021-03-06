package objects.linkedList;

import java.util.Random;

/**
 * Created by ksenia on 25.03.2017.
 */
public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        ArrayList<Integer> arrayList2 = new ArrayList<>(5);
        ArrayList<Integer> arrayList3 = new ArrayList<>(5);

        Random rnd = new Random();
        for (int i = 0, j = 9; i < 10; i++, j--) {
            arrayList.add(rnd.nextInt(20));
            arrayList2.add(i);
            arrayList3.add(j);

        }
        System.out.println(arrayList.toString());

        arrayList.add(2, 6);
        arrayList.add(3, 7);
        System.out.println(arrayList.toString());

        arrayList.add(1, 6);
        arrayList.remove(5);
        System.out.println(arrayList.toString());

        System.out.println(arrayList.get(0) + " " + arrayList.get(3) + " " + arrayList.get(4) + " " + arrayList.get(5));


        //UtilityClass
//        find
        System.out.println("find: " + UtilityClass.<Integer>find(new Predicate<Integer>() {
            @Override
            public boolean apply(Integer o) {
                return o == 3;
            }
        }, arrayList));
        System.out.println();

//        filter
        List<Integer> filteredList = UtilityClass.filter(new Predicate<Integer>() {
            @Override
            public boolean apply(Integer o) {
                return o.toString().length() > 1;
            }
        }, arrayList);
        System.out.println(filteredList.toString());

//        transform
        List<String> transformedList = UtilityClass.transform(new Transformer<Integer, String>() {
            @Override
            public String apply(Integer o) {
                return Integer.toString(o)  + Integer.toString(o);
            }
        }, arrayList);
        System.out.println(transformedList.toString());

        System.out.println(arrayList.hashCode());
        System.out.println(arrayList2.hashCode());
        System.out.println(arrayList3.hashCode());


    }
}
