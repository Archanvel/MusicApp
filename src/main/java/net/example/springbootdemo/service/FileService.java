package net.example.springbootdemo.service;

import net.example.springbootdemo.model.File;
import net.example.springbootdemo.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {
    private FileRepository fileRepository;


    @Autowired
    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }
    public File findById(Long Fileid){
        return fileRepository.findById(Fileid).orElse(null);
    }
    public List<File> findAll(){
        return fileRepository.findAll();
    }
    public File saveFolder(File file){
        return fileRepository.save(file);
    }
    public void deleteById(Long Fileid){
        fileRepository.deleteById(Fileid);
    }
}
