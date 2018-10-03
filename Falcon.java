
/**
 * Write a description of class Falcon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Falcon
{// Initialized Variables
    private int age;
    private String name;
    
    // Constructors
    public Falcon(){
       age = 0;
       name = "";
    }
    
    public Falcon(int yo, String nme){
        age = yo;
        name = nme;
    }
    
    public int getAge(){
     return age;   
    }
    
    public String getName(){
     return name;   
    }
    
    // Setter Methods
    public void setAge(int a){
        age = a;
    }
    
    public void setName(String n){
        name = n;
    }
    
    // Other Methods
    public void speed(){
        System.out.println("Zoom! Zoom!"); 
    }//speed() end
    
    public String toString(){
        String str;
        str = (name + " the falcon is " + age + " years old.");
        return str;
    }//toString() end
    
    }//Falcon end