package Rectangle;
import java.util.Scanner;
public class Rectangle {
}


class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            int s;
            int p;
            p = n*2 + m*2;
            s = m*n;
            System.out.print(p + " ");
            System.out.println(s);
        }

    }
}