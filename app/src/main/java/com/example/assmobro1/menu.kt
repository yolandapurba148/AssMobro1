package com.example.assmobro1


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.assmobro1.databinding.FragmentMenuBinding

/**
 * A simple [Fragment] subclass.
 */
class menu : Fragment() {
    lateinit var binding:FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =DataBindingUtil.inflate(inflater,R.layout.fragment_menu,container,false)

        binding.persegiMenu.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_menu2_to_persegi))
        binding.segitigaMenu.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_menu2_to_segitiga))

        setHasOptionsMenu(true)
        return binding.root


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
    }



