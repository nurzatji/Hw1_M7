package com.example.lesson1.data.local

import androidx.room.*
import com.example.lesson1.data.model.NoteEntity

@Dao
interface NoteDao {
    @Query("SELECT * FROM notes ")
    fun getAllNotes():List<NoteEntity>

@Insert
    fun createNote(noteEntity: NoteEntity)

    @Update
    fun  updateNote(noteEntity: NoteEntity)

@Delete
    fun deleteNote(noteEntity: NoteEntity)
}