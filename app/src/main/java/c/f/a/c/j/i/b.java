package c.f.a.c.j.i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends e implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // c.f.a.c.j.i.d
    public final Bundle B(int i2, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(10);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        g.b(parcelJ, bundle);
        g.b(parcelJ, bundle2);
        Parcel parcelC1 = c1(IMediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE, parcelJ);
        Bundle bundle3 = (Bundle) g.a(parcelC1, Bundle.CREATOR);
        parcelC1.recycle();
        return bundle3;
    }

    @Override // c.f.a.c.j.i.d
    public final Bundle E2(int i2, String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(9);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        g.b(parcelJ, bundle);
        Parcel parcelC1 = c1(IMediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT, parcelJ);
        Bundle bundle2 = (Bundle) g.a(parcelC1, Bundle.CREATOR);
        parcelC1.recycle();
        return bundle2;
    }

    @Override // c.f.a.c.j.i.d
    public final Bundle H0(int i2, String str, String str2, String str3, String str4) {
        Parcel parcelJ = J();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        parcelJ.writeString(null);
        Parcel parcelC1 = c1(3, parcelJ);
        Bundle bundle = (Bundle) g.a(parcelC1, Bundle.CREATOR);
        parcelC1.recycle();
        return bundle;
    }

    @Override // c.f.a.c.j.i.d
    public final int P0(int i2, String str, String str2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i2);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Parcel parcelC1 = c1(1, parcelJ);
        int i3 = parcelC1.readInt();
        parcelC1.recycle();
        return i3;
    }

    @Override // c.f.a.c.j.i.d
    public final Bundle o2(int i2, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(9);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        g.b(parcelJ, bundle);
        Parcel parcelC1 = c1(11, parcelJ);
        Bundle bundle2 = (Bundle) g.a(parcelC1, Bundle.CREATOR);
        parcelC1.recycle();
        return bundle2;
    }

    @Override // c.f.a.c.j.i.d
    public final Bundle v1(int i2, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i2);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        parcelJ.writeString(null);
        g.b(parcelJ, bundle);
        Parcel parcelC1 = c1(8, parcelJ);
        Bundle bundle2 = (Bundle) g.a(parcelC1, Bundle.CREATOR);
        parcelC1.recycle();
        return bundle2;
    }

    @Override // c.f.a.c.j.i.d
    public final Bundle y0(int i2, String str, String str2, String str3) {
        Parcel parcelJ = J();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        Parcel parcelC1 = c1(4, parcelJ);
        Bundle bundle = (Bundle) g.a(parcelC1, Bundle.CREATOR);
        parcelC1.recycle();
        return bundle;
    }

    @Override // c.f.a.c.j.i.d
    public final Bundle z1(int i2, String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        g.b(parcelJ, bundle);
        Parcel parcelC1 = c1(2, parcelJ);
        Bundle bundle2 = (Bundle) g.a(parcelC1, Bundle.CREATOR);
        parcelC1.recycle();
        return bundle2;
    }
}
