package com.gugyu.rounddialogdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.gugyu.rounddialoglib.RoundDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_normal.setOnClickListener {
            RoundDialogBuilder()
                .setTitle("Normal")
                .setContentText("This is normal Dialog")
                .addVerticalButton("OK") {
                    Toast.makeText(application, "You said OK!", Toast.LENGTH_SHORT).show()
                }
                .addVerticalButton("Cancel")
                .build()
                .show(supportFragmentManager, "normal")
        }

        button_colorful.setOnClickListener {
            RoundDialogBuilder()
                .setTitle("Colorful")
                .setContentText("You can apply pointColor\nwith color drawable id", true)
                .setPointColor(R.color.teal_200)
                .addHorizontalButton("Nice")
                .addHorizontalButton("Not bad")
                .enableDivider(false)
                .build()
                .show(supportFragmentManager, "colorful")
        }

        button_edittext.setOnClickListener {
            RoundDialogBuilder()
                .setTitle("Custom content!")
                .setContentView(R.layout.layout_edittext)
                .addHorizontalButton("Done") {
                    Toast.makeText(application, "Your name is " + it?.findViewById<EditText>(R.id.editText)?.text,
                        Toast.LENGTH_SHORT).show()
                }
                .addHorizontalButton("Nope")
                .build()
                .show(supportFragmentManager, "edittext")
        }

        button_ok_cancel.setOnClickListener {
            RoundDialogBuilder()
                .setContentText("Are you sure?", true)
                .addHorizontalButton("Yes")
                .addHorizontalButton("No")
                .setTextSize(20f)
                .build()
                .show(supportFragmentManager, "ok_no")
        }

        button_only_button.setOnClickListener {
            RoundDialogBuilder()
                .addVerticalButton("First choice")
                .addVerticalButton("Second choice")
                .build()
                .show(supportFragmentManager, "only_button")
        }

        button_more_button.setOnClickListener {
            RoundDialogBuilder()
                .setTitle("Try !")
                .setContentText("Where will you go?\nYou must choice.")
                .addHorizontalButton("Left")
                .addHorizontalButton("Top")
                .addHorizontalButton("Right")
                .enableCancel(false)
                .build()
                .show(supportFragmentManager, "more_button")
        }

        button_more_more.setOnClickListener {
            RoundDialogBuilder()
                .setTitle("Favorite color")
                .addVerticalButton("Red")
                .addVerticalButton("Blue")
                .addVerticalButton("Yellow")
                .addVerticalButton("Green")
                .addVerticalButton("Black")
                .build()
                .show(supportFragmentManager, "more_more")
        }

        button_wired.setOnClickListener {
            RoundDialogBuilder()
                .setTitle("Hm,,")
                .setContentText("It's just..for fun")
                .addVerticalButton("Trust me")
                .addVerticalButton("Nobody")
                .addVerticalButton("Use it")
                .addHorizontalButton("It's")
                .addHorizontalButton("Wired")
                .addHorizontalButton("~.~")
                .build()
                .show(supportFragmentManager, "wired")
        }
    }
}