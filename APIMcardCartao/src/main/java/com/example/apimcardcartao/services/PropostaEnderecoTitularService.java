package com.example.apimcardcartao.services;

import com.example.apimcardcartao.models.PropostaEnderecoTitular;
import com.example.apimcardcartao.repositories.PropostaEnderecoTitularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropostaEnderecoTitularService {
    final
    PropostaEnderecoTitularRepository propostaEnderecoTitularRepository;

    public PropostaEnderecoTitularService(PropostaEnderecoTitularRepository propostaEnderecoTitularRepository) {
        this.propostaEnderecoTitularRepository = propostaEnderecoTitularRepository;
    }

    public List<PropostaEnderecoTitular> getAll() {
        return propostaEnderecoTitularRepository.findAll();
    }
}
