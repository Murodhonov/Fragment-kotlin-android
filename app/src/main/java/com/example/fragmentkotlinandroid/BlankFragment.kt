package com.example.fragmentkotlinandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_blank.view.*

class BlankFragment : Fragment() {

    lateinit var root: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        root = inflater.inflate(R.layout.fragment_blank, container, false)

        root.btn_next.setOnClickListener {

            val name = root.edt_name.text.toString()

            val bundle = Bundle()
            bundle.putString("keyName", name)

            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()
            val blankFragment2 = BlankFragment2()
            blankFragment2.arguments = bundle
            transaction.replace(R.id.my_fragment_host, blankFragment2)
            transaction.addToBackStack(blankFragment2.toString())
            transaction.commit()
        }

        return root
    }

}