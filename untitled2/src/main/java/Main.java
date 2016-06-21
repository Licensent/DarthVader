import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by DarthVader on 20.06.2016.
 */
public class Main {
    private static String text = "This new text \nThis new text2\nThis new text3\nThis new text4\n";
    private static String fileName = "C://Users/DarthVader/IdeaProjects/untitled2";

    public static void main(String... args) throws FileNotFoundException {

        File[] fileList;
        File file = new File(fileName);
        fileList = file.listFiles();

        for (int i = 0; i < fileList.length; i++) {
            //Нужны только папки в место isFile() пишим isDirectory()
            if (fileList[i].isFile())
                System.out.println(String.valueOf(i) + " - " + fileList[i].getName());
        }

//        BufferedReader in = new BufferedReader(new FileReader(directory.getName()));
//        System.out.println(in);

//        FileWorker.write(fileName, text);
//         System.out.println(NewParser.parse(fileName));
    }
}
