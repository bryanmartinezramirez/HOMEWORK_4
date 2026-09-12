import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private final ArrayList<File> files;
    private final ArrayList<Folder> subFolders;

    public Folder(String name) {
        setName(name);
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return new ArrayList<>(files);
    }

    public List<Folder> getSubFolders() {
        return new ArrayList<>(subFolders);
    }

    public void addFile(File file) {
        if (file == null) {
            throw new IllegalArgumentException("A folder cannot contain a null file.");
        }
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        if (folder == null) {
            throw new IllegalArgumentException("A folder cannot contain a null subfolder.");
        }
        if (folder == this) {
            throw new IllegalArgumentException("A folder cannot contain itself.");
        }
        subFolders.add(folder);
    }

    public boolean deleteSubFolder(String folderName) {
        for (int i = 0; i < subFolders.size(); i++) {
            if (subFolders.get(i).getName().equals(folderName)) {
                /*
                 * Removing the only parent reference composes the deletion:
                 * the folder and everything it owns are no longer in the tree.
                 */
                subFolders.remove(i);
                return true;
            }
        }
        return false;
    }

    public void print() {
        print(0);
    }

    private void print(int indentation) {
        printIndentation(indentation);
        System.out.println("Folder: " + name);

        for (File file : files) {
            printIndentation(indentation + 1);
            file.print();
        }

        for (Folder subFolder : subFolders) {
            subFolder.print(indentation + 1);
        }
    }

    private static void printIndentation(int indentation) {
        for (int i = 0; i < indentation; i++) {
            System.out.print("  ");
        }
    }
}
