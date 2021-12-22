package net.example.music.controller;

import net.example.music.model.Music;
import net.example.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MusicController {
    private MusicService musicService;

    @Autowired
    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/music")
    public String getAll(Model model){
        List<Music> musics = musicService.getAll();
        model.addAttribute("musics", musics);
        return "music_main";
    }
}
