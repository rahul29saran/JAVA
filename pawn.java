class pawn
{
    void pawn(int a, int b)
    {
        int c;
        c=a;
        a=b;
        b=c;
        System.out.print(a);
        System.out.print(b);

    }
    public static void main(String arg[])
    {
        pawn p= new pawn();
        p.pawn(86, 29);
    }
    
}