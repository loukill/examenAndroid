package tn.esprit.examenandroid.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.examenandroid.databinding.SingleItemMovieBinding
import tn.esprit.examenandroid.models.Movies

class MoviesAdapter (val newsList: MutableList<Movies>) : RecyclerView.Adapter<MoviesAdapter.NewsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val binding =
            SingleItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        with(holder) {
            with(newsList[position]) {
                binding.newsTitle.text = title
                binding.newsDescription.text = description
                binding.newsImage.setImageResource(imageRes)


            }
        }
    }

    override fun getItemCount() = newsList.size

    inner class NewsHolder(val binding: SingleItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root)
}