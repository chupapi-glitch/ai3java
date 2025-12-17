package Week7;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    int modelNumber; //instance variable //object variable //attribute
    String color;
    double price;
    
    void start()
    {
        System.out.println("Car starts");
    }
    void stop()
    {
        System.out.println("Car stops");
    }
    
    public static void main(String[]arg)
    {
        Car c=new Car();
        c.modelNumber=123;
        c.color="black";
        c.price=20000;
        
        System.out.println("ModelNumber is "+c.modelNumber);
        System.out.println("Color is "+c.color);
        System.out.println("Pricce is "+c.price);
        
        c.start(); //method calling //change in behaviour
        c.stop();
        
        Car c1=new Car();
        c.modelNumber=456;
        c.color="blue";
        c.price=25000;
        
        System.out.println("\n"+"ModelNumber is "+c.modelNumber);
        System.out.println("Color is "+c.color);
        System.out.println("Pricce is "+c.price);
        
        c.start();
        c.stop();
    }
}