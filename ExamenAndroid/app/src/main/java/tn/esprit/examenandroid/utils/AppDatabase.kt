package tn.esprit.examenandroid.utils

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import tn.esprit.examenandroid.dao.MovieDao
import tn.esprit.examenandroid.models.Movies

@Database(entities = [Movies::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {


    abstract fun movieDao(): MovieDao

    companion object {
        //TODO 11 Apply the Design Pattern singleton
        fun getDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "db_movies").allowMainThreadQueries().build()
        }

    }
}