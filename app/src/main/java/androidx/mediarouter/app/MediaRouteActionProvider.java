package androidx.mediarouter.app;

import a.i.r.b;
import a.t.l.f;
import a.t.l.g;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class MediaRouteActionProvider extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f4665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f4666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f4667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.t.k.g f4668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaRouteButton f4669h;

    public static final class a extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<MediaRouteActionProvider> f4670a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.f4670a = new WeakReference<>(mediaRouteActionProvider);
        }

        @Override // a.t.l.g.a
        public void a(g gVar, g.e eVar) {
            l(gVar);
        }

        @Override // a.t.l.g.a
        public void b(g gVar, g.e eVar) {
            l(gVar);
        }

        @Override // a.t.l.g.a
        public void c(g gVar, g.e eVar) {
            l(gVar);
        }

        @Override // a.t.l.g.a
        public void d(g gVar, g.C0076g c0076g) {
            l(gVar);
        }

        @Override // a.t.l.g.a
        public void e(g gVar, g.C0076g c0076g) {
            l(gVar);
        }

        @Override // a.t.l.g.a
        public void g(g gVar, g.C0076g c0076g) {
            l(gVar);
        }

        public final void l(g gVar) {
            MediaRouteActionProvider mediaRouteActionProvider = this.f4670a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.n();
            } else {
                gVar.k(this);
            }
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.f4667f = f.f3357a;
        this.f4668g = a.t.k.g.a();
        this.f4665d = g.f(context);
        this.f4666e = new a(this);
    }

    @Override // a.i.r.b
    public boolean c() {
        return this.f4665d.j(this.f4667f, 1);
    }

    @Override // a.i.r.b
    public View d() {
        if (this.f4669h != null) {
            Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        MediaRouteButton mediaRouteButtonM = m();
        this.f4669h = mediaRouteButtonM;
        mediaRouteButtonM.setCheatSheetEnabled(true);
        this.f4669h.setRouteSelector(this.f4667f);
        this.f4669h.setDialogFactory(this.f4668g);
        this.f4669h.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.f4669h;
    }

    @Override // a.i.r.b
    public boolean f() {
        MediaRouteButton mediaRouteButton = this.f4669h;
        if (mediaRouteButton != null) {
            return mediaRouteButton.b();
        }
        return false;
    }

    @Override // a.i.r.b
    public boolean h() {
        return true;
    }

    public MediaRouteButton m() {
        return new MediaRouteButton(a());
    }

    public void n() {
        i();
    }

    public void o(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4667f.equals(fVar)) {
            return;
        }
        if (!this.f4667f.f()) {
            this.f4665d.k(this.f4666e);
        }
        if (!fVar.f()) {
            this.f4665d.a(fVar, this.f4666e);
        }
        this.f4667f = fVar;
        n();
        MediaRouteButton mediaRouteButton = this.f4669h;
        if (mediaRouteButton != null) {
            mediaRouteButton.setRouteSelector(fVar);
        }
    }
}
