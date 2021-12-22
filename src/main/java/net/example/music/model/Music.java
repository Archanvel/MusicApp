package net.example.music.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsong;

    @Column(name = "autorsong")
    private String autorsong;

    @Column(name = "namesong")
    private String namesong;

    @Column(name = "date")
    private String date;

}
