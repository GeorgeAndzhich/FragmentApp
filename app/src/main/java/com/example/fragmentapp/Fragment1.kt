package com.example.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment1) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment1,false)
        val button = view.findViewById<Button>(R.id.button3)
        button.setOnClickListener{
            Toast.makeText(getContext(),"Toast from fragment",Toast.LENGTH_SHORT).show()
        }
        return view
    }
}

