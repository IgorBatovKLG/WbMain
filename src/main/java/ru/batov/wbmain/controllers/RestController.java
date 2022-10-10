package ru.batov.wbmain.controllers;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import ru.batov.wbmain.services.CheckProductWbServices;
import ru.batov.wbmain.services.updateCatalog;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private ConfigurableApplicationContext context;

    public RestController(ConfigurableApplicationContext context) {
        this.context = context;
    }

    @GetMapping("/getVariables")
    public String getGlobalVariables() {
        return "ThreadCount = " + GlobalVariables.ThreadCount + " NewProductCount = " + GlobalVariables.NewProductCount + " UpdateProductCount = " + GlobalVariables.UpdateProductCount + " ExceptionCount = " + GlobalVariables.ExceptionCount + " DuplicateProductCount = " + GlobalVariables.DuplicateProductCount + " NullProductCount = " + GlobalVariables.NullProductCount;
    }

    @GetMapping("/stop")
    public String stop() {
        updateCatalog bean = context.getBean(updateCatalog.class);
        bean.updateCatalog();
        return "stop";
    }

    @GetMapping("/start")
    public String start() {
        CheckProductWbServices bean = context.getBean(CheckProductWbServices.class);
        bean.operator();
        return "start";
    }


}
