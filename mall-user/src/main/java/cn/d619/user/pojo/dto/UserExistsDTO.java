package cn.d619.user.pojo.dto;

import lombok.Data;

@Data
public class UserExistsDTO {
    private boolean exists;

    public UserExistsDTO(boolean exists) {
        this.exists = exists;
    }
}
