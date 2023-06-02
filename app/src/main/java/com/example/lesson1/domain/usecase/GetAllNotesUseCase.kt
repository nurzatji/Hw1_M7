package com.example.lesson1.domain.usecase

import com.example.lesson1.domain.repository.NoteRepository

class GetAllNotesUseCase(private val  noteRepository: NoteRepository) {

    fun getAllNotes() = noteRepository.getAllNotes()
}