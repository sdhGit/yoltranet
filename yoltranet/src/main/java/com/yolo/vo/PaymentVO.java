package com.yolo.vo;

public class PaymentVO {
	private int payment_idx;				// 결제 idx
	private String payment_type;			// 타입
	private int payment_receiver_idx;		// 발신인 idx
	private int payment_sender_idx;			// 수신인 idx
	private String payment_title;			// 결재 제목
	private String payment_content;			// 결재 내용
	private String payment_reportDate;		// 보고 날짜
	private String payment_paymentDate;		// 결재 날짜
	private String payment_status;			// 결재 상태
	private String payment_feedback;		// 결재 피드백
	private String payment_filePath;		// 결재 파일 경로
	
	
	public PaymentVO() {	}


	public PaymentVO(int payment_idx, String payment_type, int payment_receiver_idx, int payment_sender_idx,
			String payment_title, String payment_content, String payment_reportDate, String payment_paymentDate,
			String payment_status, String payment_feedback, String payment_filePath) {
		super();
		this.payment_idx = payment_idx;
		this.payment_type = payment_type;
		this.payment_receiver_idx = payment_receiver_idx;
		this.payment_sender_idx = payment_sender_idx;
		this.payment_title = payment_title;
		this.payment_content = payment_content;
		this.payment_reportDate = payment_reportDate;
		this.payment_paymentDate = payment_paymentDate;
		this.payment_status = payment_status;
		this.payment_feedback = payment_feedback;
		this.payment_filePath = payment_filePath;
	}


	public int getPayment_idx() {
		return payment_idx;
	}


	public void setPayment_idx(int payment_idx) {
		this.payment_idx = payment_idx;
	}


	public String getPayment_type() {
		return payment_type;
	}


	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}


	public int getPayment_receiver_idx() {
		return payment_receiver_idx;
	}


	public void setPayment_receiver_idx(int payment_receiver_idx) {
		this.payment_receiver_idx = payment_receiver_idx;
	}


	public int getPayment_sender_idx() {
		return payment_sender_idx;
	}


	public void setPayment_sender_idx(int payment_sender_idx) {
		this.payment_sender_idx = payment_sender_idx;
	}


	public String getPayment_title() {
		return payment_title;
	}


	public void setPayment_title(String payment_title) {
		this.payment_title = payment_title;
	}


	public String getPayment_content() {
		return payment_content;
	}


	public void setPayment_content(String payment_content) {
		this.payment_content = payment_content;
	}


	public String getPayment_reportDate() {
		return payment_reportDate;
	}


	public void setPayment_reportDate(String payment_reportDate) {
		this.payment_reportDate = payment_reportDate;
	}


	public String getPayment_paymentDate() {
		return payment_paymentDate;
	}


	public void setPayment_paymentDate(String payment_paymentDate) {
		this.payment_paymentDate = payment_paymentDate;
	}


	public String getPayment_status() {
		return payment_status;
	}


	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}


	public String getPayment_feedback() {
		return payment_feedback;
	}


	public void setPayment_feedback(String payment_feedback) {
		this.payment_feedback = payment_feedback;
	}


	public String getPayment_filePath() {
		return payment_filePath;
	}


	public void setPayment_filePath(String payment_filePath) {
		this.payment_filePath = payment_filePath;
	}


	@Override
	public String toString() {
		return "PaymentVO [payment_idx=" + payment_idx + ", payment_type=" + payment_type + ", payment_receiver_idx="
				+ payment_receiver_idx + ", payment_sender_idx=" + payment_sender_idx + ", payment_title="
				+ payment_title + ", payment_content=" + payment_content + ", payment_reportDate=" + payment_reportDate
				+ ", payment_paymentDate=" + payment_paymentDate + ", payment_status=" + payment_status
				+ ", payment_feedback=" + payment_feedback + ", payment_filePath=" + payment_filePath + "]";
	}

	
	
	
}