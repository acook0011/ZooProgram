
/**
 * Write a description of class Owl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Owl
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;

    /**
     * Constructor for objects of class Owl
     */
    public Owl()
    {
        // initialise instance variables
        age = 0;
        name = "";
    }
    public Owl(int years,String nme){
        name = nme;
        age = years;
    }
    
    /**
    * setAge
     *
     * @param  int years
     * @return    nothing
     */
    public void setAge(int years)
    {
        // put your code here
        age = years;
    }
    public void setName(String nme)
    {
        // put your code here
        name = nme;
    }
    // Other Methods
    public void hoot(){
        System.out.println("Hoot! Hoot!"); 
    }//hoot() end
    
    public String toString(){
        String str;
        str = (name + " the owl is " + age + " years old.");
        return str;
    }//toString() end
}
