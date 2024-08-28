package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.MailDAO;
import kr.ac.kopo.vo.MailVO;
import kr.ac.kopo.vo.MemberVO;

public class MailService {

	private MailDAO mailDao;
	
	public MailService() {
		mailDao = new MailDAO();
	}
	
	public void addMail(MailVO mail) {
		mailDao.insertMail(mail);
	}
	
	public List<MailVO> searchRMail(MemberVO member) {
		List<MailVO> list = mailDao.selectRMail(member);
		return list;
	}
	
	public List<MailVO> searchSMail(MemberVO member) {
		List<MailVO> list = mailDao.selectSMail(member);
		return list;
	}
	
	public List<MailVO> searchTMail(MemberVO member) {
		List<MailVO> list = mailDao.selectTMail(member);
		return list;
	}
	
	public void deleteAllMail(String id) {
		mailDao.deleteAllMail(id);
	}
	
	public void deleteOneMail(int no, String id) {
		mailDao.deleteOneMail(no, id);
	}
}
