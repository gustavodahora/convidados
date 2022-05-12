package dev.gustavodahora.convidados.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import dev.gustavodahora.convidados.databinding.FragmentAllBinding
import dev.gustavodahora.convidados.view.adapter.GuestAdapter
import dev.gustavodahora.convidados.viewModel.AllGuestsViewModel

class AllGuestsFragment : Fragment() {

    private var _binding: FragmentAllBinding? = null

    private val binding get() = _binding!!
    private lateinit var allGuestsViewModel: AllGuestsViewModel
    private val mAdapter: GuestAdapter = GuestAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        allGuestsViewModel =
            ViewModelProvider(this)[AllGuestsViewModel::class.java]

        _binding = FragmentAllBinding.inflate(inflater, container, false)

        // Get recycler
        val recycler = _binding?.recyclerAllGuests

        // Set type of recycler
        recycler?.layoutManager = LinearLayoutManager(context)

        // Set a adapter
        recycler?.adapter = mAdapter

        observer()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun observer() {
        allGuestsViewModel.guestList.observe(viewLifecycleOwner, Observer {
            mAdapter.updateGuests(it)
        })
    }

    override fun onResume() {
        super.onResume()
        allGuestsViewModel.load()
    }
}