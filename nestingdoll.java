
/**
 *
 *
 * Aidan Li
 * version 1
 */
public class nestingdoll
{
    private String name; private int layers;
    
    public nestingdoll(){name=""; layers=0;}
    public nestingdoll(String nme, int lrs){name=nme; layers=lrs;}
    public void clop(){System.out.println("Clip clop, clip clop");}
    public String toString(){return "Russian nesting doll "+name+" has "+
        layers+" layers.";}
}
