import java.io.File;
import java.util.ArrayList;

public class FileMenger {

    private File folder;

    public FileMenger() {
        folder = new File(new File("").getAbsolutePath());
    }

    public void openFolderRepository() {
        folder = new File(folder.getAbsolutePath() + "\\Repository");
        if (folder.mkdir()) {
            System.out.println("folder 'Repository' created and open");
        } else {
            System.out.println("folder 'Repository' open");
        }
    }

    public void getFileInFolder() {
        for (File file :
                folder.listFiles()) {
            System.out.println(file.getName());
        }
    }


}
