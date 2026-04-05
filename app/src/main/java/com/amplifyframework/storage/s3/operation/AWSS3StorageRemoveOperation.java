package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageRemoveOperation;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.request.AWSS3StorageRemoveRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.utils.S3Keys;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageRemoveOperation extends StorageRemoveOperation<AWSS3StorageRemoveRequest> {
    private final CognitoAuthProvider cognitoAuthProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageRemoveResult> onSuccess;
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageRemoveOperation(StorageService storageService, ExecutorService executorService, CognitoAuthProvider cognitoAuthProvider, AWSS3StorageRemoveRequest aWSS3StorageRemoveRequest, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StorageRemoveRequest);
        aWSS3StorageRemoveRequest.getClass();
        storageService.getClass();
        this.storageService = storageService;
        executorService.getClass();
        this.executorService = executorService;
        this.cognitoAuthProvider = cognitoAuthProvider;
        consumer.getClass();
        this.onSuccess = consumer;
        consumer2.getClass();
        this.onError = consumer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda$start$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a() {
        try {
            try {
                String identityId = this.cognitoAuthProvider.getIdentityId();
                StorageAccessLevel accessLevel = getRequest().getAccessLevel();
                if (getRequest().getTargetIdentityId() != null) {
                    identityId = getRequest().getTargetIdentityId();
                }
                this.storageService.deleteObject(S3Keys.createServiceKey(accessLevel, identityId, getRequest().getKey()));
                this.onSuccess.accept(StorageRemoveResult.fromKey(getRequest().getKey()));
            } catch (StorageException e2) {
                this.onError.accept(e2);
            }
        } catch (Exception e3) {
            this.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage remove operation", e3, "See attached exception for more information and suggestions"));
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new Runnable() { // from class: c.b.e.a.b.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f5082b.a();
            }
        });
    }
}
