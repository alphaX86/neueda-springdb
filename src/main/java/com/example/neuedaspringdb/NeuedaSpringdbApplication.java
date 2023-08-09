package com.example.neuedaspringdb;

import com.example.neuedaspringdb.entity.Music;
import com.example.neuedaspringdb.exceptions.MusicNotFoundException;
import com.example.neuedaspringdb.service.MusicService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class NeuedaSpringdbApplication {

	private static Object context;

	public static void main(String[] args) throws MusicNotFoundException {

		ApplicationContext context = SpringApplication.run(NeuedaSpringdbApplication.class, args);
		System.out.println("App is started...");
		MusicService musicService = context.getBean(MusicService.class);
		List<String> artist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter option: (1) Insert (2) View (Other) Exit");
		int op = sc.nextInt();
		String id, name, genre;
		switch (op) {
			case 1:
				System.out.println("Enter the following: ID, Name, Artist, Genre");
				id = sc.next();
				name = sc.next();
				artist.add(sc.next());
				genre = sc.next();
				musicService.addMusicData(new Music(id, name, artist, genre));
				System.out.println("Added!");
				break;
			case 2:
				musicService.getAllMusicData();
				break;
			default:
				System.out.println("Exiting...");
				break;
		}
		artist.clear();
	}
}
