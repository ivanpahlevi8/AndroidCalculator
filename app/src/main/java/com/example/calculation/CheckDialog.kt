package com.example.calculation

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class CheckDialog : DialogFragment() {

    companion object {
        var message: String = "Null"
        var success: Boolean = false
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog{
        val builder = AlertDialog.Builder(this.requireActivity())
        builder.setMessage(message)
            .setPositiveButton("Ok") { dialog, id ->
                if (success) {
                    val intent = Intent(this.requireActivity(), MainActivity2::class.java)
                    startActivity(intent)
                }
            }
            .setNegativeButton("Cancle") { dialog, id ->
            }

        return builder.show()
    }
}