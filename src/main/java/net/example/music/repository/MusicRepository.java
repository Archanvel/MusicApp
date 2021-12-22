package net.example.music.repository;

import net.example.music.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MusicRepository extends JpaRepository<Music, Long> {

}
