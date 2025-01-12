package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Game;

public class GameService {
	private static List<Game> li;
	
	public GameService() {
		li = new ArrayList<>();
		li.add(new Game("SnowBird","Danny",300));
		li.add(new Game("FreshFood","Ram",450));
		li.add(new Game("Batsman","Kate",400));
		li.add(new Game("YammyTommy","Narayan",350));
	}
	
	
	public List<Game> viewAll() {
		List<Game> li1 = new ArrayList<>();
		for(Game s : li) {
			li1.add(s);
		}
		
		return li1;
	}
	
	public String authorSearch(String author) throws authorException{
		
		for(Game s : li) {
			if(s.getAuthorName().equalsIgnoreCase(author)) {
				return s.getGameName();
			}
		}
		throw new authorException("Not found");
	}
}
