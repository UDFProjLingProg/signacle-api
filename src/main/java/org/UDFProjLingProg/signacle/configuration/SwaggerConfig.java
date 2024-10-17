package org.UDFProjLingProg.signacle.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "Swagger - SignacleApi",
        version = "1.0",
        description = "O Signacle api é um motor de busca com objetivo de consulta e gerenciamento de Libras, principalmente de suas representações visuais."
    ),
    servers = {
        @Server(
            description = "Local Env",
            url = "http://localhost:8081"
        )
    }
)
public class SwaggerConfig {

}
