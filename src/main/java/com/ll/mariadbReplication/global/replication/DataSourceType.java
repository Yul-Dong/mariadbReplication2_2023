package com.ll.mariadbReplication.global.replication;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DataSourceType {
    MASTER("master"), SLAVE("slave");

    private final String name;
}