package com.aplication.teste.controller;

import com.aplication.teste.domain.universidade.ProfessorForm;
import com.aplication.teste.domain.universidade.ProfessorService;
import com.aplication.teste.exception.AlreadyHaveException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/v1/Professor")
public class ProfessorController {

    ProfessorService service;

    @PostMapping
    public ResponseEntity createProfessor(@RequestBody ProfessorForm form) throws AlreadyHaveException {
        var professor = service.createProfessor(form);
        return ResponseEntity.ok(professor);
    }
}
