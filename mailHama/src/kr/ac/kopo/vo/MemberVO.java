package kr.ac.kopo.vo;

public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private String nno;
	private String pno;
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", nno=" + nno + ", pno=" + pno + "]";
	}

	public MemberVO(String id, String pw, String name, String nno, String pno) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nno = nno;
		this.pno = pno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNno() {
		return nno;
	}

	public void setNno(String nno) {
		this.nno = nno;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}
	
	
}
