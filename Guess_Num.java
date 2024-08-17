import java.util.*;
public class Guess_Num {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO Guess My Number !");
        System.out.println("YOU HAVE TO GUESS THE NUMBER WITH A MAXIMUM OF 5 TRIALS.");
        System.out.println("P.S: YOU WILL GET A HINT IN THE FIRST ROUND AND A BONUS HINT IN LAST ROUND >_< ");
        System.out.println("Enter 1 to START or 0 to EXIT -->");
        int n1=sc.nextInt();
        game(n1);
    }
    static void game(int num)
    { int a=64;
        switch(num)
        {
            case 0:
            System.out.println("THANK YOU");
            System.exit(0);
            break;
            case 1:
            for(int i=1;i<=5;i++)
            { 
              int res=check(i,a);
              if(res==1){
              System.out.println("CONGRATULATIONS! IT WAS A RIGHT GUESS. YOU HAVE WON THE GAME");
              break;}
              else
              {
              System.out.println("SORRY,WRONG GUESS."+(5-i)+" trials are left.");}

            }
            break;
            default:
            System.out.println("INVALID CHOICE !!");
        }
    }
    static int check(int x,int y)
    {
        Scanner sc=new Scanner(System.in);
                if(x==1)
                { 
                    System.out.println("First Hint: THE NUMBER LIES BETWEEN 1 AND 100.");
                    System.out.println("Make the Guess: ");
                    int m=sc.nextInt();
                    if(m==y)
                return 1;
                else
                return 0;
                }
                else if(x==5)
                { 
                    System.out.println("BONUS Hint: THE NUMBER LIES BETWEEN 60 AND 70.");
                    System.out.println("Make the Guess: ");
                    int m=sc.nextInt();
                    if(m==y)
                return 1;
                else
                return 0;
                }
                else
                {
                    System.out.println("Make the Guess: ");
                    int m=sc.nextInt();
                    if(m==y)
                return 1;
                else
                return 0;
                }
                
    }
    
}
