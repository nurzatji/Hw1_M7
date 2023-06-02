package com.example.lesson1.domain.usecase

import com.example.lesson1.domain.model.Note
import com.example.lesson1.domain.repository.NoteRepository

class UpdateNoteUseCase(private val noteRepository: NoteRepository) {

    fun  updateNote(note:Note) = noteRepository.update(note)
}