package c.f.a.b.j3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f9293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9295c;

    public x(String... strArr) {
        this.f9293a = strArr;
    }

    public synchronized boolean a() {
        if (this.f9294b) {
            return this.f9295c;
        }
        this.f9294b = true;
        try {
            for (String str : this.f9293a) {
                System.loadLibrary(str);
            }
            this.f9295c = true;
        } catch (UnsatisfiedLinkError unused) {
            z.i("LibraryLoader", "Failed to load " + Arrays.toString(this.f9293a));
        }
        return this.f9295c;
    }
}
