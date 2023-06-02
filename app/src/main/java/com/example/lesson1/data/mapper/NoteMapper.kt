package com.example.lesson1.data.mapper


import com.example.lesson1.data.model.NoteEntity
import com.example.lesson1.domain.model.Note

fun Note.toEntity( ) = NoteEntity(id, title, description)


fun  NoteEntity.toNote() = Note(this.id,title,description)



