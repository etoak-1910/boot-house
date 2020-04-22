package com.etoak.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 处理ParamException异常
     * @param e
     * @return
     */
    @ExceptionHandler(ParamEcxeption.class)
    public ModelAndView handleParamException(ParamEcxeption e){

        log.error(e.getMessage(),e);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;

    }


}
