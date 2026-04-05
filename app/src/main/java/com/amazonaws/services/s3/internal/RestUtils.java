package com.amazonaws.services.s3.internal;

import com.amazonaws.Request;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RestUtils {
    private static final List<String> SIGNED_PARAMETERS = Arrays.asList("acl", "torrent", "logging", "location", "policy", "requestPayment", "versioning", "versions", "versionId", TransferService.INTENT_KEY_NOTIFICATION, "uploadId", "uploads", "partNumber", "website", "delete", "lifecycle", "tagging", "cors", "restore", "replication", "accelerate", "inventory", "analytics", "metrics", ResponseHeaderOverrides.RESPONSE_HEADER_CACHE_CONTROL, ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_DISPOSITION, ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_ENCODING, ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_LANGUAGE, ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_TYPE, ResponseHeaderOverrides.RESPONSE_HEADER_EXPIRES);

    public static <T> String makeS3CanonicalString(String str, String str2, Request<T> request, String str3) {
        return makeS3CanonicalString(str, str2, request, str3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.lang.String makeS3CanonicalString(java.lang.String r10, java.lang.String r11, com.amazonaws.Request<T> r12, java.lang.String r13, java.util.Collection<java.lang.String> r14) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.internal.RestUtils.makeS3CanonicalString(java.lang.String, java.lang.String, com.amazonaws.Request, java.lang.String, java.util.Collection):java.lang.String");
    }
}
