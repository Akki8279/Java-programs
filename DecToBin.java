import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        char A = 'y';
        while(A != 'n'){
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int i = 0;
        while(n!=0){
            a[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j = i-1;j>=0; j--)
            System.out.print(a[j]);
            System.out.println("\nDo yo want to continue y/n ?");
            A = sc.next().charAt(0);
    }
    }
}
