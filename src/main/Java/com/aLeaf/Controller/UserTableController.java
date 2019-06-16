package com.aLeaf.Controller;

import com.aLeaf.Pojo.UserTable;
import com.aLeaf.Services.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("UserController")
public class UserTableController {

    @Autowired
    private UserTableService userTableService;

    @RequestMapping("/UserFind")
    public String UserFind(){
        UserTable u = userTableService.selectByPrimaryKey("1");
        System.out.println(u.getU_id()+"输出名字");
        return u.getU_id();
    }

    @RequestMapping("/InsertUserTable")
    public String InsertUserTable(){
        UserTable u =new UserTable();
        u.setU_id("2");
        u.setU_name("二叶");
        u.setU_password("123456");
        u.setU_sex(1);
        userTableService.insertUserTable(u);
        u = userTableService.selectByPrimaryKey(u.getU_id());
        System.out.println(u.getU_id());
        return u.getU_id();
    }
}
