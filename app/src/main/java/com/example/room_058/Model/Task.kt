package com.example.room058.Model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import io.reactivex.annotations.NonNull


@Entity( tableName = "task_table")
data class Task(
@PrimaryKey(autoGenerate = true)
@NonNull
    val idTask: Int = 0,

    val task: String,
    val descripcion: String,
    val date: String

)