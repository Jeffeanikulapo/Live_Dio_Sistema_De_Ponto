package com.dio.sistemadeponto.Service;


import com.dio.sistemadeponto.Repository.JornadaRepository;
import com.dio.sistemadeponto.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    @Autowired
    JornadaRepository jornadaRepository;

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public List<JornadaTrabalho> findAll() {
      return   jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public void deleteJornada(long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }

}
