package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.MailVO;

public class ReceiveMailUI extends MailBaseUI {

	private int choiceMenu() {
		System.out.println("1. 받은 메일 삭제");
		System.out.println("2. 뒤로");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		
		List<MailVO> list = mailService.searchRMail(MainMenuUI.member);
		
		if(list.isEmpty()) {
			System.out.println("받은 메일이 없습니다...");
		} else {
			for(MailVO mail : list) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("no : " + mail.getNo());
				System.out.println("보낸사람 : " + mail.getFid());
				System.out.println("제목 : " + mail.getTitle());
				System.out.println("내용 : " + mail.getContent());
				System.out.println("발신일 : " + mail.getFtdate());
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
