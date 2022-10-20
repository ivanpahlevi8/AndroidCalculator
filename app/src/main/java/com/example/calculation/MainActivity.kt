package com.example.calculation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener { view ->
            val id = inputId.text.toString()
            val pass = inputPass.text.toString()
            val checkId: Boolean = id.equals("ivanpahlevi8")
            val checkPass: Boolean = pass.equals("03052001")
            if (checkId && checkPass) {
                textView2.setText("Login Success")
                CheckDialog.message = "Login Success"
                CheckDialog.success = true
                val dialog = CheckDialog()
                dialog.show(supportFragmentManager, "123")
            } else if (!checkId) {
                CheckDialog.message = "Wrong Id"
                val dialog = CheckDialog()
                dialog.show(supportFragmentManager, "123")
                textView2.setText("Wrong Id")
            } else {
                CheckDialog.message = "Wrong Password"
                val dialog = CheckDialog()
                dialog.show(supportFragmentManager, "123")
                textView2.setText("Wrong Password")
            }
        }
    }
}