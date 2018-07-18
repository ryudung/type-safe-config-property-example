package com.example.configpropertyexample.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Copyright (c) 2018 ZUM Internet, Inc.
 * All right reserved.
 * http://www.zum.com
 * This software is the confidential and proprietary information of ZUM
 * , Inc. You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * you entered into with ZUM.
 * <p>
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 * ryugwanghyen                2018-07-18
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "app")
public class AppProperty {

	private DataSource dataSource;

	@Getter
	@Setter
	public static class DataSource {
		private String url;
		private String username;
		private String password;
	}
}
