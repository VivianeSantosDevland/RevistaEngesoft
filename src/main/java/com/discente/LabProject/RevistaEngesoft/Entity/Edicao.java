package com.discente.LabProject.RevistaEngesoft.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_edicao")

public class Edicao {
    @Id
    @GeneratedValue
    @Column(name = "id_edicao")
    BigInteger id;
    @Column(name = "volume_edicao")
    int volume;
    @Column(name = "numero_edicao")
    int numero;
    @Column(name = "mes_edicao")
    int mes;
    @Column(name = "ano_edicao")
    int ano;
    @Column(name = "tema_edicao")
    String tema;
    @OneToMany(mappedBy = "table_artigo", cascade = CascadeType.PERSIST)//está correto?
    private List<Artigo>artigos = new ArrayList<>();
}
