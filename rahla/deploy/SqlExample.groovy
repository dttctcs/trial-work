import org.apache.camel.Exchange
import org.apache.camel.Processor
import groovy.sql.Sql
import org.slf4j.LoggerFactory

class SqlExample implements Processor {

    def logger = LoggerFactory.getLogger(this.class.name)

    def dataSource

    def getDataSource() {
        return dataSource
    }

    void setDataSource(dataSource) {
        this.dataSource = dataSource
    }

    void process(Exchange exchange) throws Exception {
        Sql sql = new Sql(dataSource)

        sql.execute """
            INSERT INTO test (id, name, description) VALUES (1, 'foo', 'bar')
        """

        def data = sql.rows('SELECT id, name FROM test;')
        logger.info(data.toString())

    }
}