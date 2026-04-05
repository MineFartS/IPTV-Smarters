package c.f.a.c.m.b;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends c.f.a.c.j.b.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // c.f.a.c.j.b.b
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 3:
                break;
            case 4:
            case 6:
                break;
            case 5:
            default:
                return false;
            case 7:
                break;
            case 8:
                b0((l) c.f.a.c.j.b.c.a(parcel, l.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
