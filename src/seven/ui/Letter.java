/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seven.ui;

/**
 *
 * @author Satyajeet
 */
public class Letter {

    Character alphabet;
    int value;
    public Letter(Character c, int s)
    {
        alphabet = c;
        value = s;
    }
	/**
	 * @return the alphabet
	 */
	public Character getAlphabet() {
		return alphabet;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

}
