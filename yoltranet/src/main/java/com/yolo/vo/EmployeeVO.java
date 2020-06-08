package com.yolo.vo;

public class EmployeeVO {
	private int employee_idx;				// 직원 idx
	private int employee_department_idx;	// 부서 idx
	private String employee_name;			// 이름
	private String employee_birth;			// 생년월일
	private String employee_address;		// 주소
	private String employee_phone;			// 핸드폰 번호
	private String employee_cPhone;			// 사내 번호	
	private String employee_joinDate;		// 입사일
	private String employee_position;		// 직급
	private int employee_salary;			// 연봉
	private String employee_id;				// 아이디
	private String employee_pw;				// 비밀번호
	private String employee_email;			// 이메일
	
	public EmployeeVO() {	}

	public EmployeeVO(int employee_idx, int employee_department_idx, String employee_name, String employee_birth,
			String employee_address, String employee_phone, String employee_cPhone, String employee_joinDate,
			String employee_position, int employee_salary, String employee_id, String employee_pw,
			String employee_email) {
		super();
		this.employee_idx = employee_idx;
		this.employee_department_idx = employee_department_idx;
		this.employee_name = employee_name;
		this.employee_birth = employee_birth;
		this.employee_address = employee_address;
		this.employee_phone = employee_phone;
		this.employee_cPhone = employee_cPhone;
		this.employee_joinDate = employee_joinDate;
		this.employee_position = employee_position;
		this.employee_salary = employee_salary;
		this.employee_id = employee_id;
		this.employee_pw = employee_pw;
		this.employee_email = employee_email;
	}

	public int getEmployee_idx() {
		return employee_idx;
	}

	public void setEmployee_idx(int employee_idx) {
		this.employee_idx = employee_idx;
	}

	public int getEmployee_department_idx() {
		return employee_department_idx;
	}

	public void setEmployee_department_idx(int employee_department_idx) {
		this.employee_department_idx = employee_department_idx;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_birth() {
		return employee_birth;
	}

	public void setEmployee_birth(String employee_birth) {
		this.employee_birth = employee_birth;
	}

	public String getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}

	public String getEmployee_phone() {
		return employee_phone;
	}

	public void setEmployee_phone(String employee_phone) {
		this.employee_phone = employee_phone;
	}

	public String getEmployee_cPhone() {
		return employee_cPhone;
	}

	public void setEmployee_cPhone(String employee_cPhone) {
		this.employee_cPhone = employee_cPhone;
	}

	public String getEmployee_joinDate() {
		return employee_joinDate;
	}

	public void setEmployee_joinDate(String employee_joinDate) {
		this.employee_joinDate = employee_joinDate;
	}

	public String getEmployee_position() {
		return employee_position;
	}

	public void setEmployee_position(String employee_position) {
		this.employee_position = employee_position;
	}

	public int getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_pw() {
		return employee_pw;
	}

	public void setEmployee_pw(String employee_pw) {
		this.employee_pw = employee_pw;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employee_idx=" + employee_idx + ", employee_department_idx=" + employee_department_idx
				+ ", employee_name=" + employee_name + ", employee_birth=" + employee_birth + ", employee_address="
				+ employee_address + ", employee_phone=" + employee_phone + ", employee_cPhone=" + employee_cPhone
				+ ", employee_joinDate=" + employee_joinDate + ", employee_position=" + employee_position
				+ ", employee_salary=" + employee_salary + ", employee_id=" + employee_id + ", employee_pw="
				+ employee_pw + ", employee_email=" + employee_email + "]";
	}
	
	
	
}
