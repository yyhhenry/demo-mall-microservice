package cn.d619.user;

import org.springframework.web.bind.annotation.RestController;

import cn.d619.user.pojo.dto.MsgDTO;
import cn.d619.user.pojo.dto.UserDTO;
import cn.d619.user.pojo.dto.UserExistsDTO;
import cn.d619.user.pojo.dto.UserExistsRequest;
import cn.d619.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MallController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/user/exists")
    public UserExistsDTO userExists(@RequestBody UserExistsRequest user) {
        return userService.userExists(user.getName());
    }

    @PostMapping("/api/user/login")
    public MsgDTO login(@RequestBody UserDTO user) {
        userService.login(user);
        return new MsgDTO("登录成功");
    }

    @PostMapping("/api/user/register")
    public MsgDTO register(@RequestBody UserDTO user) {
        userService.register(user);
        return new MsgDTO("注册成功");
    }

}
