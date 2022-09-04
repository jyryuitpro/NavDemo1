package io.jyryuitpro.navdemo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import io.jyryuitpro.navdemo1.databinding.FragmentSecondeBinding

class SecondeFragment : Fragment() {

    private lateinit var binding: FragmentSecondeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_seconde, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_seconde, container, false)
        return binding.root
    }
}