

/**
 * Gavin Dooley
 * This is my rat.
 */
public class Rat
{
    private String name;
    private int age;
    private double length;
    private double weight;

    public Rat()
    {
        String name = "";
        int age = 0;
        double length = 0;
        double weight = 0;
    }
    
    public Rat(String nme, int years, double feet, double pounds){
        name = nme;
        age = years;
        length = feet;
        weight = pounds;
    }

    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public void setLength(double newLength){
        length = newLength;
    }
    
    public void setWeight(double newWeight){
        weight = newWeight;
    }
    
    public void scream(){
        System.out.println("YOW!");
    }
    
    public String toString(){
        return "Rat "+name+" is "+age+" years old, is "+length+" feet long, and weighs "+weight+" pounds.";
    }
}