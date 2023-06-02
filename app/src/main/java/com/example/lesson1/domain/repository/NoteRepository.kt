package com.example.lesson1.domain.repository

import com.example.lesson1.domain.model.Note

interface NoteRepository {
    fun  getAllNotes():List<Note>

    fun  createNote(note: Note)

    fun  update(note: Note)

    fun deleteNote(note: Note)


}