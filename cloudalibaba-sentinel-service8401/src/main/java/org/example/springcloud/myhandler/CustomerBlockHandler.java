package org.example.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.springcloud.entities.CommonResult;

public class CustomerBlockHandler
{
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }
}
