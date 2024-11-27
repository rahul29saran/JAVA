class add4digit
{
    int a,b,c,d;

    add4digit()
    {
     a = 6;
     b = 3;
     c = 1;
     d = 0;
    }

    void calculateSum()
    {
        int e = a+b+c+d;

        System.out.print(e);
    }

    public static void main(String arg[])
    {
        add4digit obj = new add4digit();
        obj.calculateSum();
    }
}