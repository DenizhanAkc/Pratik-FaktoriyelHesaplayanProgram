import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman Sayisini Giriniz :");
        int n = inp.nextInt();
        int nFac = 1;
        for (int i = 1; i <= n; i++) {

            nFac = nFac * i;

        }
        System.out.print("Kume Sayisini Giriniz :");
        int r = inp.nextInt();
        int rFac = 1;
        for (int i = 1; i <= r; i++) {

            rFac = rFac * i;

        }
        int minusFac = 1;
        for (int i = 1; i <= (n - r); i++) {

            minusFac = minusFac * i;
        }
        double comb = (nFac / (rFac * (minusFac)));
        System.out.println(comb);

        }
    }


//C(n,r) = n! / (r! * (n-r)!)
