package c.f.a.c.j.h;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f13317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f13318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f13319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f13320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f13321j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e0 e0Var, String str, String str2, Context context, Bundle bundle) {
        super(e0Var, true);
        this.f13321j = e0Var;
        this.f13317f = str;
        this.f13318g = str2;
        this.f13319h = context;
        this.f13320i = bundle;
    }

    @Override // c.f.a.c.j.h.v
    public final void a() {
        String str;
        String str2;
        String str3;
        int iMax;
        boolean z;
        try {
            e0 e0Var = this.f13321j;
            if (e0.s(this.f13317f, this.f13318g)) {
                String str4 = this.f13318g;
                str2 = this.f13317f;
                str3 = str4;
                str = this.f13321j.f13291c;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            e0.j(this.f13319h);
            boolean z2 = e0.f13290b.booleanValue() || str2 != null;
            e0 e0Var2 = this.f13321j;
            e0Var2.f13299k = e0Var2.v(this.f13319h, z2);
            if (this.f13321j.f13299k == null) {
                Log.w(this.f13321j.f13291c, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.f13319h, ModuleDescriptor.MODULE_ID);
            int iC = DynamiteModule.c(this.f13319h, ModuleDescriptor.MODULE_ID);
            if (z2) {
                iMax = Math.max(iA, iC);
                z = iC < iA;
            } else {
                if (iA > 0) {
                    iC = iA;
                }
                iMax = iC;
                z = iA > 0;
            }
            this.f13321j.f13299k.initialize(c.f.a.c.g.b.K2(this.f13319h), new yd(37000L, iMax, z, str, str2, str3, this.f13320i, c.f.a.c.k.b.v4.a(this.f13319h)), this.f13572b);
        } catch (Exception e2) {
            this.f13321j.q(e2, true, false);
        }
    }
}
