package net.example.music.service;

import net.example.music.model.Music;
import net.example.music.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    private MusicRepository musicRepository;


    @Autowired
    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }
    public List<Music> getAll(){
        return musicRepository.findAll();
    }
}
