import java.io.FileNotFoundException;

/**
 * Created by DarthVader on 20.06.2016.
 */
public class Main {
    private static String fileName = "C://projects/DarthVader/untitled2";
    private static String fileName2 = "C://projects/DarthVader/untitled2/2.txt";
    private static String ext = ".xls";
//    public static List<Person> persons = new Person(a.XXX(MyFileNameFilter.findFiles(fileName, ext)));
    public static void main(String... args) throws FileNotFoundException {
//        MyFileNameFilter.findFiles(fileName, ext);
        NewParser a = new NewParser();
        a.XXX(MyFileNameFilter.findFiles(fileName, ext));

        //        NewParser parser = new NewParser(filter);
//        File[] fileList;
//        File file = new File(fileName);
//        fileList = file.listFiles();

//        for (int i = 0; i < fileList.length; i++) {
        //Нужны только папки в место isFile() пишим isDirectory()
//            if (fileList[i].isFile())
//                System.out.println(String.valueOf(i) + " - " + fileList[i].getName());
//        }

//        BufferedReader in = new BufferedReader(new FileReader(directory.getName()));
//        System.out.println(in);

//        FileWorker.write(fileName2, text);
//        System.out.println(NewParser.parse(MyFileNameFilter.findFiles(fileName, ext)));
    }
}
