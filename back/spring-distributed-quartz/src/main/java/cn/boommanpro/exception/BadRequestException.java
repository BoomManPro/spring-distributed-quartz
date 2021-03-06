package cn.boommanpro.exception;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author jie
 * @date 2018-11-23
 * 统一异常处理
 */
@Getter
public class BadRequestException extends RuntimeException{

    private Integer status = BAD_REQUEST.value();

    public BadRequestException(String msg){
        super(msg);
    }

    public BadRequestException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }
}
