package com.example.champeons;

import com.example.champeons.entity.Equipa;
import com.example.champeons.entity.Pais;
import com.example.champeons.service.JogosService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class ChampeonsApplication {
	public static ArrayList<Equipa> equipaList = new ArrayList<>();

	static {
		equipaList.add(new Equipa(1, "Liverpool", 12, Pais.ENGLAND, new ArrayList<>(Arrays.asList(Pais.SCOTLAND))));
		equipaList.add(new Equipa(2, "Sporting CP", 10, Pais.PORTUGAL, new ArrayList<>(Arrays.asList(Pais.GIBRALTAR))));
		equipaList.add(new Equipa(3, "Monaco", 10, Pais.FRANCE, new ArrayList<>()));
		equipaList.add(new Equipa(4, "Brest", 10, Pais.FRANCE, new ArrayList<>()));
		equipaList.add(new Equipa(5, "Inter", 10, Pais.ITALY, new ArrayList<>()));
		equipaList.add(new Equipa(6, "Barcelona", 9, Pais.SPAIN, new ArrayList<>()));
		equipaList.add(new Equipa(7, "B. Dortmund", 9, Pais.GERMANY, new ArrayList<>()));
		equipaList.add(new Equipa(8, "Aston Villa", 9, Pais.ENGLAND, new ArrayList<>(Arrays.asList(Pais.SCOTLAND))));
		equipaList.add(new Equipa(9, "Atalanta", 8, Pais.ITALY, new ArrayList<>()));
		equipaList.add(new Equipa(10, "Man City", 7, Pais.ENGLAND, new ArrayList<>(Arrays.asList(Pais.SCOTLAND))));
		equipaList.add(new Equipa(11, "Juventus", 7, Pais.ITALY, new ArrayList<>()));
		equipaList.add(new Equipa(12, "Arsenal", 7, Pais.ENGLAND, new ArrayList<>(Arrays.asList(Pais.SCOTLAND))));
		equipaList.add(new Equipa(13, "Leverkusen", 7, Pais.GERMANY, new ArrayList<>()));
		equipaList.add(new Equipa(14, "Lille", 7, Pais.FRANCE, new ArrayList<>()));
		equipaList.add(new Equipa(15, "Celtic", 7, Pais.SCOTLAND, new ArrayList<>(Arrays.asList(Pais.ENGLAND))));
		equipaList.add(new Equipa(16, "GNK Dinamo", 7, Pais.CROATIA, new ArrayList<>(Arrays.asList(Pais.SERBIA))));
		equipaList.add(new Equipa(17, "Bayern Munchen", 6, Pais.GERMANY, new ArrayList<>()));
		equipaList.add(new Equipa(18, "Real Madrid", 6, Pais.SPAIN, new ArrayList<>()));
		equipaList.add(new Equipa(19, "Benfica", 6, Pais.PORTUGAL, new ArrayList<>()));
		equipaList.add(new Equipa(20, "Milan", 6, Pais.ITALY, new ArrayList<>()));
		equipaList.add(new Equipa(21, "Feyenoord", 6, Pais.NETHERLANDS, new ArrayList<>()));
		equipaList.add(new Equipa(22, "Club Brugge", 6, Pais.BELGIUM, new ArrayList<>()));
		equipaList.add(new Equipa(23, "Atleti", 6, Pais.SPAIN, new ArrayList<>()));
		equipaList.add(new Equipa(24, "PSV", 5, Pais.NETHERLANDS, new ArrayList<>()));
		equipaList.add(new Equipa(25, "Paris", 4, Pais.FRANCE, new ArrayList<>()));
		equipaList.add(new Equipa(26, "Sparta Praha", 4, Pais.CZECH_REPUBLIC, new ArrayList<>()));
		equipaList.add(new Equipa(27, "Stuttgart", 4, Pais.GERMANY, new ArrayList<>()));
		equipaList.add(new Equipa(28, "Shakhtar", 4, Pais.UKRAINE, new ArrayList<>(Arrays.asList(Pais.RUSSIA))));
		equipaList.add(new Equipa(29, "Girona", 3, Pais.SPAIN, new ArrayList<>()));
		equipaList.add(new Equipa(30, "Salzburg", 3, Pais.AUSTRIA, new ArrayList<>()));
		equipaList.add(new Equipa(31, "Bologna", 1, Pais.ITALY, new ArrayList<>()));
		equipaList.add(new Equipa(32, "Leipzig", 0, Pais.GERMANY, new ArrayList<>()));
		equipaList.add(new Equipa(33, "Sturm Graz", 0, Pais.AUSTRIA, new ArrayList<>()));
		equipaList.add(new Equipa(34, "Young Boys", 0, Pais.SWITZERLAND, new ArrayList<>()));
		equipaList.add(new Equipa(35, "Crvena Zvezda", 0, Pais.SERBIA, new ArrayList<>(Arrays.asList(Pais.CROATIA))));
		equipaList.add(new Equipa(36, "S. Bratislava", 0, Pais.SLOVAKIA, new ArrayList<>(Arrays.asList(Pais.HUNGARY))));
	}

	public static void main(String[] args) {
		SpringApplication.run(ChampeonsApplication.class, args);
	}

}
