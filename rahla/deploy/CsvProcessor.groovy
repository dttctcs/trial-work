import org.apache.camel.Exchange
import org.apache.camel.Processor
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.slf4j.LoggerFactory

class CsvProcessor implements Processor {
    
    def logger = LoggerFactory.getLogger(this.class.name)

    void process(Exchange exchange) throws Exception {
        def document = exchange.in.getBody(String.class)
        logger.info("CsvProcessor started")
        def reader = new StringReader(document)

        
    }
}