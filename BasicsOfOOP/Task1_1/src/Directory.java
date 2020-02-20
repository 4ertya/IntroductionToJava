import java.util.ArrayList;

public class Directory {

    private String directoryName;
    private ArrayList<File> files;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<File>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(String fileName) {
        for (int i = 0; i < files.size(); i++) {
            if(files.get(i).getFileName().equals(fileName)) {
                files.remove(i);
            }
        }
    }
    public void printContent(){
        System.out.println(directoryName+":");
        for (File file: files){
            System.out.println(file);
        }
    }
}
