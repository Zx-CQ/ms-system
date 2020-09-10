package com.jd.jsl.dd.service.Utils;

import com.alibaba.fastjson.JSONObject;
import com.jd.jsl.dd.domain.enums.Const;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Preconditions;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 实体转换工具类
 * @author wujia215
 * @date 2020/8/2111:04
 */

@Slf4j
public class ObjectUtils {

    /**** 解析网关请求body */
    public static JSONObject getBody(HttpServletRequest request ){
        Map<String,Object> params  = new HashMap<>();
        request.getParameterMap().forEach((key, value) -> params.put(key, value[0]));
        log.info("request url is : " + request.getRequestURI());
        log.info("get parameters: params = : " + params);
        Object object = params.get(Const.body.name());
        Preconditions.checkArgument(object !=null , "解析网关传参错误");
        return JSONObject.parseObject(String.valueOf(object));
    }

    /*** object转map **/
    public static Map<String, Object> objectToMap(Object obj){
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        System.out.println(clazz);
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = null;
            try {
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                log.error("[objectToMap] object to map failure !");
            }
            if(fieldName.equals("serialVersionUID")){
                continue;
            }
            map.put(fieldName, value);
        }
        return map;
    }
}
