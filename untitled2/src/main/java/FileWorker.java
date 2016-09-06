import java.io.*;
import java.util.Set;

/**
 * Created by DarthVader on 20.06.2016.
 */
public class FileWorker {

    public static void write(File fileName, Set text) {
        //Определяем файл
//        File file = fileName;

        try {
            //проверяем, что если файл не существует то создаем его
            if (!fileName.exists()) {
                fileName.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(new FileWriter(fileName, true));

            try {
                //Записываем текст у файл
                out.write(text.toString());
                out.flush();
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String fileName2, Set text) {
        File fileName = new File(fileName2);
        write(fileName, text);
    }


    public static String read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

        exists(file);

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    private static void exists(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }

    }
}

