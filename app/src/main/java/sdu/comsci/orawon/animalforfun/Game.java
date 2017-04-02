package sdu.comsci.orawon.animalforfun;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game extends AppCompatActivity {

    //Explicit
    Button btn1, btn2, btn3, btn4;
    ImageView questionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumeImageButton;
    int questionCount = 10; //กำหนดจำนวนข้อ
    ArrayList<Integer> qID = new ArrayList<Integer>() ;
    String answer;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initial viwew
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        questionImageView = (ImageView) findViewById(R.id.imvQuestion);
        volumeImageButton = (ImageButton) findViewById(R.id.imbVolume);

        for (int i = 1; i <= questionCount; i++) {
            qID.add(i); //จองพื้นที่หน่วยความจำจำนวนข้อคำถาม

        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));


    }// Main Method

    private void setQuestion(Integer qID) {
        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("หมู");
            choice.add("ช้าง");
            choice.add("ยุง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("แกะ");
            choice.add("สุนัข");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("วัว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4) {
            answer = "สุนัข";
            questionImageView.setImageResource(R.drawable.dog_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุง");
            choice.add("สุนัข");
            choice.add("ม้า");
            choice.add("นก");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("ม้า");
            choice.add("ยุง");
            choice.add("สิงโต");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("สิงโต");
            choice.add("ยุง");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("ยุง");
            choice.add("นก");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("หมู");
            choice.add("สุนัข");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("แกะ");
            choice.add("ยุง");
            choice.add("นก");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

    } //EndvsetQuestion Method ทำการแสดงคำถามบนหน้าxml
    public void choiceAns (View view) {
        Button button = (Button) view;
        String buttonString = button.getText().toString(); // เก็บข้อความลงปุ่ม
        if (buttonString.equals(answer)){
            score++;
        }
        if (qID.isEmpty()){  //ทำครบทุกข้อแล้วหรือยัง
            dialonBoxScore ();

        }else{
            setQuestion(qID.remove(0));
        }
    }//end choiceAns Method

    private void dialonBoxScore() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณได้คะแนน" + score + "คะแนน")
        .setCancelable(false)
        .setPositiveButton("ออกจากเกมส์", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        })
        .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }// end dialogBoxScore Method

    //play sound
    public void playSound (View view) {
        mediaPlayer.start();
    } // End playSound Method


} // Main Class
