package c.f.a.c.j.c;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f12854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f12855c;

    public h0(TextView textView, List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.f12855c = arrayList;
        this.f12854b = textView;
        arrayList.addAll(list);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        MediaInfo mediaInfoS;
        c.f.a.c.d.l lVarP;
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p() || (mediaInfoS = iVarB.l().S()) == null || (lVarP = mediaInfoS.P()) == null) {
            return;
        }
        for (String str : this.f12855c) {
            if (lVarP.e(str)) {
                this.f12854b.setText(lVarP.K(str));
                return;
            }
        }
        this.f12854b.setText(BuildConfig.FLAVOR);
    }
}
