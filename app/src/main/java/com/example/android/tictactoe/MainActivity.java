package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static String player1;
    public static String comp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * listener to check for chosen game piece
         */
        RadioGroup rGroup = findViewById(R.id.radio);

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.select_x:
                        player1 = "X";
                        comp = "O";
                        break;
                    case R.id.select_o:
                        player1 = "O";
                        comp = "X";
                        break;
                    default:
                        break;
                }
            }
        });
    }

    /**
     * This method is called when start game button is clicked, it opens the game board
     * @param view
     */
    public void start_board3 (View view) {
        Intent board3xIntent = new Intent(MainActivity.this, Board3xActivity.class);
        startActivity(board3xIntent);
    }

    public void start_board5 (View view) {
        Intent board5xIntent = new Intent(MainActivity.this, Board5xActivity.class);
        startActivity(board5xIntent);
    }
}
