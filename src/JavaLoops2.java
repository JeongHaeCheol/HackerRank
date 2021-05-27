

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {

		// Not Use Math.pow()
		
		int a;
        int b;
        int n;

        int result;

        int a2;
        int c;

        String resultText;
        String[] box = new String[1];

        int q = -1;
        
        
        Scanner scanner = new Scanner(System.in); 
        q = scanner.nextInt();
        
        while (!(0 <= q && q <= 500)) {
            scanner.close();
            scanner = new Scanner(System.in);
            q = scanner.nextInt();
        }
        
        box = new String[q];

        for (int j = 0; j < q; j++) {

            resultText = "";
            c = 2;
            result = 0;

            do {
                a = scanner.nextInt();
                b = scanner.nextInt();
                n = scanner.nextInt();
            } while (!check(a, b, n));

            result = a + b;

            for (int i = 0; i < n; i++) {

                resultText = resultText + result + " ";

                result = result + (b * c);
                c = c * 2;
            }
            box[j] = resultText + " ";
        }
    
        for (int j = 0; j < q; j++) {
            System.out.println(box[j]);
        }
}
    
        static boolean check(int a, int b, int n) {

            if ((0 <= a && a <= 50) && (1 <= n && n <= 15)) {
                return true;
            }else
            return false;
        }


}
