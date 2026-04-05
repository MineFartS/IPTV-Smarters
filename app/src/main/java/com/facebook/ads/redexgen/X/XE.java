package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XE extends AsyncTask<String, Void, Bitmap[]> implements C8A {
    public static byte[] A0A;
    public static String[] A0B;
    public int A00;
    public int A01;
    public InterfaceC0896No A02;
    public boolean A03;
    public final int A04;
    public final int A05;

    @Nullable
    public final WeakReference<C0894Nm> A06;
    public final WeakReference<X2> A07;

    @Nullable
    public final WeakReference<ImageView> A08;

    @Nullable
    public final WeakReference<ViewGroup> A09;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    public static void A02() {
        A0B = new String[]{"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    }

    public XE(ViewGroup viewGroup, int i2, int i3, X2 x2) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(x2);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i2;
        this.A05 = i3;
    }

    public XE(ViewGroup viewGroup, X2 x2) {
        this(viewGroup, 12, 16, x2);
    }

    public XE(ImageView imageView, X2 x2) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(x2);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public XE(C0894Nm c0894Nm, X2 x2) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(x2);
        this.A06 = new WeakReference<>(c0894Nm);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A03(Bitmap[] bitmapArr) throws Throwable {
        C0894Nm c0894Nm;
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                ImageView imageView = this.A08.get();
                if (bitmapArr[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(bitmapArr[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(bitmapArr[0]);
                }
            }
            if (this.A06 != null && (c0894Nm = this.A06.get()) != null) {
                c0894Nm.setImage(bitmapArr[0], bitmapArr[1]);
            }
            if (this.A09 != null && this.A09.get() != null && bitmapArr[1] != null) {
                C0856Lz.A0W(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), bitmapArr[1]));
            }
            if (this.A02 != null) {
                this.A02.A9k(bitmapArr[0] != null);
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    private final Bitmap[] A04(String... strArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmapA0J = null;
            Bitmap bitmapA01 = null;
            X2 x2 = this.A07.get();
            if (x2 == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmapA0J = new C7C(x2).A0J(str, this.A00, this.A01);
                if (bitmapA0J != null && !this.A03) {
                    bitmapA01 = M6.A01(x2, bitmapA0J, this.A04, this.A05);
                }
            } catch (Throwable th) {
                x2.A04().A86(A00(0, 7, 16), C05228d.A1C, new C05238e(th));
            }
            return new Bitmap[]{bitmapA0J, bitmapA01};
        } catch (Throwable th2) {
            C0822Kp.A00(th2, this);
            return null;
        }
    }

    public final XE A05() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final XE A06(int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        return this;
    }

    public final XE A07(InterfaceC0896No interfaceC0896No) {
        this.A02 = interfaceC0896No;
        return this;
    }

    public final void A08(String str) {
        if (TextUtils.isEmpty(str)) {
            InterfaceC0896No interfaceC0896No = this.A02;
            if (interfaceC0896No != null) {
                interfaceC0896No.A9k(false);
                return;
            }
            return;
        }
        executeOnExecutor(M4.A06, str);
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    @Nullable
    public final X2 A5H() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            return A04(strArr);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A03(bitmapArr);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
