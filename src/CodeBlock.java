/**
 * Created by Thando Mini on 1/9/2017.
 */
public class CodeBlock {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        //String player = "John Mini";

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+ highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+ highScore);

        System.out.println("\n\n");

        displayHighScorePosition("John", 7);
        calculateHighScorePosition(1500);

        displayHighScorePosition("Zoro", 50);
        calculateHighScorePosition(900);

        displayHighScorePosition("Mncedi", 150);
        calculateHighScorePosition(400);

        displayHighScorePosition("Thando", 800);
        calculateHighScorePosition(50);
    }

    public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        else{
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position "+ position+ " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score > 1000){
            return 1;
        }else if(score > 500 && score <= 1000){
            return 2;
        }else if (score > 100 && score <= 500){
            return 3;
        }else{
            return 4;
        }
    }

}