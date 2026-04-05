package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1160Xv implements AZ {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;

    @Nullable
    public final InterfaceC0612Bz<YS> A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{73, 104, 107, 108, 120, 97, 121, 95, 104, 99, 105, 104, 127, 104, 127, 126, 75, 108, 110, 121, 98, 127, 116, 31, 40, 40, 53, 40, 122, 51, 52, 41, 46, 59, 52, 46, 51, 59, 46, 51, 52, 61, 122, 28, 28, 55, 42, 63, 61, 122, 63, 34, 46, 63, 52, 41, 51, 53, 52, 28, 43, 43, 54, 43, 121, 48, 55, 42, 45, 56, 55, 45, 48, 56, 45, 48, 55, 62, 121, 31, DateTimeFieldType.SECOND_OF_MINUTE, 24, 26, 121, 60, 33, 45, 60, 55, 42, 48, 54, 55, 92, 107, 107, 118, 107, 57, 112, 119, 106, 109, 120, 119, 109, 112, 120, 109, 112, 119, 126, 57, 86, 105, 108, 106, 57, 124, 97, 109, 124, 119, 106, 112, 118, 119, 52, 3, 3, 30, 3, 81, 24, 31, 2, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, 31, 5, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, 24, 31, DateTimeFieldType.MILLIS_OF_DAY, 81, 39, 33, 72, 81, DateTimeFieldType.SECOND_OF_DAY, 9, 5, DateTimeFieldType.SECOND_OF_DAY, 31, 2, 24, 30, 31, 108, 79, 65, 68, 69, 68, 0, 102, 70, 77, 80, 69, 71, 97, 85, 68, 73, 79, 114, 69, 78, 68, 69, 82, 69, 82, DateTimeFieldType.HOUR_OF_HALFDAY, 31, 60, 50, 55, 54, 55, 115, 31, 58, 49, 53, 63, 50, 48, DateTimeFieldType.MINUTE_OF_DAY, 38, 55, 58, 60, 1, 54, 61, 55, 54, 33, 54, 33, 125, 65, 98, 108, 105, 104, 105, 45, 65, 100, 111, 98, 125, 120, 126, 76, 120, 105, 100, 98, 95, 104, 99, 105, 104, 127, 104, 127, 35, 126, 93, 83, 86, 87, 86, DateTimeFieldType.MINUTE_OF_DAY, 126, 91, 80, 68, 66, 74, 100, 91, 86, 87, 93, 96, 87, 92, 86, 87, 64, 87, 64, 28, 119, 123, 121, 58, 114, 117, 119, 113, 118, 123, 123, 127, 58, 117, 112, 103, 58, 125, 122, 96, 113, 102, 122, 117, 120, 58, 113, 108, 123, 100, 120, 117, 109, 113, 102, 38, 58, 113, 108, 96, 58, 114, 114, 121, 100, 113, 115, 58, 82, 114, 121, 100, 113, 115, 85, 97, 112, 125, 123, 70, 113, 122, 112, 113, 102, 113, 102, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 40, 39, 42, 104, 35, 62, 41, 54, 42, 39, 63, 35, 52, 116, 104, 35, 62, 50, 104, 32, 42, 39, 37, 104, 10, 47, 36, 32, 42, 39, 37, 7, 51, 34, 47, 41, DateTimeFieldType.SECOND_OF_DAY, 35, 40, 34, 35, 52, 35, 52, 121, 117, 119, 52, 124, 123, 121, 127, 120, 117, 117, 113, 52, 123, 126, 105, 52, 115, 116, 110, 127, 104, 116, 123, 118, 52, 127, 98, 117, 106, 118, 123, 99, 127, 104, 40, 52, 127, 98, 110, 52, 117, 106, 111, 105, 52, 86, 115, 120, 117, 106, 111, 105, 91, 111, 126, 115, 117, 72, 127, 116, 126, 127, 104, 127, 104, 92, 80, 82, DateTimeFieldType.HOUR_OF_DAY, 89, 94, 92, 90, 93, 80, 80, 84, DateTimeFieldType.HOUR_OF_DAY, 94, 91, 76, DateTimeFieldType.HOUR_OF_DAY, 86, 81, 75, 90, 77, 81, 94, 83, DateTimeFieldType.HOUR_OF_DAY, 90, 71, 80, 79, 83, 94, 70, 90, 77, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 90, 71, 75, DateTimeFieldType.HOUR_OF_DAY, 73, 79, 6, DateTimeFieldType.HOUR_OF_DAY, 115, 86, 93, 73, 79, 71, 105, 86, 91, 90, 80, 109, 90, 81, 91, 90, 77, 90, 77};
    }

    public C1160Xv(Context context) {
        this(context, 0);
    }

    public C1160Xv(Context context, int i2) {
        this(context, null, i2, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Deprecated
    public C1160Xv(Context context, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz, int i2, long j2) {
        this.A02 = context;
        this.A00 = i2;
        this.A01 = j2;
        this.A03 = interfaceC0612Bz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz, long j2, Handler handler, JP jp, int i2, ArrayList<Y0> arrayList) {
        arrayList.add(new C03751y(context, InterfaceC0644Dj.A00, j2, interfaceC0612Bz, false, handler, jp, 50));
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
            } catch (ClassNotFoundException unused) {
                return;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            arrayList.add(size, (Y0) Class.forName(A00(469, 64, 117)).getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, JP.class, Integer.TYPE).newInstance(true, Long.valueOf(j2), handler, jp, 50));
            Log.i(A00(0, 23, 71), A00(243, 27, 120));
        } catch (Exception e3) {
            e = e3;
            throw new RuntimeException(A00(127, 33, 59), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    private final void A03(Context context, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz, InterfaceC0593Ay[] interfaceC0593AyArr, Handler handler, B6 b6, int i2, ArrayList<Y0> arrayList) {
        int i3;
        int i4;
        Y0 renderer;
        Y0 renderer2;
        String strA00 = A00(0, 23, 71);
        arrayList.add(new AnonymousClass27(context, InterfaceC0644Dj.A00, interfaceC0612Bz, false, handler, b6, C0586Ar.A00(context), interfaceC0593AyArr));
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            i3 = size + 1;
            try {
                arrayList.add(size, (Y0) Class.forName(A00(Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE, 66, 80)).getConstructor(Handler.class, B6.class, InterfaceC0593Ay[].class).newInstance(handler, b6, interfaceC0593AyArr));
                Log.i(strA00, A00(215, 28, 71));
            } catch (ClassNotFoundException unused) {
            } catch (Exception e2) {
                e = e2;
                throw new RuntimeException(A00(93, 34, 83), e);
            }
        } catch (ClassNotFoundException unused2) {
            i3 = size;
        } catch (Exception e3) {
            e = e3;
        }
        try {
            renderer2 = (Y0) Class.forName(A00(337, 66, 12)).getConstructor(Handler.class, B6.class, InterfaceC0593Ay[].class).newInstance(handler, b6, interfaceC0593AyArr);
            i4 = i3 + 1;
        } catch (ClassNotFoundException unused3) {
            i4 = i3;
        } catch (Exception e4) {
            e = e4;
        }
        try {
            arrayList.add(i3, renderer2);
            Log.i(strA00, A00(187, 28, 25));
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e5) {
            e = e5;
            throw new RuntimeException(A00(59, 34, 19), e);
        }
        try {
            try {
                renderer = (Y0) Class.forName(A00(270, 67, 94)).getConstructor(Handler.class, B6.class, InterfaceC0593Ay[].class).newInstance(handler, b6, interfaceC0593AyArr);
            } catch (ClassNotFoundException unused5) {
                return;
            }
        } catch (Exception e6) {
            e = e6;
        }
        try {
            arrayList.add(i4, renderer);
            Log.i(strA00, A00(160, 27, 106));
        } catch (Exception e7) {
            e = e7;
            throw new RuntimeException(A00(23, 36, 16), e);
        }
    }

    private final void A04(Context context, InterfaceC0655Dw interfaceC0655Dw, Looper looper, int i2, ArrayList<Y0> arrayList) {
        arrayList.add(new C3I(interfaceC0655Dw, looper));
    }

    private final void A05(Context context, InterfaceC0711Ge interfaceC0711Ge, Looper looper, int i2, ArrayList<Y0> arrayList) {
        arrayList.add(new AnonymousClass32(interfaceC0711Ge, looper));
    }

    private final InterfaceC0593Ay[] A06() {
        return new InterfaceC0593Ay[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.AZ
    public final Y0[] A4R(Handler handler, JP jp, B6 b6, InterfaceC0711Ge interfaceC0711Ge, InterfaceC0655Dw interfaceC0655Dw, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz) {
        InterfaceC0612Bz<YS> interfaceC0612Bz2 = interfaceC0612Bz;
        if (interfaceC0612Bz2 == null) {
            interfaceC0612Bz2 = this.A03;
        }
        ArrayList<Y0> arrayList = new ArrayList<>();
        A02(this.A02, interfaceC0612Bz2, this.A01, handler, jp, this.A00, arrayList);
        A03(this.A02, interfaceC0612Bz2, A06(), handler, b6, this.A00, arrayList);
        A05(this.A02, interfaceC0711Ge, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, interfaceC0655Dw, handler.getLooper(), this.A00, arrayList);
        return (Y0[]) arrayList.toArray(new Y0[arrayList.size()]);
    }
}
