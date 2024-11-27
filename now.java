class now 
{
    void fact(int n)
    {
        int fact = 1;
        for(int i =1; i <= n; i++)
        {
            fact = fact * i;
        } 
        System.out.print(fact);
    }
    public static void main(String arg[])
    {
        now n = new now();
        n.fact(5);
    }
}
