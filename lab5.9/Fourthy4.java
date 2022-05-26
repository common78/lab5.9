package Fourthy4;

public class Fourthy4 {

	public static void main(String[] args) {
		int f = 1;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.print(n + "! = " + f);

        int n1 = 10;
        long f1 = 1;
        int i1 = 1;
        while(i1 <= n1) {
            f1 *= i1;
            i1++;
        }
            System.out.println(n1+"! = "+ f1);

	}

}
