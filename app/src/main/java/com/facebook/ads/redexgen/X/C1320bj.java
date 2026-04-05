package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1320bj implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, K2 {
    public static C7C A0g;
    public static byte[] A0h;
    public static String[] A0i;
    public static final String A0j;
    public static final WeakHashMap<View, WeakReference<C1320bj>> A0k;
    public long A00;

    @Nullable
    public Drawable A01;
    public View.OnTouchListener A02;

    @Nullable
    public View A03;
    public View A04;

    @Nullable
    public View A05;

    @Nullable
    public NativeAdLayout A06;
    public EnumC03500z A07;

    @Nullable
    public C0991Rg A08;
    public C0678Ev A09;

    @Nullable
    public S5 A0A;

    @Nullable
    public C7H A0B;

    @Nullable
    public C05418w A0C;
    public EnumC0798Jp A0D;
    public ViewOnClickListenerC1322bl A0E;

    @Nullable
    public InterfaceC1316bf A0F;
    public C0805Jw A0G;
    public EnumC0806Jx A0H;
    public KD A0I;
    public C0877Mv A0J;

    @Nullable
    public C0895Nn A0K;

    @Nullable
    public C0924Oq A0L;

    @DoNotStrip
    public Q1 A0M;
    public Q2 A0N;
    public String A0O;

    @Nullable
    public String A0P;
    public WeakReference<TA> A0Q;
    public WeakReference<Q1> A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;

    @Nullable
    public C0986Rb A0W;
    public final C7C A0X;
    public final X2 A0Y;
    public final InterfaceC0802Jt A0Z;
    public final K4 A0a;
    public final C0849Ls A0b;
    public final String A0c;
    public final String A0d;
    public final List<View> A0e;
    public volatile boolean A0f;

    public static String A0S(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0h, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0X() {
        A0h = new byte[]{89, 90, 91, -119, 94, 97, 90, 94, -90, -89, -85, -92, -91, -38, -38, -87, -76, -75, -72, -77, -25, -71, -71, -79, -39, 8, -35, -37, -34, 9, -42, 12, 115, 113, 112, 108, -96, -97, 113, 115, -77, -78, -31, -83, -80, -32, -84, -77, -110, -75, 113, -65, -64, -59, 113, -67, -64, -78, -75, -74, -75, -88, -53, -80, -54, -42, -43, -67, -48, -52, -34, -121, -48, -38, -121, -44, -48, -38, -38, -48, -43, -50, -107, -101, -66, -82, -65, -57, -54, -58, -69, -50, -65, 122, -127, 127, -51, -127, 122, -61, -51, 122, -56, -55, -50, 122, -69, 122, -56, -69, -50, -61, -48, -65, 122, -69, -66, -82, -86, -87, -35, -52, -47, -51, -42, -53, -51, -74, -51, -36, -33, -41, -38, -45, -50, -23, -15, -12, -19, -20, -88, -4, -9, -88, -12, -9, -23, -20, -88, -43, -19, -20, -15, -23, -74, -80, -53, -45, -42, -49, -50, -118, -34, -39, -118, -39, -52, -34, -53, -45, -40, -118, -34, -49, -41, -38, -42, -53, -34, -49, -118, -77, -82, -118, -48, -36, -39, -41, -118, -52, -45, -50, -118, -38, -53, -29, -42, -39, -53, -50, -118, -111, -113, -35, -111, -75, -38, -32, -47, -34, -38, -51, -40, -116, -47, -34, -34, -37, -34, -102, 118, -121, -84, -76, -97, -86, -89, -94, 94, -79, -93, -78, 94, -83, -92, 94, -95, -86, -89, -95, -87, -97, -96, -86, -93, 94, -76, -89, -93, -75, -79, -50, -26, -27, -22, -30, -41, -22, -26, -8, -95, -22, -12, -95, -18, -22, -12, -12, -22, -17, -24, -81, -116, -76, -78, -77, 95, -81, -79, -82, -75, -88, -93, -92, 95, -96, 95, -107, -88, -92, -74, -40, -21, -2, -13, 0, -17, -86, -53, -18, -86, 1, -21, -3, -86, -21, -10, -4, -17, -21, -18, 3, -86, -4, -17, -15, -13, -3, -2, -17, -4, -17, -18, -86, 1, -13, -2, -14, -86, -21, -86, -32, -13, -17, 1, -72, -86, -53, -1, -2, -7, -86, -1, -8, -4, -17, -15, -13, -3, -2, -17, -4, -13, -8, -15, -86, -21, -8, -18, -86, -6, -4, -7, -19, -17, -17, -18, -13, -8, -15, -72, -123, -104, -85, -96, -83, -100, 87, -104, -101, 87, -101, -100, -86, -85, -87, -90, -80, -100, -101, -66, -47, -28, -39, -26, -43, -112, -47, -44, -112, -36, -33, -47, -44, -112, -30, -43, -31, -27, -43, -29, -28, -43, -44, -115, -96, -100, -82, 87, -104, -93, -87, -100, -104, -101, -80, 87, -87, -100, -98, -96, -86, -85, -100, -87, -100, -101, 87, -82, -96, -85, -97, 87, -104, 87, -123, -104, -85, -96, -83, -100, 120, -101, 101, 87, 120, -84, -85, -90, 87, -84, -91, -87, -100, -98, -96, -86, -85, -100, -87, -96, -91, -98, 87, -104, -91, -101, 87, -89, -87, -90, -102, -100, -100, -101, -96, -91, -98, 101, -127, -108, -112, -94, 75, -103, -102, -97, 75, -99, -112, -110, -108, -98, -97, -112, -99, -112, -113, 75, -94, -108, -97, -109, 75, -97, -109, -108, -98, 75, 121, -116, -97, -108, -95, -112, 108, -113, -112, -109, 79, -100, -108, -109, -104, -112, 79, -93, -88, -97, -108, 79, -104, -94, 79, -99, -98, -93, 79, -94, -92, -97, -97, -98, -95, -93, -108, -109, 93, -105, -102, -107, -86, -88, -105, -92, -87, -94, -105, -86, -97, -91, -92, -4, -1, DateTimeFieldType.HOUR_OF_DAY, 0, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, DateTimeFieldType.HOUR_OF_HALFDAY, 0, DateTimeFieldType.HALFDAY_OF_DAY, -6, 9, -4, 8, 0, -30, -15, -22, -69, -56, -67, -46, -72, -74, -63, -63, -76, -55, -60, -76, -74, -72, -55, -66, -60, -61, -4, -3, 11, 12, 10, 7, DateTimeFieldType.HOUR_OF_DAY, -90, -93, -97, -94, -86, -89, -84, -93, -54, -57, -52, -55, -67, -62, -61, -47, -63, -48, -57, -50, -46, -57, -51, -52, -75, -72, -86, -83, -118, -83, -91, -88, -102, -99, 122, -99, 97, 98, 89, -100, -102, -91, -91, -98, -99, 89, -90, -88, -85, -98, 89, -83, -95, -102, -89, 89, -88, -89, -100, -98, -94, -91, -105, -102, 119, -102, 124, -88, -91, -93, 120, -97, -102, -28, -41, -22, -33, -20, -37, -44, -59, -39, -41, -55, -61, -40, -42, -59, -46, -41, -48, -59, -40, -51, -45, -46, -94, -98, -109, -85, -111, -90, -92, -109, -96, -91, -98, -109, -90, -101, -95, -96, -15, -13, -16, -18, -16, -11, -26, -27, -32, -11, -13, -30, -17, -12, -19, -30, -11, -22, -16, -17, -32, -36, -48, -42, -50, -39, -52, -48, -36, -37, -31, -46, -27, -31, -79, -82, -83, -84, -79, -83, -80, -93, -94, -99, -78, -80, -97, -84, -79, -86, -97, -78, -89, -83, -84};
    }

    public static void A0Y() {
        A0i = new String[]{"Bl7Z7O36thNMsAQG86cT5hXAswukL2TU", "w0l3kgVUfrf8f1EzcfbBJ9JqF1JIQyF1", "3FYeVZ4P9Hva0brxRfDXnSutu97odoaf", "TkemScCQ72wM3yeu7V5OcaIZTlgQuG0T", "aV5nfdXEnoj7uvLi", "brDFWAS69jf159nGVdOYVvf", "WGIwYSb5Wjcv", "W7skGFSknqdZoaqu210O1mF"};
    }

    static {
        A0Y();
        A0X();
        A0j = C1320bj.class.getSimpleName();
        A0k = new WeakHashMap<>();
    }

    public C1320bj(Context context, String str, InterfaceC0802Jt interfaceC0802Jt, boolean z) {
        this.A0d = UUID.randomUUID().toString();
        this.A0I = KD.A06;
        this.A0Q = new WeakReference<>(null);
        this.A0e = new ArrayList();
        this.A0b = new C0849Ls();
        this.A0V = false;
        this.A0U = false;
        this.A0D = EnumC0798Jp.A04;
        this.A07 = EnumC03500z.A03;
        this.A00 = -1L;
        if (!z) {
            this.A0Y = AnonymousClass52.A04(context);
        } else {
            this.A0Y = AnonymousClass52.A02(context);
        }
        this.A0Y.A0C(this);
        this.A0c = str;
        this.A0Z = interfaceC0802Jt;
        C7C c7c = A0g;
        if (c7c != null) {
            this.A0X = c7c;
        } else {
            this.A0X = new C7C(this.A0Y);
        }
        this.A04 = new View(context);
        this.A0a = new K4(this.A0Y, this);
    }

    public C1320bj(X2 x2, C0986Rb c0986Rb, @Nullable C05418w c05418w, InterfaceC0802Jt interfaceC0802Jt) {
        this((Context) x2, (String) null, interfaceC0802Jt, true);
        this.A0W = c0986Rb;
        this.A0C = c05418w;
        this.A0f = true;
        this.A04 = new View(x2);
    }

    public C1320bj(X2 x2, C0986Rb c0986Rb, @Nullable C05418w c05418w, InterfaceC0802Jt interfaceC0802Jt, @Nullable S5 s5) {
        this(x2, c0986Rb, c05418w, interfaceC0802Jt);
        this.A0A = s5;
    }

    public C1320bj(C1320bj c1320bj) {
        this((Context) c1320bj.A0Y, (String) null, c1320bj.A0Z, true);
        this.A0C = c1320bj.A0C;
        this.A0W = c1320bj.A0W;
        this.A0A = c1320bj.A0A;
        this.A0f = true;
        this.A04 = new View(this.A0Y);
    }

    private int A00() {
        C05418w c05418w = this.A0C;
        if (c05418w != null) {
            return c05418w.A04();
        }
        C0678Ev c0678Ev = this.A09;
        if (c0678Ev == null || c0678Ev.A0H() == null) {
            return 1;
        }
        return this.A09.A0H().A04();
    }

    private int A01() {
        C05418w c05418w = this.A0C;
        if (c05418w != null) {
            return c05418w.A07();
        }
        C0986Rb c0986Rb = this.A0W;
        if (c0986Rb != null) {
            int iA0G = c0986Rb.A0G();
            String[] strArr = A0i;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[7] = "EUscbuPuA5cZxxPx7y6ncGc";
            strArr2[5] = "07NrZ6juCFttxvE5hiFlF8c";
            return iA0G;
        }
        C0678Ev c0678Ev = this.A09;
        if (c0678Ev != null && c0678Ev.A0H() != null) {
            return this.A09.A0H().A07();
        }
        return 0;
    }

    private int A02() {
        C05418w c05418w = this.A0C;
        if (c05418w != null) {
            return c05418w.A08();
        }
        C0986Rb c0986Rb = this.A0W;
        if (c0986Rb != null) {
            int iA0H = c0986Rb.A0H();
            String[] strArr = A0i;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[1] = "wlXrbCoONy6aNPfJSLZ4JGG9g8lWOQWJ";
            strArr2[3] = "zMDzXw8vWIk5v34E7N5RdIcOKoPIh5je";
            return iA0H;
        }
        C0678Ev c0678Ev = this.A09;
        String[] strArr3 = A0i;
        if (strArr3[4].length() != strArr3[6].length()) {
            String[] strArr4 = A0i;
            strArr4[7] = "IJhE7OuQr9AUmHg0gZAU0NE";
            strArr4[5] = "Tpbr9nnLmrgR8Cas3OKWnYo";
            if (c0678Ev == null) {
                return 1000;
            }
        } else {
            String[] strArr5 = A0i;
            strArr5[0] = "x7i9CQzVOJPdqJX1dHOWNRL80PPtBuUS";
            strArr5[2] = "xh5QtfSCbDAINUU48h4MV8p0ljd4aaCa";
            if (c0678Ev == null) {
                return 1000;
            }
        }
        if (c0678Ev.A0H() != null) {
            return this.A09.A0H().A08();
        }
        return 1000;
    }

    private int A03() {
        C05418w c05418w = this.A0C;
        if (c05418w != null) {
            return c05418w.A09();
        }
        C0678Ev c0678Ev = this.A09;
        if (c0678Ev == null || c0678Ev.A0H() == null) {
            return 0;
        }
        return this.A09.A0H().A09();
    }

    public static Drawable A05(X2 x2, Bitmap bitmap, boolean z, @Nullable String str) {
        BitmapDrawable bitmapDrawableA00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(x2.getResources(), bitmap);
        if (z && (bitmapDrawableA00 = C0923Op.A00(x2, str)) != null) {
            return new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawableA00});
        }
        return bitmapDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws K8 {
        KD kdA00 = KI.A00(str2);
        if (kdA00 != null) {
            KD kd = KD.A05;
            String[] strArr = A0i;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[0] = "9sjWaS9CbZxjWOFrlYfgckD2h0ahWze6";
            strArr2[2] = "CgLfFBC4KJYZcdRIWMiGUMQeYT9XpqO1";
            if (kdA00 == kd) {
                return new NativeBannerAd(context, str);
            }
            if (kdA00 == KD.A06) {
                return new NativeAd(context, str);
            }
            throw new K8(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0S(83, 34, 50), kdA00));
        }
        throw new K8(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0S(155, 50, 66), str2));
    }

    @Nullable
    private final C0986Rb A0C() {
        C0986Rb c0986Rb = this.A0W;
        if (c0986Rb != null && c0986Rb.A0g()) {
            return c0986Rb;
        }
        return null;
    }

    public static InterfaceC0802Jt A0I() {
        return new C1335by();
    }

    public static C1320bj A0J(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C1320bj) ((C04334h) Proxy.getInvocationHandler(nativeAdBaseApi)).A05();
        }
        return (C1320bj) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* JADX INFO: renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public final C0804Jv getAdStarRating() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0L();
    }

    private AdPlacementType A0O() {
        return this.A0I == KD.A06 ? AdPlacementType.NATIVE : AdPlacementType.NATIVE_BANNER;
    }

    private void A0V() {
        for (View view : this.A0e) {
            view.setOnClickListener(null);
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0e.clear();
    }

    private void A0W() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            LH.A09(new LH(), this.A0Y, Uri.parse(getAdChoicesLinkUrl()), A15());
        }
    }

    public static void A0Z(@Nullable Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(null);
        } else {
            imageView.setBackgroundDrawable(null);
        }
    }

    private void A0a(View view) {
        this.A0e.add(view);
        view.setOnClickListener(this.A0E);
        view.setOnTouchListener(this.A0E);
        if (Build.VERSION.SDK_INT >= 18) {
            boolean zA0o = JT.A0o(view.getContext());
            String[] strArr = A0i;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[4] = "GeTsVetQiODT9yUx";
            strArr2[6] = "UPeG8QvAHkrx";
            if (zA0o) {
                view.setOnLongClickListener(this.A0E);
            }
        }
    }

    private void A0b(View view, View view2, List<View> list, boolean z) {
        InterfaceC1316bf interfaceC1316bf;
        View adContentsView = view2;
        if (!A0n()) {
            this.A0Y.A0A().ACF();
        }
        if (view == null) {
            String strA0S = A0S(272, 19, 23);
            if (!A0n()) {
                this.A0Y.A0A().ACE(strA0S);
            }
            throw new IllegalArgumentException(strA0S);
        }
        if (list == null || list.size() == 0) {
            String strA0S2 = A0S(221, 30, 22);
            if (!A0n()) {
                this.A0Y.A0A().ACE(strA0S2);
            }
            throw new IllegalArgumentException(strA0S2);
        }
        C0986Rb c0986RbA0C = A0C();
        if (c0986RbA0C == null) {
            String strA0S3 = A0S(48, 13, 41);
            if (!A0n()) {
                this.A0Y.A0A().ACE(strA0S3);
            }
            Log.e(A0j, strA0S3);
            K7 k7 = new K7(AdErrorType.NATIVE_AD_IS_NOT_LOADED, strA0S3);
            A0x().A0A().A2d(C0848Lr.A01(this.A00), k7.A04().getErrorCode(), k7.A05());
            if (JT.A1W(this.A0Y) && (interfaceC1316bf = this.A0F) != null) {
                interfaceC1316bf.A9b(k7);
                return;
            }
            return;
        }
        String str = this.A0P;
        boolean z2 = view instanceof FrameLayout;
        String[] strArr = A0i;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[0] = "EctJGKY0XxsuqG0UQd3u1zsk6i1LiKEB";
        strArr2[2] = "xfmrtxxFdZMJNwdY4ICwqytBKlocc6OO";
        if (z2 && str != null) {
            A0c((FrameLayout) view, str);
        }
        NativeAdLayout nativeAdLayout = this.A06;
        if (nativeAdLayout != null) {
            ((TP) nativeAdLayout.getNativeAdLayoutApi()).A03();
        }
        TA ta = this.A0Q.get();
        if (ta != null && c0986RbA0C.A0B() == 1) {
            ta.A03(M7.AN_INFO_ICON);
        }
        if (adContentsView == null) {
            if (this.A0I == KD.A06) {
                AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
                String strA0S4 = A0S(251, 21, 89);
                K7 k72 = new K7(adErrorType, strA0S4);
                A0x().A0A().A2d(C0848Lr.A01(this.A00), k72.A04().getErrorCode(), k72.A05());
                InterfaceC1316bf interfaceC1316bf2 = this.A0F;
                if (interfaceC1316bf2 != null) {
                    interfaceC1316bf2.A9b(k72);
                }
                if (AdInternalSettings.isDebugBuild()) {
                    Log.e(A0j, strA0S4);
                    return;
                }
                return;
            }
            AdErrorType adErrorType2 = AdErrorType.NO_ICONVIEW_IN_NATIVEBANNERAD;
            String strA0S5 = A0S(61, 22, 63);
            K7 k73 = new K7(adErrorType2, strA0S5);
            A0x().A0A().A2d(C0848Lr.A01(this.A00), k73.A04().getErrorCode(), k73.A05());
            InterfaceC1316bf interfaceC1316bf3 = this.A0F;
            if (interfaceC1316bf3 != null) {
                interfaceC1316bf3.A9b(k73);
            }
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0j, strA0S5);
            return;
        }
        boolean z3 = false;
        boolean z4 = (adContentsView instanceof AdNativeComponentView) && ((AdNativeComponentView) adContentsView).getAdContentsView() != null;
        if (z && (adContentsView instanceof ImageView)) {
            z3 = true;
        }
        if (!z4 && !z3) {
            if (this.A0F != null) {
                K7 k74 = new K7(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0S(527, 31, 7));
                A0x().A0A().A2d(C0848Lr.A01(this.A00), k74.A04().getErrorCode(), k74.A05());
                this.A0F.A9b(k74);
                return;
            }
            return;
        }
        if (this.A03 != null) {
            Log.w(A0j, A0S(291, 80, 98));
            unregisterView();
        }
        boolean zContainsKey = A0k.containsKey(view);
        String[] strArr3 = A0i;
        if (strArr3[7].length() != strArr3[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0i;
        strArr4[7] = "Yitqb4l5O5wHhToyiUZG328";
        strArr4[5] = "n4uNZUYEyoiQJdMJgH58rRy";
        if (zContainsKey && A0k.get(view).get() != null) {
            Log.w(A0j, A0S(414, 75, 15));
            A0k.get(view).get().unregisterView();
        }
        this.A0E = new ViewOnClickListenerC1322bl(this, this.A0Y, null);
        this.A03 = view;
        this.A05 = adContentsView;
        boolean nativeAdBannerViewIsImageView = view instanceof ViewGroup;
        if (nativeAdBannerViewIsImageView) {
            this.A0J = new C0877Mv(this.A0Y, new C1342cA(this));
            ((ViewGroup) view).addView(this.A0J);
        }
        ArrayList arrayList = new ArrayList(list);
        View view3 = this.A04;
        if (view3 != null) {
            arrayList.add(view3);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0a((View) it.next());
        }
        int iA00 = A00();
        this.A0M = new C1343cB(this, adContentsView, z3, c0986RbA0C);
        if (adContentsView instanceof AdNativeComponentView) {
            adContentsView = ((AdNativeComponentView) adContentsView).getAdContentsView();
        }
        this.A0N = new Q2(adContentsView, iA00, A03(), true, new WeakReference(this.A0M), this.A0Y);
        this.A0N.A0a(true ^ A0n());
        this.A0N.A0Y(A01());
        this.A0N.A0Z(A02());
        this.A08 = new C0991Rg(this.A0Y, new C1321bk(this, null), this.A0N, this.A0W);
        this.A08.A0E(arrayList);
        A0k.put(view, new WeakReference<>(this));
        if (Build.VERSION.SDK_INT >= 18 && JT.A0o(this.A0Y)) {
            this.A0K = new C0895Nn();
            this.A0K.A0D(this.A0c);
            this.A0K.A0C(this.A0Y.getPackageName());
            this.A0K.A0B(this.A0N);
            if (this.A0W.A0C() > 0) {
                this.A0K.A09(this.A0W.A0C(), this.A0W.A0D());
            }
            C05418w c05418w = this.A0C;
            if (c05418w != null) {
                this.A0K.A0A(c05418w.A0C());
            } else {
                C0678Ev c0678Ev = this.A09;
                if (c0678Ev != null && c0678Ev.A0H() != null) {
                    this.A0K.A0A(this.A09.A0H().A0C());
                }
            }
            View adContentsView2 = this.A03;
            adContentsView2.getOverlay().add(this.A0K);
        }
    }

    private void A0c(FrameLayout frameLayout, String str) {
        C0924Oq c0924Oq = this.A0L;
        if (c0924Oq != null) {
            frameLayout.removeView(c0924Oq);
        }
        this.A0L = C0923Op.A01(AnonymousClass52.A02(this.A0Y), str);
        C0924Oq c0924Oq2 = this.A0L;
        if (c0924Oq2 != null) {
            frameLayout.addView(c0924Oq2, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(@Nullable C0986Rb c0986Rb, boolean z) {
        if (c0986Rb == null) {
            return;
        }
        if (this.A0D.equals(EnumC0798Jp.A04)) {
            String strA5l = c0986Rb.A5l();
            if (!TextUtils.isEmpty(strA5l)) {
                this.A0X.A0X(new C0789Jg(strA5l, this.A0Y.A06()));
            }
            if (c0986Rb.A0K() != null) {
                AnonymousClass79 anonymousClass79 = new AnonymousClass79(c0986Rb.A0K().getUrl(), c0986Rb.A0K().getHeight(), c0986Rb.A0K().getWidth(), c0986Rb.A0R(), A0S(688, 6, 78));
                anonymousClass79.A00 = this.A0B;
                this.A0X.A0P();
                this.A0X.A0R(anonymousClass79);
            }
            if (!this.A0I.equals(KD.A05)) {
                if (c0986Rb.A0J() != null) {
                    this.A0X.A0R(new AnonymousClass79(c0986Rb.A0J().getUrl(), c0986Rb.A0J().getHeight(), c0986Rb.A0J().getWidth(), c0986Rb.A0R(), A0S(688, 6, 78)));
                }
                List<C1320bj> listA0V = c0986Rb.A0V();
                String[] strArr = A0i;
                if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0i;
                strArr2[1] = "BiVeVWtUTguxpSjeMqAkCwQXeKWOVTz4";
                strArr2[3] = "8sdR9nWPZ664Gt9BvBocaDJi5It1hBkX";
                if (listA0V != null) {
                    for (C1320bj c1320bj : c0986Rb.A0V()) {
                        if (c1320bj.getAdCoverImage() != null) {
                            this.A0X.A0R(new AnonymousClass79(c1320bj.getAdCoverImage().getUrl(), c1320bj.getAdCoverImage().getHeight(), c1320bj.getAdCoverImage().getWidth(), c0986Rb.A0R(), A0S(688, 6, 78)));
                        }
                    }
                }
                String strA0T = c0986Rb.A0T();
                if (!TextUtils.isEmpty(strA0T)) {
                    this.A0X.A0W(new C7B(strA0T, c0986Rb.A0R(), A0S(688, 6, 78), c0986Rb.A0N().longValue()));
                }
            }
        }
        this.A0X.A0Q(new C1341c9(this, c0986Rb, z), new AnonymousClass75(c0986Rb.A0R(), A0S(688, 6, 78)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0e(AnonymousClass11 anonymousClass11) {
        C0986Rb c0986Rb = this.A0W;
        if (c0986Rb == null) {
            return;
        }
        c0986Rb.A0X(anonymousClass11);
    }

    public static void A0f(NativeAdImageApi nativeAdImageApi, ImageView imageView, X2 x2) {
        if (nativeAdImageApi != null && imageView != null) {
            new XE(imageView, x2).A06(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A08(nativeAdImageApi.getUrl());
        }
    }

    private final void A0g(EnumC0798Jp enumC0798Jp, @Nullable String str) {
        A1N(enumC0798Jp, str, new C7H(false, -1, -1));
    }

    private final void A0j(InterfaceC1316bf interfaceC1316bf) {
        this.A0F = interfaceC1316bf;
    }

    private final void A0k(String str) {
        this.A0O = str;
    }

    private void A0l(List<View> list, View view) {
        InterfaceC0802Jt interfaceC0802Jt = this.A0Z;
        if (interfaceC0802Jt != null && interfaceC0802Jt.ADD(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                String[] strArr = A0i;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0i;
                strArr2[1] = "SQxDsveS3BVeMl0nUnJayKxDlwKiSRwM";
                strArr2[3] = "CPUPH8uU8pe6dd8URnD7AGDEQ4lKFlLs";
                A0l(list, childAt);
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0m() {
        return A14() == EnumC0808Jz.A05 || A14() == EnumC0808Jz.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0n() {
        C0986Rb c0986Rb = this.A0W;
        return c0986Rb != null && c0986Rb.A0h();
    }

    public final long A0u() {
        return this.A00;
    }

    @Nullable
    public final C0986Rb A0v() {
        return this.A0W;
    }

    public final C7C A0w() {
        return this.A0X;
    }

    public final X2 A0x() {
        return this.A0Y;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* JADX INFO: renamed from: A0y, reason: merged with bridge method [inline-methods] */
    public final C0803Ju getAdChoicesIcon() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0I();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* JADX INFO: renamed from: A0z, reason: merged with bridge method [inline-methods] */
    public final C0803Ju getAdCoverImage() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* JADX INFO: renamed from: A10, reason: merged with bridge method [inline-methods] */
    public final C0803Ju getAdIcon() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0K();
    }

    @Nullable
    public final InterfaceC1316bf A11() {
        return this.A0F;
    }

    public final C0805Jw A12() {
        return this.A0G;
    }

    public final EnumC0806Jx A13() {
        return this.A0H;
    }

    public final EnumC0808Jz A14() {
        if (!isAdLoaded()) {
            return EnumC0808Jz.A03;
        }
        return this.A0W.A0M();
    }

    @Nullable
    public final String A15() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A5l();
    }

    @Nullable
    public final String A16() {
        return this.A0P;
    }

    @Nullable
    public final String A17() {
        return A1B(A0S(694, 17, 60));
    }

    @Nullable
    public final String A18() {
        return A1B(A0S(711, 16, 10));
    }

    @Nullable
    public final String A19() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0S();
    }

    @Nullable
    public final String A1A() {
        if (!isAdLoaded() || TextUtils.isEmpty(this.A0W.A0T())) {
            return null;
        }
        return this.A0X.A0M(this.A0W.A0T());
    }

    @Nullable
    public final String A1B(String str) {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0U(str);
    }

    @Nullable
    public final List<C1320bj> A1C() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0V();
    }

    public final void A1D() {
        if (!AnonymousClass23.A0Q(this.A0Y.A00(), false)) {
            A0W();
            return;
        }
        X2 x2 = this.A0Y;
        N1 n1A01 = N2.A01(x2, x2.A06(), A15(), this.A06);
        if (n1A01 == null) {
            A0W();
        } else {
            ((TP) this.A06.getNativeAdLayoutApi()).A04(n1A01);
            n1A01.A0J();
        }
    }

    public final void A1E(@Nullable Drawable drawable) {
        this.A01 = drawable;
        A1U(drawable != null, true);
        String[] strArr = A0i;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[4] = "Q96JEqttX0oIb74l";
        strArr2[6] = "mqYIcYUMJzEb";
    }

    public final void A1F(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0l(arrayList, view);
        A0b(view, imageView, arrayList, true);
    }

    public final void A1G(View view, ImageView imageView, List<View> list) {
        A0b(view, imageView, list, true);
    }

    public final void A1H(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0l(arrayList, view);
        A0b(view, adNativeComponentView, arrayList, false);
    }

    public final void A1I(View view, AdNativeComponentView adNativeComponentView, List<View> list) {
        A0b(view, adNativeComponentView, list, false);
    }

    public final void A1J(MediaView mediaView) {
        if (mediaView != null) {
            this.A0U = true;
        }
    }

    public final void A1K(MediaView mediaView) {
        if (mediaView != null) {
            this.A0V = true;
        }
    }

    public final void A1L(@Nullable NativeAdLayout nativeAdLayout) {
        this.A06 = nativeAdLayout;
    }

    public final void A1M(@Nullable TA ta) {
        this.A0Q = new WeakReference<>(ta);
    }

    public final void A1N(EnumC0798Jp enumC0798Jp, @Nullable String str, C7H c7h) {
        this.A00 = System.currentTimeMillis();
        if (this.A0f) {
            AdSettings.IntegrationErrorMode integrationErrorModeA00 = C03621l.A00(this.A0Y);
            String strA0S = A0S(645, 30, 17);
            if (!AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE.equals(integrationErrorModeA00)) {
                K7 k7 = new K7(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0S(645, 30, 17));
                A0x().A0A().A2d(C0848Lr.A01(this.A00), k7.A04().getErrorCode(), k7.A05());
                InterfaceC1316bf interfaceC1316bf = this.A0F;
                if (interfaceC1316bf != null) {
                    interfaceC1316bf.A9b(k7);
                } else {
                    Log.e(A0S(117, 17, 64), strA0S);
                }
                C05238e c05238e = new C05238e(strA0S);
                A0x().A04().A86(A0S(587, 3, 89), C05228d.A0R, c05238e);
            } else {
                throw new C03671q(strA0S);
            }
        }
        this.A0f = true;
        this.A0D = enumC0798Jp;
        if (enumC0798Jp.equals(EnumC0798Jp.A05)) {
            this.A07 = EnumC03500z.A05;
        }
        this.A0B = c7h;
        C03611k c03611k = new C03611k(this.A0c, this.A0I, A0O(), null, 1);
        c03611k.A04(enumC0798Jp);
        c03611k.A05(this.A0O);
        c03611k.A06(this.A0P);
        this.A09 = new C0678Ev(this.A0Y, c03611k);
        this.A09.A0R(new c8(this));
        this.A09.A0T(str);
    }

    public final void A1O(C0805Jw c0805Jw) {
        this.A0G = c0805Jw;
    }

    public final void A1P(EnumC0806Jx enumC0806Jx) {
        this.A0H = enumC0806Jx;
    }

    public final void A1Q(KD kd) {
        if (!A0n()) {
            if (KD.A05.equals(kd)) {
                X2 x2 = this.A0Y;
                String[] strArr = A0i;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0i;
                strArr2[7] = "er71GFUENUkH6mVEmd80tsw";
                strArr2[5] = "eRFgtOOg0hnVr16Te1PNaNs";
                x2.A0A().A2j(AdPlacementType.NATIVE_BANNER.toString());
            } else {
                this.A0Y.A0A().A2j(AdPlacementType.NATIVE.toString());
            }
        }
        this.A0I = kd;
    }

    public final void A1R(Q1 q1) {
        this.A0R = new WeakReference<>(q1);
    }

    public final void A1S(boolean z) {
        this.A0S = z;
    }

    public final void A1T(boolean z) {
        this.A0T = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1U(boolean r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1320bj.A1U(boolean, boolean):void");
    }

    public final boolean A1V() {
        return this.A06 == null;
    }

    @Override // com.facebook.ads.redexgen.X.K2
    public final int A5u() {
        View view = this.A05;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof PB) {
                return ((PB) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new K0(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        KL.A05(A0S(608, 7, 112), A0S(371, 19, 15), A0S(8, 8, 76));
        if (!A0n()) {
            this.A0Y.A0A().A2k();
        }
        C0678Ev c0678Ev = this.A09;
        if (c0678Ev != null) {
            c0678Ev.A0W(true);
            this.A09 = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0D.equals(EnumC0798Jp.A05)) {
            this.A07 = EnumC03500z.A04;
        }
        this.A0D = EnumC0798Jp.A04;
        A0d(this.A0W, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdBodyText() {
        if (isAdLoaded()) {
            return this.A0W.A0O();
        }
        String[] strArr = A0i;
        if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[0] = "hTgZwGr1QjZPArcNv2XISvdh6HkvBsNu";
        strArr2[2] = "WdfIathAKVLlC1caO5TsuRke00xxoQup";
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdCallToAction() {
        return A1B(A0S(594, 14, 45));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        C0803Ju adChoicesIcon = getAdChoicesIcon();
        String[] strArr = A0i;
        if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[7] = "MRTmAh7YnfwjJHGdoro5GGF";
        strArr2[5] = "5NAjexdbITBZf7E7VHPXfXw";
        return adChoicesIcon.getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesLinkUrl() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesText() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdHeadline() {
        return A1B(A0S(615, 8, 22));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdLinkDescription() {
        return A1B(A0S(623, 16, 54));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdSocialContext() {
        return A1B(A0S(747, 14, 69));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdTranslation() {
        return A1B(A0S(558, 14, 14));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdUntrimmedBodyText() {
        return A1B(A0S(590, 4, 49));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdvertiserName() {
        return A1B(A0S(572, 15, 115));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        C0986Rb c0986Rb = this.A0W;
        if (c0986Rb == null) {
            return 0.0f;
        }
        C0803Ju c0803JuA0J = c0986Rb.A0J();
        int width = c0803JuA0J.getWidth();
        String[] strArr = A0i;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[1] = "Gk0JtmCCXYpL8dPDyrRdSPBqQO7pSw2M";
        strArr2[3] = "hZFl2ZrFl9W40ZKmdwMt57qcTxbjzHrP";
        int height = c0803JuA0J.getHeight();
        if (height > 0) {
            return width / height;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        String str = this.A0d;
        String[] strArr = A0i;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[7] = "iawtn5ImZtHDfKUJHK1ePg9";
        strArr2[5] = "61vZsTsWUXSHOR043CjOsZn";
        return str;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0c;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final Drawable getPreloadedIconViewDrawable() {
        C0803Ju adIcon;
        Bitmap bitmapA0I;
        C0986Rb c0986Rb = this.A0W;
        if (c0986Rb != null && (adIcon = c0986Rb.A0K()) != null && (bitmapA0I = this.A0X.A0I(adIcon.getUrl())) != null) {
            X2 x2A0x = A0x();
            boolean zA1V = A1V();
            String[] strArr = A0i;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[4] = "5rXv1LFjMRKkpcU7";
            strArr2[6] = "SFgDKFOuseBk";
            return A05(x2A0x, bitmapA0I, zA1V, A16());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getPromotedTranslation() {
        return A1B(A0S(727, 20, 89));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getSponsoredTranslation() {
        return A1B(A0S(761, 21, 22));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        C0986Rb c0986Rb = this.A0W;
        return c0986Rb != null && c0986Rb.A0f();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0B = true;
        C0678Ev c0678Ev = this.A09;
        if (c0678Ev != null) {
            zA0B = c0678Ev.A0X();
        } else {
            S5 s5 = this.A0A;
            String[] strArr = A0i;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[7] = "v5uFzvuQ32LyebguaenlI2Y";
            strArr2[5] = "nsJGpwd0QPZOfVeZMyNRGWR";
            if (s5 != null) {
                zA0B = s5.A0B();
            }
        }
        this.A0Y.A0A().A4Y(zA0B);
        return zA0B;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        C0986Rb c0986Rb = this.A0W;
        return c0986Rb != null && c0986Rb.A0g();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        KL.A05(A0S(639, 6, 33), A0S(390, 24, 72), A0S(0, 8, 0));
        loadAd(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        KL.A05(A0S(639, 6, 33), A0S(390, 24, 72), A0S(40, 8, 84));
        A0g(EnumC0798Jp.A00(mediaCacheFlag), null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        KL.A05(A0S(639, 6, 33), A0S(390, 24, 72), A0S(24, 8, 126));
        ((K0) nativeLoadAdConfig).loadAd();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAdFromBid(String str) {
        KL.A05(A0S(675, 13, 14), A0S(390, 24, 72), A0S(32, 8, 20));
        loadAdFromBid(str, NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAdFromBid(String str, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        KL.A05(A0S(675, 13, 14), A0S(390, 24, 72), A0S(16, 8, 89));
        A0g(EnumC0798Jp.A00(mediaCacheFlag), str);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        this.A04.performClick();
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        View view = this.A03;
        if (view != null) {
            view.post(new C1340c6(this));
        }
        String str = A0S(205, 16, 68) + C0839Li.A03(this.A0Y, th);
        A0x().A0A().A2d(C0848Lr.A01(this.A00), AdError.INTERNAL_ERROR_CODE, str);
        InterfaceC1316bf interfaceC1316bf = this.A0F;
        if (interfaceC1316bf != null) {
            interfaceC1316bf.A9b(new K7(AdError.INTERNAL_ERROR_CODE, str));
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setAdListener(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        if (nativeAdListener == null) {
            return;
        }
        A0j(new C05659v(nativeAdListener, nativeAdBase));
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0k(extraHints.getHints());
        this.A0P = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void unregisterView() {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1320bj.unregisterView():void");
    }
}
