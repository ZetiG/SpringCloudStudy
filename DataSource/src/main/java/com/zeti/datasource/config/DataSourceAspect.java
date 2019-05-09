package com.zeti.datasource.config;

import com.zeti.datasource.constants.DataSourceEnum;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect {

    @Pointcut("execution(* com.zeti.datasource.mapper01.*.*(..))")
    private void db1Aspect() {
    }

    @Pointcut("execution(* com.zeti.datasource.mapper02.*.*(..))")
    private void db2Aspect() {
    }

    @Before("db1Aspect()")
    public void dbTest1() {
        DatabaseContextHolder.setContextHold(DataSourceEnum.test1);
    }

    @Before("db2Aspect()")
    public void dbTest02() {
        DatabaseContextHolder.setContextHold(DataSourceEnum.test2);
    }

}
