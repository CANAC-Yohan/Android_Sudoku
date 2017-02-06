package kartoh.sudoku.com;

class vGrille{
    public int num;
    public int level;
    public int done;

    public vGrille(int num, int level, int done){
        this.num = num;
        this.level = level;
        this.done = done;
    }

    public String toString(){
        return num + "" + level + "" + done + "";
    }
}