package com.amplifyframework.storage.s3;

import com.amazonaws.auth.AWSCredentialsProvider;

/* JADX INFO: loaded from: classes.dex */
public interface CognitoAuthProvider {
    AWSCredentialsProvider getCredentialsProvider();

    String getIdentityId();
}
