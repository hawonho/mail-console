package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.MailVO;

public class ToMeMailUI extends MailBaseUI {

	@Override
	public void execute() throws Exception {
		
		List<MailVO> list = mailService.searchTMail(MainMenuUI.member);
		
		if(list.isEmpty()) {
			System.out.println("���Ծ� ������ �����ϴ�...");
		} else {
			for(MailVO mail : list) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("no : " + mail.getNo());
				System.out.println("���� : " + mail.getTitle());
				System.out.println("���� : " + mail.getContent());
				System.out.println("�߽��� : " + mail.getFtdate());
				System.out.println("---------------------------------------------------------------");
			}
		}

	}

}
