package net.example.springbootdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "folder")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Fileid;
    @Column(name = "FileName")
    private String FileName;
    @Column(name = "FilePath")
    private String FilePath;
}
