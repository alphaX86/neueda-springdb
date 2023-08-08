package com.example.neuedaspringdb.service;

import com.example.neuedaspringdb.entity.Music;
import com.example.neuedaspringdb.exceptions.MusicNotFoundException;

import java.util.List;

public interface IMusicService {

    public Music addMusicData(Music data);

    public Music deleteMusicData(String name);

    public List<Music> getAllMusicData();

    public Music getMusicByName(String name) throws MusicNotFoundException;

    public Music updateMusicData(String name, Music movieData) throws MusicNotFoundException;
}