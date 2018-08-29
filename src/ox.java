public class ox {
    private String[][]table = {
            {" ","0","1","2"},
            {"0","-","-","-"},
            {"1","-","-","-"},
            {"2","-","-","-"}
    };
    private String player;
    private  int countO;
    private  int countX;
    private  int countDraw;
    public static int x=0;
    public static int o=0;
    public ox(){
        player = "X";
        countO =0;
        countX=0;
        countDraw=0;
    }

    public String gettableString() {
        String result="";
        for(int row=0;row<table.length;row++){
            for(int col=0;col<table[row].length;col++){
                result=result+table[row][col];
            }
            result = result+"\n";
        }
        return result;
    }

    public void reset() {
        for(int row=0;row<table.length-1;row++){
            for(int col=0;col<table[row].length-1;col++){
                table[row+1][col+1]="-";
            }
        }
    }
    public void draw() {
        countDraw++;
    }
    public boolean isDraw() {
        int d=0;
        for(int row=0;row<table.length;row++){
            for(int col=0;col<table[row].length;col++){
                if((table[row][col].equals("X"))||(table[row][col].equals("O"))){
                    d++;
                }
            }
        }if(d==9){
            draw();
            return true;
        }
        return false;
    }
    public String getCurrentplayer() {
        return player;
    }
    public String get(int col,int row) {
        return table[row+1][col+1];
    }
    public int getcountX() {
        return countX;
    }

    public int getcountO() {
        return countO;
    }

    public int getcountDreaw() {
        return  countDraw;
    }
    public void print() {
        System.out.println("X win "+getcountX());
        System.out.println("O win "+getcountO());
        System.out.println("Draw "+getcountDreaw());
    }
    public boolean put(int col, int row) {
        if(!(row<=2&&row>=0)){
            return false;
        }
        if(!(col<=2&&col>=0)){
            return false;
        }
        if(!(table [row+1][col+1].equals("-"))){
            return false;
        }

        table [row+1][col+1]=getCurrentplayer();
        return true;
    }

    public void swithPlayer() {
        if(player =="O"){
            player ="X";
        }else {
            player = "O";
        }
    }

    public boolean checkWin(int col, int row) {
        x=0;
        o=0;
        for( row=0;row<3;row++){
            if(table[row+1][col+1].equals("-")){
                return  false;
            }else if(table[row+1][col+1].equals("X")){
                x++;
            }else if(table[row+1][col+1].equals("O")){
                o++;
            }
        }
        if(x==3){
            countX++;
            return true;
        }else if(o==3){
            countO++;
            return true;
        }
        return false;
    }

    public boolean checkWin2(int col, int row) {
        x=0;
        o=0;
        for( col=0;col<3;col++){
            if(table[row+1][col+1].equals("-")){
                return  false;
            }else if(table[row+1][col+1].equals("X")){
                x++;
            }else if(table[row+1][col+1].equals("O")){
                o++;
            }
        }
        if(x==3){
            countX++;
            return true;
        }else if(o==3){
            countO++;
            return true;
        }
        return false;
    }

    public boolean checkWin3(int col, int row) {
        x=0;
        o=0;
        for( col=0,row=0;col<3;col++,row++){
            if(table[row+1][col+1].equals("-")){
                return  false;
            }else if(table[row+1][col+1].equals("X")){
                x++;
            }else if(table[row+1][col+1].equals("O")){
                o++;
            }
        }
        if(x==3){
            countX++;
            return true;
        }else if(o==3){
            countO++;
            return true;
        }
        return false;
    }

    public boolean checkWin4(int col, int row) {
        x=0;
        o=0;
        for( col=2,row=0;row<3;col--,row++){
            if(table[row+1][col+1].equals("-")){
                return  false;
            }else if(table[row+1][col+1].equals("X")){
                x++;
            }else if(table[row+1][col+1].equals("O")){
                o++;
            }
        }
        if(x==3){
            countX++;
            return true;
        }else if(o==3){
            countO++;
            return true;
        }
        return false;
    }
}
