/* you are bob and you want to adopt a cat. you go look at the kitty options. you pick a kitty and bring kitty home.
you can pet kiity. feed kitty. walk kitty outside, talk to kitty, pick-up kitty, or return kitty . have fun ig?"
AYEH SHIHADEH 10/14/2022 - 10/14/2022
 */

import java.util.Scanner;
import java.util.Random;

public class catRunner {
    static int happiness=5; //0 is dies of depression, 10 is happi


    public static void main(String[] args) throws Exception{

        Scanner obj0 = new Scanner(System.in); //start game or not
        Scanner obj1 = new Scanner(System.in); //for picking cat
        Scanner obj2 = new Scanner(System.in);//for setting cat name
        Scanner obj3 = new Scanner(System.in);//for cat interaction action
        Scanner obj4 = new Scanner(System.in); //input to if they really wanna play

        System.out.println("play cat game? y/n");
        String gamestart = obj0.nextLine();
        Thread.sleep(1000);
        do{

            if(gamestart.equals("n") || gamestart.equals("N")){ //if user does NOT want to play
                System.out.println("salam, bye, cya ... ");
                System.exit(0); //exit game
            }

            else if(gamestart.equals("y") || gamestart.equals("Y")){
           
                System.out.println("u r bob...");
                Thread.sleep(2000);
                System.out.println("u r sad and want a cat...");
                Thread.sleep(2000);
                System.out.println("u need 10 happi points to win...");
                Thread.sleep(2000);
                System.out.println("pick cat: 1-crusty-aah cat     2-angee cat      3-brian cat? ");
                int pickCat = obj1.nextInt(); //waiting for user int input 1-3

  
                //CRUSTY CAT
                if (pickCat==1){
                    crusty crustyc = new crusty();
                    Thread.sleep(1500);
                    System.out.println("give the crusty-aah cat a name pls: ");
                    String crustyname = obj2.nextLine();
                    Thread.sleep(1500);
                    crustyc.setName(crustyname);
                    System.out.println("bob meet "+crustyc.getName()+", "+crustyc.getName()+" meet bob...u may kiss");
                    Thread.sleep(1500);
                    System.out.println("wat u wanna do?");
                    Thread.sleep(1500);
                    System.out.println("1-pet 2-feed 3-walk 4-talk 5-pick up 6-return :(");
                    int action = obj3.nextInt(); //user input 1-6

                    do{ //keep doing actions till happiness == 10
                        if(action==1){ //PET
                            crustyc.purr();
                            happiness--;
                            happyDisplay();
                        }
                        else if(action==2){ //FEED
                            crustyc.eat();
                            happiness++;
                            happyDisplay();
                        }
                        else if(action==3){//WALK
                            walk();
                            happyDisplay();
                        }
                        else if(action==4){//TALK
                            crustyc.meow();
                            happiness--;
                            happyDisplay();
                        }
                        else if(action==5){//PICK UP
                            crustyc.attack();
                            happiness=happiness+2;
                            happyDisplay();
                        }
                        else if(action==6){//RETURN CAT :(
                            //exit game?
                            System.out.println("you give "+crustyc.getName()+" away :(");
                            System.exit(0); //exit game
                        }
                        System.out.println("1-pet 2-feed 3-walk 4-talk 5-pick up 5-return :(");
                        action = obj3.nextInt(); //user input 1-6

                    }while(happiness<10);
   
                }//end of pick crusty



                //ANGEE CAT
                else if (pickCat==2){
                    angee angeec = new angee();
                    System.out.println("give the angee cat a name pls: ");
                    String angeename = obj2.nextLine(); //am i allowed to use the same object for all names? yup!
                    Thread.sleep(1500);
                    angeec.setName(angeename);
                    System.out.println("bob meet "+angeec.getName()+", "+angeec.getName()+" meet bob...u may kiss");
                    Thread.sleep(1500);
                    System.out.println("wat u wanna do?");
                    Thread.sleep(1500);
                    System.out.println("1-pet 2-feed 3-walk 4-talk 5-pick up 6-return :(");
                    int action = obj3.nextInt(); //user input 1-6

                    do{ //keep doing actions till happiness == 10
                        if(action==1){ //PET
                            angeec.purr();
                            happiness++;
                            happyDisplay();
                        }
                        else if(action==2){ //FEED
                            angeec.eat();
                            happiness=happiness-2;
                            happyDisplay();
                        }
                        else if(action==3){//WALK
                            walk();
                            happyDisplay();
                        }
                        else if(action==4){//TALK
                            angeec.meow();
                            happiness=happiness+2;
                            happyDisplay();
                        }
                        else if(action==5){//PICK UP
                            angeec.attack();
                            happiness=happiness-2;
                            happyDisplay();
                        }
                        else if(action==6){//RETURN CAT :(
                            //exit game?
                            System.out.println("you give "+angeec.getName()+" away :(");
                            System.exit(0); //exit game
                        }
                        System.out.println("1-pet 2-feed 3-walk 4-talk 5-pick up 6-return :(");
                        action = obj3.nextInt(); //user input 1-6

                    }while(happiness<10);

                }//end of pick angee



                //BRIAN CAT
                else if (pickCat==3){
                    brian brianc = new brian();
                    System.out.println("brian said you cant change his name");
                    Thread.sleep(1500);
                    System.out.println("bob meet brian, brian, meet bob...u may kiss");
                    Thread.sleep(1500);
                    System.out.println("wat u wanna do?");
                    Thread.sleep(1500);
                    System.out.println("1-pet 2-feed 3-walk 4-talk 5-pick up 6-return :(");
                    int action = obj3.nextInt(); //user input 1-6

                    do{ //keep doing actions till happiness == 10
                        if(action==1){ //PET
                            brianc.purr();
                            happiness--;
                            happyDisplay();
                        }
                        else if(action==2){ //FEED
                            brianc.eat();
                            happiness++;
                            happyDisplay();
                        }
                        else if(action==3){//WALK
                            walk();
                            happyDisplay();
                        }
                        else if(action==4){//TALK
                            brianc.meow();
                            happiness++;
                            happyDisplay();
                        }
                        else if(action==5){//PICK UP
                            brianc.attack();
                            happiness--;
                            happyDisplay();
                        }
                        else if(action==6){//RETURN CAT :(
                            System.out.println("you give "+brianc.getName()+" away :(");
                            System.exit(0); //exit game
                        }
                        System.out.println("1-pet 2-feed 3-walk 4-talk 5-pick up 6-return :(");
                        action = obj3.nextInt(); //user input 1-6

                    }while(happiness<10);

                }//end of pick brian

                else{ //if user doesnt input proper cat #
                    System.out.println("that aint a proper input...try again");
                }

            }  //end of gamestart == y

            else{ //if input is not expected 
                System.out.println("pls choose a proper input...y/n");
                gamestart = obj0.nextLine();

            }

            
        }while(gamestart != "n" || gamestart != "N");//end of do
    
}

//METHODS...
public static void happyDisplay() throws InterruptedException{
    System.out.println("happiness: "+ happiness);
    Thread.sleep(1500);
    if (happiness==1 || happiness==2 || happiness==3){
        System.out.println("status: seconds from cyring in a corner");
        Thread.sleep(1500);
    }
    else if (happiness<=0){ //if less than or equal to 0 
        System.out.println("status: what is life?");
        Thread.sleep(1500);
        System.out.println("welp you lost. cat no help. ur fault gg go next ig");
        System.exit(0);

    }
    else if (happiness==4 || happiness==5 || happiness==6){System.out.println("status: slighty happier with a cat i guess?"); Thread.sleep(1500);}
    else if (happiness==7 || happiness==8 || happiness==9){System.out.println("status: why didnt we think of getting a cat sooner FREE THERAPY"); Thread.sleep(1500);}
    else if (happiness>=10){ //if greater than or equal to 10
        System.out.println("status: CATS ARE TO BE WORSHIPPED I LOVE LIFE"); 
        Thread.sleep(1500);
        System.out.println("you win at life ggez");
        System.exit(0);
    }
}


public static void walk() throws InterruptedException{ //random that makes cat run away or stay with you or find love or get stuck on a tree
    Random rand = new Random(); //for walking action
    int x = rand.nextInt(4);//generates random num between 0-3
    if (x==0){
        System.out.println("*you put the cat on a harness and step outside...*");
        Thread.sleep(1500);
        System.out.println("*you let the cat sniff a tree but he gets too excited and climbs it...*");
        Thread.sleep(1500);
        System.out.println("'hello, 911 what's your emergency?...-$200'");
        Thread.sleep(1500);
        happiness--;
    }
    else if (x==1){
        System.out.println("*you put the cat on a harness and step outside...*");
        Thread.sleep(1500);
        System.out.println("*the cat notices another cat walking by... theyre in love...*");
        Thread.sleep(1500);
        System.out.println("your jealous ass gets upset and takes the cat back inside...");
        Thread.sleep(1500);
        happiness--;
    }
    else if (x==2){
        System.out.println("*you put the cat on a harness and step outside...*");
        Thread.sleep(1500);
        System.out.println("*you both frolic into a forrest of beautiful flowers and find narnia within the forrest...*");
        Thread.sleep(1500);
        System.out.println("*the people of narnia give you the title of king and you live happily ever after...*");
        Thread.sleep(1500);
        happiness= happiness+2;
    }
    else if (x==3){
        System.out.println("*you put the cat on a harness and step outside...*");
        Thread.sleep(1500);
        System.out.println("*the weather is a tad chilly so the cat sits on your feet for warmth...*");
        Thread.sleep(1500);
        happiness++;
    }
        
}
}//end of runner 

