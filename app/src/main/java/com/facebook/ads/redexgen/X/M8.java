package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M8 {
    public static Bitmap A00(M7 m7) {
        byte[] bArrDecode = Base64.decode(m7.A01(C0856Lz.A01), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Drawable A01(X2 x2, M7 m7) {
        return new BitmapDrawable(x2.getResources(), A00(m7));
    }
}
