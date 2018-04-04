package cn.chinaflame.park.controller;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.chinaflame.park.dao.PaStaffData;
import cn.chinaflame.park.model.PaStaff;

/**
 * 
 */
@RestController
public class StaffController extends BaseController{

    @Autowired
    private PaStaffData pastaffdata;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @PostMapping(value="/start-process", produces= MediaType.APPLICATION_JSON_VALUE)
    public PaStaff startHireProcess(@RequestBody PaStaff data) {
    	PaStaff staff = new PaStaff();
    	staff.setStaffname(data.getStaffname());
    	staff.setEmail(data.getEmail());
    	staff.setPhone(data.getPhone());
    	pastaffdata.insertPaStaff(staff);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("staff", staff);
        runtimeService.startProcessInstanceByKey("hireProcessWithJpa", params);
        return staff;
    }

    /**
     * 本地服务实例的信息
     * @return
     */
//    @GetMapping("/instance-info")
//    public ServiceInstance showInfo() {
//        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
//        return localServiceInstance;
//    }
}
