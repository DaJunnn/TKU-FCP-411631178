import java.util.Scanner;
public class ch5_8 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n,sum=0;

        do{
            System.out.print("請輸入累加的最大值");
            n=scn.nextInt();
        }while(n<1);

        for(int i=1;i<=n;i++)
        sum+=i;
        System.out.printf("1+2+....+%d=%d\n",n,sum);
        scn.close();

        
    }
    
}