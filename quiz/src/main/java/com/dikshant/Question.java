package com.dikshant;

public class Question {

    private int id;
    private String ques;
    private String op1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String ans;


    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", ques='" + ques + '\'' +
                ", op1='" + op1 + '\'' +
                ", opt2='" + opt2 + '\'' +
                ", opt3='" + opt3 + '\'' +
                ", opt4='" + opt4 + '\'' +
                ", ans='" + ans + '\'' +
                '}';
    }

    public Question(int id, String ques, String op1, String opt2, String opt3, String opt4, String ans) {
        this.id = id;
        this.ques = ques;
        this.op1 = op1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
