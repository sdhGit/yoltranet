package com.yolo.vo;

public class MessanerLog {

	private int messanerLog_idx;			// 메신저 Log idx
	private int messanerLog_receiver_idx;	// 수신자 idx
	private int messanerLog_sender_idx;		// 발신자 idx
	private String messanerLog_content;		// 내용
	private String messanerLog_sendDate;	// 보낸 날짜
	private int messanerLog_receiverCheck;	// 읽음 여부
	
	public MessanerLog() {	}

	public MessanerLog(int messanerLog_idx, int messanerLog_receiver_idx, int messanerLog_sender_idx,
			String messanerLog_content, String messanerLog_sendDate, int messanerLog_receiverCheck) {
		super();
		this.messanerLog_idx = messanerLog_idx;
		this.messanerLog_receiver_idx = messanerLog_receiver_idx;
		this.messanerLog_sender_idx = messanerLog_sender_idx;
		this.messanerLog_content = messanerLog_content;
		this.messanerLog_sendDate = messanerLog_sendDate;
		this.messanerLog_receiverCheck = messanerLog_receiverCheck;
	}

	public int getMessanerLog_idx() {
		return messanerLog_idx;
	}

	public void setMessanerLog_idx(int messanerLog_idx) {
		this.messanerLog_idx = messanerLog_idx;
	}

	public int getMessanerLog_receiver_idx() {
		return messanerLog_receiver_idx;
	}

	public void setMessanerLog_receiver_idx(int messanerLog_receiver_idx) {
		this.messanerLog_receiver_idx = messanerLog_receiver_idx;
	}

	public int getMessanerLog_sender_idx() {
		return messanerLog_sender_idx;
	}

	public void setMessanerLog_sender_idx(int messanerLog_sender_idx) {
		this.messanerLog_sender_idx = messanerLog_sender_idx;
	}

	public String getMessanerLog_content() {
		return messanerLog_content;
	}

	public void setMessanerLog_content(String messanerLog_content) {
		this.messanerLog_content = messanerLog_content;
	}

	public String getMessanerLog_sendDate() {
		return messanerLog_sendDate;
	}

	public void setMessanerLog_sendDate(String messanerLog_sendDate) {
		this.messanerLog_sendDate = messanerLog_sendDate;
	}

	public int getMessanerLog_receiverCheck() {
		return messanerLog_receiverCheck;
	}

	public void setMessanerLog_receiverCheck(int messanerLog_receiverCheck) {
		this.messanerLog_receiverCheck = messanerLog_receiverCheck;
	}

	@Override
	public String toString() {
		return "MessanerLog [messanerLog_idx=" + messanerLog_idx + ", messanerLog_receiver_idx="
				+ messanerLog_receiver_idx + ", messanerLog_sender_idx=" + messanerLog_sender_idx
				+ ", messanerLog_content=" + messanerLog_content + ", messanerLog_sendDate=" + messanerLog_sendDate
				+ ", messanerLog_receiverCheck=" + messanerLog_receiverCheck + "]";
	}
	
	
	
}
