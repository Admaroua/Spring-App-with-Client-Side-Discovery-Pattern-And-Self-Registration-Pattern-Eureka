package com.esisba.msscolarite.Proxy;

import com.esisba.msscolarite.Models.Formation;
import com.esisba.msscolarite.RandomLoad;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation")
@LoadBalancerClient(name = "ms-formation",configuration = RandomLoad.class)
public interface FormationProxy {

    @GetMapping("/formations/{id}")
    Formation getFormation(@PathVariable("id") Long id);
}
