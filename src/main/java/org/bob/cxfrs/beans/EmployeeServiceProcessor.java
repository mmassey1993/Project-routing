package org.bob.cxfrs.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class EmployeeServiceProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        String msg = exchange.getIn().getBody(String.class);

        exchange.getOut().setBody(msg);
    }
}
