package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.service.MemberServiceFactory;

public abstract class MemberBaseUI implements IUI{

	private Scanner sc;
	protected MemberService memberService;
	
	public MemberBaseUI() {
		sc = new Scanner(System.in);
		memberService = MemberServiceFactory.getInstance();
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));
	}
}
