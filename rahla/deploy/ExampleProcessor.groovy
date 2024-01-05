import org.apache.camel.Exchange
import org.apache.camel.Processor
import groovy.sql.Sql

class ExampleProcessor implements Processor {

    void process(Exchange exchange) throws Exception {
        exchange.in.body = "Hello"
    }
}