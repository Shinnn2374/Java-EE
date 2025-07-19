package sia.firstMicroService.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sia.firstMicroService.service.GoogleClient;

@RestController
@AllArgsConstructor
@RequiredArgsConstructor
public class MainController {

    private GoogleClient googleClient;

    @GetMapping(path = "/")
    private String getMainPage(){
        return  googleClient.getMainPage();
    }
}
