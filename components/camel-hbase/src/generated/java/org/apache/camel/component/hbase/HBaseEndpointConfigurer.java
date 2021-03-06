/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hbase;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HBaseEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        HBaseEndpoint target = (HBaseEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cellmappingstrategyfactory":
        case "cellMappingStrategyFactory": target.setCellMappingStrategyFactory(property(camelContext, org.apache.camel.component.hbase.mapping.CellMappingStrategyFactory.class, value)); return true;
        case "filters": target.setFilters(property(camelContext, java.util.List.class, value)); return true;
        case "mappingstrategyclassname":
        case "mappingStrategyClassName": target.setMappingStrategyClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "mappingstrategyname":
        case "mappingStrategyName": target.setMappingStrategyName(property(camelContext, java.lang.String.class, value)); return true;
        case "rowmapping":
        case "rowMapping": target.setRowMapping(property(camelContext, java.util.Map.class, value)); return true;
        case "rowmodel":
        case "rowModel": target.setRowModel(property(camelContext, org.apache.camel.component.hbase.model.HBaseRow.class, value)); return true;
        case "usergroupinformation":
        case "userGroupInformation": target.setUserGroupInformation(property(camelContext, org.apache.hadoop.security.UserGroupInformation.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "remove": target.setRemove(property(camelContext, boolean.class, value)); return true;
        case "removehandler":
        case "removeHandler": target.setRemoveHandler(property(camelContext, org.apache.camel.component.hbase.HBaseRemoveHandler.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxresults":
        case "maxResults": target.setMaxResults(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

