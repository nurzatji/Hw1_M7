package com.example.lesson1.domain.usecase

import com.example.lesson1.domain.model.Note
import com.example.lesson1.domain.repository.NoteRepository

class DeleteNoteUseCase(private val noteRepository: NoteRepository) {

    fun deleteNote(note:Note) = noteRepository.deleteNote(note)
}