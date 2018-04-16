package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Board3xActivity extends AppCompatActivity {

    //ensures a particular button is not played on twice during a game
    int turn;

    //checks total turn count, for draw games
    int turnCount = 0;

    //player scores
    int score1 = 0; int score2 = 0;

    Button b01, b02, b03, b11, b12, b13, b21, b22, b23;

    /**
     * Get variables, player1 and comp, from Main Activity
     */
    String player1 = MainActivity.player1;
    public String getPlayer1() {
        return player1;
    }

    String comp1 = MainActivity.comp;
    public String getComp1() {
        return comp1;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardx3_);

        turn = 1;

        /**
         * find buttons from game layout and point to them
         */
        b01 = findViewById(R.id.btn01);
        b02 = findViewById(R.id.btn02);
        b03 = findViewById(R.id.btn03);
        b11 = findViewById(R.id.btn11);
        b12 = findViewById(R.id.btn12);
        b13 = findViewById(R.id.btn13);
        b21 = findViewById(R.id.btn21);
        b22 = findViewById(R.id.btn22);
        b23 = findViewById(R.id.btn23);

        /**
         * set onclick listeners on buttons to play game & display game piece chosen
         */
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b01.getText().toString().equals("")) {
                    if (turn == 1) {
                        b01.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b01.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b01.setEnabled(false);
                endGame();
            }
        });

        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b02.getText().toString().equals("")) {
                    if (turn == 1) {
                        b02.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b02.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b02.setEnabled(false);
                endGame();
            }
        });

        b03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b03.getText().toString().equals("")) {
                    if (turn == 1) {
                        b03.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b03.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b03.setEnabled(false);
                endGame();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b11.getText().toString().equals("")) {
                    if (turn == 1) {
                        b11.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b11.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b11.setEnabled(false);
                endGame();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b12.getText().toString().equals("")) {
                    if (turn == 1) {
                        b12.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b12.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b12.setEnabled(false);
                endGame();
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b13.getText().toString().equals("")) {
                    if (turn == 1) {
                        b13.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b13.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b13.setEnabled(false);
                endGame();
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b21.getText().toString().equals("")) {
                    if (turn == 1) {
                        b21.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b21.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b21.setEnabled(false);
                endGame();
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b22.getText().toString().equals("")) {
                    if (turn == 1) {
                        b22.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b22.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b22.setEnabled(false);
                endGame();
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b23.getText().toString().equals("")) {
                    if (turn == 1) {
                        b23.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b23.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b23.setEnabled(false);
                endGame();
            }
        });
    }

    /**
     * method to display player 1 score
     */
    public void displayScore1 (int score) {
        TextView gameResult1 = findViewById(R.id.score1);
        gameResult1.setText(String.valueOf(score));
    }

    /**
     * method to display player 1 score
     */
    public void displayScore2 (int score) {
        TextView gameResult2 = findViewById(R.id.score2);
        gameResult2.setText(String.valueOf(score));
    }

    /**
     * method to specify at which point the game ends
     */
    public void endGame() {
       boolean end = false;

        String b1, b2, b3, b4,b5, b6, b7, b8, b9;

        b1 = b01.getText().toString();
        b2 = b02.getText().toString();
        b3 = b03.getText().toString();
        b4 = b11.getText().toString();
        b5 = b12.getText().toString();
        b6 = b13.getText().toString();
        b7 = b21.getText().toString();
        b8 = b22.getText().toString();
        b9 = b23.getText().toString();

        if (b1.equals(getPlayer1()) && b2.equals(getPlayer1()) && b3.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b4.equals(getPlayer1()) && b5.equals(getPlayer1()) && b6.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b7.equals(getPlayer1()) && b8.equals(getPlayer1()) && b9.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b1.equals(getPlayer1()) && b5.equals(getPlayer1()) && b9.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b1.equals(getPlayer1()) && b4.equals(getPlayer1()) && b7.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b2.equals(getPlayer1()) && b5.equals(getPlayer1()) && b8.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b3.equals(getPlayer1()) && b6.equals(getPlayer1()) && b9.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b3.equals(getPlayer1()) && b5.equals(getPlayer1()) && b7.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b1.equals(getComp1()) && b2.equals(getComp1()) && b3.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b4.equals(getComp1()) && b5.equals(getComp1()) && b6.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b7.equals(getComp1()) && b8.equals(getComp1()) && b9.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b1.equals(getComp1()) && b5.equals(getComp1()) && b9.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b1.equals(getComp1()) && b4.equals(getComp1()) && b7.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b2.equals(getComp1()) && b5.equals(getComp1()) && b8.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b3.equals(getComp1()) && b6.equals(getComp1()) && b9.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b3.equals(getComp1()) && b5.equals(getComp1()) && b7.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (turnCount == 9) {
            Toast.makeText(this, "This Round is a Draw", Toast.LENGTH_LONG).show();
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }

        if (end) {
            b01.setEnabled(false);
            b02.setEnabled(false);
            b03.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
        }
    }

    /**
     * Method called when the new game button is pressed
     * @param view
     */
    public void new_game (View view) {

//        if (turn == 1) {
//            turn = 2;
//            Toast.makeText(this, "Player 2 starts this round", Toast.LENGTH_SHORT).show();
//        } else {
//            turn = 1;
//            Toast.makeText(this, "Player 1 starts this round", Toast.LENGTH_SHORT).show();
//        }
        turn = 1;
        turnCount = 0;
        score1 = 0;
        score2 = 0;

        displayScore1(score1);
        displayScore2(score2);

        b01.setText("");
        b02.setText("");
        b03.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");

        b01.setEnabled(true);
        b02.setEnabled(true);
        b03.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        
    }

    /**
     * Method called when the try again button is pressed
     * @param view
     */
    public void replay (View view) {

        turn = 1;
        turnCount = 0;

        b01.setText("");
        b02.setText("");
        b03.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");

        b01.setEnabled(true);
        b02.setEnabled(true);
        b03.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);

    }
}
