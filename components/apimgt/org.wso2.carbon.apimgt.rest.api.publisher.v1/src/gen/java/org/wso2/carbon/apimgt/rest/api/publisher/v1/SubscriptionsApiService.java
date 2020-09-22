package org.wso2.carbon.apimgt.rest.api.publisher.v1;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.*;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.*;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.wso2.carbon.apimgt.api.APIManagementException;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIMonetizationUsageDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ErrorDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.SubscriberInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.SubscriptionListDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.SubscriptionsApi.*;


public interface SubscriptionsApiService {
      public Response subscriptionsBlockSubscriptionPost(String subscriptionId, BlockStateEnum blockState, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response subscriptionsGet(String apiId, Integer limit, Integer offset, String ifNoneMatch, String query, MessageContext messageContext) throws APIManagementException;
      public Response subscriptionsSubscriptionIdSubscriberInfoGet(String subscriptionId, MessageContext messageContext) throws APIManagementException;
      public Response subscriptionsSubscriptionIdUsageGet(String subscriptionId, MessageContext messageContext) throws APIManagementException;
      public Response subscriptionsUnblockSubscriptionPost(String subscriptionId, String ifMatch, MessageContext messageContext) throws APIManagementException;
}
