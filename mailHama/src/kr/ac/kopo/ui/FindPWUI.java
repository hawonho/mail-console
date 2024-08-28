package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class FindPWUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("***** PW찾기 *****");
		String id = scanStr("1. ID : ");
		String name = scanStr("2. 이름 : ");
		String nno = scanStr("3. 주민번호 : ");
		String pno = scanStr("4. 전화번호 : ");
		
		MemberVO member = memberService.findPW(id, name, nno, pno);
		
		if(member != null) {
			System.out.println(member.getId() + "님의 PW : " + member.getPw());
		} else {
			System.out.println("회원 정보가 일치하지 않습니다...");
		}

	}

}
