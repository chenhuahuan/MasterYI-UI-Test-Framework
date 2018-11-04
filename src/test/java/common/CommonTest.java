package common;

import org.springframework.boot.SpringApplication;

import com.dcits.yi.springboot.Application;


public class CommonTest {
	
	public static void main(String[] args) throws Exception {
		//实例化WebTest对象，可传入suite文件或者多个测试用例类
		//WebTest test = new WebTest(Baidu.class);
		
		//传入一个或多个测试报告处理器对象
		//test.setReportManagers(new ZTestReportManager());		
		
		//常规启动测试
		//test.start();
		
		//使用seleniumConfig.properties中配置的定时规则
		//test.startCron();
		
		//传入指定的定时规则
		//test.startCron("*/3 * * * *");
		
		//以json格式化输出测试报告数据
		//System.out.println(JSONUtil.parse(GlobalTestConfig.report).toStringPretty());
		
		//启动spring-boot-web，可以调用api获取一些信息或者启动测试
		SpringApplication.run(Application.class);
	}
}
