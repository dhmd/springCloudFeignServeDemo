package example.client;

import common.entity.RestfulResult;
import example.entity.ServiceInfo;
import org.springframework.stereotype.Component;

/**
 * @classname: ServiceFallback
 * @description:
 * @author: dhm
 * @create: 2021/07/14 17:27
 */

@Component
public class ServiceFallback implements ServiceFeignClient{

    @Override
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败");
        return result;
    }
}
