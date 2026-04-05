package n.a.a;

import android.content.DialogInterface;
import android.os.Build;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import n.a.a.c;

/* JADX INFO: loaded from: classes2.dex */
public class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f31223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f31224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a f31225d;

    public e(g gVar, f fVar, c.a aVar) {
        this.f31223b = (Build.VERSION.SDK_INT < 17 || gVar.getParentFragment() == null) ? gVar.getActivity() : gVar.getParentFragment();
        this.f31224c = fVar;
        this.f31225d = aVar;
    }

    public final void a() {
        c.a aVar = this.f31225d;
        if (aVar != null) {
            f fVar = this.f31224c;
            aVar.h(fVar.f31228c, Arrays.asList(fVar.f31230e));
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 != -1) {
            a();
            return;
        }
        Object obj = this.f31223b;
        if (obj instanceof Fragment) {
            f fVar = this.f31224c;
            ((Fragment) obj).requestPermissions(fVar.f31230e, fVar.f31228c);
        } else {
            if (obj instanceof android.app.Fragment) {
                if (Build.VERSION.SDK_INT < 23) {
                    throw new IllegalArgumentException("Target SDK needs to be greater than 23 if caller is android.app.Fragment");
                }
                f fVar2 = this.f31224c;
                ((android.app.Fragment) obj).requestPermissions(fVar2.f31230e, fVar2.f31228c);
                return;
            }
            if (obj instanceof a.l.d.e) {
                f fVar3 = this.f31224c;
                a.i.h.a.q((a.l.d.e) obj, fVar3.f31230e, fVar3.f31228c);
            }
        }
    }
}
