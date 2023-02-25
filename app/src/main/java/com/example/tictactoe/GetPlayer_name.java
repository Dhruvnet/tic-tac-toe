package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class GetPlayer_name extends AppCompatActivity {

    EditText playerOneName, playerTwoName;
    Button playerOneButton;
    ImageView BackBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_player_name);

        BackBtn = findViewById(R.id.player_names_back_btn);
        playerOneName = findViewById(R.id.player_one_name_edttxt);
        playerTwoName = findViewById(R.id.player_two_name_edttxt);
        playerOneButton = findViewById(R.id.player_btn);

        playerOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playerOneName.getText().toString().equals("")){
                    Toast.makeText(GetPlayer_name.this, "Enter Player 1 Name ", Toast.LENGTH_SHORT).show();
                }
                else if (playerTwoName.getText().toString().equals("")){
                    Toast.makeText(GetPlayer_name.this, "Enter Player 2 Name ", Toast.LENGTH_SHORT).show();
                }
                else{
                    String p1 = playerOneName.getText().toString();
                    String p2 = playerTwoName.getText().toString();
                    Intent intent = new Intent(GetPlayer_name.this,Two_player_game.class);
                    intent.putExtra("Playerone",p1);
                    intent.putExtra("Playertwo",p2);
                    startActivity(intent);
                }

            }
        });



    }

}