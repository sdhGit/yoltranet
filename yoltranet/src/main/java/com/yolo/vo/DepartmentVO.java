package com.yolo.vo;

public class DepartmentVO {	// 부서

	private int department_idx;				// 부서 idx
	private String department_name;			// 부서명
	private String department_createDate;	// 부서 생성일
	
	public DepartmentVO() {	}
	
	

	public DepartmentVO(int department_idx, String department_name, String department_createDate) {
		super();
		this.department_idx = department_idx;
		this.department_name = department_name;
		this.department_createDate = department_createDate;
	}



	public int getDepartment_idx() {
		return department_idx;
	}

	public void setDepartment_idx(int department_idx) {
		this.department_idx = department_idx;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDepartment_createDate() {
		return department_createDate;
	}

	public void setDepartment_createDate(String department_createDate) {
		this.department_createDate = department_createDate;
	}



	@Override
	public String toString() {
		return "DepartmentVO [department_idx=" + department_idx + ", department_name=" + department_name
				+ ", department_createDate=" + department_createDate + "]";
	}
	
	
	
}
