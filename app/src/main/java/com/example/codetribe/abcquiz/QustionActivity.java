package com.example.codetribe.abcquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.codetribe.abcquiz.R.id.question7;

public class QustionActivity extends AppCompatActivity {

    private RadioButton radA, radB, radC, radD, radE, radF, radG, radH, radI, radJ, radK, radL, radN, radM, radO, radP, radQ, radR, radS, radT, radV, radU, radX, radY;



    private TextView t1, t2, t3, t4, t5, t6, t7, t8;
    int i,j,k;
    String questions;
    int l, count=0;
    boolean  q1=false, q2=false,q3=false;


    Question question = new Question();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qustion);

        // Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        radA = (RadioButton) findViewById(R.id.radio_a);
        radB = (RadioButton) findViewById(R.id.radio_b);
        radC = (RadioButton) findViewById(R.id.radio_c);
        t1 = (TextView) findViewById(R.id.question1);

        //THe following are for Question2
        radD = (RadioButton) findViewById(R.id.radio_D);
        radE = (RadioButton) findViewById(R.id.radio_E);
        radF = (RadioButton) findViewById(R.id.radio_F);
        t2 = (TextView) findViewById(R.id.question2);
        //THe following are for Question3
        radG = (RadioButton) findViewById(R.id.radio_G);
        radH = (RadioButton) findViewById(R.id.radio_H);
        radI = (RadioButton) findViewById(R.id.radio_I);
        t3 = (TextView) findViewById(R.id.question3);
        //THe following are for Question4
        radJ = (RadioButton) findViewById(R.id.radio_J);
        radK = (RadioButton) findViewById(R.id.radio_K);
        radL = (RadioButton) findViewById(R.id.radio_L);
        t4 = (TextView) findViewById(R.id.question4);
        //THe following are for Question5
        radN = (RadioButton) findViewById(R.id.radio_N);
        radM = (RadioButton) findViewById(R.id.radio_M);
        radO = (RadioButton) findViewById(R.id.radio_O);
        t5 = (TextView) findViewById(R.id.question5);
        //THe following are for Question6
        radP = (RadioButton) findViewById(R.id.radio_P);
        radQ = (RadioButton) findViewById(R.id.radio_Q);
        radR = (RadioButton) findViewById(R.id.radio_R);
        t6 = (TextView) findViewById(R.id.question6);
        //THe following are for Question7
        radS = (RadioButton) findViewById(R.id.radio_S);
        radT = (RadioButton) findViewById(R.id.radio_T);
        radV = (RadioButton) findViewById(R.id.radio_V);
        t7 = (TextView) findViewById(question7);
        //THe following are for Question8
        radU = (RadioButton) findViewById(R.id.radio_U);
        radX = (RadioButton) findViewById(R.id.radio_X);
        radY = (RadioButton) findViewById(R.id.radio_Y);
        t8 = (TextView) findViewById(R.id.question8);

        Intent i = getIntent();
        questions = i.getStringExtra("question");

        switch (questions) {
            case "education":
                l = 0;
                q1=true;
                getSupportActionBar().setTitle("EDUCATION");

                question();
                break;


            case "technology":
                getSupportActionBar().setTitle("TECHNOLOGY");
                l = 1;
                q2=true;


                question();
                break;
            case "politics":
                getSupportActionBar().setTitle("POLITICS");
                l = 2;
                q3=true;
                question();


                break;

        }
    }

    public void Que1(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Answer 1 for Education
        if(q1==true) {
            switch (view.getId()) {
                case R.id.radio_c:
                    if (checked == checked) {
                        count+= 1;
                    }
                    break;
                default:
                    count+= 0;
                    break;

            }
        }

                //Answer 1 for Technology
            if(q2==true) {
                switch (view.getId()) {
                    case R.id.radio_a:
                        if (checked) {
                            count += 1;
                        }
                        break;
                    default:
                        count += 0;
                        break;

                }
            }
                        //Answer  1 for Politics
                if(q3==true) {
                    switch (view.getId()) {
                        case R.id.radio_b:
                            if (checked) {
                                count += 1;
                            }
                            break;
                        default:
                            count += 0;
                            break;


                    }
                }



    }
 // Return back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    public void Que2(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Answer 2 for Education
        if(q1==true) {
            switch (view.getId()) {
                case R.id.radio_F:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                //Answer 2 for Technology
             if(q2==true){
                switch (view.getId()) {
                    case R.id.radio_E:
                        if (checked) {
                            count += 1;
                        }
                        break;
                    default:
                        count += 0;
                        break;
                }
        }

                        //Answer 2 for Politics
                     if(q3==true){
                        switch (view.getId()) {
                            case R.id.radio_F:
                                if (checked) {
                                    count += 1;
                                }
                                break;
                            default:
                                count += 0;
                                break;

                        }



        }
    }

    public void Que3(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Answer 3 for Education
        if(q1==true) {
            switch (view.getId()) {
                case R.id.radio_H:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                //Answer 3 for Technology
        if(q2==true) {
            switch (view.getId()) {
                case R.id.radio_I:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                        //Answer 3 for Politics
         if(q3==true){
             switch (view.getId()) {
                 case R.id.radio_H:
                     if(checked) {
                         count += 1;
                     }
                     break;
                 default:
                     count += 0;
                     break;

                }
        }
    }

    public void Que4(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Answer 4 for Education
        if(l==0) {
            switch (view.getId()) {
                case R.id.radio_K:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;

            }
        }

                //Answer 4 for Technology
        if(l==1) {
            switch (view.getId()) {
                case R.id.radio_J:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

        if(l==2){
                        //Answer 4 for Politics
            switch (view.getId()) {
                case R.id.radio_K:
                    if(checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;

                }
        }
    }

    public void Que5(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Answer 5 for Education
        if(l==0) {
            switch (view.getId()) {
                case R.id.radio_M:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                //Answer 5 for Technology
        if(l==1) {
            switch (view.getId()) {
                case R.id.radio_M:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                        //Answer 5 for Politics
        if(l==2){
            switch (view.getId()) {
                case R.id.radio_O:
                    if(checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;


                }
        }
    }
    public void Que6(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Answer 6 for Education
        if(l==0) {
            switch (view.getId()) {
                case R.id.radio_R:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                //Answer 6 for Technology
        if(l==1) {
            switch (view.getId()) {
                case R.id.radio_P:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                        //Answer 6 for Politics
        if(l==2){
                        switch (view.getId()) {
                            case R.id.radio_R:
                                if(checked) {
                                    count += 1;
                                }
                                break;
                            default:
                                count += 0;
                                break;

                }
        }
    }

    public void Que7(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Answer 7 for Education
        if(l==0) {
            switch (view.getId()) {
                case R.id.radio_S:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                //Answer 7 for Technology
        if(l==1) {
            switch (view.getId()) {
                case R.id.radio_T:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                        //Answer 7 for Politics
        if(l==2){
                        switch (view.getId()) {
                            case R.id.radio_T:
                                if(checked) {
                                    count += 1;
                                }
                                break;
                            default:
                                count += 0;
                                break;

                }
        }
    }

    public void Que8(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Answer 8 for Education
        if(l==0) {
            switch (view.getId()) {
                case R.id.radio_X:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                //Answer 8 for Technology
        if(l==1) {
            switch (view.getId()) {
                case R.id.radio_Y:
                    if (checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;
            }
        }

                        //Answer 8 for Politics
        if(l==2){
            switch (view.getId()) {
                case R.id.radio_X:
                    if(checked) {
                        count += 1;
                    }
                    break;
                default:
                    count += 0;
                    break;


                }
        }
    }

    public void Submit(View view){
        Intent intent = new Intent(getApplicationContext(),Results.class);
        intent.putExtra("count",count);
        startActivity(intent);

    }


    public void question()
    {

    question.setdetails(l);

        String questionA = question.getanswerA();
        String questionB = question.getanswerB();
        String questionC = question.getanswerC();
        String Text = question.getText();

        radA.setText(questionA);
        radB.setText(questionB);
        radC.setText(questionC);
        t1.setText(Text);

        //Answer2
        String question1A = question.getanswer1A();
        String question1B = question.getanswer1B();
        String question1C = question.getanswer1C();
        String Text1 = question.getText1();

        radD.setText(question1A);
        radE.setText(question1B);
        radF.setText(question1C);
        t2.setText(Text1);

        //Answer3
        String question3A = question.getAnswer3A();
        String question3B = question.getAnswer3B();
        String question3C =question.getAnswer3C();
        String Text3 = question.getText3();

        radG.setText(question3A);
        radH.setText(question3B);
        radI.setText(question3C);
        t3.setText(Text3);

        //Answer4
        String question4A = question.getAnswer4A();
        String question4B = question.getAnswer4B();
        String question4C =question.getAnswer4C();
        String Text4 = question.getText4();

        radJ.setText(question4A);
        radK.setText(question4B);
        radL.setText(question4C);
        t4.setText(Text4);

        //Answer5
        String question5A = question.getAnswer5A();
        String question5B = question.getAnswer5B();
        String question5C = question.getAnswer5C();
        String Text5 = question.getText5();

        radN.setText(question5A);
        radM.setText(question5B);
        radO.setText(question5C);
        t5.setText(Text5);

        //Answer6
        String question6A = question.getAnswer6A();
        String question6B = question.getAnswer6B();
        String queation6C = question.getAnswer6C();
        String Text6 = question.getText6();

        radP.setText(question6A);
        radQ.setText(question6B);
        radR.setText(queation6C);
        t6.setText(Text6);

        //Answer7
        String question7A = question.getAnswer7A();
        String question7B = question.getAnswer7B();
        String question7C = question.getAnswer7C();
        String Text7 = question.getText7();

        radS.setText(question7A);
        radT.setText(question7B);
        radU.setText(question7C);
        t7.setText(Text7);

        //Answer8
        String question8A = question.getAnswer8A();
        String question8B = question.getAnswer8B();
        String question8C = question.getAnswer8C();
        String Text8 = question.getText8();

        radV.setText(question8A);
        radX.setText(question8B);
        radY.setText(question8C);
        t8.setText(Text8);


    }
    }




