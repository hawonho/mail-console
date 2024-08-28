package kr.ac.kopo.vo;

public class MailVO {

	private int no;
	private String fid;
	private String tid;
	private String title;
	private String content;
	private String ftdate;
	
	public MailVO(int no, String fid, String tid, String title, String content, String ftdate) {
		super();
		this.no = no;
		this.fid = fid;
		this.tid = tid;
		this.title = title;
		this.content = content;
		this.ftdate = ftdate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFtdate() {
		return ftdate;
	}

	public void setFtdate(String ftdate) {
		this.ftdate = ftdate;
	}
	
}
