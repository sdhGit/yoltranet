package com.yolo.vo;

public class DataBoardVO {	// 자료실

	private int dataBoard_idx;				// 자료 idx
	private int dataBoard_employee_idx;		// 작성자 idx
	private String dataBoard_title;			// 자료 제목
	private String dataBoard_content;		// 자료 내용
	private String dataBoard_alter;			// 자료 수정 여부
	private String dataBoard_reportingDate;	// 자료 작성 날짜
	private String dataBoard_filePath;		// 자료 경로
	
	public DataBoardVO() {	}

	public DataBoardVO(int dataBoard_idx, int dataBoard_employee_idx, String dataBoard_title, String dataBoard_content,
			String dataBoard_alter, String dataBoard_reportingDate, String dataBoard_filePath) {
		super();
		this.dataBoard_idx = dataBoard_idx;
		this.dataBoard_employee_idx = dataBoard_employee_idx;
		this.dataBoard_title = dataBoard_title;
		this.dataBoard_content = dataBoard_content;
		this.dataBoard_alter = dataBoard_alter;
		this.dataBoard_reportingDate = dataBoard_reportingDate;
		this.dataBoard_filePath = dataBoard_filePath;
	}

	public int getDataBoard_idx() {
		return dataBoard_idx;
	}

	public void setDataBoard_idx(int dataBoard_idx) {
		this.dataBoard_idx = dataBoard_idx;
	}

	public int getDataBoard_employee_idx() {
		return dataBoard_employee_idx;
	}

	public void setDataBoard_employee_idx(int dataBoard_employee_idx) {
		this.dataBoard_employee_idx = dataBoard_employee_idx;
	}

	public String getDataBoard_title() {
		return dataBoard_title;
	}

	public void setDataBoard_title(String dataBoard_title) {
		this.dataBoard_title = dataBoard_title;
	}

	public String getDataBoard_content() {
		return dataBoard_content;
	}

	public void setDataBoard_content(String dataBoard_content) {
		this.dataBoard_content = dataBoard_content;
	}

	public String getDataBoard_alter() {
		return dataBoard_alter;
	}

	public void setDataBoard_alter(String dataBoard_alter) {
		this.dataBoard_alter = dataBoard_alter;
	}

	public String getDataBoard_reportingDate() {
		return dataBoard_reportingDate;
	}

	public void setDataBoard_reportingDate(String dataBoard_reportingDate) {
		this.dataBoard_reportingDate = dataBoard_reportingDate;
	}

	public String getDataBoard_filePath() {
		return dataBoard_filePath;
	}

	public void setDataBoard_filePath(String dataBoard_filePath) {
		this.dataBoard_filePath = dataBoard_filePath;
	}

	@Override
	public String toString() {
		return "DataBoardVO [dataBoard_idx=" + dataBoard_idx + ", dataBoard_employee_idx=" + dataBoard_employee_idx
				+ ", dataBoard_title=" + dataBoard_title + ", dataBoard_content=" + dataBoard_content
				+ ", dataBoard_alter=" + dataBoard_alter + ", dataBoard_reportingDate=" + dataBoard_reportingDate
				+ ", dataBoard_filePath=" + dataBoard_filePath + "]";
	}
	
	
	
}
