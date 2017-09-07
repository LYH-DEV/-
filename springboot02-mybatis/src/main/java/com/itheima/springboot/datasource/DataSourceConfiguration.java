package com.itheima.springboot.datasource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*** 
*Title: DataSourceConfiguration
*Description:数据源配置
*Company: 八股文公司 
* @author Liu YueHua
* @date 2017年9月7日 上午9:39:30
*/
@Configuration
public class DataSourceConfiguration {
	@Bean("dataSourceZ")
	@Primary
	@ConfigurationProperties("spring.datasource.c3p0")
	public DataSource getDataSource(){
		System.out.println("===========DataSourceConfiguration开始配置了================");
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}
}
