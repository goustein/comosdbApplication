package com.company.appname.dtos;

public class SiteTO {
	
	private String  siteNum;
	
	private String siteAddress;

	public String  getSiteNum() {
		return siteNum;
	}

	public void setSiteNum(String siteNum) {
		this.siteNum = siteNum;
	}

	public String getSiteAddress() {
		return siteAddress;
	}

	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}

	@Override
	public String toString() {
		return "SiteTO [siteNum=" + siteNum + ", siteAddress=" + siteAddress + "]";
	}
	
	

}
