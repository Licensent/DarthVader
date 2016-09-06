
import java.io.File;
import java.util.*;

/**
 * Created by DarthVader on 18.07.2016.
 */
public class MyFilter {
    private static String fileName3 = "C://projects/DarthVader/untitled2/3.txt";

    public Map<String, Set<Person>> myFilter(List<Person> persons) {
        Map<String, Set<Person>> lastNameMap = new HashMap<>();
        for (Person person : persons) {
            Set<Person> personSet = lastNameMap.get(person.getLastname());
            if (personSet == null) {
                personSet = new HashSet<>();
                lastNameMap.put(person.getLastname(), personSet);
            }
            personSet.add(person);

        }
        System.out.println(lastNameMap);
        for (String s:lastNameMap.keySet()){
            File file = new File(s+".txt");
            FileWorker.write(file, lastNameMap.get(s));
        }
        return lastNameMap;

    }
}
