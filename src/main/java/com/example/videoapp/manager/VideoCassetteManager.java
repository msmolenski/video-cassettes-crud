package com.example.videoapp.manager;

import com.example.videoapp.dao.VideoCassetteRepository;
import com.example.videoapp.dao.entity.VideoCassette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCassetteManager {

    private VideoCassetteRepository videoCassetteRepository;

    @Autowired
    public VideoCassetteManager(VideoCassetteRepository videoCassetteRepostory){
        this.videoCassetteRepository = videoCassetteRepostory;
    }

    public Optional<VideoCassette> findById(Long id){
        return videoCassetteRepository.findById(id);
    }

    public Iterable<VideoCassette> findAll() {
        return videoCassetteRepository.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette) {
        return videoCassetteRepository.save(videoCassette);
    }

    public void deleteById(Long id) {
        videoCassetteRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb(){
        save(new VideoCassette(1L, "Shrek", LocalDate.of(2005,10,02)));
        save(new VideoCassette(2L, "Matrix", LocalDate.of(1999,11,01)));
        save(new VideoCassette(3L, "Titanic", LocalDate.of(1990,8,12)));
    }
}
