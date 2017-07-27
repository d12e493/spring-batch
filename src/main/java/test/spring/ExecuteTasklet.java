package test.spring;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class ExecuteTasklet implements Tasklet{

	private int count=1;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		// TODO Auto-generated method stub
		while(true){			
			System.out.println("doing job "+count++);
			Thread.sleep(1000);
		}
	}

}
