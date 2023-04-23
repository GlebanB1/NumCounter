package com.example.numcounter


import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button

class GameActivity : AppCompatActivity() {

    var a = 0
    var check = 0
    var previos = 0
    var rnds2 = 0
    var rnds3 = 0
    var count = 0
    var sum:Int = 0
    var p:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        supportActionBar?.hide()

        val TextField = findViewById(R.id.textView11) as TextView
        val TextField1 = findViewById(R.id.textView7) as TextView
        val TextField2 = findViewById(R.id.textView25) as TextView
        val ProgressBar = findViewById(R.id.progressBar1) as ProgressBar
        val points = findViewById(R.id.textView4) as TextView
        val got_points = findViewById(R.id.textView5) as TextView
        val username = intent.getStringExtra("Username")

        object : CountDownTimer(61000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                TextField.setText("" + millisUntilFinished / 1000 + " seconds")
                ProgressBar.setProgress((61-millisUntilFinished/ 1000).toInt())
            }
            override fun onFinish() {
                TextField.setText("Done!")
                var points1: String = points.getText().toString()
                var count1: String = count.toString()
                var name: String = username.toString()
                val intent = Intent(this@GameActivity, ResultActivity::class.java)
                intent.putExtra("Points",points1)
                intent.putExtra("Count",count1)
                intent.putExtra("Username",name)
                startActivity(intent)
                finish()
            }
        }.start()



            val btn1 = findViewById(R.id.button1) as Button
            val btn2 = findViewById(R.id.button2) as Button
            val btn3 = findViewById(R.id.button3) as Button
            val btn4 = findViewById(R.id.button4) as Button
            val btn5 = findViewById(R.id.button5) as Button
            val btn6 = findViewById(R.id.button6) as Button
            val btn7 = findViewById(R.id.button7) as Button
            val btn8 = findViewById(R.id.button8) as Button
            val btn9 = findViewById(R.id.button9) as Button
            val btn10 = findViewById(R.id.button10) as Button
            val btn11 = findViewById(R.id.button11) as Button
            val btn12 = findViewById(R.id.button12) as Button
            val btn13 = findViewById(R.id.button13) as Button
            val btn14 = findViewById(R.id.button14) as Button
            val btn15 = findViewById(R.id.button15) as Button
            val btn16 = findViewById(R.id.button16) as Button
            val btn17 = findViewById(R.id.button17) as Button
            val btn18 = findViewById(R.id.button18) as Button
            val btn19 = findViewById(R.id.button19) as Button
            val btn20 = findViewById(R.id.button20) as Button

            btn1.visibility = View.INVISIBLE
            btn2.visibility = View.INVISIBLE
            btn3.visibility = View.INVISIBLE
            btn4.visibility = View.INVISIBLE
            btn5.visibility = View.INVISIBLE
            btn6.visibility = View.INVISIBLE
            btn7.visibility = View.INVISIBLE
            btn8.visibility = View.INVISIBLE
            btn9.visibility = View.INVISIBLE
            btn10.visibility = View.INVISIBLE
            btn11.visibility = View.INVISIBLE
            btn12.visibility = View.INVISIBLE
            btn13.visibility = View.INVISIBLE
            btn14.visibility = View.INVISIBLE
            btn15.visibility = View.INVISIBLE
            btn16.visibility = View.INVISIBLE
            btn17.visibility = View.INVISIBLE
            btn18.visibility = View.INVISIBLE
            btn19.visibility = View.INVISIBLE
            btn20.visibility = View.INVISIBLE


            val btn21 = findViewById(R.id.button21) as Button
            val btn22 = findViewById(R.id.button22) as Button
            val btn23 = findViewById(R.id.button23) as Button
            val btn24 = findViewById(R.id.button24) as Button
            val btn25 = findViewById(R.id.button25) as Button
            val btn26 = findViewById(R.id.button26) as Button
            val btn27 = findViewById(R.id.button27) as Button
            val btn28 = findViewById(R.id.button28) as Button
            val btn29 = findViewById(R.id.button29) as Button
            val btn30 = findViewById(R.id.button30) as Button


        var rnds1 = (1..3).random()
        btn21.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn22.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn23.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn24.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn25.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn26.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn27.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn28.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn29.setText(""+rnds1)
        rnds1 = (1..3).random()
        btn30.setText(""+rnds1)





        fun randomNum() {
            if (count < 3) rnds2 = (4..10).random()
            else if (count >=3 && count < 7)  rnds2 = (5..15).random()
            else if (count >=7 && count < 13) rnds2 = (10..20).random()
            else if (count >=13 && count < 21) rnds2 = (15..30).random()
            else if (count >=21 && count < 100) rnds2 = (20..40).random()

            if (rnds2 == previos) {
                randomNum()
            }
            else {
                TextField1.setText(""+rnds2)
                previos = rnds2
            }
        }

        fun randomNumGame() {
            if (count < 3) rnds3 = (1..3).random()
            else if (count >=3 && count < 7) rnds3 = (1..4).random()
            else if (count >=7 && count < 13) rnds3 = (1..5).random()
            else if (count >=13 && count < 21) rnds3 = (1..6).random()
            else if (count >=21 && count < 100) rnds3 = (1..7).random()
        }

        randomNum()

        fun buttonCheck() {
            if (count < 100) {
                if (btn21.getVisibility() == View.INVISIBLE) {
                    btn21.visibility = View.VISIBLE
                    randomNumGame()
                    btn21.setText("" + rnds3)
                }

                if (btn22.getVisibility() == View.INVISIBLE) {
                    btn22.visibility = View.VISIBLE
                    randomNumGame()
                    btn22.setText("" + rnds3)
                }

                if (btn23.getVisibility() == View.INVISIBLE) {
                    btn23.visibility = View.VISIBLE
                    randomNumGame()
                    btn23.setText("" + rnds3)
                }

                if (btn24.getVisibility() == View.INVISIBLE) {
                    btn24.visibility = View.VISIBLE
                    randomNumGame()
                    btn24.setText("" + rnds3)
                }

                if (btn25.getVisibility() == View.INVISIBLE) {
                    btn25.visibility = View.VISIBLE
                    randomNumGame()
                    btn25.setText("" + rnds3)
                }

                if (btn26.getVisibility() == View.INVISIBLE) {
                    btn26.visibility = View.VISIBLE
                    randomNumGame()
                    btn26.setText("" + rnds3)
                }

                if (btn27.getVisibility() == View.INVISIBLE) {
                    btn27.visibility = View.VISIBLE
                    randomNumGame()
                    btn27.setText("" + rnds3)
                }

                if (btn28.getVisibility() == View.INVISIBLE) {
                    btn28.visibility = View.VISIBLE
                    randomNumGame()
                    btn28.setText("" + rnds3)
                }

                if (btn29.getVisibility() == View.INVISIBLE) {
                    btn29.visibility = View.VISIBLE
                    randomNumGame()
                    btn29.setText("" + rnds3)
                }

                if (btn30.getVisibility() == View.INVISIBLE) {
                    btn30.visibility = View.VISIBLE
                    randomNumGame()
                    btn30.setText("" + rnds3)
                }
            }

            if (count >= 3 && count < 100) {
                if (btn16.getVisibility() == View.INVISIBLE) {
                    btn16.visibility = View.VISIBLE
                    randomNumGame()
                    btn16.setText("" + rnds3)
                }

                if (btn17.getVisibility() == View.INVISIBLE) {
                    btn17.visibility = View.VISIBLE
                    randomNumGame()
                    btn17.setText("" + rnds3)
                }

                if (btn18.getVisibility() == View.INVISIBLE) {
                    btn18.visibility = View.VISIBLE
                    randomNumGame()
                    btn18.setText("" + rnds3)
                }

                if (btn19.getVisibility() == View.INVISIBLE) {
                    btn19.visibility = View.VISIBLE
                    randomNumGame()
                    btn19.setText("" + rnds3)
                }

                if (btn20.getVisibility() == View.INVISIBLE) {
                    btn20.visibility = View.VISIBLE
                    randomNumGame()
                    btn20.setText("" + rnds3)
                }
            }

            if (count >= 7 && count < 100) {
                if (btn11.getVisibility() == View.INVISIBLE) {
                    btn11.visibility = View.VISIBLE
                    randomNumGame()
                    btn11.setText("" + rnds3)
                }

                if (btn12.getVisibility() == View.INVISIBLE) {
                    btn12.visibility = View.VISIBLE
                    randomNumGame()
                    btn12.setText("" + rnds3)
                }

                if (btn13.getVisibility() == View.INVISIBLE) {
                    btn13.visibility = View.VISIBLE
                    randomNumGame()
                    btn13.setText("" + rnds3)
                }

                if (btn14.getVisibility() == View.INVISIBLE) {
                    btn14.visibility = View.VISIBLE
                    randomNumGame()
                    btn14.setText("" + rnds3)
                }

                if (btn15.getVisibility() == View.INVISIBLE) {
                    btn15.visibility = View.VISIBLE
                    randomNumGame()
                    btn15.setText("" + rnds3)
                }
            }

            if (count >= 13 && count < 100) {
                if (btn6.getVisibility() == View.INVISIBLE) {
                    btn6.visibility = View.VISIBLE
                    randomNumGame()
                    btn6.setText("" + rnds3)
                }

                if (btn7.getVisibility() == View.INVISIBLE) {
                    btn7.visibility = View.VISIBLE
                    randomNumGame()
                    btn7.setText("" + rnds3)
                }

                if (btn8.getVisibility() == View.INVISIBLE) {
                    btn8.visibility = View.VISIBLE
                    randomNumGame()
                    btn8.setText("" + rnds3)
                }

                if (btn9.getVisibility() == View.INVISIBLE) {
                    btn9.visibility = View.VISIBLE
                    randomNumGame()
                    btn9.setText("" + rnds3)
                }

                if (btn10.getVisibility() == View.INVISIBLE) {
                    btn10.visibility = View.VISIBLE
                    randomNumGame()
                    btn10.setText("" + rnds3)
                }
            }

            if (count >= 21 && count < 100) {
                if (btn1.getVisibility() == View.INVISIBLE) {
                    btn1.visibility = View.VISIBLE
                    randomNumGame()
                    btn1.setText("" + rnds3)
                }

                if (btn2.getVisibility() == View.INVISIBLE) {
                    btn2.visibility = View.VISIBLE
                    randomNumGame()
                    btn2.setText("" + rnds3)
                }

                if (btn3.getVisibility() == View.INVISIBLE) {
                    btn3.visibility = View.VISIBLE
                    randomNumGame()
                    btn3.setText("" + rnds3)
                }

                if (btn4.getVisibility() == View.INVISIBLE) {
                    btn4.visibility = View.VISIBLE
                    randomNumGame()
                    btn4.setText("" + rnds3)
                }

                if (btn5.getVisibility() == View.INVISIBLE) {
                    btn5.visibility = View.VISIBLE
                    randomNumGame()
                    btn5.setText("" + rnds3)
                }
            }
        }


        fun game() {
            if (previos < a)  {
                TextField2.setText("Too much!")
                if (count < 3) {
                    got_points.setText("-30")
                     p = 30
                }
                else if (count >=3 && count < 7) {
                    got_points.setText("-25")
                     p = 25
                }
                else if (count >=7 && count < 13) {
                    got_points.setText("-20")
                     p = 20
                }
                else if (count >=13 && count < 21) {
                    got_points.setText("-15")
                     p = 15
                }
                else if (count >=21 && count < 100) {
                    got_points.setText("-10")
                     p = 10
                }

                sum = sum - p
                points.setText(sum.toString())
                a = 0
                randomNum()
                buttonCheck()

            }
            else if (previos == a) {

                TextField2.setText("Good job!")
                if (count < 3) {
                    got_points.setText("+20")
                    p = 20
                }
                else if (count >=3 && count < 7) {
                    got_points.setText("+30")
                    p = 30
                }
                else if (count >=7 && count < 13) {
                    got_points.setText("+40")
                    p = 40
                }
                else if (count >=13 && count < 21) {
                    got_points.setText("+50")
                    p = 50
                }
                else {
                    got_points.setText("+60")
                    p = 60
                }
                sum = sum + p
                points.setText(sum.toString())
                a = 0
                count += 1
                randomNum()
                buttonCheck()

            }
            else if (previos > a) {
                TextField2.setText("Keep going!")
            }
        }

        btn21.setOnClickListener {
            a = a + Integer.parseInt(btn21.getText().toString())
            btn21.visibility = View.INVISIBLE
            game()
        }
        btn22.setOnClickListener {
            a = a + Integer.parseInt(btn22.getText().toString())
            btn22.visibility = View.INVISIBLE
            game()
        }
        btn23.setOnClickListener {
            a = a + Integer.parseInt(btn23.getText().toString())
            btn23.visibility = View.INVISIBLE
            game()
        }
        btn24.setOnClickListener {
            a = a + Integer.parseInt(btn24.getText().toString())
            btn24.visibility = View.INVISIBLE
            game()
        }
        btn25.setOnClickListener {
            a = a + Integer.parseInt(btn25.getText().toString())
            btn25.visibility = View.INVISIBLE
            game()
        }
        btn26.setOnClickListener {
            a = a + Integer.parseInt(btn26.getText().toString())
            btn26.visibility = View.INVISIBLE
            game()
        }
        btn27.setOnClickListener {
            a = a + Integer.parseInt(btn27.getText().toString())
            btn27.visibility = View.INVISIBLE
            game()
        }
        btn28.setOnClickListener {
            a = a + Integer.parseInt(btn28.getText().toString())
            btn28.visibility = View.INVISIBLE
            game()
        }
        btn29.setOnClickListener {
            a = a + Integer.parseInt(btn29.getText().toString())
            btn29.visibility = View.INVISIBLE
            game()
        }
        btn30.setOnClickListener {
            a = a + Integer.parseInt(btn30.getText().toString())
            btn30.visibility = View.INVISIBLE
            game()
        }
        btn1.setOnClickListener {
            a = a + Integer.parseInt(btn1.getText().toString())
            btn1.visibility = View.INVISIBLE
            game()
        }
        btn2.setOnClickListener {
            a = a + Integer.parseInt(btn2.getText().toString())
            btn2.visibility = View.INVISIBLE
            game()
        }
        btn3.setOnClickListener {
            a = a + Integer.parseInt(btn3.getText().toString())
            btn3.visibility = View.INVISIBLE
            game()
        }
        btn4.setOnClickListener {
            a = a + Integer.parseInt(btn4.getText().toString())
            btn4.visibility = View.INVISIBLE
            game()
        }
        btn5.setOnClickListener {
            a = a + Integer.parseInt(btn5.getText().toString())
            btn5.visibility = View.INVISIBLE
            game()
        }
        btn6.setOnClickListener {
            a = a + Integer.parseInt(btn6.getText().toString())
            btn6.visibility = View.INVISIBLE
            game()
        }
        btn7.setOnClickListener {
            a = a + Integer.parseInt(btn7.getText().toString())
            btn7.visibility = View.INVISIBLE
            game()
        }
        btn8.setOnClickListener {
            a = a + Integer.parseInt(btn8.getText().toString())
            btn8.visibility = View.INVISIBLE
            game()
        }
        btn9.setOnClickListener {
            a = a + Integer.parseInt(btn9.getText().toString())
            btn9.visibility = View.INVISIBLE
            game()
        }
        btn10.setOnClickListener {
            a = a + Integer.parseInt(btn10.getText().toString())
            btn10.visibility = View.INVISIBLE
            game()
        }
        btn11.setOnClickListener {
            a = a + Integer.parseInt(btn11.getText().toString())
            btn11.visibility = View.INVISIBLE
            game()
        }
        btn12.setOnClickListener {
            a = a + Integer.parseInt(btn12.getText().toString())
            btn12.visibility = View.INVISIBLE
            game()
        }
        btn13.setOnClickListener {
            a = a + Integer.parseInt(btn13.getText().toString())
            btn13.visibility = View.INVISIBLE
            game()
        }
        btn14.setOnClickListener {
            a = a + Integer.parseInt(btn14.getText().toString())
            btn14.visibility = View.INVISIBLE
            game()
        }
        btn15.setOnClickListener {
            a = a + Integer.parseInt(btn15.getText().toString())
            btn15.visibility = View.INVISIBLE
            game()
        }
        btn16.setOnClickListener {
            a = a + Integer.parseInt(btn16.getText().toString())
            btn16.visibility = View.INVISIBLE
            game()
        }
        btn17.setOnClickListener {
            a = a + Integer.parseInt(btn17.getText().toString())
            btn17.visibility = View.INVISIBLE
            game()
        }
        btn18.setOnClickListener {
            a = a + Integer.parseInt(btn18.getText().toString())
            btn18.visibility = View.INVISIBLE
            game()
        }
        btn19.setOnClickListener {
            a = a + Integer.parseInt(btn19.getText().toString())
            btn19.visibility = View.INVISIBLE
            game()
        }
        btn20.setOnClickListener {
            a = a + Integer.parseInt(btn20.getText().toString())
            btn20.visibility = View.INVISIBLE
            game()
        }






    }
}