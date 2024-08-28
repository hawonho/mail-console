package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class FindIDUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("***** IDã�� *****");
		String name = scanStr("1. �̸� : ");
		String nno = scanStr("2. �ֹι�ȣ : ");
		String pno = scanStr("3. ��ȭ��ȣ : ");
		
		MemberVO member = memberService.findID(name, nno, pno);
		
		if(member != null) {
			System.out.println(member.getName() + "���� ID : " + member.getId());
		} else {
			System.out.println("���ԵǾ��ִ� ID�� �����ϴ�...");
		}

	}

}
