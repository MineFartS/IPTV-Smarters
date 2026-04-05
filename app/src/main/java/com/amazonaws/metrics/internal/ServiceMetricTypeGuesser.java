package com.amazonaws.metrics.internal;

import com.amazonaws.Request;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.SimpleThroughputMetricType;
import com.amazonaws.metrics.ThroughputMetricType;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;

/* JADX INFO: loaded from: classes.dex */
public enum ServiceMetricTypeGuesser {
    ;

    public static ThroughputMetricType guessThroughputMetricType(Request<?> request, String str, String str2) {
        if (!AwsSdkMetrics.isMetricsEnabled() || !request.getOriginalRequest().getClass().getName().startsWith("com.amazonaws.services.s3")) {
            return null;
        }
        return new SimpleThroughputMetricType(S3ServiceMetric.SERVICE_NAME_PREFIX + str, request.getServiceName(), S3ServiceMetric.SERVICE_NAME_PREFIX + str2);
    }
}
