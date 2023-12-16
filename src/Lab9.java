import java.util.Scanner;
import java.util.ArrayList;
class file{
    String name;
    String path;
    file(String name, String path){
        this.name= name;
        this.path=path;
    } @Override
    public String toString() {
        return "file{" +
                "Название='" + name + '\'' +
                ", путь к файлу='" + path + '\'' +
                '}';
    }
}
class musicFile extends file{
    musicFile(String name, String path) {
        super(name, path);
    } @Override
    public String toString() {
        return "Музыкальный файл{" +
                "Название='" + name + '\'' +
                ", путь к файлу='" + path + '\'' +
                '}';
    }
}
class videoFile extends file{
    videoFile(String name, String path) {
        super(name, path);
    } @Override
    public String toString() {
        return "Видеофайл{" +
                "Название='" + name + '\'' +
                ", путь к файлу='" + path + '\'' +
                '}';
    }
}
class Package{
    private ArrayList<file> masCar=new ArrayList<file>();
    public void addFile(file m){
        masCar.add(m);
    }
    public void printFiles() {
        System.out.println("В каталоге: ");
        for (file a : masCar) {
            System.out.println("\t" + a.toString());
        }
    }
    public void numberOfMusicFiles(){
        int colMus=0;
        for (file a : masCar) {
            if (a instanceof musicFile) {
                colMus+=1;
            }
        }
        System.out.println("Количество музыкальных файлов "+ colMus);
    }
    public void numberOfVideoFiles(){
        int colVideo=0;
        for (file a : masCar) {
            if (a instanceof videoFile) {
                colVideo+=1;
            }
        }
        System.out.println("\t" +"Количество видеофайлов "+ colVideo);
    }
}
public class Lab9 {
    //Вариант 6
    public static void main(String[] args) {
        Package Catsound = new Package();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t" +"Введите количество музыкальных файлов");
        int colmusic= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < colmusic; i++) {
            System.out.println("Введите название музыкального файла ");
            String name = sc.nextLine();
            System.out.println("Введите путь к музыкальному файлу");
            String path = sc.nextLine();
            musicFile music1 = new musicFile(name,path);
            Catsound.addFile(music1);
        }
        System.out.println("Введите количество видеофайлов");
        int colvideo= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < colvideo; i++) {
            System.out.println("Введите название видеофайла");
            String name = sc.nextLine();
            System.out.println("Введите путь к видеофайлу");
            String path = sc.nextLine();
            videoFile video1 = new videoFile(name,path);
            Catsound.addFile(video1);
        }
        Catsound.printFiles();
        Catsound.numberOfMusicFiles();
        Catsound.numberOfVideoFiles();
    }
}