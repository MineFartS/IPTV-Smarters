package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24226b;

    public GooglePlayServicesManifestException(int i2, @RecentlyNonNull String str) {
        super(str);
        this.f24226b = i2;
    }
}
