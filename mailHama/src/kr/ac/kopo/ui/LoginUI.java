package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class LoginUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		System.out.println("***** �α��� *****");
		String id = scanStr("1. ID : ");
		String pw = scanStr("2. PW : ");
		MemberVO member = memberService.searchMember(id, pw);
		if(member != null) {
			System.out.println(member.getId() + " ������...");
			IUI ui = null;
			ui = new MainMenuUI();
			MainMenuUI.member = member;
			ui.execute();
		} else {
			System.out.println("ID �Ǵ� PW�� Ʋ�Ƚ��ϴ�...");
		}
	}
}
