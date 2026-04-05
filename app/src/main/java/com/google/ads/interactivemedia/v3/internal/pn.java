package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pn {
    public pn() {
    }

    public pn(ala alaVar, SparseArray<nm> sparseArray) {
        SparseArray sparseArray2 = new SparseArray(alaVar.b());
        for (int i2 = 0; i2 < alaVar.b(); i2++) {
            int iA = alaVar.a(i2);
            nm nmVar = sparseArray.get(iA);
            ajr.b(nmVar);
            sparseArray2.append(iA, nmVar);
        }
    }

    public static List<byte[]> a(byte[] bArr) {
        byte b2 = bArr[11];
        byte b3 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(j(i(((b2 & 255) << 8) | (b3 & 255))));
        arrayList.add(j(i(3840L)));
        return arrayList;
    }

    public static final nu b(int i2, int i3) {
        int i4 = 1;
        return new nu(i4, i4);
    }

    public static boolean c(BaseDisplayContainer baseDisplayContainer, ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        return resizeAndPositionVideoMsgData.x().intValue() >= 0 && resizeAndPositionVideoMsgData.width().intValue() >= 0 && resizeAndPositionVideoMsgData.x().intValue() + resizeAndPositionVideoMsgData.width().intValue() <= baseDisplayContainer.getAdContainer().getWidth() && resizeAndPositionVideoMsgData.y().intValue() >= 0 && resizeAndPositionVideoMsgData.height().intValue() >= 0 && resizeAndPositionVideoMsgData.y().intValue() + resizeAndPositionVideoMsgData.height().intValue() <= baseDisplayContainer.getAdContainer().getHeight();
    }

    public static void d(String str) {
        if (k(2)) {
            Log.e("IMASDK", str);
        }
    }

    public static void e(String str, Throwable th) {
        if (k(2)) {
            Log.e("IMASDK", str, th);
        }
    }

    public static void f(String str) {
        if (k(1)) {
            Log.i("IMASDK", str);
        }
    }

    public static void g(String str) {
        if (k(2)) {
            Log.w("IMASDK", str);
        }
    }

    public static void h(String str, Exception exc) {
        if (ai.f19778a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    private static long i(long j2) {
        return (j2 * 1000000000) / 48000;
    }

    private static byte[] j(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    private static boolean k(int i2) {
        return i2 + (-1) > 0;
    }
}
