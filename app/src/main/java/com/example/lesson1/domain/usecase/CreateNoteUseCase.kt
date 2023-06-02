package com.example.lesson1.domain.usecase

import com.example.lesson1.domain.model.Note
import com.example.lesson1.domain.repository.NoteRepository

 class CreateNoteUseCase(private  val noteRepository: NoteRepository){

   fun createNote(note: Note) = noteRepository.createNote(note)
    }
