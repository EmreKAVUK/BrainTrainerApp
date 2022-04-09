package com.emre.braintrainerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int point =0;
    CountDownTimer ct;
    int seqque = 0;
    TextView ques;
    TextView sequ;
    TextView tm;
    TextView tr;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    int cevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        make_question();
        make_answer();
        ct = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                tm.setText(l/1000+"s");
            }

            @Override
            public void onFinish() {

            }
        };
        ct.start();
    }
    public void make_question(){
        String [] islem = {"+","-","*","/"};
        Random rnd = new Random();
        int nm1 =  rnd.nextInt(1000);
        int nm2 = rnd.nextInt(1000);
        int is = rnd.nextInt(4);
        ques.setText(nm1+islem[is]+nm2);
        if (is == 0){
            cevap = nm1+nm2;
        }
        else if(is == 1){
            cevap = nm1-nm2;
        }
        else if(is == 2){
            cevap = nm1*nm2;
        }
        else{
            cevap = nm1/nm2;
        }
    }
    public void make_answer(){
        Random rand = new Random();
        int correct = rand.nextInt(4);
        int ans1 = cevap - rand.nextInt(50);
        int ans2 = cevap - rand.nextInt(50);
        int ans3 = cevap - rand.nextInt(50);
        if (correct == 0){
            btn1.setText(""+cevap);
            btn2.setText(""+ans1);
            btn3.setText(""+ans2);
            btn4.setText(""+ans3);
        }
        else if(correct == 1){
            btn2.setText(""+cevap);
            btn1.setText(""+ans1);
            btn3.setText(""+ans2);
            btn4.setText(""+ans3);
        }
        else if (correct==2){
            btn3.setText(""+cevap);
            btn2.setText(""+ans1);
            btn1.setText(""+ans2);
            btn4.setText(""+ans3);
        }
        else{
            btn4.setText(""+cevap);
            btn2.setText(""+ans1);
            btn3.setText(""+ans2);
            btn1.setText(""+ans3);
        }

    }
    public void but(View view){
        ct.cancel();
        ct = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                tm.setText(l/1000+"s");
            }

            @Override
            public void onFinish() {
                point=0;
                seqque=0;
                sequ.setText(""+0+"/"+0);
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.horn);
                mp.start();
                tr.setText("TIME OUT");
            }
        };
        ct.start();
        if(btn1.getText().equals(""+cevap)){
            point+=1;
            tr.setText("TRUE");
        }
        else{
            tr.setText("FALSE");
        }
        seqque+=1;
        sequ.setText(""+point+"/"+seqque);
        make_question();
        make_answer();
    }
    public void but2(View view){
        ct.cancel();
        ct = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                tm.setText(l/1000+"s");
            }

            @Override
            public void onFinish() {
                point=0;
                seqque=0;
                sequ.setText(""+0+"/"+0);
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.horn);
                mp.start();
                tr.setText("TIME OUT");
            }
        };
        ct.start();
        if(btn2.getText().equals(""+cevap)){
            point+=1;
            tr.setText("TRUE");
        }
        else{
            tr.setText("FALSE");
        }
        seqque+=1;
        sequ.setText(""+point+"/"+seqque);
        make_question();
        make_answer();
    }
    public void but3(View view){
        ct.cancel();
        ct = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                tm.setText(l/1000+"s");
            }

            @Override
            public void onFinish() {
                point=0;
                seqque=0;
                sequ.setText(""+0+"/"+0);
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.horn);
                mp.start();
                tr.setText("TIME OUT");
            }
        };
        ct.start();
        if(btn3.getText().equals(""+cevap)){
            point+=1;
            tr.setText("TRUE");
        }
        else{
            tr.setText("FALSE");
        }
        seqque+=1;
        sequ.setText(""+point+"/"+seqque);
        make_question();
        make_answer();
    }
    public void but4(View view){
        ct.cancel();
        ct = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                tm.setText(l/1000+"s");
            }

            @Override
            public void onFinish() {
                point=0;
                seqque=0;
                sequ.setText(""+0+"/"+0);
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.horn);
                mp.start();
                tr.setText("TIME OUT");
            }
        };
        ct.start();
        if(btn4.getText().equals(""+cevap)){
            point+=1;
            tr.setText("TRUE");
        }
        else{
            tr.setText("FALSE");
        }
        seqque+=1;
        sequ.setText(""+point+"/"+seqque);
        make_question();
        make_answer();
    }
    public void tanimla(){
        ques = findViewById(R.id.question);
        sequ = findViewById(R.id.sequence);
        tr = findViewById(R.id.tf);
        tm = findViewById(R.id.time);


        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);



    }
}