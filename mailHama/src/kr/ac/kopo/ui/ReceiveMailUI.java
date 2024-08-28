package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.MailVO;

public class ReceiveMailUI extends MailBaseUI {

	private int choiceMenu() {
		System.out.println("1. ���� ���� ����");
		System.out.println("2. �ڷ�");
		int type = scanInt("�׸��� �����ϼ��� : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		
		List<MailVO> list = mailService.searchRMail(MainMenuUI.member);
		
		if(list.isEmpty()) {
			System.out.println("���� ������ �����ϴ�...");
		} else {
			for(MailVO mail : list) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("no : " + mail.getNo());
				System.out.println("������� : " + mail.getFid());
				System.out.println("���� : " + mail.getTitle());
				System.out.println("���� : " + mail.getContent());
				System.out.println("�߽��� : " + mail.getFtdate());
				System.out.println("---------------------------------------------------------------");
			}
			
		}
		while(true) {
			IUI ui = null;
			int type = choiceMenu();
			switch(type) {
			case 1:
				ui = new DeleteMailUI();
				break;
			case 2:
				ui = new MainMenuUI();
				break;
			}
			if(ui != null) {
				ui.execute();
			}
		}

	}

}
