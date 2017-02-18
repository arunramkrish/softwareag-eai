package com.softwareag.customcomp;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The customcomp producer.
 */
public class customcompProducer extends DefaultProducer {
    private static final Logger LOG = LoggerFactory.getLogger(customcompProducer.class);
    private customcompEndpoint endpoint;

    public customcompProducer(customcompEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());    
    }

}
