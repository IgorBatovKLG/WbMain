package ru.batov.wbmain.controllers;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import ru.batov.wbmain.repositories.ProductRepositories;
import ru.batov.wbmain.services.CheckProductWbServices;
import ru.batov.wbmain.services.updateCatalog;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private ConfigurableApplicationContext context;

    public RestController(ConfigurableApplicationContext context) {
        this.context = context;
    }

    @GetMapping("/getVariables")
    public String getVariables() {
        LocalDateTime finish = LocalDateTime.now();
        long seconds = java.time.Duration.between(GlobalVariables.start, finish).getSeconds();
        long countProductEntity = context.getBean(ProductRepositories.class).getCountProductEntity();
         return "ThreadCount = " + GlobalVariables.ThreadCount + " NewProductCount = " + GlobalVariables.NewProductCount + " UpdateProductCount = " + GlobalVariables.UpdateProductCount + " ExceptionCount = " + GlobalVariables.ExceptionCount + " DuplicateProductCount = " + GlobalVariables.DuplicateProductCount + " NullProductCount = " + GlobalVariables.NullProductCount  + " countProductEntity = " + countProductEntity+ " Время работы программы = " + seconds + " секунд" + " Осталось проверить " +  GlobalVariables.HashMap.toString();
    }

    @GetMapping("/stop")
    public String stop() {
        updateCatalog bean = context.getBean(updateCatalog.class);
        bean.updateCatalog();
        return "stop";
    }

    @GetMapping("/start")
    public String start() {
        GlobalVariables.start = LocalDateTime.now();
        CheckProductWbServices bean = context.getBean(CheckProductWbServices.class);
        bean.operator();
        //bean.manegeDiscount();
        return "start";

    }

    @GetMapping("/getCountProductEntity")
    public String getCountProductEntity() {

        CheckProductWbServices bean = context.getBean(CheckProductWbServices.class);
        bean.deleteDuplicate();
        return "getCountProductEntity";
    }





}
