package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.amazonaws.event.ProgressEvent;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W5 extends C6U {
    public static byte[] A07;
    public static final String A08;
    public final Context A00;

    @Nullable
    public final PackageInfo A01;

    @Nullable
    public final PackageManager A02;
    public final C04715u A03;

    @Nullable
    public final ActivityInfo[] A04;

    @Nullable
    public final ServiceInfo[] A05;

    @Nullable
    public final String[] A06;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{29, 57, 35, 35, 57, 62, 55, 112, 0, 49, 51, 59, 49, 55, 53, 112, 0, 53, 34, 61, 57, 35, 35, 57, 63, 62, 35};
    }

    static {
        A07();
        A08 = W5.class.getSimpleName();
    }

    public W5(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A00 = context;
        this.A03 = c04715u;
        this.A01 = A02(context);
        this.A02 = context.getPackageManager();
        this.A04 = A08(context);
        this.A05 = A0A(context);
        this.A06 = A0C(context);
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private PackageInfo A02(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), ProgressEvent.PART_FAILED_EVENT_CODE);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(A08, A06(0, 27, 39), e2);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ActivityInfo[] A08(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(A08, A06(0, 27, 39), e2);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ServiceInfo[] A0A(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(A08, A06(0, 27, 39), e2);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private String[] A0C(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), ProgressEvent.PART_FAILED_EVENT_CODE).requestedPermissions;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(A08, A06(0, 27, 39), e2);
            return null;
        }
    }

    public final InterfaceC04806d A0H() {
        return new W3(this);
    }

    public final InterfaceC04806d A0I() {
        return new W2(this);
    }

    public final InterfaceC04806d A0J() {
        return new W4(this);
    }

    public final InterfaceC04806d A0K() {
        return new W1(this);
    }

    public final InterfaceC04806d A0L() {
        return new C1109Vw(this);
    }

    public final InterfaceC04806d A0M() {
        return new C1105Vs(this);
    }

    public final InterfaceC04806d A0N() {
        return new C1110Vx(this);
    }

    public final InterfaceC04806d A0O() {
        return new W0(this);
    }

    public final InterfaceC04806d A0P() {
        return new C1111Vy(this);
    }

    public final InterfaceC04806d A0Q() {
        return new C1112Vz(this);
    }

    public final InterfaceC04806d A0R() {
        return new C1108Vv(this);
    }

    public final InterfaceC04806d A0S() {
        return new C1107Vu(this);
    }

    public final InterfaceC04806d A0T() {
        return new C1106Vt(this);
    }

    public final InterfaceC04806d A0U() {
        return new C1103Vq(this);
    }

    public final InterfaceC04806d A0V() {
        return new C1102Vp(this);
    }

    public final InterfaceC04806d A0W() {
        return new C1104Vr(this);
    }

    public final InterfaceC04806d A0X() {
        return new C1100Vn(this);
    }

    public final InterfaceC04806d A0Y() {
        return new C1099Vm(this);
    }

    public final InterfaceC04806d A0Z() {
        return new C1101Vo(this);
    }
}
