class track
{
    void fact()
    {
        int fact = 1 , n=5;
        for(int i =1; i <= n; i++)
        {
            fact = fact*i;
        }    
        System.out.print(fact);
    }
        public static void main(String arg[])
        {
            track t = new track();
            t.fact();
            
        }
}

