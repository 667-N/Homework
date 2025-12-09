package IfElse;
import java.util.Scanner;

public class ifElse {

}


class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y;
        if(x < 5){
            y = x*x - 3*x +4;
        } else{
            y = x + 7;
        }
        System.out.print(y);
    }
}