
import java.util.*;


public class javaStudyHall {

    public static String BigWordFinder(String string){
        String biggestWord="";
        String[] workingArray=string.split(" ");
        int highScore=0;
        int count=0;
        int highIndex=0;
        for(String word:workingArray){
            int score =0;

            for(int i=0;i<word.length();i++){
                score+=letterScore(word.charAt(i));
            }
            if(score>highScore){
                highScore=score;
                highIndex=count;
            }
            count++;
        }
        biggestWord=workingArray[highIndex];


        return biggestWord;
    }

    public static int letterScore(char letter){
        HashMap<Character, Integer> scorer= new HashMap<>();
        scorer.put('a',1);
        scorer.put('b',2);
        scorer.put('c',3);
        scorer.put('d',4);
        scorer.put('e',5);
        scorer.put('f',6);
        scorer.put('g',7);
        scorer.put('h',8);
        scorer.put('i',9);
        scorer.put('j',10);
        scorer.put('k',11);
        scorer.put('l',12);
        scorer.put('m',13);
        scorer.put('n',14);
        scorer.put('o',15);
        scorer.put('p',16);
        scorer.put('q',17);
        scorer.put('r',18);
        scorer.put('s',19);
        scorer.put('t',20);
        scorer.put('u',21);
        scorer.put('v',22);
        scorer.put('w',23);
        scorer.put('x',24);
        scorer.put('y',25);
        scorer.put('z',26);

        int letterscore=scorer.get(letter);
        return letterscore;
    }


    public static void main(String[] args) {


    }


}
