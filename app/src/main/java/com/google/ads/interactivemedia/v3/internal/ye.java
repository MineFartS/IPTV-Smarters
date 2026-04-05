package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ye implements yl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23790c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ye f23789b = new ye(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ye f23788a = new ye();

    private /* synthetic */ ye() {
    }

    private /* synthetic */ ye(int i2) {
        this.f23790c = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yl
    public final int a(Object obj) {
        xy xyVar = (xy) obj;
        if (this.f23790c == 0) {
            int i2 = ym.f23797a;
            return xyVar.f23759a.startsWith("OMX.google") ? 1 : 0;
        }
        int i3 = ym.f23797a;
        String str = xyVar.f23759a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (amn.f20135a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
