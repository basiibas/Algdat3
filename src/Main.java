import java.util.Comparator;

public class Main {
    public static void main(String[]args){
//opppgave 0
        /*
        ObligSBinTre<String> to = new ObligSBinTre<>(Comparator.naturalOrder());
        System.out.println(to.antall()); // Utskrift: 0



        ObligSBinTre<Character> four = new ObligSBinTre<>(Comparator.naturalOrder());
        System.out.println(four.antall());

        */
        /*
        //Oppgave 1
        Integer[] a = {4,7,2,9,5,10,8,1,3,6};
        ObligSBinTre<Integer> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) tre.leggInn(verdi);
        System.out.println(tre.antall()); // Utskrift: 10

*/

        //Oppgave 2

        Integer[] a = {4,7,2,9,4,10,8,7,4,6};
        ObligSBinTre<Integer> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) tre.leggInn(verdi);
        System.out.println(tre.antall()); // Utskrift: 10
        System.out.println(tre.antall(5)); // Utskrift: 0
        System.out.println(tre.antall(4)); // utskrift: 3
        System.out.println(tre.antall(7)); // Utskrift: 2
        System.out.println(tre.antall(10)); // Utskrift: 1




    }
}
