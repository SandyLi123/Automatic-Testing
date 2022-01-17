package com.company.car;
import com.sun.deploy.net.proxy.ProxyUtils;

import java.io.InputStream;
import java.util.Properties;
public class  ReadConfig{
        //public method: read the value in config file
        public static String readConfig(String key) {
                Properties prop = new Properties();
                InputStream input = ProxyUtils.class.getResourceAsStream("/com/company/car/config.properties");
                String value = null;
                if (input != null) {
                        try {
                                prop.load(input);
                                int available = input.available();
                                value = prop.getProperty(key);
                                input.close();

                        } catch (Exception e) {
                                System.out.println("Exception" + e);
                        } finally {

                        }
                }
                return value;
        }
        }