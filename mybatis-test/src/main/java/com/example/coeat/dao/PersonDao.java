package com.example.coeat.dao;

import com.example.coeat.config.SqlMapConfig;
import com.example.coeat.dto.PersonDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDao {
    private final SqlMapConfig sqlMapConfig;

    public PersonDao(SqlMapConfig sqlMapConfig) {
        this.sqlMapConfig = sqlMapConfig;
    }

    public List<PersonDto> selectPersonALl(){
        SqlSession sqlSession = sqlMapConfig.getSqlSessionFactory().openSession();
        List<PersonDto> list = sqlSession.selectList("selectPersonAll");
        sqlSession.close();
        return list;

    }
}
