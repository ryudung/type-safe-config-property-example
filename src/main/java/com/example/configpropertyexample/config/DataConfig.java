package com.example.configpropertyexample.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
@Slf4j
@Configuration
@EnableConfigurationProperties(AppProperty.class)
public class DataConfig {

	@Bean
	public String dataSource(AppProperty appProperty) {
		/**
		 * type-safe configuration properties.
		 * https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#boot-features-external-config-vs-value
		 * */
		log.info(appProperty.getDataSource().getUrl());
		log.info(appProperty.getDataSource().getUsername());
		log.info(appProperty.getDataSource().getPassword());

		return null;
	}
}
