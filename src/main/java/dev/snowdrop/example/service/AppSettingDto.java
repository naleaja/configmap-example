package dev.snowdrop.example.service;

public class AppSettingDto {

	private String appCode;
	private String client;
	private String baseUrl;
	private String successCode;

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getSuccessCode() {
		return successCode;
	}

	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}

	@Override
	public String toString() {
		return "AppSettingDto [appCode=" + appCode + ", client=" + client + ", baseUrl=" + baseUrl + ", successCode="
				+ successCode + "]";
	}

}
