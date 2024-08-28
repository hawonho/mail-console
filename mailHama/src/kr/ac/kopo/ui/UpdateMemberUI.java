package kr.ac.kopo.ui;

public class UpdateMemberUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("***** 회원정보수정 *****");
		String pw = scanStr("1. PW : ");
		String name = scanStr("2. 이름 : ");
		String pno = scanStr("3. 전화번호 : ");
		
		memberService.updateMember(pw, name, pno);
		System.out.println("회원정보 수정 완료...");

	}

}
