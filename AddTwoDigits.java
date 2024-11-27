// class add
// {
//     int a, b;

//      add()
//     {
//         a=2;
//         b=8;
//         int c = a+b;
//         System.out.print(c);
        
//     }
//     public static void main(String arg[])
//     {
//         add a = new add();
        
        
//     }
// }

// class Addition {
//     int num1, num2; 
    
//     Addition() 
//     {
//         num1 = 2;  
//         num2 = 8;  
//     }

//     void calculateSum() 
//     {
//         int sum = num1 + num2;
//         System.out.println("First Number: " + num1);
//         System.out.println("Second Number: " + num2);
//         System.out.println("Sum = " + sum);
//     }
//     public static void main(String args[]) 
//     {
//         Addition obj = new Addition();  
//         obj.calculateSum();  
//     }
// }


// Program to add two digits using a default constructor
public class AddTwoDigits {
    int num1; 
    int num2; 
    
    public AddTwoDigits() {
        
        num1 = 1654650; 
        num2 = 2875410; 
    }

    
    public int addNumbers() {
        return num1 + num2;
    }

    public static void main(String[] args) {
        
        AddTwoDigits obj = new AddTwoDigits();
                
        System.out.println("The sum of " + obj.num1 + " and " + obj.num2 + " is: " + obj.addNumbers());
    }
}
