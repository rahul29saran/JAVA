class methodoverload
{
    int a,b,c,d;

    methodoverload()
    {
        a=10;
        b=20;
        c=30;
        d=40;
    }

    methodoverload(int u, int v, int w)
    {
        a=u;
        b=v;
        c=w;
        d=40;
        
    }

    methodoverload(int k, int l, int m, int n)
    {
        a=k;
        b=l;
        c=m;
        d=n;
    }

    void display()
    {
        int sum = a+b+c+d;
        System.out.print(sum);
    }

    public static void main(String arg[])
    {
        methodoverload obj1 = new methodoverload();
        System.out.print("using default constructor:");
        obj1.display();
        
        methodoverload obj2 = new methodoverload(100,200,300);
        System.out.print("\n using three parameter constructor:");
        obj2.display();

        methodoverload obj3 = new methodoverload(1000,2000,3000,4000);
        System.out.print("\n using four parameter constructor:");
        obj3.display();
    }


}
