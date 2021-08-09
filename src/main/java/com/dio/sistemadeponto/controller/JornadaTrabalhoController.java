package com.dio.sistemadeponto.controller;


import com.dio.sistemadeponto.Service.JornadaService;
import com.dio.sistemadeponto.model.JornadaTrabalho;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;


    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);

    }

    @GetMapping()
    public List<JornadaTrabalho> getJornadalis() {
        return jornadaService.findAll();

    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJobadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new Exception("jornada não encontrada.")));


    }
    @PutMapping
    public JornadaTrabalho upadateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {

       try {
           jornadaService.deleteJornada(idJornada);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
       return (ResponseEntity<JornadaTrabalho>)ResponseEntity.ok();


    }
}




