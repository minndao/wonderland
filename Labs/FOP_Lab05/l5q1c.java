
import java.util.IntSummaryStatistics;
import java.util.Random;

/**
 */
public class l5q1c {
    public static void main(String[] args) {
        IntSummaryStatistics stats = new Random().ints(10, 1, 101).summaryStatistics();
        System.out.println("min = " + stats.getMin());
        System.out.println("max = " + stats.getMax());
        System.out.println("average = " + stats.getAverage());
    }
}
