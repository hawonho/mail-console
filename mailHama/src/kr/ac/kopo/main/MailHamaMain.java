package kr.ac.kopo.main;

import kr.ac.kopo.ui.MailHamaUI;

public class MailHamaMain {

	public static void main(String[] args) {
		MailHamaUI ui = new MailHamaUI();
		try {
			ui.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
