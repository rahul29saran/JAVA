class bkn 
{
    int fact(int n)   
    {
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        } 
        return fact;  
    }
    
    public static void main(String arg[])
    {
        bkn n = new bkn();
        int result = n.fact(5);   
        System.out.print(result);  
    }
}
