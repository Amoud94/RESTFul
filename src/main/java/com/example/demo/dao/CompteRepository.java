package com.example.demo.dao;

import com.example.demo.entity.compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompteRepository  extends JpaRepository<compte,Long> {
}
