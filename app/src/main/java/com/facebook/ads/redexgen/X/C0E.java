package com.facebook.ads.redexgen.X;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0E implements Comparator<File> {
    public C0E() {
    }

    private int A00(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compare(File file, File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}
