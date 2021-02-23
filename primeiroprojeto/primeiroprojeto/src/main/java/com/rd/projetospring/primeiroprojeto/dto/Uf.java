package com.rd.projetospring.primeiroprojeto.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Uf {

    private BigInteger idUf;
    private String dsUf;
}