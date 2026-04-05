package io.realm.internal;

import e.a.g.c;
import e.a.g.d;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TableQuery implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f30413b = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f30414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30416e = true;

    public TableQuery(c cVar, Table table, long j2) {
        this.f30414c = cVar;
        this.f30415d = j2;
        cVar.a(this);
    }

    public static native long nativeGetFinalizerPtr();

    public void a() {
        if (this.f30416e) {
            return;
        }
        String strNativeValidateQuery = nativeValidateQuery(this.f30415d);
        if (!strNativeValidateQuery.equals(BuildConfig.FLAVOR)) {
            throw new UnsupportedOperationException(strNativeValidateQuery);
        }
        this.f30416e = true;
    }

    @Override // e.a.g.d
    public long getNativeFinalizerPtr() {
        return f30413b;
    }

    @Override // e.a.g.d
    public long getNativePtr() {
        return this.f30415d;
    }

    public final native String nativeValidateQuery(long j2);
}
