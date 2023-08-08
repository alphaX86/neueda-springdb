package com.example.neuedaspringdb;

import com.example.neuedaspringdb.entity.Music;
import com.example.neuedaspringdb.exceptions.MusicNotFoundException;
import com.example.neuedaspringdb.service.MusicService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class NeuedaSpringdbApplication {

	private static Object context;

	public static void main(String[] args) throws MusicNotFoundException {

		ApplicationContext context = SpringApplication.run(NeuedaSpringdbApplication.class, args);
		System.out.println("App is started...");
		MusicService musicService = context.getBean(MusicService.class);
		List<String> artist = new ArrayList<String>();
		artist.add("Gordon");
		musicService.addMusicData(new Music("1", "test1", artist, "metal"));
		musicService.getMusicByName("test");
	}

}
