
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
         Rat avery = new Rat("Avery",56,90,2);
         Falcon jay= new Falcon(56, "Jay");
         Mongoose yahhhh = new Mongoose("yahhhh", 33);
         Snake susy = new Snake(7 , "Susy");
         
         //Speech Patterns
         leo.roar();
         rory.roar();
         bill.talk();
         jeff.clop();
         andy.attack();
         ylvis.howl(); //What does the fox say?
         avery.scream();
         jay.speed();
         yahhhh.talk();
        
         susy.hisss();
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
         System.out.println(avery);
         System.out.println(jay);
         System.out.println(yahhhh);
         System.out.println(susy);
         
         Owl hooter = new Owl();            //Age is 0 and name is ""
         Owl nightEyes = new Owl(3, "Hooty");
         hooter.setAge(5);
         hooter.setName("NightHawk");
         hooter.hoot();
         nightEyes.hoot();
         System.out.println(hooter);
         System.out.println(nightEyes);
    }//main() end
}//ZooProgram end
