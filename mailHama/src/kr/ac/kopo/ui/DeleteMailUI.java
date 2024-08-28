package kr.ac.kopo.ui;

public class DeleteMailUI extends MailBaseUI {

	private int choiceMenu() {
		System.out.println("***** 메일삭제 *****");
		System.out.println("1. 메일 선택 삭제");
		System.out.println("2. 메일 전체 삭제");
		System.out.println("3. 뒤로");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}
	
	private int deleteNo() {
		System.out.println("***** 메일 선택 삭제 *****");
		int no = scanInt("삭제할 메일번호 : ");
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
				System.out.println("메일 삭제 완료...");
				break;
			case 2:
				mailService.deleteAllMail(MainMenuUI.member.getId());
				System.out.println("전체 메일 삭제 완료...");
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
