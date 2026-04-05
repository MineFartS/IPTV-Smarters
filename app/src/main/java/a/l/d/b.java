package a.l.d;

import a.l.d.y;
import a.p.f;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f2250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f2252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f2257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CharSequence f2259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f2260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<String> f2261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2262o;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(a.l.d.a aVar) {
        int size = aVar.f2494c.size();
        this.f2249b = new int[size * 5];
        if (!aVar.f2500i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2250c = new ArrayList<>(size);
        this.f2251d = new int[size];
        this.f2252e = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            y.a aVar2 = aVar.f2494c.get(i2);
            int i4 = i3 + 1;
            this.f2249b[i3] = aVar2.f2507a;
            ArrayList<String> arrayList = this.f2250c;
            Fragment fragment = aVar2.f2508b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f2249b;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.f2509c;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.f2510d;
            int i7 = i6 + 1;
            iArr[i6] = aVar2.f2511e;
            iArr[i7] = aVar2.f2512f;
            this.f2251d[i2] = aVar2.f2513g.ordinal();
            this.f2252e[i2] = aVar2.f2514h.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.f2253f = aVar.f2499h;
        this.f2254g = aVar.f2502k;
        this.f2255h = aVar.v;
        this.f2256i = aVar.f2503l;
        this.f2257j = aVar.f2504m;
        this.f2258k = aVar.f2505n;
        this.f2259l = aVar.f2506o;
        this.f2260m = aVar.p;
        this.f2261n = aVar.q;
        this.f2262o = aVar.r;
    }

    public b(Parcel parcel) {
        this.f2249b = parcel.createIntArray();
        this.f2250c = parcel.createStringArrayList();
        this.f2251d = parcel.createIntArray();
        this.f2252e = parcel.createIntArray();
        this.f2253f = parcel.readInt();
        this.f2254g = parcel.readString();
        this.f2255h = parcel.readInt();
        this.f2256i = parcel.readInt();
        this.f2257j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2258k = parcel.readInt();
        this.f2259l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2260m = parcel.createStringArrayList();
        this.f2261n = parcel.createStringArrayList();
        this.f2262o = parcel.readInt() != 0;
    }

    public a.l.d.a b(n nVar) {
        a.l.d.a aVar = new a.l.d.a(nVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f2249b.length) {
            y.a aVar2 = new y.a();
            int i4 = i2 + 1;
            aVar2.f2507a = this.f2249b[i2];
            if (n.G0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f2249b[i4]);
            }
            String str = this.f2250c.get(i3);
            aVar2.f2508b = str != null ? nVar.g0(str) : null;
            aVar2.f2513g = f.c.values()[this.f2251d[i3]];
            aVar2.f2514h = f.c.values()[this.f2252e[i3]];
            int[] iArr = this.f2249b;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.f2509c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.f2510d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f2511e = i10;
            int i11 = iArr[i9];
            aVar2.f2512f = i11;
            aVar.f2495d = i6;
            aVar.f2496e = i8;
            aVar.f2497f = i10;
            aVar.f2498g = i11;
            aVar.f(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f2499h = this.f2253f;
        aVar.f2502k = this.f2254g;
        aVar.v = this.f2255h;
        aVar.f2500i = true;
        aVar.f2503l = this.f2256i;
        aVar.f2504m = this.f2257j;
        aVar.f2505n = this.f2258k;
        aVar.f2506o = this.f2259l;
        aVar.p = this.f2260m;
        aVar.q = this.f2261n;
        aVar.r = this.f2262o;
        aVar.y(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f2249b);
        parcel.writeStringList(this.f2250c);
        parcel.writeIntArray(this.f2251d);
        parcel.writeIntArray(this.f2252e);
        parcel.writeInt(this.f2253f);
        parcel.writeString(this.f2254g);
        parcel.writeInt(this.f2255h);
        parcel.writeInt(this.f2256i);
        TextUtils.writeToParcel(this.f2257j, parcel, 0);
        parcel.writeInt(this.f2258k);
        TextUtils.writeToParcel(this.f2259l, parcel, 0);
        parcel.writeStringList(this.f2260m);
        parcel.writeStringList(this.f2261n);
        parcel.writeInt(this.f2262o ? 1 : 0);
    }
}
