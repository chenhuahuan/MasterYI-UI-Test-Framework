package com.dcits.yi.ui.report.manage;

import com.dcits.yi.tool.TestKit;
import com.dcits.yi.ui.GlobalTestConfig;
import com.dcits.yi.ui.report.SuiteReport;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;

/**
 * 默认html报告处理器：生成一个Cucumber样式的测试报告
 * @author xuwangcheng
 * @version 20181012
 *
 */
public class CucumberReportManager implements IReportManager {

	@Override
	public String manage(SuiteReport reportData) {
		String json = JSONUtil.parse(reportData).toString();
		String report = FileUtil.readString(TestKit.getProjectRootPath() + "/template/webReport.xml", "utf-8");
		
		report = report.replace("#JSON_STRING__JSON_STRING#", json);
		String reportPath = createReportPath(reportData.getReportName());
		
		FileUtil.writeString(report, reportPath, "utf-8");
		
		return reportPath;
		
	}

	@Override
	public String createReportPath(String reportName) {		
		return GlobalTestConfig.ENV_INFO.getReportFolder() + "/" + reportName + ".html";
	}
}
