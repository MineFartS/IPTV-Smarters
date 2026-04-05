package c.f.a.c.f;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakReference<byte[]> f12317c = new WeakReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference<byte[]> f12318d;

    public f0(byte[] bArr) {
        super(bArr);
        this.f12318d = f12317c;
    }

    @Override // c.f.a.c.f.d0
    public final byte[] I2() {
        byte[] bArrL2;
        synchronized (this) {
            bArrL2 = this.f12318d.get();
            if (bArrL2 == null) {
                bArrL2 = L2();
                this.f12318d = new WeakReference<>(bArrL2);
            }
        }
        return bArrL2;
    }

    public abstract byte[] L2();
}
