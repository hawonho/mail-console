package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.MailVO;

public class ToMeMailUI extends MailBaseUI {

	@Override
	public void execute() throws Exception {
		
		List<MailVO> list = mailService.searchTMail(MainMenuUI.member);
		
		if(list.isEmpty()) {
			System.out.println("내게쓴 메일이 없습니다...");
		} else {
			for(MailVO mail : list) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("no : " + mail.getNo());
				System.out.println("제목 : " + mail.getTitle());
				System.out.println("내용 : " + mail.getContent());
				System.out.println("발신일 : " + mail.getFtdate());
				System.out.println("---------------------------------------------------------------");
			}
		}

	}

}
