public class ch5_10 {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=10;i++){
            if(i%3==0)
                break;
            System.out.println("i="+i);
        }
        System.out.println("when loop interrrupted. i="+i);
    }
    
}