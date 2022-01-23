package com.qbitscience.fragmentinkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View=inflater.inflate(R.layout.fragment_first, container, false)
        var image: ImageView =view.findViewById(R.id.qbitscience)
        image.setOnClickListener{
            var fragmentManager: FragmentManager =requireActivity().supportFragmentManager
            var fragmentTransaction: FragmentTransaction =fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.main_container,SecondFragment())
            fragmentTransaction.commit()
        }
        return view

    }

}