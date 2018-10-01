
/**
 * Lion class
 *
 * @aj
 * @ZooProj.Lion
 */
public class Lion
{
    // Initialized Variables
    private int age;
    private String name;
    
    // Constructors
    public Lion(){
       age = 0;
       name = "";
    }//Lion() end
    
    public Lion(int yo, String nme){
        age = yo;
        name = nme;
    }//Lion(int yo, String nme) end
    
    
    // Getter Methods
    public int getAge(){
     return age;   
    }//getAge() end
    
    public String getName(){
     return name;   
    }//getName() end
    
    // Setter Methods
    public void setAge(int a){
        age = a;
    }
    
    public void setName(String n){
        name = n;
    }
    
    // Other Methods
    public void roar(){
        System.out.println("Roar! Roar!"); 
    }//roar() end
    
    public String toString(){
        String str;
        str = (name + " the lion is " + age + " years old.");
        return str;
    }//toString() end
    
    }//Lion end

