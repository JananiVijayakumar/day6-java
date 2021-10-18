import java.util.*;
public class StopWatch {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Type START to Start the watch : ");
        String str = n.next().toLowerCase();
        long start = System.currentTimeMillis();
        if (str.equals("start")){
            System.out.print("Type STOP to Stop the watch : ");
            String str1 = n.next().toLowerCase();
            while (!str1.equals("stop")){
                System.out.println("Type STOP to Stop the watch : ");
                str1 = n.next().toLowerCase();
            }
            long stop = System.currentTimeMillis();
            long timeElapesd = stop - start;
            System.out.println("Time = "+timeElapesd+ " ms");
        }
        else
            System.out.println("Input is wrong ");


    }


}