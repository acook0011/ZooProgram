
/**
 * What even is this animal??????
 *
 * @gkroeges
 * @ZooProject.Mongoose
 */
public class Mongoose
{
    private String name;
    private int age;
    
    public Mongoose(String name,int age)
    {
        this.name = name;
        this.age = age;
    } // Mongoose(String name,int age) end
    
    public Mongoose()
    {
        this.name = "";
        this.age = 0;
    } // Mongoose() end
    
    public int getAge(){
     return age;   
    } //getAge() end
    
    public String getName(){
     return name;   
    } //getName() end
    
    public void setAge(int age){
        this.age = age;
    } //setAge(int age) end
    
    public void setName(String name){
        this.name = name;
    } //setName(String name) end
    
    public void talk(){
        System.out.println("brrrrrrr"); 
    } //talk() end

    public String toString(){
        String str;
        str = (name + " the mongoose is " + age + " years old.");
        return str;
    } // toString end
} // class end
