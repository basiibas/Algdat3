import java.util.Comparator;

public class Main {
    public static void main(String[]args){

        /*

        long startTime = System.nanoTime();

        ObligSBinTre<Character> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        char[] verdier = "DACBOPE".toCharArray();
        for (char c : verdier) tre.leggInn(c);
        System.out.println(tre);

        long endTime = System.nanoTime();
        long duration = ((endTime - startTime)/1000000);
        System.out.println(duration + "ms");

        */
        /*
        int[] a = {4,7,2,9,4,10,8,7,4,6,1};
        ObligSBinTre<Integer> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) tre.leggInn(verdi);
        System.out.println(tre.fjernAlle(4)); // 3
        tre.fjernAlle(7); tre.fjern(8);
        System.out.println(tre.antall()); // 5
        System.out.println(tre + " " + tre.toString());
        */

        ObligSBinTre<Integer> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        tre.leggInn(0);
        System.out.println(tre);
        tre.fjernAlle(0);
        System.out.println(tre);



        // [1, 2, 6, 9, 10] [10, 9, 6, 2, 1]
        // OBS: Hvis du ikke har gjort oppgave 4 kan du her bruke toString()
    }
}
