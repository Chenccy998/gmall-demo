package com.atguigu.gmall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class PageInfoVo {
    @ApiModelProperty("总记录数")
    private Long total;
}
