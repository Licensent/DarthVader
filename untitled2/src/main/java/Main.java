import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by DarthVader on 20.06.2016.
 */
public class Main {
    private static String fileName = "C://projects/DarthVader/untitled2";
    private static String fileName2 = "C://projects/DarthVader/untitled2/3.txt";
    private static String ext = ".xls";

    public static void main(String... args) throws FileNotFoundException {
        NewParser a = new NewParser();
        a.XXX(MyFileNameFilter.findFiles(fileName, ext));
        System.out.println(NewParser.myHashSet);
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(100);
        myArrayList.add(200);
        myArrayList.add(300);
        myArrayList.add(400);
        myArrayList.add(500);
        myArrayList.add(600);
        myArrayList.add(700);
        myArrayList.add(800);
        myArrayList.add(900);
        myArrayList.add(1000);


        myArrayList.remove(8);

        System.out.println(myArrayList.get(8));


        List<Person> persons = new ArrayList<>(NewParser.myHashSet);
        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                int i = o1.getName().compareToIgnoreCase(o2.getName());
                if (i != 0) {
                    return i;
                }
                return o1.getLastname().compareToIgnoreCase(o2.getLastname());
            }
        });
        System.out.println(persons);
        int z = 'a';
        int b = 'b';
        int c = 'c';
        System.out.println(z);
        System.out.println(b);
        System.out.println(c);
        MyFilter myFilter = new MyFilter();
        myFilter.myFilter(persons);




       /* List<String> integerList = new ArrayList<>();
        Collection<String> collection = integerList;
        integerList.add("xxx");
        integerList.add("x");
        integerList.add("xx");

        integerList.remove(2);
        collection.remove(1);
        System.out.println(integerList.size());
        //4
        //3
        //2
        //1
        //0*/
    }
}
