import java.io.File;
import java.io.FilenameFilter;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DarthVader on 22.06.2016.
 */
public class MyFileNameFilter implements FilenameFilter {
    private String ext;

    public MyFileNameFilter(String ext) {
        this.ext = ext.toLowerCase();
    }

    protected static List<File> findFiles(String fileName, String ext) {
        File file = new File(fileName);
        List<File> list = new LinkedList<>();
        File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
        if (listFiles.length == 0) {
        } else {
            for (File f : listFiles) {
                list.add(f);
            }
        }
        return list;
    }

    @Override
    public boolean accept(File fileName, String name) {
        return name.toLowerCase().endsWith(ext);
    }
}
