package com.example.videoapp.dao;

import com.example.videoapp.dao.entity.VideoCassette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCassetteRepository extends JpaRepository<VideoCassette, Long> {
}
