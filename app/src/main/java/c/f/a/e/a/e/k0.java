package c.f.a.e.a.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k0 extends f0 implements l0 {
    public k0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // c.f.a.e.a.e.f0
    public final boolean J(int i2, Parcel parcel) {
        switch (i2) {
            case 2:
                h1(parcel.readInt(), (Bundle) g0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int i3 = parcel.readInt();
                h(i3);
                return true;
            case 4:
                int i4 = parcel.readInt();
                j(i4);
                return true;
            case 5:
                n2(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) g0.a(parcel, creator);
                f0(bundle);
                return true;
            case 7:
                a2((Bundle) g0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) g0.a(parcel, creator2);
                A1(bundle2);
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) g0.a(parcel, creator3);
                f1(bundle3);
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                F1((Bundle) g0.a(parcel, creator4), (Bundle) g0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                c2((Bundle) g0.a(parcel, creator5), (Bundle) g0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                x2((Bundle) g0.a(parcel, creator6), (Bundle) g0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                n();
                return true;
            case 15:
                i();
                return true;
        }
    }
}
