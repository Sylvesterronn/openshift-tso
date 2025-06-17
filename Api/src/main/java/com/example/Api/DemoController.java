    package com.example.Api;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.net.InetAddress;
    import java.net.UnknownHostException;

    @RestController
    public class DemoController {
        @GetMapping("/get")
        public String getMachineName() {
            try {
                InetAddress inetAddress = InetAddress.getLocalHost();
                return "Machine Name: " + inetAddress.getHostName();
            } catch (UnknownHostException e) {
                return "Unable to retrieve machine name";
            }
        }
    }