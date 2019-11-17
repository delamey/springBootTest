package com.example.demo.manager;


import com.example.demo.dao.mapper.TUserMapper;
import com.example.demo.dao.pojo.TUser;
import com.example.demo.dao.pojo.TUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuyiming
 * @description
 * @date 2019-11-04 23:08
 */
@Service
public class UserManager {

    @Autowired
    TUserMapper tUserMapper;

    public TUser selectUserById(Integer id) {
        TUser tUser = tUserMapper.selectByPrimaryKey(id);
        return tUser;

    }

    public int insertUser(TUser user) {
        int i = tUserMapper.insertSelective(user);

        return i;

    }

    public List<TUser> selectByage(int age) {
        TUserExample userExample=new TUserExample();
        TUserExample.Criteria userExampleCriteria = userExample.createCriteria();
        userExampleCriteria.andAgeEqualTo(age);
        List<TUser> tUsers = tUserMapper.selectByExample(userExample);
        return tUsers;
    }
}
