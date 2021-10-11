package com.hos.vo;

import java.util.HashMap;
import java.util.Map;

public class Rooms {
	private static Map<Long, Room>  allRoomMap= new HashMap<>();
	static {
		allRoomMap.put(1l, new Room());
		allRoomMap.put(2l, new Room());
		allRoomMap.put(3l, new Room());
		allRoomMap.put(4l, new Room());
		allRoomMap.put(5l, new Room());
		allRoomMap.put(6l, new Room());
		allRoomMap.put(7l, new Room());
		allRoomMap.put(8l, new Room());
		allRoomMap.put(9l, new Room());
		allRoomMap.put(10l, new Room());
	}
	
	public static Map<Long, Room> getAllRoomMap() {
		return allRoomMap;
	}
	
	
	
	
}
