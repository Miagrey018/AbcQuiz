package com.example.codetribe.abcquiz;

/**
 * Created by codetribe on 5/29/2017.
 */

public class Question
{
    //Array list of education questions
  // private String[] educationQuestion = {"What is the product of 5*3?","Which animal gives us milk?","What color does the sky turn it rains?"};

    //Data members
    private String answerA = "";
    private String answerB = "";
    private String answerC = " ";
    private String Text ="";

    private String answer1A = "";
    private String answer1B = "";
    private String answer1C = "";
    private String Text1 ="";

    private String answer4A = "";
    private String answer4B = "";
    private String answer4C = "";
    private String Text4 ="";

    private String answer3A = "";
    private String answer3B = "";
    private String answer3C = "";
    private String Text3 ="";

    private String answer5A = "";
    private String answer5B = "";
    private String answer5C = "";
    private String Text5 ="";

    private String answer6A = "";
    private String answer6B = "";
    private String answer6C = "";
    private String Text6 ="";

        private String answer7A = "";
    private String answer7B = "";
    private String answer7C = "";
    private String Text7 ="";

    private String answer8A = "";
    private String answer8B = "";
    private String answer8C = "";
    private String Text8 ="";



    public void setdetails( int i){
//Question 1 for Education
if(i ==0) {
    answerA = "160";
    answerB = "120";
    answerC = "140";
    Text = "1.What is the sum of 120+20?";
//Question 2 for Education

    answer1A = "82 weeks";
     answer1B = "62 weeks";
     answer1C = "52 weeks";
     Text1 ="2)How many weeks are in a year?";
//Question 4 for Education

     answer4A = "white";
     answer4B = "gray";
     answer4C = "blue";
     Text4 ="4.What color does the sky appear to be when it rains?";
//Question 3 for Education

     answer3A = "horse";
     answer3B = "cow";
     answer3C = "dog";
    Text3 ="3.What farm animal gives us milk to drink?";
//Question 5 for Education

     answer5A = "9";
     answer5B = "10";
     answer5C = "12";
     Text5 ="5.5+5= what?";
//Question 6 for Education

     answer6A = "9 o'clock";
     answer6B = "12 o'clock";
     answer6C = "3 o' clock";
     Text6 ="6.On a clock, if the big hand is on 12 and the little hand is on 3 what time would it be?";
//Question 7 for Education

     answer7A = "20";
     answer7B = "15";
     answer7C = "10";
     Text7 ="7.If an average person counted all of their fingers and toes, how many would they have?";
//Question 8 for Education

     answer8A = "9";
     answer8B = "8";
    answer8C = "5";
    Text8 ="8.What is 10-2?";


}else if(i==1) {
    //Question 1 for Technology
    Text = "1.Who invented Apple?";
    answerA = "Steve Jobs";
    answerB = "Bill Gates";
    answerC = "Mark Zuckerburg";
//Question 2 for Technology

    answer1A = "Wide Wing Web";
    answer1B = "World Wide Web";
    answer1C = "World Wild Web";
    Text1 ="2.What does the abbreviation WWW stand for?";
//Question 4 for Technology

    answer4A = "Printer";
    answer4B = "Webcam";
    answer4C = "Mouse";
    Text4 ="4.Which of these things is not an input device? ";

//Question 3 for Technology
    answer3A = "Output";
    answer3B = "Input";
    answer3C = "Both";
    Text3 ="3.What kind of device is a touch screen?";
////Question 5 for Technology

    answer5A = "2000";
    answer5B = "1989";
    answer5C = "1864";
    Text5 ="5.In what year did Sir Tim Berners-Lee invent the world wide web?";
////Question 6 for Technology

    answer6A = "Read Only Memory";
    answer6B = "Red Old Memory";
    answer6C = "Reader Of Memory";
    Text6 ="6.In terms of computing, what does ROM stand for?";
////Question 7 for Technology

    answer7A = "Opera Mini";
    answer7B = "Web browsers";
    answer7C = "Lane Reign";
    Text7 ="7.Firefox, Opera, Chrome, Safari and Explorer are types of what";
//Question 8 for Technology

    answer8A = "Search engine";
    answer8B = "Steve Jobs";
    answer8C = "Paul Allen";
    Text8 ="8.Along with whom did Bill Gates found Microsoft?";

}else if(i==2) {
    //Question 1 for Politics
    Text = "1.Who is the President of United States of America?";
    answerA = "Barrack Obama";
    answerB = "Donald Trump";
    answerC = "Robert Mugabe";
//Question 2 for Politics

    answer1A = "His parents' house";
    answer1B = "His own house";
    answer1C = "The White House";
    Text1 ="2.Where does the President of the United States live, while in office?";
//Question 4 for Politics

    answer4A = "Helen Zille";
    answer4B = "Mmusi Maimane";
    answer4C = "Julius Malema";
    Text4 ="4.Who is the leader of Democratic Alliance?";

//Question 3 for Politics
    answer3A = "2007";
    answer3B = "2016";
    answer3C = "1997";
    Text3 ="3.In what year did Donald Trump become President?";
//Question 5 for Politics

    answer5A = "1994";
    answer5B = "1999";
    answer5C = "1990";
    Text5 ="5.In what year was Nelson Mandela released from Prison?";
//Question 6 for Politics

    answer6A = "1997";
    answer6B = "1995";
    answer6C = "1994";
    Text6 ="6.What year did South Africa become a democratic country?";
//Question 7 for Politics

    answer7A = "Mike";
    answer7B = "Adolf";
    answer7C = "Zachariah";
    Text7 ="7.What is Hitler's first name";
//Question 8 for Politics

    answer8A = "Kofi annan";
    answer8B = "Robert Mugabe";
    answer8C = "Ian Khama";
    Text8 ="8.Who is the President of Zimbabawe?";


}

    }


    //Accessor methods
    public String getanswer1A()
    {
        return answer1A;
    }

    public String getanswer1B()
    {
        return answer1B;
    }

    public String getanswer1C()
    {
        return answer1C;
    }

    public String getText1() {
        return Text1;
    }

    //Accessor methods
    public String getanswerA()
    {
        return answerA;
    }

    public String getanswerB()
    {
        return answerB;
    }

    public String getanswerC()
    {
        return answerC;
    }

    public String getText() {
        return Text;
    }




    public String getAnswer4A() {
        return answer4A;
    }

    public String getAnswer4B() {
        return answer4B;
    }

    public String getAnswer4C() {
        return answer4C;
    }

    public String getText4() {
        return Text4;
    }


    public String getAnswer3A() {
        return answer3A;
    }

    public String getAnswer3B() {
        return answer3B;
    }

    public String getAnswer3C() {
        return answer3C;
    }

    public String getText3() {
        return Text3;
    }



    public String getAnswer5A() {
        return answer5A;
    }

    public String getAnswer5B() {
        return answer5B;
    }

    public String getAnswer5C() {
        return answer5C;
    }

    public String getText5() {
        return Text5;
    }



    public String getAnswer6A() {
        return answer6A;
    }

    public String getAnswer6B() {
        return answer6B;
    }

    public String getAnswer6C() {
        return answer6C;
    }

    public String getText6() {
        return Text6;
    }



    public String getAnswer7A() {
        return answer7A;
    }

    public String getAnswer7B() {
        return answer7B;
    }

    public String getAnswer7C() {
        return answer7C;
    }

    public String getText7() {
        return Text7;
    }



    public String getAnswer8A() {
        return answer8A;
    }

    public String getAnswer8B() {
        return answer8B;
    }

    public String getAnswer8C() {
        return answer8C;
    }

    public String getText8() {
        return Text8;
    }
}
