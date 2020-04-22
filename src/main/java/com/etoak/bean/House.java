package com.etoak.bean;


import io.swagger.models.auth.In;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class House {

    private Integer id;
    @NotNull(message = "省份必填")
    private Integer province;
    @NotNull(message = "市必填")
    private Integer city;
    @NotNull(message = "所在区必填")
    private Integer area;
    private String areaName;
    @NotNull(message = "租赁方式必填")

    private String rentMode;
    private String orientation;
    private String houseType;

    @NotNull(message = "租金必填")
    @Max(value = 100000,message = "租金不能超过十万")
    @Min(value = 100 ,message = "租金不能低于100")
    private Integer rental;

    @Size(min = 1 ,max = 10 , message = "地址长度介于1-10个字符")
    @NotBlank(message = "地址必填")
    private String address;
    private String pic;
    private String publishTime;


}
