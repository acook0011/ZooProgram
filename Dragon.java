//Joe Adcock
//Period 3
//Creating the Dragon class for the zoo project

public class Dragon
{
    //instance variables
    private int age;
    private String name;
    
    //constructors
    public Dragon(){
       age = 0;
       name = "";
    } //Dragon() end
    public Dragon(int ag, String nme){
        age = ag;
        name = nme;
    } //Dragon(ag, nme) end
    
    
    //getter methods
    public int getAge(){
     return age;   
    } //getAge() end
    public String getName(){
     return name;   
    } //getName() end
    
    //setter methods
    public void setAge(int a){
        age = a;
    } //setAge(a) end
    public void setName(String n){
        name = n;
    } //setName(n) end
    
    //noise method
    public void attack(){
        System.out.println(">>>>>>>>>>"); 
        System.out.println(">>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>");
    } //attack() end
    
    //toString method
    public String toString(){
        return name + " the Dragon is " + age + " years old.";
    } //toString() end
} //Lion end
