package zhanglin.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: 张林
 * @Date :Created in 5:10 pm 27/07/2020
 */
@Getter
@Setter
@ToString
public class Response {

    private boolean success;//业务是否处理成功
    private String code;//错误码
    private String message;//错误消息
    private Object data;//业务字段
    private String stackTrace;//出现异常时，堆栈信息

}
