package org.bob.cxfrs.beans;

import org.apache.camel.builder.RouteBuilder;

public class EmployeeServiceRouteBuilder extends RouteBuilder {
    public void configure() throws Exception {
        from("cxfrs://bean://restService")
                .process(new EmployeeServiceProcessor())
                .to("file:/home/michael/camel-logs");
    }
}
