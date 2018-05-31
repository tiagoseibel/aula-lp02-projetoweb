package br.com.empresa.gdt;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.empresa.gdt.resource.BlocoResource;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register( BlocoResource.class );
    }
}
