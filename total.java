class total
{
    int add(int a, int b)
    {
        int c = a+b;
        return c;
    }
    public static void main(String[] args)
    {
        total s= new total();
        int result = s.add(456,329);

        System.out.print(result);
    }
}