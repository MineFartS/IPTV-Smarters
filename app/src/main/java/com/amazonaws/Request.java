package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface Request<T> {
    void addHeader(String str, String str2);

    void addParameter(String str, String str2);

    AWSRequestMetrics getAWSRequestMetrics();

    InputStream getContent();

    URI getEndpoint();

    Map<String, String> getHeaders();

    String getHostPrefix();

    HttpMethodName getHttpMethod();

    AmazonWebServiceRequest getOriginalRequest();

    Map<String, String> getParameters();

    String getResourcePath();

    String getServiceName();

    long getTimeOffset();

    boolean isStreaming();

    void setAWSRequestMetrics(AWSRequestMetrics aWSRequestMetrics);

    void setContent(InputStream inputStream);

    void setEndpoint(URI uri);

    void setHeaders(Map<String, String> map);

    void setHostPrefix(String str);

    void setHttpMethod(HttpMethodName httpMethodName);

    void setParameters(Map<String, String> map);

    void setResourcePath(String str);

    void setStreaming(boolean z);

    @Deprecated
    void setTimeOffset(int i2);

    void setTimeOffset(long j2);

    Request<T> withParameter(String str, String str2);

    @Deprecated
    Request<T> withTimeOffset(int i2);

    Request<T> withTimeOffset(long j2);
}
