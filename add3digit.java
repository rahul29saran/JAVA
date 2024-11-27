class add3digit
{
    int a,b,c;

    add3digit(int x, int y, int z)
    {
        a=x;
        b=y;
        c=z;
    }
    

    void add()
    {
        int d = a+b+c;

        System.out.print(d);
    }

    public static void main(String arg[])
    {
        add3digit a = new add3digit(5,8,2);
        a.add();
    }


}
