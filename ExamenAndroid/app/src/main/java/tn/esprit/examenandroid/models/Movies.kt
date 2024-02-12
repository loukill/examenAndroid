package tn.esprit.examenandroid.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Movies (
    @PrimaryKey
    val id:Int,
    val imageRes:Int,
    val title: String,
    val description: String,
    )