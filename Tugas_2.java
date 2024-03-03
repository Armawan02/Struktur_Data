package armawan;
import java.util.*;
public class Tugas2 {
    public static void main(String[] args) {
        //1. Array 1D dengan tipe data primitif
        int ar[] = new int[3];
        ar[0] = 222;
        ar[1] = 444;
        ar[2] = 224;
        
        byte b[] = {22, 44, 24, 42};
        
        long c[] = {424, 224, 442, 242};
        
        short[] d = {73, 62, 67};
        
        double e[] = {2.15, 6.76};
        
        float f[] = {1.1f, 2.2f, 1.3f,};
        
        char[] name;
        
        name = new char[3];
        name[0] = 'O';
        name[1] = 'M';
        name[2] = 'E';
        boolean g[] = {true, true, false};

        //2. 5 metode mencetak isi Array
        System.out.println("For");
        int array[] = new int[3];
        array[0] = 864;
        array[1] = 45;
        array[2] = 86;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("For-Each");
        byte foreach[] = {22, 35, 45, 77};
        for (int i : foreach) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("While");
        long whilee[] = {774, 765, 743, 353};
        int i = 0;
        while (i < whilee.length) {
            System.out.print(whilee[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Do-While");
        float ff[] = {2.3f, 2.6f, 1.1f,};
        byte j = 0;
        do {
            System.out.print(ff[j] + " ");
            j++;
        } while (j < ff.length);
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Kelas Arrays");
        name = new char[3];
        name[0] = 'O';
        name[1] = 'M';
        name[2] = 'E';
        System.out.println(Arrays.toString(name));

        //3. Array 2D dengan inputan
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Array 2D dengan inputan");
        System.out.println("Input nilai indeks");
        int zz[][] = new int[2][2];
        Scanner jw = new Scanner(System.in);
        for (int k = 0; k < zz.length; k++) {
            for (int l = 0; l < zz[k].length; l++) {
                System.out.print("[" + k + "]" + "[" + l + "]" + "= ");
                zz[k][l] = jw.nextInt();

            }

        }
        System.out.println(Arrays.deepToString(zz));
        //4. ArrayList tipe data Wrapper
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ArrayList tipe data wrapper");
        ArrayList<Character> namaku = new ArrayList<Character>();
        namaku.add('A');
        namaku.add('R');
        namaku.add('M');
        namaku.add('A');
        namaku.add('W');
        namaku.add('A');
        namaku.add('N');
        
            System.out.println(namaku);
        
        //5. ArrayLIst bertipe Integer
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ArrayList bertipe Integer");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //menambah nilai
        numbers.add(422);
        numbers.add(343);
        numbers.add(332);
        numbers.add(47);
        System.out.print("Data ArrayList " + numbers);
        System.out.println("\nIndeks ke-3 : " + numbers.get(3));

        numbers.set(2, 7);
        System.out.println("Setelah nilai diganti \n" + numbers);

        numbers.remove(3);
        System.out.println("Setelah nilai dihapus \n" + numbers);

        System.out.println("Size ArrayList : " + numbers.size());

    }
}
