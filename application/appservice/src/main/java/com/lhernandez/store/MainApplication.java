package com.lhernandez.store;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(info = @Info(title = "Micro servicio tiendas",
                    version = "API's Swagger microservicio",
                    description = "Micro servicio de tienda para agregar,eliminar,actualizar productos",
                    license = @License(name = "Apache 2.0"),
                    contact = @Contact(url = "S",name = "MS-name",email = "")),
                    security = {@SecurityRequirement(name="")},
    servers = {
        @Server(description = "Ambiente de aplicacion", url = "http://localhost:8080/shop")
    })
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
