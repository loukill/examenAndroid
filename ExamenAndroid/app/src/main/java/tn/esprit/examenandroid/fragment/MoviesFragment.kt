package tn.esprit.examenandroid.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import tn.esprit.examenandroid.R
import tn.esprit.examenandroid.adapters.MoviesAdapter
import tn.esprit.examenandroid.databinding.FragmentMoviesBinding
import tn.esprit.examenandroid.models.Movies


class MoviesFragment : Fragment() {

    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMoviesBinding.inflate(layoutInflater)

        binding.rvNews.adapter = MoviesAdapter(getListNews(requireContext()))
        binding.rvNews.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return binding.root
    }

    private fun getListNews(context: Context) : MutableList<Movies> {
        return mutableListOf(
            Movies(1, R.drawable.ic_news1, context.getString(R.string.news1) , context.getString(R.string.newsDesc1)),
            Movies(2, R.drawable.ic_news2, context.getString(R.string.news2) , context.getString(R.string.newsDesc2)),
            Movies(3, R.drawable.ic_news3, context.getString(R.string.news3) , context.getString(R.string.newsDesc3))
        )
    }
}