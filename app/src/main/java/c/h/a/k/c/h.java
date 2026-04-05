package c.h.a.k.c;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import c.f.a.b.c3.b0;
import c.f.a.b.c3.r;
import c.f.a.b.c3.x;
import c.f.a.b.c3.y;
import c.f.a.b.h3.k0;
import c.f.a.b.j3.g0;
import c.f.a.b.j3.x0;
import com.nst.iptvsmarterstvbox.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class h extends b0 {

    public static final class a implements x.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f17772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17773c;

        public a(Context context, k0 k0Var, int i2) {
            this.f17771a = context.getApplicationContext();
            this.f17772b = k0Var;
            this.f17773c = i2;
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void a(x xVar, boolean z) {
            y.b(this, xVar, z);
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void b(x xVar, boolean z) {
            y.f(this, xVar, z);
        }

        @Override // c.f.a.b.c3.x.d
        public void c(x xVar, r rVar, Exception exc) {
            Notification notificationB;
            int i2 = rVar.f6767b;
            if (i2 == 3) {
                notificationB = this.f17772b.a(this.f17771a, R.drawable.hp_download, null, x0.E(rVar.f6766a.f6669h));
            } else if (i2 != 4) {
                return;
            } else {
                notificationB = this.f17772b.b(this.f17771a, R.drawable.hp_download, null, x0.E(rVar.f6766a.f6669h));
            }
            Context context = this.f17771a;
            int i3 = this.f17773c;
            this.f17773c = i3 + 1;
            g0.b(context, i3, notificationB);
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void d(x xVar, c.f.a.b.d3.d dVar, int i2) {
            y.e(this, xVar, dVar, i2);
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void e(x xVar, r rVar) {
            y.a(this, xVar, rVar);
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void f(x xVar) {
            y.c(this, xVar);
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void g(x xVar) {
            y.d(this, xVar);
        }
    }

    public h() {
        super(1, 1000L, "download_channel", R.string.exo_download_notification_channel_name, 0);
    }

    @Override // c.f.a.b.c3.b0
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c.f.a.b.d3.c p() {
        if (x0.f9296a >= 21) {
            return new c.f.a.b.d3.c(this, 1);
        }
        return null;
    }

    @Override // c.f.a.b.c3.b0
    public x l() {
        x xVarH = i.h(this);
        xVarH.b(new a(this, i.i(this), 2));
        return xVarH;
    }

    @Override // c.f.a.b.c3.b0
    public Notification m(List<r> list) {
        return i.i(this).e(this, R.drawable.ic_download, null, null, list);
    }
}
