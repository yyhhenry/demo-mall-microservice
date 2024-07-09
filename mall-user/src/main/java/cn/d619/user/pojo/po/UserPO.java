package cn.d619.user.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("user")
public class UserPO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String password;
}
