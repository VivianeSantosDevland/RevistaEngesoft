package com.discente.LabProject.RevistaEngesoft.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_avaliacao")
public class Avaliacao {
   @Id
   @Column(name = "id_avaliacao")
    BigInteger id;
    @Column(name = "originalidade_avaliacao")
    int originalidade;
    @Column(name = "conteudo_avaliacao")
    int conteudo;
    @Column(name = "apresentacao_avaliacao")
    int apresentacao;
    @Column(name = "status_avaliacao")
    String status;
}
