package com.acornacademy.Membership;



//�ּ� ���� 
public class Postcode {

	// ����
	private Integer no;

	// �����ȣ
	private String zipcode;

	// �ּ�
	private String addr1;

	// ���ּ�
	private String addr2;

	// ���̵�
	private String hid;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getHId() {
		return hid;
	}

	public void setHId(String hid) {
		this.hid = hid;
	}

	// Postcode �� ����
	public void CopyData(Postcode param) {
		this.no = param.getNo();
		this.zipcode = param.getZipcode();
		this.addr1 = param.getAddr1();
		this.addr2 = param.getAddr2();
		this.id = param.getId();
	}
}
