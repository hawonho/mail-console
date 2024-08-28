package kr.ac.kopo.ui;

public class FindIPUI extends MemberBaseUI {

	private int choiceMenu() {
		System.out.println("***** ID/PW 찾기 *****");
		System.out.println("1. ID찾기");
		System.out.println("2. PW찾기");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		
//		while(true) {
			IUI ui = null;
			int type = choiceMenu();
			switch(type) {
			case 1:
				ui = new FindIDUI();
				break;
			case 2:
				ui = new FindPWUI();
				break;
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("다시 입력하세요...");
			}
//		}

	}

}
