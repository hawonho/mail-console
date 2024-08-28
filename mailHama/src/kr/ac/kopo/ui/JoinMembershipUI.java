package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class JoinMembershipUI extends MemberBaseUI{

	@Override
	public void execute() throws Exception {
		System.out.println("***** ȸ������ *****");
		String id;
		while(true) {
			id = scanStr("1. ID : ");
			String lid = memberService.idCheck(id);
			if(lid != null) {
				System.out.println("�̹� �����ϴ� ID�Դϴ�...");
			} else {
				System.out.println("��� ������ ID�Դϴ�...");
				break;
			}
		}
		String pw = scanStr("2. PW : ");
		String name = scanStr("3. �̸� : ");
		String nno = scanStr("4. �ֹι�ȣ : ");
		String pno = scanStr("5. ��ȭ��ȣ : ");
		
		MemberVO member = new MemberVO(id, pw, name, nno, pno);
		memberService.addMember(member);
		
		System.out.println("ȸ������ �Ϸ�...");
	}
}
