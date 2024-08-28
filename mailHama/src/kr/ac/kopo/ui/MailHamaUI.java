package kr.ac.kopo.ui;

public class MailHamaUI extends MemberBaseUI{

	private int choiceMenu() {
		System.out.println("***** MailHama *****");
		System.out.println("1. �α���");
		System.out.println("2. ȸ������");
		System.out.println("3. ID/PW ã��");
		System.out.println("0. ���α׷� ����");
		int type = scanInt("�׸��� �����ϼ��� : ");
		return type;
	}

	@Override
	public void execute() throws Exception {
		while(true) {
			IUI ui = null;
			int type = choiceMenu();
			switch(type) {
			case 1:
				ui = new LoginUI();
				break;
			case 2:
				ui = new JoinMembershipUI();
				break;
			case 3:
				ui = new FindIPUI();
				break;
			case 0:
				ui = new ExitUI();
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("�ٽ� �Է��ϼ���...");
			}
		}
		
	}
	
	
}
