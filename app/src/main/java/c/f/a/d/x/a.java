package c.f.a.d.x;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0180a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f15253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f15254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f15255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f15256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15258g;

    /* JADX INFO: renamed from: c.f.a.d.x.a$a, reason: collision with other inner class name */
    public static class C0180a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long f15259a = s.a(l.c(1900, 0).f15326g);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f15260b = s.a(l.c(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f15326g);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f15262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f15263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f15264f;

        public b(a aVar) {
            this.f15261c = f15259a;
            this.f15262d = f15260b;
            this.f15264f = f.b(Long.MIN_VALUE);
            this.f15261c = aVar.f15253b.f15326g;
            this.f15262d = aVar.f15254c.f15326g;
            this.f15263e = Long.valueOf(aVar.f15256e.f15326g);
            this.f15264f = aVar.f15255d;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f15264f);
            l lVarD = l.d(this.f15261c);
            l lVarD2 = l.d(this.f15262d);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l2 = this.f15263e;
            return new a(lVarD, lVarD2, cVar, l2 == null ? null : l.d(l2.longValue()), null);
        }

        public b b(long j2) {
            this.f15263e = Long.valueOf(j2);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean a(long j2);
    }

    public a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f15253b = lVar;
        this.f15254c = lVar2;
        this.f15256e = lVar3;
        this.f15255d = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f15258g = lVar.y(lVar2) + 1;
        this.f15257f = (lVar2.f15323d - lVar.f15323d) + 1;
    }

    public /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0180a c0180a) {
        this(lVar, lVar2, cVar, lVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15253b.equals(aVar.f15253b) && this.f15254c.equals(aVar.f15254c) && a.i.q.d.a(this.f15256e, aVar.f15256e) && this.f15255d.equals(aVar.f15255d);
    }

    public l f(l lVar) {
        return lVar.compareTo(this.f15253b) < 0 ? this.f15253b : lVar.compareTo(this.f15254c) > 0 ? this.f15254c : lVar;
    }

    public c h() {
        return this.f15255d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15253b, this.f15254c, this.f15256e, this.f15255d});
    }

    public l j() {
        return this.f15254c;
    }

    public int k() {
        return this.f15258g;
    }

    public l l() {
        return this.f15256e;
    }

    public l m() {
        return this.f15253b;
    }

    public int n() {
        return this.f15257f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f15253b, 0);
        parcel.writeParcelable(this.f15254c, 0);
        parcel.writeParcelable(this.f15256e, 0);
        parcel.writeParcelable(this.f15255d, 0);
    }
}
