package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class LoginUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		System.out.println("***** 로그인 *****");
		String id = scanStr("1. ID : ");
		String pw = scanStr("2. PW : ");
		MemberVO member = memberService.searchMember(id, pw);
		if(member != null) {
			System.out.println(member.getId() + " 접속중...");
			IUI ui = null;
			ui = new MainMenuUI();
			MainMenuUI.member = member;
			ui.execute();
		} else {
			System.out.println("ID 또는 PW가 틀렸습니다...");
		}
	}
}
