package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Board5xActivity extends AppCompatActivity {

    //ensures a particular button is not played on twice during a game
    int turn;

    //checks total turn count, for draw games
    int turnCount = 0;

    //player scores
    int score1 = 0; int score2 = 0;

    Button b01, b02, b03, b04, b05, b11, b12, b13, b14, b15, b21, b22, b23, b24, b25, b31, b32, b33,
    b34, b35, b41, b42, b43, b44, b45;

    /**
     * Get variables, player1 and comp, from Main Activity
     */
    String player1 = MainActivity.player1;
    String comp1 = MainActivity.comp;

    public String getPlayer1() {
        return player1;
    }

    public String getComp1() {
        return comp1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board5x);

        turn = 1;

        /**
         * find buttons from game layout and point to them
         */
        b01 = findViewById(R.id.btn01);
        b02 = findViewById(R.id.btn02);
        b03 = findViewById(R.id.btn03);
        b04 = findViewById(R.id.btn04);
        b05 = findViewById(R.id.btn05);
        b11 = findViewById(R.id.btn11);
        b12 = findViewById(R.id.btn12);
        b13 = findViewById(R.id.btn13);
        b14 = findViewById(R.id.btn14);
        b15 = findViewById(R.id.btn15);
        b21 = findViewById(R.id.btn21);
        b22 = findViewById(R.id.btn22);
        b23 = findViewById(R.id.btn23);
        b24 = findViewById(R.id.btn24);
        b25 = findViewById(R.id.btn25);
        b31 = findViewById(R.id.btn31);
        b32 = findViewById(R.id.btn32);
        b33 = findViewById(R.id.btn33);
        b34 = findViewById(R.id.btn34);
        b35 = findViewById(R.id.btn35);
        b41 = findViewById(R.id.btn41);
        b42 = findViewById(R.id.btn42);
        b43 = findViewById(R.id.btn43);
        b44 = findViewById(R.id.btn44);
        b45 = findViewById(R.id.btn45);

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

        b04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b04.getText().toString().equals("")) {
                    if (turn == 1) {
                        b04.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b04.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b04.setEnabled(false);
                endGame();
            }
        });

        b05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b05.getText().toString().equals("")) {
                    if (turn == 1) {
                        b05.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b05.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b05.setEnabled(false);
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

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b14.getText().toString().equals("")) {
                    if (turn == 1) {
                        b14.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b14.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b14.setEnabled(false);
                endGame();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b15.getText().toString().equals("")) {
                    if (turn == 1) {
                        b15.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b15.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b15.setEnabled(false);
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

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b24.getText().toString().equals("")) {
                    if (turn == 1) {
                        b24.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b24.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b24.setEnabled(false);
                endGame();
            }
        });

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b25.getText().toString().equals("")) {
                    if (turn == 1) {
                        b25.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b25.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b25.setEnabled(false);
                endGame();
            }
        });

        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b31.getText().toString().equals("")) {
                    if (turn == 1) {
                        b31.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b31.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b31.setEnabled(false);
                endGame();
            }
        });

        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b32.getText().toString().equals("")) {
                    if (turn == 1) {
                        b32.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b32.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b32.setEnabled(false);
                endGame();
            }
        });

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b33.getText().toString().equals("")) {
                    if (turn == 1) {
                        b33.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b33.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b33.setEnabled(false);
                endGame();
            }
        });

        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b34.getText().toString().equals("")) {
                    if (turn == 1) {
                        b34.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b34.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b34.setEnabled(false);
                endGame();
            }
        });

        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b35.getText().toString().equals("")) {
                    if (turn == 1) {
                        b35.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b35.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b35.setEnabled(false);
                endGame();
            }
        });

        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b41.getText().toString().equals("")) {
                    if (turn == 1) {
                        b41.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b41.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b41.setEnabled(false);
                endGame();
            }
        });

        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b42.getText().toString().equals("")) {
                    if (turn == 1) {
                        b42.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b42.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b42.setEnabled(false);
                endGame();
            }
        });

        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b43.getText().toString().equals("")) {
                    if (turn == 1) {
                        b43.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b43.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b43.setEnabled(false);
                endGame();
            }
        });

        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b44.getText().toString().equals("")) {
                    if (turn == 1) {
                        b44.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b44.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b44.setEnabled(false);
                endGame();
            }
        });

        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b45.getText().toString().equals("")) {
                    if (turn == 1) {
                        b45.setText(getPlayer1());
                        turn = 2;
                    } else if (turn == 2) {
                        b45.setText(getComp1());
                        turn = 1;
                    }
                }
                turnCount++;
                b45.setEnabled(false);
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

        String a, b, c, d,e, f, g, h, i, j, k, l, m, n, o, p, q, r, s,
        t, u, v, w, x, y;

        a = b01.getText().toString();
        b = b02.getText().toString();
        c = b03.getText().toString();
        d = b04.getText().toString();
        e = b05.getText().toString();
        f = b11.getText().toString();
        g = b12.getText().toString();
        h = b13.getText().toString();
        i = b14.getText().toString();
        j = b15.getText().toString();
        k = b21.getText().toString();
        l = b22.getText().toString();
        m = b23.getText().toString();
        n = b24.getText().toString();
        o = b25.getText().toString();
        p = b31.getText().toString();
        q = b32.getText().toString();
        r = b33.getText().toString();
        s = b34.getText().toString();
        t = b35.getText().toString();
        u = b41.getText().toString();
        v = b42.getText().toString();
        w = b43.getText().toString();
        x = b44.getText().toString();
        y = b45.getText().toString();

        if (a.equals(getPlayer1()) && b.equals(getPlayer1()) && c.equals(getPlayer1())
                && d.equals(getPlayer1()) && e.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (f.equals(getPlayer1()) && g.equals(getPlayer1()) && h.equals(getPlayer1())
                && i.equals(getPlayer1()) && j.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (k.equals(getPlayer1()) && l.equals(getPlayer1()) && m.equals(getPlayer1())
                && n.equals(getPlayer1()) && o.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (p.equals(getPlayer1()) && q.equals(getPlayer1()) && r.equals(getPlayer1())
                && s.equals(getPlayer1()) && t.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (u.equals(getPlayer1()) && v.equals(getPlayer1()) && w.equals(getPlayer1())
                && x.equals(getPlayer1()) && y.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (a.equals(getPlayer1()) && f.equals(getPlayer1()) && k.equals(getPlayer1())
                && p.equals(getPlayer1()) && u.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b.equals(getPlayer1()) && g.equals(getPlayer1()) && l.equals(getPlayer1())
                && q.equals(getPlayer1()) && v.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (c.equals(getPlayer1()) && h.equals(getPlayer1()) && m.equals(getPlayer1())
                && r.equals(getPlayer1()) && w.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (d.equals(getPlayer1()) && i.equals(getPlayer1()) && n.equals(getPlayer1())
                && s.equals(getPlayer1()) && x.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (e.equals(getPlayer1()) && j.equals(getPlayer1()) && o.equals(getPlayer1())
                && t.equals(getPlayer1()) && y.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (a.equals(getPlayer1()) && g.equals(getPlayer1()) && m.equals(getPlayer1())
                && s.equals(getPlayer1()) && y.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (e.equals(getPlayer1()) && i.equals(getPlayer1()) && m.equals(getPlayer1())
                && q.equals(getPlayer1()) && u.equals(getPlayer1())) {
            Toast.makeText(this, "Player 1 wins this round", Toast.LENGTH_LONG).show();
            score1 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
            
            
            
        }else if (a.equals(getComp1()) && b.equals(getComp1()) && c.equals(getComp1())
                && d.equals(getComp1()) && e.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (f.equals(getComp1()) && g.equals(getComp1()) && h.equals(getComp1())
                && i.equals(getComp1()) && j.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (k.equals(getComp1()) && l.equals(getComp1()) && m.equals(getComp1())
                && n.equals(getComp1()) && o.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (p.equals(getComp1()) && q.equals(getComp1()) && r.equals(getComp1())
                && s.equals(getComp1()) && t.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (u.equals(getComp1()) && v.equals(getComp1()) && w.equals(getComp1())
                && x.equals(getComp1()) && y.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (a.equals(getComp1()) && f.equals(getComp1()) && k.equals(getComp1())
                && p.equals(getComp1()) && u.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (b.equals(getComp1()) && g.equals(getComp1()) && l.equals(getComp1())
                && q.equals(getComp1()) && v.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (c.equals(getComp1()) && h.equals(getComp1()) && m.equals(getComp1())
                && r.equals(getComp1()) && w.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (d.equals(getComp1()) && i.equals(getComp1()) && n.equals(getComp1())
                && s.equals(getComp1()) && x.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (e.equals(getComp1()) && j.equals(getComp1()) && o.equals(getComp1())
                && t.equals(getComp1()) && y.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (a.equals(getComp1()) && g.equals(getComp1()) && m.equals(getComp1())
                && s.equals(getComp1()) && y.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (e.equals(getComp1()) && i.equals(getComp1()) && m.equals(getComp1())
                && q.equals(getComp1()) && u.equals(getComp1())) {
            Toast.makeText(this, "Player 2 wins this round", Toast.LENGTH_LONG).show();
            score2 ++;
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }else if (turnCount == 25) {
            Toast.makeText(this, "This Round is a Draw", Toast.LENGTH_LONG).show();
            displayScore1(score1);
            displayScore2(score2);
            end = true;
        }

        if (end) {
            b01.setEnabled(false);
            b02.setEnabled(false);
            b03.setEnabled(false);
            b04.setEnabled(false);
            b05.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
            b31.setEnabled(false);
            b32.setEnabled(false);
            b33.setEnabled(false);
            b34.setEnabled(false);
            b35.setEnabled(false);
            b41.setEnabled(false);
            b42.setEnabled(false);
            b43.setEnabled(false);
            b44.setEnabled(false);
            b45.setEnabled(false);
        }
    }

    /**
     * Method called when the new game button is pressed
     * @param view
     */
    public void new_game (View view) {

        turn = 1;
        turnCount = 0;
        score1 = 0;
        score2 = 0;

        displayScore1(score1);
        displayScore2(score2);

        b01.setText("");
        b02.setText("");
        b03.setText("");
        b04.setText("");
        b05.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");
        b25.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");
        b34.setText("");
        b35.setText("");
        b41.setText("");
        b42.setText("");
        b43.setText("");
        b44.setText("");
        b45.setText("");

        b01.setEnabled(true);
        b02.setEnabled(true);
        b03.setEnabled(true);
        b04.setEnabled(true);
        b05.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b24.setEnabled(true);
        b25.setEnabled(true);
        b31.setEnabled(true);
        b32.setEnabled(true);
        b33.setEnabled(true);
        b34.setEnabled(true);
        b35.setEnabled(true);
        b41.setEnabled(true);
        b42.setEnabled(true);
        b43.setEnabled(true);
        b44.setEnabled(true);
        b45.setEnabled(true);

    }

    /**
     * Method called when the play again button is pressed
     * @param view
     */
    public void replay (View view) {

        turn = 1;
        turnCount = 0;

        b01.setText("");
        b02.setText("");
        b03.setText("");
        b04.setText("");
        b05.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");
        b25.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");
        b34.setText("");
        b35.setText("");
        b41.setText("");
        b42.setText("");
        b43.setText("");
        b44.setText("");
        b45.setText("");

        b01.setEnabled(true);
        b02.setEnabled(true);
        b03.setEnabled(true);
        b04.setEnabled(true);
        b05.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b24.setEnabled(true);
        b25.setEnabled(true);
        b31.setEnabled(true);
        b32.setEnabled(true);
        b33.setEnabled(true);
        b34.setEnabled(true);
        b35.setEnabled(true);
        b41.setEnabled(true);
        b42.setEnabled(true);
        b43.setEnabled(true);
        b44.setEnabled(true);
        b45.setEnabled(true);

    }
}

