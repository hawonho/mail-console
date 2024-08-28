package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.ui.MainMenuUI;
import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MemberVO;

public class MemberDAO {

	public void insertMember(MemberVO member) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO tbl_member(id, pw, name, nno, pno) ");
		sql.append("VALUES(?, ?, ?, ?, ?) ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getNno());
			pstmt.setString(5, member.getPno());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String idCK(String id) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id FROM TBL_MEMBER WHERE id = ? ");
		String lid = null;
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) lid = rs.getString("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lid;
	}
	
	public MemberVO selectMember(String id, String pw) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM TBL_MEMBER WHERE id = ? AND PW = ? ");
		MemberVO member = null;
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String lid = rs.getString("id");
				String lpw = rs.getString("pw");
				String lname = rs.getString("name");
				String lnno = rs.getString("nno");
				String lpno = rs.getString("pno");
				
				member = new MemberVO(lid, lpw, lname, lnno, lpno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}
	
	public MemberVO findMemberID(String name, String nno, String pno) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM TBL_MEMBER WHERE name = ? AND nno = ? and pno = ? ");
		MemberVO member = null;
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, name);
			pstmt.setString(2, nno);
			pstmt.setString(3, pno);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String lid = rs.getString("id");
				String lpw = rs.getString("pw");
				String lname = rs.getString("name");
				String lnno = rs.getString("nno");
				String lpno = rs.getString("pno");
				
				member = new MemberVO(lid, lpw, lname, lnno, lpno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}
	
	public MemberVO findMemberPW(String id, String name, String nno, String pno) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM TBL_MEMBER WHERE id = ? and name = ? AND nno = ? and pno = ? ");
		MemberVO member = null;
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, nno);
			pstmt.setString(4, pno);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String lid = rs.getString("id");
				String lpw = rs.getString("pw");
				String lname = rs.getString("name");
				String lnno = rs.getString("nno");
				String lpno = rs.getString("pno");
				
				member = new MemberVO(lid, lpw, lname, lnno, lpno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}
	
	public void updateMemberInfo(String pw, String name, String pno) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE TBL_MEMBER SET pw = ?, name = ?, pno = ? WHERE id = ? and pw = ? and name = ? and nno = ? and pno = ? ");
		MemberVO member = null;
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				) {
			pstmt.setString(1, pw);
			pstmt.setString(2, name);
			pstmt.setString(3, pno);
			member = MainMenuUI.member;
			pstmt.setString(4, member.getId());
			pstmt.setString(5, member.getPw());
			pstmt.setString(6, member.getName());
			pstmt.setString(7, member.getNno());
			pstmt.setString(8, member.getPno());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
