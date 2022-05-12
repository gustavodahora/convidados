package dev.gustavodahora.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import dev.gustavodahora.convidados.viewModel.GuestFormViewModel
import dev.gustavodahora.convidados.R
import dev.gustavodahora.convidados.databinding.ActivityGuestFormBinding

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var viewModel: GuestFormViewModel
    lateinit var binding: ActivityGuestFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[GuestFormViewModel::class.java]

        setListeners()
    }

    override fun onClick(v: View?) {
        val id = v?.id
        if (id == R.id.button_save) {

        }
    }

    private fun setListeners() {
        binding.buttonSave.setOnClickListener {

        }
    }
}