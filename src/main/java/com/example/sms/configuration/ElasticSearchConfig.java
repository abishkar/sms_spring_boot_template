package com.example.sms.configuration;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//https://medium.com/faun/java-high-level-rest-client-elasticsearch-7-be4fb247c286

@Configuration
public class ElasticSearchConfig  {

    private static final Logger LOG = LoggerFactory.getLogger(ElasticSearchConfig.class);
    
    private RestHighLevelClient restHighLevelClient;

    @Bean
    public  RestHighLevelClient buildClient() {
        try {
            restHighLevelClient = new RestHighLevelClient(
                    RestClient.builder(
                            new HttpHost("localhost", 9200, "http")));
                          
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }
        return restHighLevelClient;
    }
}