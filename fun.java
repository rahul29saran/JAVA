class fun 
{
    void odd()
    {
        int a=99;
        if(a%2==0)
        {
            System.out.print("a is even");
        }
        else
        {
            System.out.print("a is odd");
        }
    }
    public static void main (String arg[])
    {
        fun o= new fun();
        o.odd();
    }

}