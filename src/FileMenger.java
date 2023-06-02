import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

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

    public void createFile(String name, String textToAppend) {
        String filePath = folder.getPath() + "\\" + name;

        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.append(textToAppend);
                writer.newLine();
                System.out.println("Text appended successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while appending the text to the file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }


}
