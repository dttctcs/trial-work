import org.apache.camel.Exchange
import org.apache.camel.Processor

class Test implements Processor {

    void process(Exchange exchange) throws Exception {
        exchange.in.body = "Hello from processor"
    }
}