package backend.archetype.server.core.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoTask {

//    @XxlJob("TestJob")
    public ReturnT<String> testJob(String param) {
        try {
            // todo
        } catch (Exception e) {
            log.error("[testJob] throw exception: {}", e.getMessage(), e);
            return ReturnT.FAIL;
        }
        return ReturnT.SUCCESS;
    }
}
