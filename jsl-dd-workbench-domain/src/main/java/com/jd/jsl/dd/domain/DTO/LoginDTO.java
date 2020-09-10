package com.jd.jsl.dd.domain.DTO;

import lombok.Data;
import lombok.ToString;

/**
 * @author wujia215
 * @date 2020/9/817:50
 */

@Data
@ToString
public class LoginDTO {

    String loginCode;
    String clientType;
    String token;
    String pin;
    String venderId;

}
