package kr.ac.kopo.ui;

public class DeleteMailUI extends MailBaseUI {

	private int choiceMenu() {
		System.out.println("***** ���ϻ��� *****");
		System.out.println("1. ���� ���� ����");
		System.out.println("2. ���� ��ü ����");
		System.out.println("3. �ڷ�");
		int type = scanInt("�׸��� �����ϼ��� : ");
		return type;
	}
	
	private int deleteNo() {
		System.out.println("***** ���� ���� ���� *****");
		int no = scanInt("������ ���Ϲ�ȣ : ");
		return no;
	}
	@Override
	public void execute() throws Exception {

		while(true) {
			IUI ui = null;
			int type = choiceMenu();
			switch(type) {
			case 1:
				mailService.deleteOneMail(deleteNo(), MainMenuUI.member.getId());
				System.out.println("���� ���� �Ϸ�...");
				break;
			case 2:
				mailService.deleteAllMail(MainMenuUI.member.getId());
				System.out.println("��ü ���� ���� �Ϸ�...");
				break;
			case 3:
				ui = new ReceiveMailUI();
				break;
			}
			if(ui != null) {
				ui.execute();
			}
		}
		
	}

}
