package a.s;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f3116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VolumeProvider f3117f;

    public class a extends VolumeProvider {
        public a(int i2, int i3, int i4, String str) {
            super(i2, i3, i4, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i2) {
            i.this.e(i2);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i2) {
            i.this.f(i2);
        }
    }

    public class b extends VolumeProvider {
        public b(int i2, int i3, int i4) {
            super(i2, i3, i4);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i2) {
            i.this.e(i2);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i2) {
            i.this.f(i2);
        }
    }

    public static abstract class c {
        public abstract void onVolumeChanged(i iVar);
    }

    public i(int i2, int i3, int i4) {
        this(i2, i3, i4, null);
    }

    public i(int i2, int i3, int i4, String str) {
        this.f3112a = i2;
        this.f3113b = i3;
        this.f3115d = i4;
        this.f3114c = str;
    }

    public final int a() {
        return this.f3115d;
    }

    public final int b() {
        return this.f3113b;
    }

    public final int c() {
        return this.f3112a;
    }

    public Object d() {
        VolumeProvider bVar;
        if (this.f3117f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                bVar = new a(this.f3112a, this.f3113b, this.f3115d, this.f3114c);
            } else if (i2 >= 21) {
                bVar = new b(this.f3112a, this.f3113b, this.f3115d);
            }
            this.f3117f = bVar;
        }
        return this.f3117f;
    }

    public abstract void e(int i2);

    public abstract void f(int i2);

    public void g(c cVar) {
        this.f3116e = cVar;
    }

    public final void h(int i2) {
        this.f3115d = i2;
        if (Build.VERSION.SDK_INT >= 21) {
            ((VolumeProvider) d()).setCurrentVolume(i2);
        }
        c cVar = this.f3116e;
        if (cVar != null) {
            cVar.onVolumeChanged(this);
        }
    }
}
