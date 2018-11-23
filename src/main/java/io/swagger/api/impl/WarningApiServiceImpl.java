package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.WarningItem;


import java.util.*;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T15:48:07.165Z[GMT]")

public class WarningApiServiceImpl extends WarningApiService {
    List<WarningItem> lw=new ArrayList<WarningItem>();
    
    @Override
    public Response addwarning(WarningItem body, SecurityContext securityContext) throws NotFoundException {
        WarningItem wi=new WarningItem();
        wi.setIdWarning(body.getIdWarning());
        wi.setDate(body.getDate());
        wi.setLength(body.getLength());
        lw.add(wi);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Warning Added!")).build();
    }
    
    @Override
    public Response deleteWarning(Long warningId, String apiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        for(int i=0;i<lw.size();i++){
            if(lw.get(i).getIdWarning()==warningId)
            lw.remove(lw.get(i));
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Warning Deleted!")).build();
    }
    
    @Override
    public Response getWarningById(Long warningId, SecurityContext securityContext) throws NotFoundException {
        WarningItem wi=new WarningItem();

        for(int i=0;i<lw.size();i++){
            if(lw.get(i).getIdWarning()==warningId){
               wi=lw.get(i);
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, wi.toString())).build();
    }
    
    @Override
    public Response getallwarnings(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, lw.toString())).build();
    }
    
}

