import java.util.Comparator;

public class Main {
    public static void main(String[]args){
        long startTime = System.nanoTime();

        //------------KODE------------------------------------------>


        int[] a = {4,7,2,9,4,10,8,7,4,6,1};
        ObligSBinTre<Integer> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) tre.leggInn(verdi);
        //System.out.println(tre.fjernAlle(4)); // 3
        //tre.fjernAlle(7);
        tre.fjern(8);
        System.out.println(tre.antall()); // 5
        System.out.println(tre.toString());



        //------------KODE------------------------------------------>

        long endTime = System.nanoTime();
        long duration = ((endTime - startTime)/1000000);
        System.out.println(duration + "ms");
    }
}
