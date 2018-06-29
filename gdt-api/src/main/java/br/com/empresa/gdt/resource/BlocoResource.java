package br.com.empresa.gdt.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.empresa.gdt.model.ApiResponse;
import br.com.empresa.gdt.model.Bloco;
import br.com.empresa.gdt.service.BlocoService;

@Component
@Path("bloco")
public class BlocoResource {

    @Autowired
    private BlocoService blocoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        List<Bloco> blocos = blocoService.findAll();
        return Response.ok().entity(blocos).build();
    }

    @GET
    @Path("pesquisa")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findByName(@QueryParam("nome") String nome ) {
        System.out.print(nome);
        List<Bloco> blocos = blocoService.findAll();
        return Response.ok().entity(blocos).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(Bloco bloco) {
        blocoService.save(bloco);
        return Response.ok().entity( new ApiResponse("OK") ).build();
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete( @PathParam("id") Long id) {
        blocoService.delete(id);
        return Response.ok().entity( new ApiResponse("OK") ).build();    
    }

}