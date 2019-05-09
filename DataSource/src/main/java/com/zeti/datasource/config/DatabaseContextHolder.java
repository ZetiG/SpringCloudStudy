package com.zeti.datasource.config;

import com.zeti.datasource.constants.DataSourceEnum;

/**
 * 保存一个线程安全的DataSourceEnum容器
 */
public class DatabaseContextHolder {

    private static final ThreadLocal<DataSourceEnum> contextHold = new ThreadLocal<>();

    public static void setContextHold(DataSourceEnum dataSourceType) {
        contextHold.set(dataSourceType);
    }

    public static DataSourceEnum getDataSourcesType() {
        return contextHold.get();
    }
}
