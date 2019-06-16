package com.aLeaf.Services;

import com.aLeaf.Pojo.UserTable;

public interface UserTableService {
    UserTable selectByPrimaryKey(String uId);
    void insertUserTable(UserTable u);
}
