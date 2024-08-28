package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class MainMenuUI extends MemberBaseUI {
	
	public static MemberVO member = null;
	
	private int choiceMenu() {
		System.out.println("***** 메뉴 *****");
		System.out.println("1. 메일쓰기");
		System.out.println("2. 받은메일함");
		System.out.println("3. 보낸메일함");
		System.out.println("4. 내게쓴 메일함");
		System.out.println("5. 회원정보 수정");
		System.out.println("6. 로그아웃");
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
				ui = new WriteMailUI();
				break;
			case 2:
				ui = new ReceiveMailUI();
				break;
			case 3:
				ui = new SendMailUI();
				break;
			case 4:
				ui = new ToMeMailUI();
				break;
			case 5:
				ui = new UpdateMemberUI();
				break;
			case 6:
				ui = new LogoutUI();
				break;
			}
			
			if(ui != null) {
				ui.execute();
			}
		}
		
	}

}
