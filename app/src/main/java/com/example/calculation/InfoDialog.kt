package com.example.calculation

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.DialogFragment

class InfoDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builedr = AlertDialog.Builder(this.requireContext())
        val inflater = requireActivity().layoutInflater
        val infoView = inflater.inflate(R.layout.info_layout, null)
        builedr.setMessage("Info").setView(infoView)

        val myButton = infoView.findViewById(R.id.okButton) as Button

        myButton.setOnClickListener{ v ->
            val myIntent = Intent(this.requireContext(), MainActivity2::class.java)
            startActivity(myIntent)
        }

        return builedr.show()
    }
}