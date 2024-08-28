package kr.ac.kopo.ui;

public class MailHamaUI extends MemberBaseUI{

	private int choiceMenu() {
		System.out.println("***** MailHama *****");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. ID/PW 찾기");
		System.out.println("0. 프로그램 종료");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}

	@Override
	public void execute() throws Exception {
		while(true) {
			IUI ui = null;
			int type = choiceMenu();
			switch(type) {
			case 1:
				ui = new LoginUI();
				break;
			case 2:
				ui = new JoinMembershipUI();
				break;
			case 3:
				ui = new FindIPUI();
				break;
			case 0:
				ui = new ExitUI();
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("다시 입력하세요...");
			}
		}
		
	}
	
	
}
