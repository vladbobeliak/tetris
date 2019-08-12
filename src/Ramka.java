public class Ramka {
     char RamkaMasuv[][] = new char[10][10];

    public Ramka() {

        for (int i = 0; i < RamkaMasuv.length; i++) {
            for (int j = 0; j < RamkaMasuv.length; j++) {
                RamkaMasuv[i][j] = ' ';
                RamkaMasuv[0][j] = '_';
                RamkaMasuv[9][j] = '_';
                RamkaMasuv[i][0] = '|';
                RamkaMasuv[i][9] = '|'; }
        }}

    public void VuvidTetris() {
        for (int i = 0; i < RamkaMasuv.length; i++) {
        for (int j = 0; j < RamkaMasuv.length; j++) {
                System.out.print(RamkaMasuv[i][j] + " ");
            }
            System.out.println(); }}}
