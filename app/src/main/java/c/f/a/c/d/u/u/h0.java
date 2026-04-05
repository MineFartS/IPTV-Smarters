package c.f.a.c.d.u.u;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f12001b;

    public h0(j jVar) {
        this.f12001b = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        if (this.f12001b.v != null) {
            this.f12001b.v.cancel();
            j.Q(this.f12001b, null);
        }
    }
}
