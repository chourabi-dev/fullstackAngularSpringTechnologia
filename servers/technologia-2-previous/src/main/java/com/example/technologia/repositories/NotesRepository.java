package com.example.technologia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.technologia.entities.Notes;

public interface NotesRepository extends JpaRepository<Notes,Long> {

}
