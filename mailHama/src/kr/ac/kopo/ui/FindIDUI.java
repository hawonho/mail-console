package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class FindIDUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("***** ID찾기 *****");
		String name = scanStr("1. 이름 : ");
		String nno = scanStr("2. 주민번호 : ");
		String pno = scanStr("3. 전화번호 : ");
		
		MemberVO member = memberService.findID(name, nno, pno);
		
		if(member != null) {
			System.out.println(member.getName() + "님의 ID : " + member.getId());
		} else {
			System.out.println("가입되어있는 ID가 없습니다...");
		}

	}

}
