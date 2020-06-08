package com.yolo.vo;

public class CalendarVO {	// 일정
	private int calendar_idx;			// 일정 idx		
	private int calendar_employee_idx;	// 작성자 idx		
	private String calendar_startDate;	// 일정 시작일
	private String calendar_endDate;	// 일정 종료일
	private String calendar_type;		// 일정 종류(휴일, 행사, 휴가, 기타)
	private String calendar_title;		// 일정 이름
	private String calendar_content;	// 일정 싱세 내용
	
	public CalendarVO() {	}

	public CalendarVO(int calendar_idx, int calendar_employee_idx, String calendar_startDate, String calendar_endDate,
			String calendar_type, String calendar_title, String calendar_content) {
		this.calendar_idx = calendar_idx;
		this.calendar_employee_idx = calendar_employee_idx;
		this.calendar_startDate = calendar_startDate;
		this.calendar_endDate = calendar_endDate;
		this.calendar_type = calendar_type;
		this.calendar_title = calendar_title;
		this.calendar_content = calendar_content;
	}

	public int getCalendar_idx() {
		return calendar_idx;
	}

	public void setCalendar_idx(int calendar_idx) {
		this.calendar_idx = calendar_idx;
	}

	public int getCalendar_employee_idx() {
		return calendar_employee_idx;
	}

	public void setCalendar_employee_idx(int calendar_employee_idx) {
		this.calendar_employee_idx = calendar_employee_idx;
	}

	public String getCalendar_startDate() {
		return calendar_startDate;
	}

	public void setCalendar_startDate(String calendar_startDate) {
		this.calendar_startDate = calendar_startDate;
	}

	public String getCalendar_endDate() {
		return calendar_endDate;
	}

	public void setCalendar_endDate(String calendar_endDate) {
		this.calendar_endDate = calendar_endDate;
	}

	public String getCalendar_type() {
		return calendar_type;
	}

	public void setCalendar_type(String calendar_type) {
		this.calendar_type = calendar_type;
	}

	public String getCalendar_title() {
		return calendar_title;
	}

	public void setCalendar_title(String calendar_title) {
		this.calendar_title = calendar_title;
	}

	public String getCalendar_content() {
		return calendar_content;
	}

	public void setCalendar_content(String calendar_content) {
		this.calendar_content = calendar_content;
	}

	@Override
	public String toString() {
		return "CalendarVO [calendar_idx=" + calendar_idx + ", calendar_employee_idx=" + calendar_employee_idx
				+ ", calendar_startDate=" + calendar_startDate + ", calendar_endDate=" + calendar_endDate
				+ ", calendar_type=" + calendar_type + ", calendar_title=" + calendar_title + ", calendar_content="
				+ calendar_content + "]";
	}
	
	
	
}
