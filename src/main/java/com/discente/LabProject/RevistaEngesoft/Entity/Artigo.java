package com.discente.LabProject.RevistaEngesoft.Entity;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_artigo")
public class Artigo {
    @Id
    @GeneratedValue
    @Column (name = "id_artigo")
    BigInteger id;
    @Column (name = "titulo_artigo")
    String titulo;
    @Column (name = "arquivo_artigo")
    String arquivoArtigo;
@ManyToMany(mappedBy = "table_autor", cascade = CascadeType.PERSIST)
   private List<Autor>autores = new ArrayList<>();
//um artigo é avaliado por três avaliadores.
}
