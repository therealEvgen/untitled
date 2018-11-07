package com.company;

public class Board {
    Room[][] map;
    public Board (Room[][] map) {this.map = map;}
    public Board(int height, int width) {map = new Room[height][width];}

    public void addRooom(Room room, int row, int col)
    {
        map[row][col] = room;
    }
    public void printBoard()
    {...}
}
