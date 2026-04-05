package com.amazonaws.mobile.client.internal;

import com.amazonaws.mobile.client.Callback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReturningRunnable<R> {
    private final String operationDescription;

    public ReturningRunnable() {
        this.operationDescription = null;
    }

    public ReturningRunnable(String str) {
        this.operationDescription = str;
    }

    public void async(final Callback<R> callback) {
        new Thread(new Runnable() { // from class: com.amazonaws.mobile.client.internal.ReturningRunnable.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    callback.onResult(ReturningRunnable.this.run());
                } catch (Exception e2) {
                    if (ReturningRunnable.this.operationDescription == null) {
                        callback.onError(e2);
                    } else {
                        callback.onError(new Exception(ReturningRunnable.this.operationDescription, e2));
                    }
                }
            }
        }).start();
    }

    public R await() {
        return run();
    }

    public abstract R run();
}
