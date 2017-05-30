import javax.swing.JOptionPane;

public class Converter {

	public String changeToHex(int intBase10) {
		String answer = "";
		if (intBase10 > 255 || intBase10 < 0) {
			JOptionPane.showMessageDialog(null, "Sorry, the number was not within the given range");
			return null;
		}
		// basic test
		if (intBase10 == 0)
			answer = "00";
		if (intBase10 == 255)
			answer = "FF";
		return answer;
	}

}
