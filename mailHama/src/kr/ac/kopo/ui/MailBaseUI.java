package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.MailService;
import kr.ac.kopo.service.MailServiceFactory;

public abstract class MailBaseUI implements IUI{

	private Scanner sc;
	protected MailService mailService;
	
	public MailBaseUI() {
		sc = new Scanner(System.in);
		mailService = MailServiceFactory.getInstance();
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));
	}
}
