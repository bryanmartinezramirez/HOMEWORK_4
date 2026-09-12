public class CompositionDriver {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");

        Folder app = new Folder("app");
        app.addFile(new File("config.php"));
        app.addFile(new File("database.php"));

        Folder sourceFiles = new Folder("Source Files");
        sourceFiles.addFile(new File("index.php"));
        sourceFiles.addFile(new File("functions.php"));
        app.addSubFolder(sourceFiles);

        Folder publicFolder = new Folder("public");
        publicFolder.addFile(new File("index.php"));
        publicFolder.addFile(new File("style.css"));

        phpDemo1.addSubFolder(app);
        phpDemo1.addSubFolder(publicFolder);
        phpDemo1.addFile(new File("README.md"));

        System.out.println("PART 5: COMPOSITION");
        System.out.println("===================");
        System.out.println("Original structure:");
        phpDemo1.print();

        System.out.println("\nAfter deleting the app folder:");
        phpDemo1.deleteSubFolder("app");
        phpDemo1.print();

        System.out.println("\nAfter deleting the public folder:");
        phpDemo1.deleteSubFolder("public");
        phpDemo1.print();
    }
}
