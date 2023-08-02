import java.util.*;
class GuessNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ready to start the game!!!   (yes/no)?");
        String start = sc.next();
        if(start.equalsIgnoreCase("yes"))
        {
            System.out.println("Lets start the game!!!");
            System.out.println("Guess the number between 1 and 100.");
            System.out.println("In how many attempts you want to guess the number?");
            int attempts = sc.nextInt();
            int score = attempts*10;
            System.out.println("Your intial score is "+score);
            System.out.println("10 points will get deducted for every wrong guess.");
            System.out.println("All the best,player!");
            int answer = (int)Math.floor(Math.random()*100);
            while(attempts>0){
                System.out.println("Enter the number-");
                int number = sc.nextInt();
                if(number == answer){
                    System.out.println("woah!!! You won.");
                    System.out.println("Your score is "+score);
                    return;
                }
                else{
                    score -= 10;
                   
                    if(attempts != 1){
                        if(number > answer)
                        System.out.println("The number is smaller than your guess.");
                        else
                        System.out.println("The number is greater than your guess.");
                    System.out.println("Wrong guess! Try Again.");
                    }
                }
                attempts--;
            }
            System.out.println("Alas! You Lost the game.");
            System.out.println("your score is "+score);
            System.out.println("The number is "+answer);
            
        }
        else{
            return;
        }
    }
}