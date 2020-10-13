import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter bricks");
        while(true){
            String x = read.next();
            if (Integer.parseInt(x) == 0){
                break;
            }
            list.add((Integer.parseInt(x)));
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println( Fib(0 ,1, 0, list.get(i)));
        }
    }

    public static int Fib ( int f1, int f2, int c, int n){
        int num = f1 + f2;
        if (c < (n-1)){
            num = Fib(f1 = f2, f2 = num, c = c + 1, n);
        }
        return num;
    }
}
