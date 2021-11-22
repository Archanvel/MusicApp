package net.example.springbootdemo.repository;

import net.example.springbootdemo.model.File;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FileRepository extends JpaRepository<File, Long> {

}
