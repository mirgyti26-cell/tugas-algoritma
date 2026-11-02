package array;
import java.util.ArrayDeque;

public class SampleQueue {
    public static void main(String[] args) {
        ArrayDeque <String> mahasiswa = new ArrayDeque<String>();
        mahasiswa.add("Syahril");
        mahasiswa.add("Meti");
        mahasiswa.add("Bismi");
        mahasiswa.add("Anton");

        System.out.println(mahasiswa.poll());
        System.out.println(mahasiswa.size());

        for (String name : mahasiswa) {
            System.out.println(name);
        }
        
        mahasiswa.remove();
        for (String name : mahasiswa) {
            System.out.println(name);
        }
    }
}