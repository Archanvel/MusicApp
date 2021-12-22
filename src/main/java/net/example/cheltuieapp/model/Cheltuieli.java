package net.example.cheltuieapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cheltuieli")
public class Cheltuieli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcec;

    @Column(name = "lista_produselor")
    private String lista_produselor;

    @Column(name = "pret_unitate")
    private Long pret_unitate;

    @Column(name = "unitati")
    private Long unitati;

    @Column(name = "pret_total")
    private Long pret_total;

}
