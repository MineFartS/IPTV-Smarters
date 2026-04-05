package com.amplifyframework.storage.s3.operation;

import android.annotation.SuppressLint;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageGetUrlOperation;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.request.AWSS3StorageGetPresignedUrlRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.utils.S3Keys;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageGetPresignedUrlOperation extends StorageGetUrlOperation<AWSS3StorageGetPresignedUrlRequest> {
    private final CognitoAuthProvider cognitoAuthProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageGetUrlResult> onSuccess;
    private final StorageService storageService;

    public AWSS3StorageGetPresignedUrlOperation(StorageService storageService, ExecutorService executorService, CognitoAuthProvider cognitoAuthProvider, AWSS3StorageGetPresignedUrlRequest aWSS3StorageGetPresignedUrlRequest, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StorageGetPresignedUrlRequest);
        this.storageService = storageService;
        this.executorService = executorService;
        this.cognitoAuthProvider = cognitoAuthProvider;
        this.onSuccess = consumer;
        this.onError = consumer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda$start$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a() {
        try {
            String identityId = this.cognitoAuthProvider.getIdentityId();
            StorageAccessLevel accessLevel = getRequest().getAccessLevel();
            if (getRequest().getTargetIdentityId() != null) {
                identityId = getRequest().getTargetIdentityId();
            }
            try {
                this.onSuccess.accept(StorageGetUrlResult.fromUrl(this.storageService.getPresignedUrl(S3Keys.createServiceKey(accessLevel, identityId, getRequest().getKey()), getRequest().getExpires())));
            } catch (Exception e2) {
                this.onError.accept(new StorageException("Encountered an issue while generating pre-signed URL", e2, "See included exception for more details and suggestions to fix."));
            }
        } catch (StorageException e3) {
            this.onError.accept(e3);
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    @SuppressLint({"SyntheticAccessor"})
    public void start() {
        this.executorService.submit(new Runnable() { // from class: c.b.e.a.b.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f5080b.a();
            }
        });
    }
}
