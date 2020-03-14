package vend;
	
	import javax.swing.JTextField;
	
	/**
	 * 
	 * @author Kaish Panjwani
	 * @version 23-11-2019
	 *
	 */

	public class TextFields extends JTextField { // Extends TextFields Class with JTextFields Class
		
		public TextFields(String text) { // Constructor for TextFields
			this.setText(text);
			this.setHorizontalAlignment(JTextField.CENTER);
		}
}
