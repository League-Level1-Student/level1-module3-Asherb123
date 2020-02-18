package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {
public static void main(String[] args) {
	
World w = new World();

w.show();
Bug b=new Bug();
w.add(new Location(5,6),b);

b.turn();





Flower f = new Flower();

w.add (new Location (4,6), f);

w.add (new Location (6,6), f);

w.add (new Location (6,6), f);
















}
}
