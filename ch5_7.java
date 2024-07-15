public class ch5_7 {
    public static void main(String[] args) {
        int n=1,sum=0;
        while (sum<=20) {
            sum+=n;
            System.out.printf("n=%d, sum=%2d\n",n, sum);
            n++;
        }
    }
    
}