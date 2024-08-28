package kr.ac.kopo.ui;

public class LogoutUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		
		MainMenuUI.member = null;
		
		System.out.println("로그아웃 완료...");
		MailHamaUI ui = new MailHamaUI();
		ui.execute();

	}

}
