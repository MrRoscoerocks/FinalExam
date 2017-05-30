import javax.swing.JOptionPane;

/* INSTRUCTIONS
 * 1. Create FinalExam_lastName Java Project✓
 * 2. Create class "Runner," and class "Converter"✓
 * 3. Instantiate both classes in main✓
 * 4. Use JOP's for all I/O -- do not leave any syso you might have
 *    used for debugging✓
 * 5. In myRunner.enterInteger(); tell allowable range is 0 - 255,
 *    and test for that range; if outside of that range tell them
 *    and ask for another try at entering a base-10 number 0-255✓
 * 6. Complete all necessary code, below
 * 7. Create and use a Git repository
 * 8. Create and use a GitHub repository
 * 9. Show Mr. M for a grade!
 */

public class Runner {

	public static void main(String[] args) {

		int intBase10 = 0;
		String hexAnswer = "";
		boolean keepLooping = true;

		while (keepLooping) {

			Runner myRunner = new Runner();
			Converter myConverter = new Converter();

			myRunner.welcome();

			intBase10 = myRunner.enterInteger();

			hexAnswer = myConverter.changeToHex(intBase10);

			JOptionPane.showMessageDialog(null, "Original Entry: " + intBase10 + ", new hex conversion: " + hexAnswer);

			int x = JOptionPane.showConfirmDialog(null, "Do you want to enter another 0-255 Yes or No", "Continue?",
					JOptionPane.YES_NO_OPTION);
			if (x == JOptionPane.YES_OPTION) {
				keepLooping = true;
			} else if (x == JOptionPane.NO_OPTION) {
				keepLooping = false;
			}

		} // end of while loop
	}

	private int enterInteger() {
		String inputS = JOptionPane.showInputDialog("Please enter a base 10 integer, ranged from 0-255");
		int length = inputS.length();
		int inputI = 0;
		int i = 0;
		for (; i < length; i++) {
			char c = inputS.charAt(i);
			if (c < '0' || c > '9') {
				JOptionPane.showMessageDialog(null, "Input was not an Integer, try again.");
				Runner myRunner = new Runner();
			} else {
				inputI = Integer.parseInt(inputS);
			}
		}

		if (inputI > 255 || inputI < 0) {
			JOptionPane.showMessageDialog(null, "Sorry, the number was not within the given range");
		}
		return inputI;
	}

	private void welcome() {
		JOptionPane.showMessageDialog(null,
				"Welcome, this program converts base-10 integers between 0-255 to hexadecimal");
	}

}
