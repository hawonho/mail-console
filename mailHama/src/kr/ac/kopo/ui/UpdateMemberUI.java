package kr.ac.kopo.ui;

public class UpdateMemberUI extends MemberBaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("***** ȸ���������� *****");
		String pw = scanStr("1. PW : ");
		String name = scanStr("2. �̸� : ");
		String pno = scanStr("3. ��ȭ��ȣ : ");
		
		memberService.updateMember(pw, name, pno);
		System.out.println("ȸ������ ���� �Ϸ�...");

	}

}
