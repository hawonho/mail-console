package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MailVO;

public class WriteMailUI extends MailBaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("***** ���Ͼ��� *****");
		int no = 0;
		String fid = MainMenuUI.member.getId();
		String tid = scanStr("�޴»�� : ");
		String title = scanStr("���� : ");
		String content = scanStr("���� : ");
		String ftdate = null;
		
		MailVO mail = new MailVO(no, fid, tid, title, content, ftdate);
		mailService.addMail(mail);
		
		System.out.println("���� ����...");
	}

}
