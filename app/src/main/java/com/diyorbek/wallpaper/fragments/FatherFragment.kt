package com.diyorbek.wallpaper.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.wallpaper.R
import com.diyorbek.wallpaper.adapter.RvAdapter
import com.diyorbek.wallpaper.databinding.FragmentFatherBinding
import com.diyorbek.wallpaper.model.Plants
import com.diyorbek.wallpaper.util.Constantas

class FatherFragment : Fragment(R.layout.fragment_father) {
    private lateinit var rvAdapter: RvAdapter
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentFatherBinding? = null
    private val binding get() = _binding!!

    private var plants: Plants? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        plants = arguments?.getParcelable("plants")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = com.diyorbek.wallpaper.databinding.FragmentFatherBinding.bind(view)
        pafife()
        importRvList()
    }

    private fun importRvList() {
        binding.rv.adapter = RvAdapter(Constantas.plantsList())
        rvAdapter = RvAdapter(Constantas.plantsList())
        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter= rvAdapter
        }
    }

    private fun pafife() {
        plants?.let { p->
            binding.
        }
    }

}