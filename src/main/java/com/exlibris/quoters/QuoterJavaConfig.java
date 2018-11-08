package com.exlibris.quoters;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableAspectJAutoProxy
@EnableAsync
@EnableScheduling
public class QuoterJavaConfig {
}
