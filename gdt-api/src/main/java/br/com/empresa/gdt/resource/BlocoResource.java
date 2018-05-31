package br.com.empresa.gdt.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

}