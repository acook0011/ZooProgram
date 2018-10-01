
/**
 * Humans are animals, too!
 *
 * @aj (aka Avery Cook)
 * @ZooProj.human
 */
public class Human
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    
    // Constructors
    public Human(){
       age = 0;
       name = "";
    }//Human() end
    
    public Human(int yo, String nme){
        age = yo;
        name = nme;
    }//Human(int yo, String nme) end
    
    
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
    }//setAge(int a) end
    
    public void setName(String n){
        name = n;
    }//setName(String n) end
    
    // Other Methods
    public void talk(){
        System.out.println("HELP! THEY TRAPPED ME IN HERE\nWITH THESE ANIMALS!\nTHERE'S NO WAY OUT!"); 
    }//roar() end
    
    public String toString(){
        String str;
        str = (name + " the human is " + age + " years old.");
        return str;
    }
   }

