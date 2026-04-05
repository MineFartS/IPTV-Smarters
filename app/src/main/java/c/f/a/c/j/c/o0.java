package c.f.a.c.j.c;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f12986b;

    public o0(TextView textView) {
        this.f12986b = textView;
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        MediaInfo mediaInfoJ;
        c.f.a.c.d.l lVarP;
        String strA;
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || (mediaInfoJ = iVarB.j()) == null || (lVarP = mediaInfoJ.P()) == null || (strA = c.f.a.c.d.u.u.k.p.a(lVarP)) == null) {
            return;
        }
        this.f12986b.setText(strA);
    }
}
