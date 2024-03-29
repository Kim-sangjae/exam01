package org.koreait.RestController;


import org.koreait.commons.CommonException;
import org.koreait.commons.JSONResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("org.koreait.RestController")
public class CommonRestController {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONResult<Object>> errorHandler(Exception e){

        // 현재 e -> CommonException 클래스로 부터 만들어진 객체이면 - getStatus()
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 500- 기본응답코드 정의한거

        if(e instanceof CommonException){
            CommonException commonException = (CommonException) e;
            status = commonException.getStatus();
        }

        JSONResult<Object> jsonResult = new JSONResult<>();
        jsonResult.setSuccess(false);
        jsonResult.setMessage(e.getMessage());
        jsonResult.setStatus(status);

        return ResponseEntity.status(status).body(jsonResult);

    }


}
