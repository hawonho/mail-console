package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class JoinMembershipUI extends MemberBaseUI{

	@Override
	public void execute() throws Exception {
		System.out.println("***** 회원가입 *****");
		String id;
		while(true) {
			id = scanStr("1. ID : ");
			String lid = memberService.idCheck(id);
			if(lid != null) {
				System.out.println("이미 존재하는 ID입니다...");
			} else {
				System.out.println("사용 가능한 ID입니다...");
				break;
			}
		}
		String pw = scanStr("2. PW : ");
		String name = scanStr("3. 이름 : ");
		String nno = scanStr("4. 주민번호 : ");
		String pno = scanStr("5. 전화번호 : ");
		
		MemberVO member = new MemberVO(id, pw, name, nno, pno);
		memberService.addMember(member);
		
		System.out.println("회원가입 완료...");
	}
}
