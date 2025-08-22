package com.dikshant;

import java.util.Scanner;

public class QuestionService {

    String  selection[] = new String[5];

    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1, "Which language is platform-independent?", "Java", "C++", "Python", "None", "Java");
        questions[1] = new Question(2, "Which keyword is used to inherit a class in Java?", "extends", "implements", "inherit", "super", "extends");
        questions[2] = new Question(3, "Which data type is used to store true/false values in Java?", "int", "boolean", "String", "char", "boolean");
        questions[3] = new Question(4, "Which collection allows key-value pairs in Java?", "List", "Map", "Set", "Queue", "Map");
        questions[4] = new Question(5, "Which method is called when an object is created?", "finalize()", "constructor", "main()", "init()", "constructor");
    }
    public void playQuiz(){
        int i = 0;
        for (Question q: questions){
            System.out.println("Ques no. "+q.getId());
            System.out.println(q.getQues());
            System.out.println(q.getOp1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s: selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;

        for(int i = 0; i<questions.length; i++){
            Question que = questions[i];
            String ans = que.getAns();
            String userans = selection[i];

            if(ans.equals(userans)){
                score++;
            }
        }
        System.out.println("Your Score: "+score);
    }
}
