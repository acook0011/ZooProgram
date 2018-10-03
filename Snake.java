//Toby Franklin

public class Snake
{
    
    private int age;
    private String name;
    
    
    public Snake(){
       age = 0;
       name = "";
    }
    
    public Snake(int yo, String nme){
        age = yo;
        name = nme;
    }
    
    
    
    public int getAge(){
     return age;   
    }
    
    public String getName(){
     return name;   
    }
    
    
    public void setAge(int a){
        age = a;
    }
    
    public void setName(String n){
        name = n;
    }
    
    
    public void hisss(){
        System.out.println("Hissssssssssss"); 
    }
    
    public String toString(){
        String str;
        str = (name + " the lion is " + age + " years old.");
        return str;
    }
    
    }
