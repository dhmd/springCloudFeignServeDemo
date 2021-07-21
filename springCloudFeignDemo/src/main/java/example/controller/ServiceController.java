package example.controller;

import common.entity.RestfulResult;
import common.utils.CommonUtils;
import example.client.ServiceFeignClient;
import example.entity.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @classname: ServiceController
 * @description:
 * @author: dhm
 * @create: 2021/07/14 13:52
 */

@RestController
public class ServiceController {
    @Autowired
    ServiceFeignClient serviceFeignClient;

    @RequestMapping("/consumerService")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult = serviceFeignClient.hello(serviceInfo);
        CommonUtils.printDataJason(response, restfulResult);
    }

}
