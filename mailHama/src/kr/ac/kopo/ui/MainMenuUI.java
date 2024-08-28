package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class MainMenuUI extends MemberBaseUI {
	
	public static MemberVO member = null;
	
	private int choiceMenu() {
		System.out.println("***** �޴� *****");
		System.out.println("1. ���Ͼ���");
		System.out.println("2. ����������");
		System.out.println("3. ����������");
		System.out.println("4. ���Ծ� ������");
		System.out.println("5. ȸ������ ����");
		System.out.println("6. �α׾ƿ�");
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
				ui = new WriteMailUI();
				break;
			case 2:
				ui = new ReceiveMailUI();
				break;
			case 3:
				ui = new SendMailUI();
				break;
			case 4:
				ui = new ToMeMailUI();
				break;
			case 5:
				ui = new UpdateMemberUI();
				break;
			case 6:
				ui = new LogoutUI();
				break;
			}
			
			if(ui != null) {
				ui.execute();
			}
		}
		
	}

}
