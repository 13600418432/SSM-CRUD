package com.zqx.utils;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class MySpecialListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        AbandonedConnectionCleanupThread.checkedShutdown();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()){
            Driver driver = drivers.nextElement();
            if (driver.getClass().getClassLoader() == loader){
                try {
                    System.out.println("Deregistering JDBC driver {}");
                    DriverManager.deregisterDriver(driver);
                } catch (SQLException e) {
                    System.out.println("Error deregistering JDBC driver {}");
                    e.printStackTrace();
                }
            }else {
                System.out.println("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader");
            }
        }
    }
}
