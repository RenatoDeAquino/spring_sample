package com.example.apimcardcartao.repositories;

import com.example.apimcardcartao.models.PropostaEnderecoTitular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface PropostaEnderecoTitularRepository extends JpaRepository<PropostaEnderecoTitular, Integer> {
}
