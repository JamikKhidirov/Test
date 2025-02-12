package com.example.konkurs

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class SliderFragment(private val dataModel: DataModel) : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val  view =  inflater.inflate(R.layout.fragment_slider, container, false)
        view.findViewById<TextView>(R.id.tvText)
        view.findViewById<ImageView>(R.id.imView).setImageResource(dataModel.imageView)

        view.findViewById<AppCompatButton>(R.id.button).setOnClickListener {
            (requireActivity() as MainActivity).goToNext()
        }


        return view
    }

}