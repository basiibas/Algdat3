import java.util.Comparator;

public class Main {
    public static void main(String[]args){

        long startTime = System.nanoTime();

        ObligSBinTre<Character> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        char[] verdier = "DACBOPE".toCharArray();
        for (char c : verdier) tre.leggInn(c);
        System.out.println(tre);

        long endTime = System.nanoTime();
        long duration = ((endTime - startTime)/1000000);
        System.out.println(duration + "ms");
    }
}
