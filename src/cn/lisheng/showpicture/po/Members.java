package cn.lisheng.showpicture.po;

public class Members {

	private String elementId;
	private String name;
	private String realName;
	private String sexy;
	private String age;
	private String tphone;
	private String gemail;
	private String idCard;
	private String country;
	private String address;
	
	public String getElementId() {
		return elementId;
	}
	public void setElementId(String elementId) {
		this.elementId = elementId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSexy() {
		return sexy;
	}
	public void setSexy(String sexy) {
		this.sexy = sexy;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
	}
	public String getGemail() {
		return gemail;
	}
	public void setGemail(String gemail) {
		this.gemail = gemail;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Members [elementId=" + elementId + ", name=" + name + ", realName=" + realName + ", sexy=" + sexy
				+ ", age=" + age + ", tphone=" + tphone + ", gemail=" + gemail + ", idCard=" + idCard + ", country="
				+ country + ", address=" + address + "]";
	}
	
}
