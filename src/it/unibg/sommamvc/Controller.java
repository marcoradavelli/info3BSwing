package it.unibg.sommamvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	public View view;
	public Model model;
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
	
	public void activate() {
		view.addListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(textField1.getText());
				int b = Integer.parseInt(textField2.getText());
				lblNewLabel.setText("" + (a+b));
			}
		});
	}
}

