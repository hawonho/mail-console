package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MailVO;
import kr.ac.kopo.vo.MemberVO;

public class MailDAO {

	public void insertMail(MailVO mail) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO tbl_mail(no, fid, tid, title, content) ");
		sql.append("VALUES(seq_tbl_mail_no.nextval, ?, ?, ?, ?) ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, mail.getFid());
			pstmt.setString(2, mail.getTid());
			pstmt.setString(3, mail.getTitle());
			pstmt.setString(4, mail.getContent());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<MailVO> selectRMail(MemberVO member) {
		
		List<MailVO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM TBL_MAIL WHERE TID = ? ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, member.getId());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String fid = rs.getString("fid");
				String tid = rs.getString("tid");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String ftdate = rs.getString("ft_date");
				MailVO mail = new MailVO(no, fid, tid, title, content, ftdate);
				list.add(mail);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<MailVO> selectSMail(MemberVO member) {
		
		List<MailVO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM TBL_MAIL WHERE FID = ? ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, member.getId());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String fid = rs.getString("fid");
				String tid = rs.getString("tid");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String ftdate = rs.getString("ft_date");
				MailVO mail = new MailVO(no, fid, tid, title, content, ftdate);
				list.add(mail);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<MailVO> selectTMail(MemberVO member) {
		
		List<MailVO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM TBL_MAIL WHERE FID = ? AND TID = ? ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getId());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String fid = rs.getString("fid");
				String tid = rs.getString("tid");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String ftdate = rs.getString("ft_date");
				MailVO mail = new MailVO(no, fid, tid, title, content, ftdate);
				list.add(mail);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void deleteAllMail(String id) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM TBL_MAIL WHERE TID = ? ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteOneMail(int no, String id) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM TBL_MAIL WHERE NO = ? AND TID = ? ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setInt(1, no);
			pstmt.setString(2, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
