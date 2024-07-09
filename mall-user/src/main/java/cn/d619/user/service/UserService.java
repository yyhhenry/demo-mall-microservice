package cn.d619.user.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import cn.d619.user.exception.LoginException;
import cn.d619.user.exception.RegisterException;
import cn.d619.user.mapper.UserMapper;
import cn.d619.user.pojo.dto.UserDTO;
import cn.d619.user.pojo.dto.UserExistsDTO;
import cn.d619.user.pojo.po.UserPO;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    private UserPO getUserByName(String name) {
        QueryWrapper<UserPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        return userMapper.selectOne(queryWrapper);
    }

    public UserExistsDTO userExists(String name) {
        return new UserExistsDTO(getUserByName(name) != null);
    }

    public void register(UserDTO user) {
        UserPO existingUser = getUserByName(user.getName());
        if (existingUser != null) {
            throw new RegisterException("用户已存在");
        }
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(user, userPO);
        userMapper.insert(userPO);
    }

    public void login(UserDTO user) {
        UserPO existingUser = getUserByName(user.getName());
        if (existingUser == null) {
            throw new LoginException("找不到用户");
        }
        if (!existingUser.getPassword().equals(user.getPassword())) {
            throw new LoginException("密码错误");
        }
    }

}
