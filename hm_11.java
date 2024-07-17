import java.util.Random;

public class hm_11 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        
        System.out.print("一維陣列內容：");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); 
            System.out.print(array[i] + " ");
        }
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println("\n陣列中的最大值為：" + max);
    }
}