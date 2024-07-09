public class ch5_4 {
    public static void main(String[] args) {
        int a=50, b=20;
        char oper='+';
        switch (oper) {
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
            System.out.println(a+"-"+b+"="+(a-b));
                break;
            default:
                System.out.println("Unknown expression!!");
                
        }
    }
}
