package com.yolo.vo;

public class BoardVO {	// 게시판
	private int board_idx;					// 글 idx 
	private int board_employee_idx;			// 작성자 idx
	private String board_type;				// 카테고리
	private String board_title;				// 글 제목
	private String board_content;			// 글 내용
	private String board_notice;			// 공지 여부
	private String board_dataBoard_alter;	// 수정 여부
	private String board_reportingDate;		// 작성 날짜
	
	public BoardVO() {	}

	public BoardVO(int board_idx, int board_employee_idx, String board_type, String board_title, String board_content,
			String board_notice, String board_dataBoard_alter, String board_reportingDate) {
		this.board_idx = board_idx;
		this.board_employee_idx = board_employee_idx;
		this.board_type = board_type;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_notice = board_notice;
		this.board_dataBoard_alter = board_dataBoard_alter;
		this.board_reportingDate = board_reportingDate;
	}

	public int getBoard_idx() {
		return board_idx;
	}

	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}

	public int getBoard_employee_idx() {
		return board_employee_idx;
	}

	public void setBoard_employee_idx(int board_employee_idx) {
		this.board_employee_idx = board_employee_idx;
	}

	public String getBoard_type() {
		return board_type;
	}

	public void setBoard_type(String board_type) {
		this.board_type = board_type;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBoard_notice() {
		return board_notice;
	}

	public void setBoard_notice(String board_notice) {
		this.board_notice = board_notice;
	}

	public String getBoard_dataBoard_alter() {
		return board_dataBoard_alter;
	}

	public void setBoard_dataBoard_alter(String board_dataBoard_alter) {
		this.board_dataBoard_alter = board_dataBoard_alter;
	}

	public String getBoard_reportingDate() {
		return board_reportingDate;
	}

	public void setBoard_reportingDate(String board_reportingDate) {
		this.board_reportingDate = board_reportingDate;
	}

	@Override
	public String toString() {
		return "BoardVO [board_idx=" + board_idx + ", board_employee_idx=" + board_employee_idx + ", board_type="
				+ board_type + ", board_title=" + board_title + ", board_content=" + board_content + ", board_notice="
				+ board_notice + ", board_dataBoard_alter=" + board_dataBoard_alter + ", board_reportingDate="
				+ board_reportingDate + "]";
	}

	
	
	
}
