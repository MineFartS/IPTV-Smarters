package c.f.a.b.b3.o;

import c.f.a.b.b3.a;
import c.f.a.b.k1;
import c.f.a.b.q1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements a.b {
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
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
