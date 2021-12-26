package com.example.videoapp.api;

import com.example.videoapp.dao.entity.VideoCassette;
import com.example.videoapp.manager.VideoCassetteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassettsApi {

    private VideoCassetteManager videoCassettes;

    @Autowired
    public VideoCassettsApi(VideoCassetteManager videoCassettes){
        this.videoCassettes = videoCassettes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll(){
        return videoCassettes.findAll();
    }

    @GetMapping
    public Optional<VideoCassette> getById(@RequestParam Long index){
        return videoCassettes.findById(index);
    }

    @PostMapping
    public VideoCassette addCassette(@RequestBody VideoCassette videoCassette){
        return videoCassettes.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateCassette(@RequestBody VideoCassette videoCassette){
        return videoCassettes.save(videoCassette);
    }

    @DeleteMapping
    public void deleteCassette(@RequestParam Long index){
        videoCassettes.deleteById(index);
    }
}
