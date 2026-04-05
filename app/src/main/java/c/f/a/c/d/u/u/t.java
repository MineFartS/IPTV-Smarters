package c.f.a.c.d.u.u;

import c.f.a.c.d.u.u.i;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends i.h {
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ JSONObject w;
    public final /* synthetic */ i x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(i iVar, int i2, int i3, JSONObject jSONObject) {
        super(iVar);
        this.x = iVar;
        this.u = i2;
        this.v = i3;
        this.w = jSONObject;
    }

    @Override // c.f.a.c.d.u.u.i.h
    public final void o() {
        int iR0 = this.x.r0(this.u);
        int i2 = this.v;
        if (i2 < 0) {
            i((i.c) e(new Status(AdError.INTERNAL_ERROR_CODE, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(this.v)))));
            return;
        }
        if (iR0 == i2) {
            i((i.c) e(new Status(0)));
            return;
        }
        if (i2 > iR0) {
            i2++;
        }
        this.x.f12005d.C(this.r, new int[]{this.u}, this.x.s0(i2), this.w);
    }
}
