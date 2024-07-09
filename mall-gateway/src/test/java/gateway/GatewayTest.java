package gateway;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import cn.d619.gateway.GatewayApplication;

@SpringBootTest(classes = GatewayApplication.class)
public class GatewayTest {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Test
    public void getInstancesTest() {
        List<ServiceInstance> instances = discoveryClient.getInstances("mall-category");
        System.out.println("Found " + instances.size() + " instances of mall-category");
        instances.forEach(instance -> {
            System.out.println("Host: " + instance.getHost() + ", Port: " + instance.getPort());
        });
    }
}
