package tn.esprit.examenandroid.dao

import androidx.room.Dao
import androidx.room.Query
import tn.esprit.examenandroid.models.Movies

@Dao
interface MovieDao {

    @Query("select * from movies")
    fun getAllMovies() : MutableList<Movies>
}