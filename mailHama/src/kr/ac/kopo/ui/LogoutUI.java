package kr.ac.kopo.ui;

public class LogoutUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		
		MainMenuUI.member = null;
		
		System.out.println("�α׾ƿ� �Ϸ�...");
		MailHamaUI ui = new MailHamaUI();
		ui.execute();

	}

}
