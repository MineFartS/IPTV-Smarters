package a.b.k;

import a.b.k.a;
import a.b.p.j.g;
import a.b.p.j.m;
import a.b.q.a0;
import a.b.q.v0;
import a.i.r.x;
import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k extends a.b.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Window.Callback f217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<a.b> f220f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f221g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Toolbar.f f222h;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.B();
        }
    }

    public class b implements Toolbar.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.f217c.onMenuItemSelected(0, menuItem);
        }
    }

    public final class c implements m.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f225b;

        public c() {
        }

        @Override // a.b.p.j.m.a
        public void b(a.b.p.j.g gVar, boolean z) {
            if (this.f225b) {
                return;
            }
            this.f225b = true;
            k.this.f215a.h();
            Window.Callback callback = k.this.f217c;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.f225b = false;
        }

        @Override // a.b.p.j.m.a
        public boolean c(a.b.p.j.g gVar) {
            Window.Callback callback = k.this.f217c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    public final class d implements g.a {
        public d() {
        }

        @Override // a.b.p.j.g.a
        public boolean a(a.b.p.j.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // a.b.p.j.g.a
        public void b(a.b.p.j.g gVar) {
            k kVar = k.this;
            if (kVar.f217c != null) {
                if (kVar.f215a.b()) {
                    k.this.f217c.onPanelClosed(108, gVar);
                } else if (k.this.f217c.onPreparePanel(0, null, gVar)) {
                    k.this.f217c.onMenuOpened(108, gVar);
                }
            }
        }
    }

    public class e extends a.b.p.i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            return i2 == 0 ? new View(k.this.f215a.v()) : super.onCreatePanelView(i2);
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            if (zOnPreparePanel) {
                k kVar = k.this;
                if (!kVar.f216b) {
                    kVar.f215a.c();
                    k.this.f216b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    public k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f222h = bVar;
        this.f215a = new v0(toolbar, false);
        e eVar = new e(callback);
        this.f217c = eVar;
        this.f215a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f215a.setWindowTitle(charSequence);
    }

    public Window.Callback A() {
        return this.f217c;
    }

    public void B() {
        Menu menuZ = z();
        a.b.p.j.g gVar = menuZ instanceof a.b.p.j.g ? (a.b.p.j.g) menuZ : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            menuZ.clear();
            if (!this.f217c.onCreatePanelMenu(0, menuZ) || !this.f217c.onPreparePanel(0, null, menuZ)) {
                menuZ.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.c0();
            }
        }
    }

    public void C(int i2, int i3) {
        this.f215a.k((i2 & i3) | ((i3 ^ (-1)) & this.f215a.w()));
    }

    @Override // a.b.k.a
    public boolean g() {
        return this.f215a.f();
    }

    @Override // a.b.k.a
    public boolean h() {
        if (!this.f215a.j()) {
            return false;
        }
        this.f215a.collapseActionView();
        return true;
    }

    @Override // a.b.k.a
    public void i(boolean z) {
        if (z == this.f219e) {
            return;
        }
        this.f219e = z;
        int size = this.f220f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f220f.get(i2).a(z);
        }
    }

    @Override // a.b.k.a
    public int j() {
        return this.f215a.w();
    }

    @Override // a.b.k.a
    public Context k() {
        return this.f215a.v();
    }

    @Override // a.b.k.a
    public boolean l() {
        this.f215a.t().removeCallbacks(this.f221g);
        x.h0(this.f215a.t(), this.f221g);
        return true;
    }

    @Override // a.b.k.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // a.b.k.a
    public void n() {
        this.f215a.t().removeCallbacks(this.f221g);
    }

    @Override // a.b.k.a
    public boolean o(int i2, KeyEvent keyEvent) {
        Menu menuZ = z();
        if (menuZ == null) {
            return false;
        }
        menuZ.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuZ.performShortcut(i2, keyEvent, 0);
    }

    @Override // a.b.k.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // a.b.k.a
    public boolean q() {
        return this.f215a.g();
    }

    @Override // a.b.k.a
    public void r(boolean z) {
    }

    @Override // a.b.k.a
    public void s(boolean z) {
        C(z ? 4 : 0, 4);
    }

    @Override // a.b.k.a
    public void t(int i2) {
        this.f215a.q(i2);
    }

    @Override // a.b.k.a
    public void u(boolean z) {
    }

    @Override // a.b.k.a
    public void v(CharSequence charSequence) {
        this.f215a.l(charSequence);
    }

    @Override // a.b.k.a
    public void w(CharSequence charSequence) {
        this.f215a.setTitle(charSequence);
    }

    @Override // a.b.k.a
    public void x(CharSequence charSequence) {
        this.f215a.setWindowTitle(charSequence);
    }

    public final Menu z() {
        if (!this.f218d) {
            this.f215a.r(new c(), new d());
            this.f218d = true;
        }
        return this.f215a.m();
    }
}
