package com.amplifyframework.storage.result;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class StorageDownloadFileResult {
    private final File file;

    private StorageDownloadFileResult(File file) {
        this.file = file;
    }

    public static StorageDownloadFileResult fromFile(File file) {
        file.getClass();
        return new StorageDownloadFileResult(file);
    }

    public File getFile() {
        return this.file;
    }
}
