package com.example.springboot.service;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;

@Service
public class UserService extends ServiceImpl<UserMapper, User>{

    //不用MyBatis-Plus
    // @Autowired
    // private UserMapper userMapper;

    // public int save(User user){ //user没有id，则表示是新增
    //     if(user.getId() == null){
    //         return userMapper.insert(user);
    //     } else{ // 否则为更新
    //         return userMapper.update(user);
    //     }
    // }

    public boolean saveUser(User user){
        // if(user.getId() == null){
        //     return save(user); //Mybatis-plus提供的方法，插入数据
        // } else{ // 否则为更新
        //     return updateById(user);
        // }
        return saveOrUpdate(user);
        
    }

}
