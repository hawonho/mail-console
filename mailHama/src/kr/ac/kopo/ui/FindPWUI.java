package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class FindPWUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("***** PWã�� *****");
		String id = scanStr("1. ID : ");
		String name = scanStr("2. �̸� : ");
		String nno = scanStr("3. �ֹι�ȣ : ");
		String pno = scanStr("4. ��ȭ��ȣ : ");
		
		MemberVO member = memberService.findPW(id, name, nno, pno);
		
		if(member != null) {
			System.out.println(member.getId() + "���� PW : " + member.getPw());
		} else {
			System.out.println("ȸ�� ������ ��ġ���� �ʽ��ϴ�...");
		}

	}

}
