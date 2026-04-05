package androidx.core.graphics.drawable;

import a.d0.b;
import android.content.res.ColorStateList;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4362b = bVar.p(iconCompat.f4362b, 1);
        iconCompat.f4364d = bVar.j(iconCompat.f4364d, 2);
        iconCompat.f4365e = bVar.r(iconCompat.f4365e, 3);
        iconCompat.f4366f = bVar.p(iconCompat.f4366f, 4);
        iconCompat.f4367g = bVar.p(iconCompat.f4367g, 5);
        iconCompat.f4368h = (ColorStateList) bVar.r(iconCompat.f4368h, 6);
        iconCompat.f4370j = bVar.t(iconCompat.f4370j, 7);
        iconCompat.f4371k = bVar.t(iconCompat.f4371k, 8);
        iconCompat.t();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.x(true, true);
        iconCompat.u(bVar.f());
        int i2 = iconCompat.f4362b;
        if (-1 != i2) {
            bVar.F(i2, 1);
        }
        byte[] bArr = iconCompat.f4364d;
        if (bArr != null) {
            bVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4365e;
        if (parcelable != null) {
            bVar.H(parcelable, 3);
        }
        int i3 = iconCompat.f4366f;
        if (i3 != 0) {
            bVar.F(i3, 4);
        }
        int i4 = iconCompat.f4367g;
        if (i4 != 0) {
            bVar.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f4368h;
        if (colorStateList != null) {
            bVar.H(colorStateList, 6);
        }
        String str = iconCompat.f4370j;
        if (str != null) {
            bVar.J(str, 7);
        }
        String str2 = iconCompat.f4371k;
        if (str2 != null) {
            bVar.J(str2, 8);
        }
    }
}
