package c.f.a.d.x;

import a.i.r.x;
import a.l.d.y;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.f.a.d.x.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class i<S> extends a.l.d.d {
    public static final Object r = "CONFIRM_BUTTON_TAG";
    public static final Object s = "CANCEL_BUTTON_TAG";
    public static final Object t = "TOGGLE_BUTTON_TAG";
    public p<S> A;
    public c.f.a.d.x.a B;
    public h<S> C;
    public int D;
    public CharSequence E;
    public boolean F;
    public int G;
    public TextView H;
    public CheckableImageButton I;
    public c.f.a.d.j0.g J;
    public Button K;
    public final LinkedHashSet<j<? super S>> u = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> v = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> w = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> x = new LinkedHashSet<>();
    public int y;
    public c.f.a.d.x.d<S> z;

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.u.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.g0());
            }
            i.this.q();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.v.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.q();
        }
    }

    public class c extends o<S> {
        public c() {
        }

        @Override // c.f.a.d.x.o
        public void a(S s) {
            i.this.p0();
            i.this.K.setEnabled(i.this.z.x());
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.K.setEnabled(i.this.z.x());
            i.this.I.toggle();
            i iVar = i.this;
            iVar.q0(iVar.I);
            i.this.o0();
        }
    }

    public static Drawable Z(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, a.b.l.a.a.d(context, c.f.a.d.e.f14776b));
        stateListDrawable.addState(new int[0], a.b.l.a.a.d(context, c.f.a.d.e.f14777c));
        return stateListDrawable;
    }

    public static int c0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(c.f.a.d.d.M) + resources.getDimensionPixelOffset(c.f.a.d.d.N) + resources.getDimensionPixelOffset(c.f.a.d.d.L);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(c.f.a.d.d.H);
        int i2 = m.f15328b;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(c.f.a.d.d.F) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(c.f.a.d.d.K)) + resources.getDimensionPixelOffset(c.f.a.d.d.D);
    }

    public static int e0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(c.f.a.d.d.E);
        int i2 = l.o().f15324e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(c.f.a.d.d.G) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(c.f.a.d.d.J));
    }

    public static boolean l0(Context context) {
        return n0(context, R.attr.windowFullscreen);
    }

    public static boolean m0(Context context) {
        return n0(context, c.f.a.d.b.x);
    }

    public static boolean n0(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c.f.a.d.g0.b.c(context, c.f.a.d.b.u, h.class.getCanonicalName()), new int[]{i2});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public String d0() {
        return this.z.g(getContext());
    }

    public final S g0() {
        return this.z.D();
    }

    public final int h0(Context context) {
        int i2 = this.y;
        return i2 != 0 ? i2 : this.z.v(context);
    }

    public final void i0(Context context) {
        this.I.setTag(t);
        this.I.setImageDrawable(Z(context));
        this.I.setChecked(this.G != 0);
        x.p0(this.I, null);
        q0(this.I);
        this.I.setOnClickListener(new d());
    }

    public final void o0() {
        int iH0 = h0(requireContext());
        this.C = h.K(this.z, iH0, this.B);
        this.A = this.I.isChecked() ? k.o(this.z, iH0, this.B) : this.C;
        p0();
        y yVarM = getChildFragmentManager().m();
        yVarM.r(c.f.a.d.f.w, this.A);
        yVarM.l();
        this.A.l(new c());
    }

    @Override // a.l.d.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // a.l.d.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.y = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.z = (c.f.a.d.x.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.B = (c.f.a.d.x.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.D = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.E = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.G = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.F ? c.f.a.d.h.s : c.f.a.d.h.r, viewGroup);
        Context context = viewInflate.getContext();
        if (this.F) {
            viewInflate.findViewById(c.f.a.d.f.w).setLayoutParams(new LinearLayout.LayoutParams(e0(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(c.f.a.d.f.x);
            View viewFindViewById2 = viewInflate.findViewById(c.f.a.d.f.w);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(e0(context), -1));
            viewFindViewById2.setMinimumHeight(c0(requireContext()));
        }
        TextView textView = (TextView) viewInflate.findViewById(c.f.a.d.f.C);
        this.H = textView;
        x.r0(textView, 1);
        this.I = (CheckableImageButton) viewInflate.findViewById(c.f.a.d.f.D);
        TextView textView2 = (TextView) viewInflate.findViewById(c.f.a.d.f.E);
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.D);
        }
        i0(context);
        this.K = (Button) viewInflate.findViewById(c.f.a.d.f.f14784c);
        if (this.z.x()) {
            this.K.setEnabled(true);
        } else {
            this.K.setEnabled(false);
        }
        this.K.setTag(r);
        this.K.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(c.f.a.d.f.f14782a);
        button.setTag(s);
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // a.l.d.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // a.l.d.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.y);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.z);
        a.b bVar = new a.b(this.B);
        if (this.C.F() != null) {
            bVar.b(this.C.F().f15326g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.D);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.E);
    }

    @Override // a.l.d.d, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = C().getWindow();
        if (this.F) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.J);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.f.a.d.d.I);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.J, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new c.f.a.d.y.a(C(), rect));
        }
        o0();
    }

    @Override // a.l.d.d, androidx.fragment.app.Fragment
    public void onStop() {
        this.A.n();
        super.onStop();
    }

    public final void p0() {
        String strD0 = d0();
        this.H.setContentDescription(String.format(getString(c.f.a.d.j.f14882m), strD0));
        this.H.setText(strD0);
    }

    public final void q0(CheckableImageButton checkableImageButton) {
        this.I.setContentDescription(checkableImageButton.getContext().getString(this.I.isChecked() ? c.f.a.d.j.p : c.f.a.d.j.r));
    }

    @Override // a.l.d.d
    public final Dialog w(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), h0(requireContext()));
        Context context = dialog.getContext();
        this.F = l0(context);
        int iC = c.f.a.d.g0.b.c(context, c.f.a.d.b.f14636m, i.class.getCanonicalName());
        c.f.a.d.j0.g gVar = new c.f.a.d.j0.g(context, null, c.f.a.d.b.u, c.f.a.d.k.u);
        this.J = gVar;
        gVar.M(context);
        this.J.X(ColorStateList.valueOf(iC));
        this.J.W(x.w(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
