package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestFactory {
    private static final String DEFAULT_ENCODING = "UTF-8";

    private void configureHeaders(Map<String, String> map, Request<?> request, ExecutionContext executionContext, ClientConfiguration clientConfiguration) {
        URI endpoint = request.getEndpoint();
        String host = endpoint.getHost();
        if (HttpUtils.isUsingNonDefaultPort(endpoint)) {
            host = host + ":" + endpoint.getPort();
        }
        map.put(HttpHeader.HOST, host);
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        if (map.get("Content-Type") == null || map.get("Content-Type").isEmpty()) {
            map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.lowerCase("UTF-8"));
        }
        if (executionContext == null || executionContext.getContextUserAgent() == null) {
            return;
        }
        map.put(HttpHeader.USER_AGENT, createUserAgentString(clientConfiguration, executionContext.getContextUserAgent()));
    }

    private String createUserAgentString(ClientConfiguration clientConfiguration, String str) {
        if (clientConfiguration.getUserAgent().contains(str)) {
            return clientConfiguration.getUserAgent();
        }
        return clientConfiguration.getUserAgent() + " " + str;
    }

    public HttpRequest createHttpRequest(Request<?> request, ClientConfiguration clientConfiguration, ExecutionContext executionContext) {
        boolean z = true;
        String strAppendUri = HttpUtils.appendUri(request.getEndpoint().toString(), request.getResourcePath(), true);
        String strEncodeParameters = HttpUtils.encodeParameters(request);
        HttpMethodName httpMethod = request.getHttpMethod();
        boolean z2 = request.getContent() != null;
        HttpMethodName httpMethodName = HttpMethodName.POST;
        if ((httpMethod == httpMethodName) && !z2) {
            z = false;
        }
        if (strEncodeParameters != null && z) {
            strAppendUri = strAppendUri + "?" + strEncodeParameters;
        }
        HashMap map = new HashMap();
        configureHeaders(map, request, executionContext, clientConfiguration);
        InputStream content = request.getContent();
        HttpMethodName httpMethodName2 = HttpMethodName.PATCH;
        if (httpMethod == httpMethodName2) {
            map.put("X-HTTP-Method-Override", httpMethodName2.toString());
            httpMethod = httpMethodName;
        }
        if (httpMethod == httpMethodName && request.getContent() == null && strEncodeParameters != null) {
            byte[] bytes = strEncodeParameters.getBytes(StringUtils.UTF8);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            map.put("Content-Length", String.valueOf(bytes.length));
            content = byteArrayInputStream;
        }
        map.put("Accept-Encoding", (clientConfiguration.isEnableGzip() && map.get("Accept-Encoding") == null) ? "gzip" : "identity");
        HttpRequest httpRequest = new HttpRequest(httpMethod.toString(), URI.create(strAppendUri), map, content);
        httpRequest.setStreaming(request.isStreaming());
        return httpRequest;
    }
}
