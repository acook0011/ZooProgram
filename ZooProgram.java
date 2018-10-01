
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
         NestingDoll jeff =new NestingDoll("edward", 47);
         Dragon andy = new Dragon(823, "Andy");
         Fox ylvis = new Fox(69, "Ylvis");
         
         
         //Speech Patterns
         leo.roar();
         rory.roar();
         bill.talk();
         jeff.clop();
         andy.attack();
         ylvis.howl();
         
         //Setting values for default object Leo
         leo.setAge(3);
         leo.setName("Leo");
         
         //Calling toString
         System.out.println(leo);
         System.out.println(rory);
         System.out.println(bill);
         System.out.println(jeff);
         System.out.println(andy);
         System.out.println(ylvis);
    }//main() end
}//ZooProgram end
