package com.softwareag.demo;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;

import org.apache.camel.impl.UriEndpointComponent;

/**
 * Represents the component that manages {@link demoEndpoint}.
 */
public class demoComponent extends UriEndpointComponent {
    
    public demoComponent() {
        super(demoEndpoint.class);
    }

    public demoComponent(CamelContext context) {
        super(context, demoEndpoint.class);
    }

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new demoEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
