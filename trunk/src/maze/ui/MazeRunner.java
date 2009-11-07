/**
 *
 */
package maze.ui;

/**
 * @author ben
 *
 */
public class MazeRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IOController iocontrol = new IOController();
		String playerName = args[0];
		String mazeName = args[1];
		int object_count = Integer.parseInt(args[2]);
		if (3 == args.length) {
			String msg = String.format(
					"Running maze %s with player %s and %d objects",
					new Object[]{mazeName,playerName, object_count}
			);
			System.out.println(msg);
			int score = runMaze(iocontrol, playerName, mazeName, object_count);
			System.out.println("Finished: " + score);
		} else {
			int rep_count = Integer.parseInt(args[3]);
			int scores[] = new int[rep_count];
			String msg = String.format(
					"Repeating maze %s with player %s and %d objects, %d times",
					new Object[]{mazeName,playerName, object_count, rep_count}
			);
			System.out.println(msg);
			for (int i = 0; i < rep_count; i++) {
				scores[i] = runMaze(iocontrol, playerName, mazeName, object_count);
			}
			for (int s : scores) {
				System.out.print(Integer.toString(s));
				System.out.print(' ');
			}
			System.out.print('\n');

		}

	}

	/**
	 * @param i the IOController that will actually find the maze and player objects
	 * @param playerName the name of the class of player to be run
	 * @param mazeName the name of the maze file to be run
	 * @param object_count the number of objects to be used
	 * @return the score
	 */
	private static int runMaze(IOController i, String playerName, String mazeName, int object_count) {
		GameConfig simpleConfig = i.makeGameConfig(mazeName, playerName, object_count);
		GameController r = new GameController();
		int score = -1;
		while(0 > score) {
			score = r.GamePlay(simpleConfig);
		}
		return score;
	}

}
