
/**
 * A zoo filled with lions oh god run for your life
 *
 * @aj
 * @ZooProj
 */
public class ZooProgram
{
    public static void main (String [] args){
         //Declaring objects
         Lion leo = new Lion();            //Age is 0 and name is ""
         Lion rory = new Lion(12, "Rory");
         Human bill = new Human(34, "Bill");
         nestingdoll jeff=new nestingdoll("edward", 47);
         Dragon andy = new Dragon(823, "Andy");
         
         
         //Speech Patterns
         leo.roar();
         rory.roar();
         bill.talk();
         jeff.clop();
         andy.attack();
         
         //Setting values for default object Leo
         leo.setAge(3);
         leo.setName("Leo");
         
         //Calling toString
         System.out.println(leo);
         System.out.println(rory);
         System.out.println(bill);
         System.out.println(jeff);
         System.out.println(andy);
    }//main() end
}//ZooProgram end
