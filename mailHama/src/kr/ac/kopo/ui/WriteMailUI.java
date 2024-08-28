package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MailVO;

public class WriteMailUI extends MailBaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("***** 메일쓰기 *****");
		int no = 0;
		String fid = MainMenuUI.member.getId();
		String tid = scanStr("받는사람 : ");
		String title = scanStr("제목 : ");
		String content = scanStr("내용 : ");
		String ftdate = null;
		
		MailVO mail = new MailVO(no, fid, tid, title, content, ftdate);
		mailService.addMail(mail);
		
		System.out.println("메일 전송...");
	}

}
