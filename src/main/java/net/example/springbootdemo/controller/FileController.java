package net.example.springbootdemo.controller;

import net.example.springbootdemo.model.File;
import net.example.springbootdemo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class FileController {
    private FileService fileService;

    @Autowired
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/files")
    public String findAll(Model model){
        List<File> files = fileService.findAll();
        model.addAttribute("files", files);
        return "file-list";
    }
    @GetMapping("/file-create")
    public String createFolderForm(File file){
        return "file-create";
    }
    @PostMapping("/file-create")
    public String createFolder(File file){
        fileService.saveFolder(file);
        return "redirect:/files";
    }
    @GetMapping("file-delete/{Fileid}")
    public String deleteFile(@PathVariable("Fileid") Long Fileid){
        fileService.deleteById(Fileid);
        return "redirect:/files";
    }
    @GetMapping("/folder-list")
    public String findFolder(){
        return "folder-list";
    };
}
