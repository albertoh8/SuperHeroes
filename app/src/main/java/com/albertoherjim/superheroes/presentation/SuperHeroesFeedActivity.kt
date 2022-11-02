package com.albertoherjim.superheroes.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.albertoherjim.superheroes.R
import com.albertoherjim.superheroes.databinding.ActivitySuperheroeFeedBinding
import com.albertoherjim.superheroes.presentation.adapter.SuperHeroeAdapter
import kotlin.concurrent.thread

class SuperHeroesFeedActivity : AppCompatActivity() {

    private var binding: ActivitySuperheroeFeedBinding? = null
    private val superHeroeAdapter = SuperHeroeAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupView()
        loadSuperHeroes()
    }

    private fun setupBinding() {
        binding = ActivitySuperheroeFeedBinding.inflate(layoutInflater)
        binding?.let {
            setContentView(it.root)
        }
    }

    private fun setupView() {
        binding?.apply {
            listSuperheroe.adapter = superHeroeAdapter
            listSuperheroe.layoutManager =
                LinearLayoutManager(
                    this@SuperHeroesFeedActivity,
                    LinearLayoutManager.VERTICAL,
                    false
                )
        }
    }

    private fun loadSuperHeroes() {
        val useCase = SuperHeroeFactory().getSuperHeroeUseCase()
        thread {
            val model = useCase.execute()
            runOnUiThread {
                superHeroeAdapter.setDataItems(model)
            }
        }
    }
}