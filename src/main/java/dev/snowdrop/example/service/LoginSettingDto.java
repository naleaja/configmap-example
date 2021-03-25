package dev.snowdrop.example.service;

public class LoginSettingDto {

	private String loginUrl;
	private String refreshUrl;
	private String loginCredentialFieldName;
	private String refreshTokenFieldName;

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getRefreshUrl() {
		return refreshUrl;
	}

	public void setRefreshUrl(String refreshUrl) {
		this.refreshUrl = refreshUrl;
	}

	public String getLoginCredentialFieldName() {
		return loginCredentialFieldName;
	}

	public void setLoginCredentialFieldName(String loginCredentialFieldName) {
		this.loginCredentialFieldName = loginCredentialFieldName;
	}

	public String getRefreshTokenFieldName() {
		return refreshTokenFieldName;
	}

	public void setRefreshTokenFieldName(String refreshTokenFieldName) {
		this.refreshTokenFieldName = refreshTokenFieldName;
	}

	@Override
	public String toString() {
		return "LoginSettingDto [loginUrl=" + loginUrl + ", loginCredentialFieldName=" + loginCredentialFieldName
				+ ", refreshTokenFieldName=" + refreshTokenFieldName + "]";
	}

}
