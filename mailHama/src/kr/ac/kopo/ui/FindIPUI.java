package kr.ac.kopo.ui;

public class FindIPUI extends MemberBaseUI {

	private int choiceMenu() {
		System.out.println("***** ID/PW ã�� *****");
		System.out.println("1. IDã��");
		System.out.println("2. PWã��");
		int type = scanInt("�׸��� �����ϼ��� : ");
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
				System.out.println("�ٽ� �Է��ϼ���...");
			}
//		}

	}

}
