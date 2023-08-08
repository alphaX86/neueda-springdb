package com.example.neuedaspringdb.service;

import com.example.neuedaspringdb.entity.Music;
import com.example.neuedaspringdb.exceptions.MusicNotFoundException;
import com.example.neuedaspringdb.repo.IMusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepo repo;

    @Override
    public Music addMusicData(Music data) {
        return repo.save(data);
    }

    @Override
    public Music deleteMusicData(String name) {

        Music m1 = repo.findByName(name);
        repo.delete(m1);
        return m1;
    }

    @Override
    public List<Music> getAllMusicData() {
        return
                repo.findAll();
    }

    @Override
    public Music getMusicByName(String name) throws MusicNotFoundException {
        return repo.findByName(name);
    }

    @Override
    public Music updateMusicData(String name, Music musicData) throws MusicNotFoundException {
        Music music = repo.findByName(name);
        music.setArtists(musicData.getArtists());
        music.setName(musicData.getName());
        music.setGenre(musicData.getGenre());

        repo.save(music);
        return music;
    }
}
