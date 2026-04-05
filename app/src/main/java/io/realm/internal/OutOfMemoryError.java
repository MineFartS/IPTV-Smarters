package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class OutOfMemoryError extends Error {
    public OutOfMemoryError() {
    }

    public OutOfMemoryError(String str) {
        super(str);
    }

    public OutOfMemoryError(String str, Throwable th) {
        super(str, th);
    }

    public OutOfMemoryError(Throwable th) {
        super(th);
    }
}
