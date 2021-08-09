package com.dio.sistemadeponto.Repository;

import com.dio.sistemadeponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface JornadaRepository extends JpaRepository<JornadaTrabalho,Long> {
}
