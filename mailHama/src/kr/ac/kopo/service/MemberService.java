package kr.ac.kopo.service;

import kr.ac.kopo.dao.MemberDAO;
import kr.ac.kopo.vo.MemberVO;

public class MemberService {

	private MemberDAO memberDao;
	
	public MemberService() {
		memberDao = new MemberDAO();
	}
	
	public void addMember(MemberVO member) {
		memberDao.insertMember(member);
	}
	
	public MemberVO searchMember(String id, String pw) {
		MemberVO member = memberDao.selectMember(id, pw);
		return member;
	}
	
	public MemberVO findID(String name, String nno, String pno) {
		MemberVO member = memberDao.findMemberID(name, nno, pno);
		return member;
	}
	
	public MemberVO findPW(String id, String name, String nno, String pno) {
		MemberVO member = memberDao.findMemberPW(id, name, nno, pno);
		return member;
	}
	
	public void updateMember(String pw, String name, String pno) {
		memberDao.updateMemberInfo(pw, name, pno);
	}
	
	public String idCheck(String id) {
		String lid = memberDao.idCK(id);
		return lid;
	}
}
