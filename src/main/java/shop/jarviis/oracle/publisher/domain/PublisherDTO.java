package shop.jarviis.oracle.publisher.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class PublisherDTO {
	private int pubId;
	private String pubName;
	private String mgrName;
	private String phone;
	public int getPubId() {
		return pubId;
	}
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("출판사Id: %d, 출판사 이름 : %s, 담당자: %s, 연락처: %s", pubId, pubName, mgrName, phone);
	}

}
