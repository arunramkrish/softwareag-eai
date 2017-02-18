package com.softwareag.demo;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The demo producer.
 */
public class demoProducer extends DefaultProducer {
    private static final Logger LOG = LoggerFactory.getLogger(demoProducer.class);
    private demoEndpoint endpoint;

    public demoProducer(demoEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());    
    }

}
