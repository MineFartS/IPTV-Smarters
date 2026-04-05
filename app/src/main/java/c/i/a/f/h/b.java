package c.i.a.f.h;

import android.annotation.SuppressLint;
import c.i.a.f.c;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c.i.a.f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18099b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18100c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18102e;

    @Override // c.i.a.f.a, c.i.a.f.g
    @SuppressLint({"SwitchIntDef"})
    public void a(int i2) {
        if (i2 == 0) {
            this.f18099b = false;
        } else if (i2 == 1) {
            this.f18099b = true;
        } else {
            if (i2 != 2) {
                return;
            }
            this.f18099b = false;
        }
    }

    public void b(c cVar) {
        boolean z = this.f18099b;
        if (z && this.f18100c == 1) {
            cVar.f(this.f18101d, this.f18102e);
        } else if (!z && this.f18100c == 1) {
            cVar.a(this.f18101d, this.f18102e);
        }
        this.f18100c = Integer.MIN_VALUE;
    }

    @Override // c.i.a.f.a, c.i.a.f.g
    public void g(String str) {
        this.f18101d = str;
    }

    @Override // c.i.a.f.a, c.i.a.f.g
    public void l(float f2) {
        this.f18102e = f2;
    }

    @Override // c.i.a.f.a, c.i.a.f.g
    public void onError(int i2) {
        if (i2 == 1) {
            this.f18100c = i2;
        }
    }
}
