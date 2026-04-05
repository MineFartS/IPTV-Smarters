package c.f.a.c.d.u.u;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f12027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f12028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f12029d;

    public j0(j jVar, i0 i0Var, i0 i0Var2) {
        this.f12029d = jVar;
        this.f12027b = i0Var;
        this.f12028c = i0Var2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f12029d.V(this.f12027b, this.f12028c);
    }
}
