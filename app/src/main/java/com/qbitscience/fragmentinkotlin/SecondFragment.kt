package com.qbitscience.fragmentinkotlin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var view:View=inflater.inflate(R.layout.fragment_second, container, false)
       var image_q:ImageView=view.findViewById(R.id.qbitscience2)
        image_q.setOnClickListener{
            var intent=Intent(requireContext(),MainActivity::class.java)
            startActivity(intent)
        }
        return view
    }
}