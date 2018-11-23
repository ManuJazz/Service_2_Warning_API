package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.WarningItem;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T15:48:07.165Z[GMT]")

public abstract class WarningApiService {
    
    public abstract Response addwarning(WarningItem body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response deleteWarning(Long warningId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getWarningById(Long warningId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getallwarnings(SecurityContext securityContext) throws NotFoundException;
    
}

