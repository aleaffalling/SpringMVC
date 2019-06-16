package com.aLeaf.Services.Impl;

import com.aLeaf.Mapper.UserTableMapper;
import com.aLeaf.Pojo.UserTable;
import com.aLeaf.Services.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userTableService")
public class UserTableServiceImpl implements UserTableService {

    @Autowired
    UserTableMapper userTableMapper;

    public UserTable selectByPrimaryKey(String uId) {
        return userTableMapper.selectByPrimaryKey(uId);
    }

    @Override
    public void insertUserTable(UserTable u) {
        userTableMapper.insertUserTable(u);
    }
}
