import java.util.Scanner;

public class Game {
    private static ox OX;
    private static Scanner kb = new Scanner(System.in);
    private static int col,row;
    public static int c=0;
    public static void input(){
        System.out.print(OX.getCurrentplayer()+" (Col): ");
        col=kb.nextInt();
        System.out.print(OX.getCurrentplayer()+" (Row): ");
        row=kb.nextInt();
    }
    public static  void  main(String[] args){
        OX=new ox();
        int num=0;
        while(true) {
            num++;
            System.out.print(OX.gettableString());
            do{
                input();
            }while (!(OX.put(col, row))) ;
            OX.swithPlayer();
            if(OX.checkWin(col,row)||OX.checkWin2(col,row)||OX.checkWin3(col,row)||OX.checkWin4(col,row)){
                System.out.print(OX.gettableString());
                OX.print();
                break;
            }
            if (num==9){
                System.out.print(OX.gettableString());
                OX.draw();
                OX.print();
                break;
            }
        }
    }
}