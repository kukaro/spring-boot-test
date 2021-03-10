package com.example.coeat.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.Reader;

@Configuration
public class SqlMapConfig {

    private SqlSessionFactory sqlSessionFactory;

    public SqlMapConfig(){
        try {
            String resource = "xml/Configuration.xml";
//            String resource = "com/example/coeat/xml/Configuration.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
