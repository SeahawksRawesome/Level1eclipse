package level1;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Planet_Grid_World {
	public static void main(String[] args){
		 World earth = new World();
		 earth.show();
		 Bug fly = new Bug();
		 Bug insect = new Bug();
		 Flower daisy = new Flower();
		 Location somewhere = new Location(3, 5);
		 Location there = new Location(5, 5);
		 //earth.add( somewhere, fly);
		// earth.add(there, insect);
		// fly.setColor( Color.blue  );
		 //fly.turn();
		 //fly.turn();
		 //earth.add(new Location(3, 4) , daisy );
		 //earth.add(new Location(3, 6) , new Flower() );
		 for(int y=0; y < 10; y++){
			 for(int x = 0; x < 10; x++){
				 System.out.println(y + " " + x);
				 if(x == y){
						 earth.add(new Location(x, y), new Bug( Color.RED) );
			 }
				 else if(x + y == 9){
								 earth.add(new Location(x, y), new Bug( Color.RED) );
				 }
			 
			 }
			 //for(int yy=1; yy < 10; yy++){
				// for(int xx = 1; xx < 10; xx++){
					// System.out.println(yy + " " + xx);
					 //earth.add(new Location(xx, yy), new Bug(Color.BLUE) );
				 //}
		 //}
		/* earth.add(new Location(0,0), new Bug());
		 earth.add(new Location(0,9), new Bug());
		 earth.add(new Location(1,1), new Bug());
		 earth.add(new Location(1,8), new Bug());
		 earth.add(new Location(2,2), new Bug());
		 earth.add(new Location(2,7), new Bug());
		 earth.add(new Location(3,3), new Bug());
		 earth.add(new Location(3,6), new Bug());
		 earth.add(new Location(4,4), new Bug());
		 earth.add(new Location(4,5), new Bug());
		 earth.add(new Location(5,4), new Bug());
		 earth.add(new Location(5,5), new Bug());
		 earth.add(new Location(6,6), new Bug());
		 earth.add(new Location(6,3), new Bug());
		 earth.add(new Location(7,7), new Bug());
		 earth.add(new Location(7,2), new Bug());
		 earth.add(new Location(8,1), new Bug());
		 earth.add(new Location(9,9), new Bug());
		 earth.add(new Location(8,8), new Bug());
		 earth.add(new Location(9,0), new Bug());
		*/ 
			 }
}
}