package io.swagger.api.factories;

import io.swagger.api.WarningApiService;
import io.swagger.api.impl.WarningApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T15:48:07.165Z[GMT]")
public class WarningApiServiceFactory {
    private final static WarningApiService service = new WarningApiServiceImpl();

    public static WarningApiService getWarningApi() {
        return service;
    }
}
