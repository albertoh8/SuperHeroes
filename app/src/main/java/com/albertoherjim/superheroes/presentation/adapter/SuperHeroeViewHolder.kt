package com.albertoherjim.superheroes.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.albertoherjim.superheroes.domain.GetSuperHeroeFeedUseCase

class SuperHeroeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(superHeroe: GetSuperHeroeFeedUseCase.SuperHeroeFeed) {
        val binding = ViewItemSuperheroeFeedBinding.bind(view)
        binding.imgSuperheroe.loadUrl(superHeroe.urlImage)
        binding.labelNameSuperheroe.text = superHeroe.nameSuperHeroe
        binding.labelRealnameSuperheroe.text = superHeroe.realName
        binding.labelOccupationSuperheroe.text = superHeroe.occupation
    }

}