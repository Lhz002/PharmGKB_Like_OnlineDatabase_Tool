package com.dst.Mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public interface MysqlDatabase {
    public void addData(String username, String password);
}

