package com.apress.spirng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apress.spirng.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
