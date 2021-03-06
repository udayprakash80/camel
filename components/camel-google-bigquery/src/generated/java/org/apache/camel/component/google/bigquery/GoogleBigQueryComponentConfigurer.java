/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.bigquery;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleBigQueryComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleBigQueryComponent target = (GoogleBigQueryComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class, value)); return true;
        case "datasetid":
        case "datasetId": target.setDatasetId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "projectid":
        case "projectId": target.setProjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

