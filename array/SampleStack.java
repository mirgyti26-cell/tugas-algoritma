package array;
import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) {
        Stack <String> mahasiswa = new Stack<String>();
        mahasiswa.push("Syahril");
        mahasiswa.push("Meti");
        mahasiswa.push("Bismi");
        mahasiswa.push("Anton");

        System.out.println(mahasiswa.get(0));
        System.out.println(mahasiswa.size());
        mahasiswa.set(1, "Arya");
        mahasiswa.remove(2);

        for (String name : mahasiswa) {
            System.out.println(name);
        }
        //Manggil yang paling akhir, dan hilang dari listnya
        System.out.println(mahasiswa.pop());

        for (String name : mahasiswa) {
            System.out.println(name);
        }

        System.out.println(mahasiswa.peek());
        System.out.println(mahasiswa.firstElement());
        System.out.println(mahasiswa.lastElement());
    }
}