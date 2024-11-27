class noarg 
{
    void add() 
    {
        int a=10, b=20, c;
        c=a+b;
        System.out.print(c);
    }
    public static void main(String arg[])
    {
        noarg n= new noarg();
        n.add();
    }
}