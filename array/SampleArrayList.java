package array;
import java.util.ArrayList;

public class SampleArrayList {
    public static void main(String[] args) {
        ArrayList <String> mahasiswa = new ArrayList<String>();
        mahasiswa.add("Syahril");
        mahasiswa.add("Meti");
        mahasiswa.add("Bismi");
        mahasiswa.add("Anton");

        System.out.println(mahasiswa.get(0));
        System.out.println(mahasiswa.size());
        mahasiswa.set(1, "Arya");
        mahasiswa.remove(2);

        for (String name : mahasiswa) {
            System.out.println(name);
        }
        mahasiswa.clear();
    }
}