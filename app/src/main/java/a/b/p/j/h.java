package a.b.p.j;

import a.b.k.b;
import a.b.p.j.m;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.b.k.b f479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m.a f481e;

    public h(g gVar) {
        this.f478b = gVar;
    }

    public void a() {
        a.b.k.b bVar = this.f479c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // a.b.p.j.m.a
    public void b(g gVar, boolean z) {
        if (z || gVar == this.f478b) {
            a();
        }
        m.a aVar = this.f481e;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // a.b.p.j.m.a
    public boolean c(g gVar) {
        m.a aVar = this.f481e;
        if (aVar != null) {
            return aVar.c(gVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        g gVar = this.f478b;
        b.a aVar = new b.a(gVar.u());
        e eVar = new e(aVar.getContext(), a.b.g.f95j);
        this.f480d = eVar;
        eVar.g(this);
        this.f478b.b(this.f480d);
        aVar.a(this.f480d.a(), this);
        View viewY = gVar.y();
        if (viewY != null) {
            aVar.c(viewY);
        } else {
            aVar.e(gVar.w()).setTitle(gVar.x());
        }
        aVar.i(this);
        a.b.k.b bVarCreate = aVar.create();
        this.f479c = bVarCreate;
        bVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f479c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f479c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f478b.L((i) this.f480d.a().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f480d.b(this.f478b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f479c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f479c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f478b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f478b.performShortcut(i2, keyEvent, 0);
    }
}
