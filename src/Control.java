import java.util.Scanner;
public class Control  {
    int x=0; int x2=1; int y=3; int y1=4; int y2=5; int y3=6;
    boolean k=false; int n=0; int l =0;
    int Move;
    Scanner scan = new Scanner(System.in);


     public  int R = (int) (Math.random() * 5) ;
    //int R=0;

    public void KakawkaMove(char[][] TT,String name) {
        Move= scan.nextInt();
        if(Move==2||Move==4||Move==6){

        if(Move==2){x++; x2++;}// move down
        if(Move==6){y++; y1++;  y2++;  y3++;}  // move right
        if(Move==4){y--; y1--;  y2--;  y3--;} // move left

        if(Move==2){ // limit down
            if(R==0&&x+1=='_'){x=8;}
            if(R==2&&x2>8){x=8;x2=9;}
            if((R==1||R==3||R==4)&&x2>8){x=8;x2=9;}}

        if(Move==6){ // limit right
            if(R==0&&y3>8){y=5;y1=6;y2=7;y3=8;}
            if(R==2&&y2>8){y1=7;y2=8;}
            if((R==1||R==3||R==4)&&y3>8){y1=6;y2=7;y3=8;}}

        if(Move==4){ // limit left
            if(R==0&&y<2){y=1;y1=2;y2=3;y3=4;}
            if(R==2&&y1<2){y1=1;y2=2;}
            if((R==1||R==3||R==4)&&y1<2){y1=1;y2=2;y3=3;}}

        if (R==0) {
            TT[x][y] = 'o'; //
            TT[x][y1] = 'o'; // pryamokytnik +
            TT[x][y2] = 'o'; //
            TT[x][y3] = 'o'; //

            if(Move==2&&x>1){//
                TT[x-1][y]  = ' ';//
                TT[x-1][y1] = ' ';// zeroing of previous values
                TT[x-1][y2] = ' ';//
                TT[x-1][y3] = ' ';}//
            if(Move==4&&y3<9&&y3>1){TT[x][y3+1] = ' ';}//
            if(Move==6&&y>1&&y<9){TT[x][y-1] = ' ';}//

        if(TT[x+1][y]=='_'||TT[x+1][y1] == '_'||TT[x+1][y2]=='_'||TT[x+1][y3] == '_' ||
           TT[x+1][y]=='o'||TT[x+1][y1] == 'o'||TT[x+1][y2]=='o'||TT[x+1][y3] == 'o' ){k=true;} // new limit
        }

        if(R==1){
            TT[x][y1]  = 'o';//
            TT[x][y2]  = 'o';//PivX +
            TT[x][y3]  = 'o';//
            TT[x2][y2] = 'o';//

            if(Move==2&&(x>1)){// zeroing of previous values
                TT[x-1][y1]  = ' ';
                TT[x-1][y2] = ' ';
                TT[x-1][y3] = ' ';}
            if(Move==4&&y3<9&&y3>1){// zeroing of previous values
                TT[x][y3+1] = ' ';
                TT[x2][y2+1] = ' ';}
            if(Move==6&&y1>1&&y1<9){// zeroing of previous values
                TT[x][y1-1] = ' ';
                TT[x2][y2-1] = ' ';}

            if(TT[x2+1][y2]=='_'||TT[x+1][y1] == 'o'||TT[x+1][y3] == 'o'||TT[x2+1][y2]=='o'){k=true;}}// new limit

        if(R==2){
            TT[x][y1]  = 'o';//
            TT[x][y2]  = 'o';//Kvadrat +
            TT[x2][y1] = 'o';//
            TT[x2][y2] = 'o';//

            if(Move==2&&x>1){ // zeroing of previous values
                TT[x-1][y1]  = ' ';
                TT[x-1][y2] = ' ';}
            if(Move==4&&y2<5){ // zeroing of previous values
                TT[x][y2+1] = ' ';
                TT[x2][y2+1] = ' '; }
            if(Move==6&&y1>1&&y1<9){ // zeroing of previous values
                TT[x][y1-1] = ' ';
                TT[x2][y1-1] = ' ';}

            if(TT[x2+1][y1]=='_'||TT[x2+1][y2] == '_'||TT[x2+1][y1]=='o'||TT[x2+1][y2]=='o'){k=true;}// new limit
        }

        if(R==3){
            TT[x][y1]  = 'o';//
            TT[x][y2]  = 'o';//PivSS +
            TT[x2][y2] = 'o';//
            TT[x2][y3] = 'o';//

            if(Move==2&&(x>1)){ // zeroing of previous values
                TT[x-1][y1]  = ' ';
                TT[x-1][y2] = ' ';
                TT[x2-1][y3] = ' ';}
            if(Move==4&&y2<5){ // zeroing of previous values
                TT[x][y2+1] = ' ';
                TT[x2][y3+1] = ' ';}
            if(Move==6&&y1>1&&y1<9){// zeroing of previous values
                TT[x][y1-1] = ' ';
                TT[x2][y2-1] = ' ';}

            if(TT[x2+1][y2]=='_'||TT[x+1][y1] == 'o'||TT[x2+1][y3] == 'o'||TT[x2+1][y2]=='o'){k=true;}}// new limit

        if(R==4){
            TT[x][y1]  = 'o';//
            TT[x][y2]  = 'o';//Hak +
            TT[x][y3]  = 'o';//
            TT[x2][y1] = 'o';//

            if(Move==2&&(x>1)){ // zeroing of previous values
                TT[x-1][y1]  = ' ';
                TT[x-1][y2] = ' ';
                TT[x-1][y3] = ' ';}
            if(Move==4&&y3>1&&y3<9){ // zeroing of previous values
                TT[x][y3+1] = ' ';
                TT[x2][y1+1] = ' ';}
            if(Move==6&&y1>1&&y1<9){ // zeroing of previous values
                TT[x][y1-1] = ' ';
                TT[x2][y1-1] = ' ';}

            if(TT[x2+1][y1]=='_'||TT[x+1][y2] == 'o'||TT[x+1][y3] == 'o'||TT[x2+1][y1]=='o'){k=true;}}// new limit




            if(TT[3][1]=='o'&&TT[3][2]=='o'&&TT[3][3]=='o'&&TT[3][4]=='o'&& TT[3][5]=='o'&&// clear line
               TT[3][6]=='o'&&TT[3][7]=='o'&&TT[3][8]=='o'){
                for(int j3=1;j3<9;j3++){TT[3][j3]=' ';}n=3;l++;}

            if(TT[4][1]=='o'&&TT[4][2]=='o'&&TT[4][3]=='o'&&TT[4][4]=='o'&& TT[4][5]=='o'&&
               TT[4][6]=='o'&&TT[4][7]=='o'&&TT[4][8]=='o'){
                for(int j4=1;j4<9;j4++){TT[4][j4]=' ';}n=4;l++;}

            if(TT[5][1]=='o'&&TT[5][2]=='o'&&TT[5][3]=='o'&&TT[5][4]=='o'&& TT[5][5]=='o'&&
               TT[5][6]=='o'&&TT[5][7]=='o'&&TT[5][8]=='o'){
                for(int j5=1;j5<9;j5++){TT[5][j5]=' ';}n=5;l++;}

            if(TT[6][1]=='o'&&TT[6][2]=='o'&&TT[6][3]=='o'&&TT[6][4]=='o'&& TT[6][5]=='o'&&
               TT[6][6]=='o'&&TT[6][7]=='o'&&TT[6][8]=='o'){
                for(int j6=1;j6<9;j6++){TT[6][j6]=' ';}n=6;l++;}

            if(TT[7][1]=='o'&&TT[7][2]=='o'&&TT[7][3]=='o'&&TT[7][4]=='o'&& TT[7][5]=='o'&&
               TT[7][6]=='o'&&TT[7][7]=='o'&&TT[7][8]=='o'){
                for(int j7=1;j7<9;j7++){TT[7][j7]=' ';}n=7;l++;}

            if(TT[8][1]=='o'&&TT[8][2]=='o'&&TT[8][3]=='o'&&TT[8][4]=='o'&& TT[8][5]=='o'&&
               TT[8][6]=='o'&&TT[8][7]=='o'&&TT[8][8]=='o'){
                for(int j=1;j<9;j++){TT[8][j]=' ';}n=8;l++;}



            if(n==3){for(int i=1;i<9;i++){
                if(TT[2][i]=='o'){TT[2][i]=' ';TT[3][i]='o';}}k=true;}// move line after clear

            if(n==4){for(int i=1;i<9;i++){
                if(TT[3][i]=='o'){TT[3][i]=' ';TT[4][i]='o';}
                if(TT[2][i]=='o'){TT[2][i]=' ';TT[3][i]='o';}}k=true;}

            if(n==5){for(int i=1;i<9;i++){
                if(TT[4][i]=='o'){TT[4][i]=' ';TT[5][i]='o';}
                if(TT[3][i]=='o'){TT[3][i]=' ';TT[4][i]='o';}
                if(TT[2][i]=='o'){TT[2][i]=' ';TT[3][i]='o';}}k=true;}

            if(n==6){for(int i=1;i<9;i++){
                if(TT[5][i]=='o'){TT[5][i]=' ';TT[6][i]='o';}
                if(TT[4][i]=='o'){TT[4][i]=' ';TT[5][i]='o';}
                if(TT[3][i]=='o'){TT[3][i]=' ';TT[4][i]='o';}
                if(TT[2][i]=='o'){TT[2][i]=' ';TT[3][i]='o';}}k=true;}

            if(n==7){for(int i=1;i<9;i++){
                if(TT[6][i]=='o'){TT[6][i]=' ';TT[7][i]='o';}
                if(TT[5][i]=='o'){TT[5][i]=' ';TT[6][i]='o';}
                if(TT[4][i]=='o'){TT[4][i]=' ';TT[5][i]='o';}
                if(TT[3][i]=='o'){TT[3][i]=' ';TT[4][i]='o';}
                if(TT[2][i]=='o'){TT[2][i]=' ';TT[3][i]='o';}}k=true;}

            if(n==8){for(int i=1;i<9;i++){
                if(TT[7][i]=='o'){TT[7][i]=' ';TT[8][i]='o';}
                if(TT[6][i]=='o'){TT[6][i]=' ';TT[7][i]='o';}
                if(TT[5][i]=='o'){TT[5][i]=' ';TT[6][i]='o';}
                if(TT[4][i]=='o'){TT[4][i]=' ';TT[5][i]='o';}
                if(TT[3][i]=='o'){TT[3][i]=' ';TT[4][i]='o';}
                if(TT[2][i]=='o'){TT[2][i]=' ';TT[3][i]='o';}}k=true;}

            }

            System.out.println(name+"'s"+" score: "+l);




        }}





