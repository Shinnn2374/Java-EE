package sia.firstMicroService.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sia.firstMicroService.service.GoogleClient;

@RestController
@AllArgsConstructor
public class MainController {

    private  final GoogleClient googleClient;

    @GetMapping(path = "/")
    public String getMainPage(){
        return  googleClient.getMainPage();
    }
}
