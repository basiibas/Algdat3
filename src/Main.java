import java.util.Comparator;

public class Main {
    public static void main(String[]args){
        /* Oppgave 0
        ObligSBinTre<String> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        System.out.println(tre.antall()); // Utskrift: 0

        */

        //Oppgave 1
        Integer[] a = {4,7,2,9,5,10,8,1,3,6};
        ObligSBinTre<Integer> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) tre.leggInn(verdi);
        System.out.println(tre.antall()); // Utskrift: 10
    }
}
