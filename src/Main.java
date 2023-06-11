import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int n;
    int s1=0;
    int s2=1;
    int fibonacci=0;
    Scanner input=new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
    n= input.nextInt();
        System.out.print(s1);
        System.out.print(" ");
        System.out.print(s2);
        System.out.print(" ");
    for(int i=0;i<=(n-2);i++) {
        fibonacci=s1+s2;
        System.out.print(fibonacci);
        System.out.print(" ");
        s1=s2;
        s2=fibonacci;

    }
    }
}
// 0 1 1 2 3 5 8 13 21 34