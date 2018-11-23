package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.WarningApiService;
import io.swagger.api.factories.WarningApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.WarningItem;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/warning")


@io.swagger.annotations.Api(description = "the warning API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T15:48:07.165Z[GMT]")

public class WarningApi  {
   private final WarningApiService delegate;

   public WarningApi(@Context ServletConfig servletContext) {
      WarningApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("WarningApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (WarningApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = WarningApiServiceFactory.getWarningApi();
      }

      this.delegate = delegate;
   }


    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "add a new warning in system", notes = "add a new warning in system", response = Void.class, tags={ "Warning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Warning created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Warning Input", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Warning already exist", response = Void.class) })
    public Response addwarning(@ApiParam(value = "Warning to store" ,required=true) WarningItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addwarning(body,securityContext);
    }

    @DELETE
    @Path("/{warningId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a warning", notes = "", response = Void.class, tags={ "Warning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Warning not found", response = Void.class) })
    public Response deleteWarning(@ApiParam(value = "Warning id to delete",required=true) @PathParam("warningId") Long warningId
,@ApiParam(value = "" )@HeaderParam("api_key") String apiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteWarning(warningId,apiKey,securityContext);
    }

    @GET
    @Path("/{warningId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find warning by ID", notes = "Returns a single warning", response = WarningItem.class, tags={ "Warning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WarningItem.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Warning not found", response = Void.class) })
    public Response getWarningById(@ApiParam(value = "ID of warning to return",required=true) @PathParam("warningId") Long warningId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getWarningById(warningId,securityContext);
    }

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns all registried warnings.", notes = "returns all registried warnings.", response = WarningItem.class, responseContainer = "List", tags={ "Warning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WarningItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getallwarnings(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getallwarnings(securityContext);
    }

}

