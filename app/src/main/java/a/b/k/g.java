package a.b.k;

import a.b.p.b;
import a.i.r.g;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class g extends Dialog implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a f195c;

    public class a implements g.a {
        public a() {
        }

        @Override // a.i.r.g.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i2) {
        super(context, b(context, i2));
        this.f195c = new a();
        e eVarA = a();
        eVarA.E(b(context, i2));
        eVarA.q(null);
    }

    public static int b(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.A, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.b.k.d
    public a.b.p.b N(b.a aVar) {
        return null;
    }

    public e a() {
        if (this.f194b == null) {
            this.f194b = e.h(this, this);
        }
        return this.f194b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i2) {
        return a().z(i2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a.i.r.g.e(this.f195c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().i(i2);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().o();
    }

    @Override // a.b.k.d
    public void j(a.b.p.b bVar) {
    }

    @Override // a.b.k.d
    public void o(a.b.p.b bVar) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().n();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().A(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().F(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().F(charSequence);
    }
}
