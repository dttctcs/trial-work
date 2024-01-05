import org.apache.camel.Exchange
import org.apache.camel.Processor
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.slf4j.LoggerFactory

class CsvProcessor implements Processor {
    
    def logger = LoggerFactory.getLogger(this.class.name)

    void process(Exchange exchange) throws Exception {
        def document = exchange.in.getBody(String.class)
        // find out if you need to read the body as different type
        // find out how to read a csv in groovy
        // iterate over rows
        // create a message that is of type Map
        // set the body as message
        logger.info("CsvProcessor started")
        def reader = new StringReader(document)
        def objects = new CSVParser(reader, CSVFormat.DEFAULT
                                    .withHeader()
                                    .withDelimiter(';' as char)
                                    .withNullString('')
                                    .withQuote('"' as char)
                                    .withIgnoreHeaderCase()
                                    .withIgnoreSurroundingSpaces(false))

        objects.each { obj ->
            logger.info(obj.toString())
        }
        
    }
}