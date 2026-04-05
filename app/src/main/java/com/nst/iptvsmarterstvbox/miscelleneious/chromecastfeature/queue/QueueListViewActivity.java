package minefarts.iptvsmarters.miscelleneious.chromecastfeature.queue;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import c.f.a.c.d.o;
import c.f.a.c.d.q;
import c.f.a.c.d.u.d;
import c.f.a.c.d.u.s;
import c.f.a.c.d.u.u.i;
import minefarts.iptvsmarters.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class QueueListViewActivity extends a.b.k.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f24931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s<d> f24932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.f.a.c.d.u.b f24933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f24934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f24935h;

    public class b extends i.a {
        public b() {
        }

        @Override // c.f.a.c.d.u.u.i.a
        public void e() {
            m();
        }

        @Override // c.f.a.c.d.u.u.i.a
        public void g() {
            m();
        }

        public final void m() {
            View view;
            int i2;
            q qVarL = QueueListViewActivity.this.f24934g.l();
            List<o> listA0 = qVarL == null ? null : qVarL.a0();
            if (listA0 == null || listA0.isEmpty()) {
                view = QueueListViewActivity.this.f24935h;
                i2 = 0;
            } else {
                view = QueueListViewActivity.this.f24935h;
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public class c implements s<d> {
        public c() {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void i(d dVar, int i2) {
            if (QueueListViewActivity.this.f24934g != null) {
                QueueListViewActivity.this.f24934g.N(QueueListViewActivity.this.f24931d);
            }
            QueueListViewActivity.this.f24934g = null;
            QueueListViewActivity.this.f24935h.setVisibility(0);
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void o(d dVar) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m(d dVar, int i2) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void l(d dVar, boolean z) {
            QueueListViewActivity queueListViewActivity = QueueListViewActivity.this;
            queueListViewActivity.f24934g = queueListViewActivity.D0();
            if (QueueListViewActivity.this.f24934g != null) {
                QueueListViewActivity.this.f24934g.N(QueueListViewActivity.this.f24931d);
            }
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void h(d dVar, String str) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void k(d dVar, int i2) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void j(d dVar, String str) {
            QueueListViewActivity queueListViewActivity = QueueListViewActivity.this;
            queueListViewActivity.f24934g = queueListViewActivity.D0();
            if (QueueListViewActivity.this.f24934g != null) {
                QueueListViewActivity.this.f24934g.N(QueueListViewActivity.this.f24931d);
            }
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void n(d dVar) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void g(d dVar, int i2) {
            if (QueueListViewActivity.this.f24934g != null) {
                QueueListViewActivity.this.f24934g.X(QueueListViewActivity.this.f24931d);
            }
            QueueListViewActivity.this.f24934g = null;
        }
    }

    public QueueListViewActivity() {
        this.f24931d = new b();
        this.f24932e = new c();
    }

    public final i D0() {
        d dVarC = this.f24933f.c().c();
        if (dVarC == null || !dVarC.c()) {
            return null;
        }
        return dVarC.p();
    }

    public final void E0() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.queue_list);
        v0(toolbar);
        n0().s(true);
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f24933f.f(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.queue_activity);
        Log.d("QueueListViewActivity", "onCreate() was called");
        c.h.a.h.m.b.n(this);
        c.f.a.c.d.u.b.e(this).c().c();
        if (bundle == null) {
            getSupportFragmentManager().m().c(R.id.container, new c.h.a.h.m.e.c(), "list view").j();
        }
        E0();
        this.f24935h = findViewById(R.id.empty);
        this.f24933f = c.f.a.c.d.u.b.e(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.queue_menu, menu);
        c.f.a.c.d.u.a.a(getApplicationContext(), menu, R.id.media_route_menu_item);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId != R.id.action_clear_queue) {
            return true;
        }
        c.h.a.h.m.b.n(getApplicationContext()).x();
        return true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        i iVar = this.f24934g;
        if (iVar != null) {
            iVar.X(this.f24931d);
        }
        this.f24933f.c().e(this.f24932e, d.class);
        super.onPause();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        this.f24933f.c().a(this.f24932e, d.class);
        if (this.f24934g == null) {
            this.f24934g = D0();
        }
        i iVar = this.f24934g;
        if (iVar != null) {
            iVar.N(this.f24931d);
            q qVarL = this.f24934g.l();
            List<o> listA0 = qVarL == null ? null : qVarL.a0();
            if (listA0 != null && !listA0.isEmpty()) {
                this.f24935h.setVisibility(8);
            }
        }
        super.onResume();
    }
}
