 class factorial 
 {
    public static void main(String arg[])
    {
        int fact=1, n=5;
        for(int i=1; i<=n; i++)
        {
            fact = fact * i;
        }
        System.out.print(fact);
    }
 }