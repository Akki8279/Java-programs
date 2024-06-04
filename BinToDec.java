import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int c = 0,t = 0;
        double p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any binary number");
        int n = sc.nextInt();
        while(n!=0){
            p = (n%10)*Math.pow(2,c);
            if(p!=0)
            t+=p;
            n/=10;
            c++;
        }
        System.out.println(t);
    }
}
