
/**
 * Fox sounds.
 *
 * @Makai Romero
 * @1.0
 */
public class Fox
{
    private int age;
    private String name;

    public void howl() //what does the fox say?
    {
        System.out.println("Howls.");
    }
    
    public void setName(String nme){
        name = nme;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int years){
        age = years;
    }
    
    public int getAge(){
        return age;
    }

    public Fox(){
        age = 0;
        name = "";
    }

    public Fox(int years, String nme){
        age = years;
        name = nme;
    }
    
    public String toString(){
        String str;
        str = name + " is " + age + " years old." + "\n";
        return str;
    }
}
