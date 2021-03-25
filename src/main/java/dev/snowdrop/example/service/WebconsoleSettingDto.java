package dev.snowdrop.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Webconsole Setting bean
 *
 * @author Kusmawati (&copy;Dec 23, 2019) 
 */
public class WebconsoleSettingDto {

	private List<AppSettingDto> appSetting;
	private LoginSettingDto loginSetting;
	private List<String> whiteListUrls;

	public List<AppSettingDto> getAppSetting() {
		return appSetting == null ? new ArrayList<>() : Collections.unmodifiableList(appSetting);
	}

	public void setAppSetting(List<AppSettingDto> appSetting) {
		this.appSetting  = appSetting == null ? new ArrayList<>() : Collections.unmodifiableList(appSetting);
	}

	public LoginSettingDto getLoginSetting() {
		return loginSetting;
	}

	public void setLoginSetting(LoginSettingDto loginSetting) {
		this.loginSetting = loginSetting;
	}

	public List<String> getWhiteListUrls() {
		return whiteListUrls == null ? new ArrayList<>() : Collections.unmodifiableList(whiteListUrls);
	}

	public void setWhiteListUrls(List<String> whiteListUrls) {
		this.whiteListUrls = whiteListUrls == null ? new ArrayList<>() : Collections.unmodifiableList(whiteListUrls);
	}

	@Override
	public String toString() {
		return "WebconsoleSettingDto [appSetting=" + appSetting + ", loginSetting=" + loginSetting + ", whiteListUrls="
				+ whiteListUrls + "]";
	}

}
