package com.example.lesson1.data.repository

import com.example.lesson1.data.local.NoteDao
import com.example.lesson1.data.mapper.toEntity
import com.example.lesson1.data.mapper.toNote
import com.example.lesson1.data.model.NoteEntity
import com.example.lesson1.domain.model.Note
import com.example.lesson1.domain.repository.NoteRepository

class NoteRepositoryImpl( private  val  noteDao:NoteDao):NoteRepository{

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map {
            it.toNote()
        }
    }

    override fun createNote(note: Note) {

noteDao.createNote(note.toEntity())
    }

    override fun update(note: Note) {
noteDao
    .updateNote(note.toEntity())
    }

    override fun deleteNote(note: Note) {
noteDao.deleteNote(note.toEntity())
    }
}