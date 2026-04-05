package a.b.k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: loaded from: classes.dex */
public class b extends g implements DialogInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlertController f136d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.f f137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f138b;

        public a(Context context) {
            this(context, b.g(context, 0));
        }

        public a(Context context, int i2) {
            this.f137a = new AlertController.f(new ContextThemeWrapper(context, b.g(context, i2)));
            this.f138b = i2;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f137a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a b(boolean z) {
            this.f137a.r = z;
            return this;
        }

        public a c(View view) {
            this.f137a.f4076g = view;
            return this;
        }

        public b create() {
            b bVar = new b(this.f137a.f4070a, this.f138b);
            this.f137a.a(bVar.f136d);
            bVar.setCancelable(this.f137a.r);
            if (this.f137a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f137a.s);
            bVar.setOnDismissListener(this.f137a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f137a.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public a d(int i2) {
            this.f137a.f4072c = i2;
            return this;
        }

        public a e(Drawable drawable) {
            this.f137a.f4073d = drawable;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f137a.f4077h = charSequence;
            return this;
        }

        public a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f137a;
            fVar.f4081l = charSequence;
            fVar.f4083n = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f137a.f4070a;
        }

        public a h(DialogInterface.OnDismissListener onDismissListener) {
            this.f137a.t = onDismissListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f137a.u = onKeyListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f137a;
            fVar.f4078i = charSequence;
            fVar.f4080k = onClickListener;
            return this;
        }

        public a k(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f137a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i2;
            fVar.H = true;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f137a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = i2;
            fVar.H = true;
            return this;
        }

        public a m(int i2) {
            AlertController.f fVar = this.f137a;
            fVar.f4075f = fVar.f4070a.getText(i2);
            return this;
        }

        public b n() {
            b bVarCreate = create();
            bVarCreate.show();
            return bVarCreate;
        }

        public a setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f137a;
            fVar.f4081l = fVar.f4070a.getText(i2);
            this.f137a.f4083n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f137a;
            fVar.f4078i = fVar.f4070a.getText(i2);
            this.f137a.f4080k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f137a.f4075f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.f137a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }
    }

    public b(Context context, int i2) {
        super(context, g(context, i2));
        this.f136d = new AlertController(getContext(), this, getWindow());
    }

    public static int g(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.f31o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button e(int i2) {
        return this.f136d.c(i2);
    }

    public ListView f() {
        return this.f136d.e();
    }

    @Override // a.b.k.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f136d.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f136d.h(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f136d.i(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // a.b.k.g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f136d.r(charSequence);
    }
}
