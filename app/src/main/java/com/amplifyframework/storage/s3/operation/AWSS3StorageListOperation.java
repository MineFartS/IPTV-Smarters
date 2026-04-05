package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageListOperation;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.request.AWSS3StorageListRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.utils.S3Keys;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageListOperation extends StorageListOperation<AWSS3StorageListRequest> {
    private final CognitoAuthProvider cognitoAuthProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageListResult> onSuccess;
    private final StorageService storageService;

    public AWSS3StorageListOperation(StorageService storageService, ExecutorService executorService, CognitoAuthProvider cognitoAuthProvider, AWSS3StorageListRequest aWSS3StorageListRequest, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StorageListRequest);
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
            try {
                String identityId = this.cognitoAuthProvider.getIdentityId();
                StorageAccessLevel accessLevel = getRequest().getAccessLevel();
                if (getRequest().getTargetIdentityId() != null) {
                    identityId = getRequest().getTargetIdentityId();
                }
                this.onSuccess.accept(StorageListResult.fromItems(this.storageService.listFiles(S3Keys.createServiceKey(accessLevel, identityId, getRequest().getPath()))));
            } catch (StorageException e2) {
                this.onError.accept(e2);
            }
        } catch (Exception e3) {
            this.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage list operation", e3, "See attached exception for more information and suggestions"));
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new Runnable() { // from class: c.b.e.a.b.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f5081b.a();
            }
        });
    }
}
