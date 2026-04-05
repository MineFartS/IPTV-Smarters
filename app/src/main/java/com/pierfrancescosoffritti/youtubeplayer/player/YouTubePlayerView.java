package com.pierfrancescosoffritti.youtubeplayer.player;

import a.p.f;
import a.p.j;
import a.p.r;
import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c.i.a.f.c;
import c.i.a.f.f;
import c.i.a.h.b;

/* JADX INFO: loaded from: classes.dex */
public class YouTubePlayerView extends FrameLayout implements b.a, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.i.a.f.b f30025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.i.a.g.a f30026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.i.a.h.b f30027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.i.a.f.h.b f30028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.i.a.f.h.a f30029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.i.a.h.a f30030g;

    /* JADX INFO: loaded from: classes2.dex */
    public class a implements c.i.a.h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f30031a;

        /* JADX INFO: renamed from: com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView$a$a, reason: collision with other inner class name */
        public class C0296a implements f {
            public C0296a() {
            }

            @Override // c.i.a.f.f
            public void a(c cVar) {
                a.this.f30031a.a(cVar);
            }
        }

        public a(f fVar) {
            this.f30031a = fVar;
        }

        @Override // c.i.a.h.a
        public void call() {
            YouTubePlayerView.this.f30025b.h(new C0296a());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class b extends c.i.a.f.a {
        public b() {
        }

        @Override // c.i.a.f.a, c.i.a.f.g
        public void h() {
            YouTubePlayerView.this.f30030g = null;
        }
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c.i.a.f.b bVar = new c.i.a.f.b(context);
        this.f30025b = bVar;
        addView(bVar, new FrameLayout.LayoutParams(-1, -1));
        this.f30026c = new c.i.a.g.a(this, bVar);
        this.f30028e = new c.i.a.f.h.b();
        this.f30027d = new c.i.a.h.b(this);
        c.i.a.f.h.a aVar = new c.i.a.f.h.a();
        this.f30029f = aVar;
        aVar.a(this.f30026c);
        l(bVar);
    }

    @Override // c.i.a.h.b.a
    public void c() {
        c.i.a.h.a aVar = this.f30030g;
        if (aVar != null) {
            aVar.call();
        } else {
            this.f30028e.b(this.f30025b);
        }
    }

    @Override // c.i.a.h.b.a
    public void g() {
    }

    public c.i.a.g.b getPlayerUIController() {
        c.i.a.g.a aVar = this.f30026c;
        if (aVar != null) {
            return aVar;
        }
        throw new RuntimeException("You have inflated a custom player UI. You must manage it with your own controller.");
    }

    public final void l(c cVar) {
        c.i.a.g.a aVar = this.f30026c;
        if (aVar != null) {
            cVar.d(aVar);
        }
        cVar.d(this.f30028e);
        cVar.d(new b());
    }

    public void m(f fVar, boolean z) {
        if (z) {
            getContext().registerReceiver(this.f30027d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.f30030g = new a(fVar);
        if (c.i.a.h.c.b(getContext())) {
            this.f30030g.call();
        }
    }

    public void n() {
        this.f30029f.d(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (getLayoutParams().height == -2) {
            i3 = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) * 9) / 16, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    @r(f.b.ON_STOP)
    public void onStop() {
        this.f30025b.pause();
    }

    @r(f.b.ON_DESTROY)
    public void release() {
        this.f30025b.destroy();
        try {
            getContext().unregisterReceiver(this.f30027d);
        } catch (Exception unused) {
        }
    }
}
