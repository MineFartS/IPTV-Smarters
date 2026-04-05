package a.b.p;

import a.b.p.b;
import a.b.p.j.j;
import a.b.p.j.o;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f356b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<f> f359c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a.f.i<Menu, Menu> f360d = new a.f.i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f358b = context;
            this.f357a = callback;
        }

        @Override // a.b.p.b.a
        public void a(b bVar) {
            this.f357a.onDestroyActionMode(e(bVar));
        }

        @Override // a.b.p.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f357a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // a.b.p.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f357a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // a.b.p.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f357a.onActionItemClicked(e(bVar), new j(this.f358b, (a.i.l.a.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f359c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f359c.get(i2);
                if (fVar != null && fVar.f356b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f358b, bVar);
            this.f359c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.f360d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f358b, (a.i.l.a.a) menu);
            this.f360d.put(menu, oVar);
            return oVar;
        }
    }

    public f(Context context, b bVar) {
        this.f355a = context;
        this.f356b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f356b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f356b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f355a, (a.i.l.a.a) this.f356b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f356b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f356b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f356b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f356b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f356b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f356b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f356b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f356b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f356b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f356b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f356b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f356b.q(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f356b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f356b.s(z);
    }
}
