package example.client;

import common.entity.RestfulResult;
import example.entity.ServiceInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @classname: ServiceFeignClient
 * @description:
 * @author: dhm
 * @create: 2021/07/14 17:27
 */

@Component
@FeignClient(value = "springbootService", fallback=ServiceFallback.class) //这里的value对应调用服务的spring.applicatoin.name
public interface ServiceFeignClient {

    @RequestMapping(value = "/service/hello")
    RestfulResult hello(@RequestBody ServiceInfo serviceInfo);

}

