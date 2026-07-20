
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista {
    public static void main(String a[]) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

        long start = System.currentTimeMillis();
        int sum1 = nums.stream().map(i -> i * 2).mapToInt(i -> i).sum();
        long end = System.currentTimeMillis();
        System.out.println("normal: " + (end - start));

        long startPara = System.currentTimeMillis();
        int sumPara = nums.parallelStream().map(i -> i * 2).mapToInt(i -> i).sum();
        long endPara = System.currentTimeMillis();
        System.out.println("Para: " + (endPara - startPara));

        System.out.println(sum1 + " ____ " + sumPara);
    }
}