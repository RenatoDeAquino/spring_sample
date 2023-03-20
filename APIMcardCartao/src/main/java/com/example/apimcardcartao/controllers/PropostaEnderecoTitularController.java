package com.example.apimcardcartao.controllers;

import com.example.apimcardcartao.models.PropostaEnderecoTitular;
import com.example.apimcardcartao.services.PropostaEnderecoTitularService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/proposta/endereco")
public class PropostaEnderecoTitularController {
    final PropostaEnderecoTitularService propostaEnderecoTitularService;


    public PropostaEnderecoTitularController(PropostaEnderecoTitularService propostaEnderecoTitularService) {
        this.propostaEnderecoTitularService = propostaEnderecoTitularService;
    }

    @GetMapping()
    public ResponseEntity<List<PropostaEnderecoTitular>> loadEnderecoTitular(){
        var request = propostaEnderecoTitularService.getAll();
       return ResponseEntity.status(HttpStatus.OK).body(request);
    }

}
