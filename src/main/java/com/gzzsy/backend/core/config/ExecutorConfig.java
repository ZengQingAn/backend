package com.gzzsy.backend.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * async executor
 *
 **/
@Configuration
public class ExecutorConfig {

    /**
     * default async executor
     */
    public static final String DEFAULT_EXECUTOR = "default-async-executor";

//    @Bean(DEFAULT_EXECUTOR)
    public Executor defaultAsyncExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        taskExecutor.setAwaitTerminationSeconds(240);
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setQueueCapacity(10000);
        taskExecutor.setKeepAliveSeconds(32);
        taskExecutor.setThreadNamePrefix("default-async-executor-thread-");
        return taskExecutor;
    }

}
