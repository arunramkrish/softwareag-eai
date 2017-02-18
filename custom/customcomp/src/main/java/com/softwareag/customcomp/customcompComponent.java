package com.softwareag.customcomp;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;

import org.apache.camel.impl.UriEndpointComponent;

/**
 * Represents the component that manages {@link customcompEndpoint}.
 */
public class customcompComponent extends UriEndpointComponent {
    
    public customcompComponent() {
        super(customcompEndpoint.class);
    }

    public customcompComponent(CamelContext context) {
        super(context, customcompEndpoint.class);
    }

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new customcompEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
