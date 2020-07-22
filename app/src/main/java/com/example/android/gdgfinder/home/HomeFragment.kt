package com.example.android.gdgfinder.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.findNavController
import com.example.android.gdgfinder.R
import com.example.android.gdgfinder.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }
    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // TODO (06) Create a binding to the home_fragment layout and tell the binding
        // about the viewModel.
        val binding = HomeFragmentBinding.inflate(inflater)
        binding.viewModel = viewModel
        // binding.lifecycleOwner = viewLifecycleOwner Не надо по их
        // TODO (07)  Register an observer on navigateToSearch, and have it navigate
        // to gdgListFragment if shouldNavigate is true.
        viewModel.navigateToSearch.observe(viewLifecycleOwner) { nav ->
            if (nav) {
                binding.root.findNavController()
                .navigate(R.id.action_homeFragment_to_gdgListFragment)
                viewModel.onNavigatedToSearch()
            }
        }
        return binding.root
    }
}
