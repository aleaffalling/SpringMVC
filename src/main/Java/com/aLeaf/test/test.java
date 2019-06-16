package com.aLeaf.test;

import com.aLeaf.Mapper.UserTableMapper;
import com.aLeaf.Pojo.UserTable;
import com.aLeaf.Services.UserTableService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;

public class test {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserTableService uts = (UserTableService) ac.getBean("userTableService");
        uts.selectByPrimaryKey("1");
    }

    @Test
    public void test2() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis/sqlMapConfig.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
        in.close();
        SqlSession ss = ssf.openSession();
        UserTable u = ss.getMapper(UserTableMapper.class).selectByPrimaryKey("1");
        System.out.println(u.getU_id());
    }
}
