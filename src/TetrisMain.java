import java.util.Scanner;

public class TetrisMain {
    public static void main(String args[]) {
        Ramka r = new Ramka();
        Control[] c = new Control[70];
        int kaka = 1;
        c[kaka] = new Control();
        System.out.print("Write your name  ");
        Scanner scan = new Scanner(System.in);
        String Name=scan.nextLine();


        while (true) {

            c[kaka].KakawkaMove(r.RamkaMasuv,Name);
            r.VuvidTetris();

            if (c[kaka].k==true) {
            kaka++;
            c[kaka] = new Control();
            c[kaka].l=c[kaka-1].l+c[kaka].l;
            if((c[kaka].x|c[kaka].x2)==(c[kaka-1].x|c[kaka-1].x2)){System.out.println("Game over ");}}
    }}}
