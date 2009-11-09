package maze.g0;

import java.util.Random;

import maze.ui.Move;
import maze.ui.Player;

public class RandomPlayer implements Player {

	private boolean firstmove = true;
	private Random r = new Random();
	public Move move(int object_detail, int number_of_objects, int total_rounds) {
		int obj = 0;
		int dir = 0;
		if (firstmove) {
			obj = 2;
			firstmove = false;
		} else {
			if (object_detail > 0) { // may as well not self-loop
				dir = 0;
			} else {
				dir = r.nextInt(10);
			}
		}
		return new Move(dir,obj);
	}

}
