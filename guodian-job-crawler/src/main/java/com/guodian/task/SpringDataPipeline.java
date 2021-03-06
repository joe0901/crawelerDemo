package com.guodian.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.guodian.pojo.JobInfo;
import com.guodian.service.JobInfoService;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

@Component
public class SpringDataPipeline implements Pipeline {

	@Autowired
	private JobInfoService jobInfoService;
	
	
	@Override
	public void process(ResultItems resultItems, Task task) {
		// TODO Auto-generated method stub
		JobInfo jobInfo = resultItems.get("jobInfo");
		
		if(jobInfo != null) {
			this.jobInfoService.save(jobInfo);
		}
	}

}
