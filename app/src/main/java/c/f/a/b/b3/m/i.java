package c.f.a.b.b3.m;

import c.f.a.b.b3.a;
import c.f.a.b.k1;
import c.f.a.b.q1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i implements a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6579b;

    public i(String str) {
        this.f6579b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return c.f.a.b.b3.b.a(this);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ k1 getWrappedMetadataFormat() {
        return c.f.a.b.b3.b.b(this);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ void populateMediaMetadata(q1.b bVar) {
        c.f.a.b.b3.b.c(this, bVar);
    }

    public String toString() {
        return this.f6579b;
    }
}
