package com.itheima.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*** 
*Title: Application
*Description: springboot启动类
*Company: 八股文公司 
* @author Liu YueHua
* @date 2017年9月5日 上午8:49:11
*/
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Application.class);
//		关闭广告
		springApplication.setBannerMode(Banner.Mode.OFF);
//		运行springboot
		springApplication.run(args);
	}

}
