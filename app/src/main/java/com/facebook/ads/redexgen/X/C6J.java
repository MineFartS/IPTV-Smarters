package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6J implements SensorEventListener {
    public static byte[] A09;
    public static String[] A0A;
    public static final String A0B;
    public C6H A00;
    public final Context A01;
    public final SensorManager A02;
    public final C6E A04;
    public final C6G A05;
    public final EnumC04846h A06;
    public final List<Sensor> A07;
    public final Map<Integer, C6N> A08 = new HashMap();
    public final Handler A03 = new Handler(C05016y.A00().A04().getLooper());

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0A[3].charAt(12) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "dphTU4VZCJVUxlSWVafH1ZM";
            strArr[1] = "vTUzDZVZybplSM6lZClu7qj";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 84);
            i5++;
        }
    }

    public static void A01() {
        A09 = new byte[]{-3, -17, -8, -3, -7, -4};
    }

    public static void A02() {
        A0A = new String[]{"LMEfueB4gayQvpRN8xXm9AklEevQLqxV", "qKD5N87REqvFR6TOuYJE2bL", BuildConfig.FLAVOR, "yxtXe6d26bGgo70LmfUKAtnwRWe4i0hP", "QGB0NXt3pt8pLttf5OCs6Mo1nTnYeT90", "cpHchmbIsy8OjJq5SMyv1Bjwv0Y4tWtv", "hkg18epqSSQRsZzRGzTmSQr5c5v3YJAV", "CsdF03UMAkfQBN54GO6xo56"};
    }

    static {
        A02();
        A01();
        A0B = C6J.class.getSimpleName();
    }

    public C6J(Context context, C6E c6e, EnumC04846h enumC04846h) {
        this.A01 = context;
        this.A02 = (SensorManager) context.getSystemService(A00(0, 6, 54));
        this.A07 = this.A02.getSensorList(-1);
        this.A04 = c6e;
        this.A05 = new C6G(this.A04, enumC04846h);
        this.A06 = enumC04846h;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.6H] */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A03(List<C6N> list) {
        int iA03;
        try {
            for (C6N c6n : list) {
                if (c6n != null && (iA03 = c6n.A03()) != -1 && this.A08.get(Integer.valueOf(c6n.ordinal())) == null) {
                    if (iA03 == 0) {
                        if (C6I.A00[c6n.ordinal()] == 1) {
                            this.A05.A03(this.A01);
                        }
                    } else {
                        for (Sensor sensor : this.A07) {
                            if (iA03 == sensor.getType()) {
                                this.A00 = new SensorEventListener(this) { // from class: com.facebook.ads.redexgen.X.6H
                                    public final SensorEventListener A00;

                                    {
                                        this.A00 = this;
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onAccuracyChanged(Sensor sensor2, int i2) {
                                        try {
                                            this.A00.onAccuracyChanged(sensor2, i2);
                                        } catch (Throwable th) {
                                            AnonymousClass66.A04(th);
                                        }
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onSensorChanged(SensorEvent sensorEvent) {
                                        try {
                                            this.A00.onSensorChanged(sensorEvent);
                                        } catch (Throwable th) {
                                            AnonymousClass66.A04(th);
                                        }
                                    }
                                };
                                this.A02.registerListener(this.A00, sensor, 3, this.A03);
                                this.A08.put(Integer.valueOf(c6n.ordinal()), c6n);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AnonymousClass66.A04(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r7.A02.unregisterListener(r7.A00, r2);
        r7.A08.remove(java.lang.Integer.valueOf(r4.ordinal()));
     */
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A04(java.util.List<com.facebook.ads.redexgen.X.C6N> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.6N> r0 = r7.A08     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L7
            monitor-exit(r7)
            return
        L7:
            if (r8 != 0) goto L1c
            android.hardware.SensorManager r1 = r7.A02     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.6H r0 = r7.A00     // Catch: java.lang.Throwable -> Lb2
            r1.unregisterListener(r0)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.6G r0 = r7.A05     // Catch: java.lang.Throwable -> Lb2
            r0.A02()     // Catch: java.lang.Throwable -> Lb2
            java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.6N> r0 = r7.A08     // Catch: java.lang.Throwable -> Lb2
            r0.clear()     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r7)
            return
        L1c:
            java.util.Iterator r6 = r8.iterator()     // Catch: java.lang.Throwable -> Lb2
        L20:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lb6
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.6N r4 = (com.facebook.ads.redexgen.X.C6N) r4     // Catch: java.lang.Throwable -> Lb2
            int r5 = r4.A03()     // Catch: java.lang.Throwable -> Lb2
            r3 = -1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C6J.A0A
            r0 = 5
            r1 = r1[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L41
            goto Lac
        L41:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C6J.A0A
            java.lang.String r1 = "A8Tij6HFi5g0fGh7y9Y4xTKtDJl0XAe"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "A8Tij6HFi5g0fGh7y9Y4xTKtDJl0XAe"
            r0 = 2
            r2[r0] = r1
            if (r5 != r3) goto L50
            goto L20
        L50:
            int r0 = r4.A03()     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L6e
            java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.6N> r1 = r7.A08     // Catch: java.lang.Throwable -> Lb2
            int r0 = r4.ordinal()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lb2
            r1.remove(r0)     // Catch: java.lang.Throwable -> Lb2
            int[] r1 = com.facebook.ads.redexgen.X.C6I.A00     // Catch: java.lang.Throwable -> Lb2
            int r0 = r4.ordinal()     // Catch: java.lang.Throwable -> Lb2
            r1 = r1[r0]     // Catch: java.lang.Throwable -> Lb2
            r0 = 1
            if (r1 == r0) goto La5
        L6e:
            java.util.List<android.hardware.Sensor> r0 = r7.A07     // Catch: java.lang.Throwable -> Lb2
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> Lb2
        L74:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L20
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Lb2
            android.hardware.Sensor r2 = (android.hardware.Sensor) r2     // Catch: java.lang.Throwable -> Lb2
            int r1 = r4.A03()     // Catch: java.lang.Throwable -> Lb2
            int r0 = r2.getType()     // Catch: java.lang.Throwable -> Lb2
            if (r1 != r0) goto L74
            android.hardware.SensorManager r1 = r7.A02     // Catch: java.lang.Throwable -> L9f
            com.facebook.ads.redexgen.X.6H r0 = r7.A00     // Catch: java.lang.Throwable -> L9f
            r1.unregisterListener(r0, r2)     // Catch: java.lang.Throwable -> L9f
            java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.6N> r1 = r7.A08     // Catch: java.lang.Throwable -> L9f
            int r0 = r4.ordinal()     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L9f
            r1.remove(r0)     // Catch: java.lang.Throwable -> L9f
            goto L20
        L9f:
            r0 = move-exception
            com.facebook.ads.redexgen.X.AnonymousClass66.A04(r0)     // Catch: java.lang.Throwable -> Lb2
            goto L20
        La5:
            com.facebook.ads.redexgen.X.6G r0 = r7.A05     // Catch: java.lang.Throwable -> Lb2
            r0.A02()     // Catch: java.lang.Throwable -> Lb2
            goto L20
        Lac:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lb2:
            r0 = move-exception
            com.facebook.ads.redexgen.X.AnonymousClass66.A04(r0)     // Catch: java.lang.Throwable -> Lb8
        Lb6:
            monitor-exit(r7)
            return
        Lb8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6J.A04(java.util.List):void");
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r9 != 18) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r9 == 20) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r9 == 12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (r9 == 13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r9 != 18) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        r13.A04.A02(new com.facebook.ads.redexgen.X.C1127Wo(r1, r4, r14.values[0]), com.facebook.ads.redexgen.X.C6D.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        r13.A04.A02(new com.facebook.ads.redexgen.X.C1127Wo(r1, r4, r14.values[0]), com.facebook.ads.redexgen.X.C6D.A0C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        r13.A04.A02(new com.facebook.ads.redexgen.X.C1133Wu(r1, r4, new com.facebook.ads.redexgen.X.C6M(new float[]{r14.values[0], r14.values[1], r14.values[2], r14.values[3]})), com.facebook.ads.redexgen.X.C6D.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        r13.A04.A02(new com.facebook.ads.redexgen.X.C1127Wo(r1, r4, r14.values[0]), com.facebook.ads.redexgen.X.C6D.A0D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // android.hardware.SensorEventListener
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSensorChanged(android.hardware.SensorEvent r14) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6J.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
