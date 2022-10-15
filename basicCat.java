import java.util.Random;

public abstract class basicCat {
    
    Random rand = new Random();
    String name="no-name";

    //CONSTRUCTOR 
    basicCat() throws InterruptedException{
        System.out.println("you have picked "+ name);
        Thread.sleep(1500);
    }

    //get and set methods
    public void setName(String n){ //user setting cat name
        name=n;
    }

    public String getName(){ //returns name
        return name;
    }


    //unimplemented meothods
    public abstract void meow() throws InterruptedException; 
    public abstract void eat() throws InterruptedException;
    public abstract void purr() throws InterruptedException;
    public abstract void attack() throws InterruptedException; //scratches or bites
 
}
