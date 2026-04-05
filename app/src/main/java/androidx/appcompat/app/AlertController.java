package androidx.appcompat.app;

import a.b.j;
import a.b.q.f0;
import a.i.r.x;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.b.k.g f4041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f4042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f4044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f4045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f4046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f4047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4052m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f4054o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4053n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4056c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.n2);
            this.f4056c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.o2, -1);
            this.f4055b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.p2, -1);
        }

        public void a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f4055b, getPaddingRight(), z2 ? getPaddingBottom() : this.f4056c);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f4054o || (message2 = alertController.q) == null) && (view != alertController.s || (message2 = alertController.u) == null)) ? (view != alertController.w || (message = alertController.y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f4041b).sendToTarget();
        }
    }

    public class b implements NestedScrollView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f4058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f4059b;

        public b(View view, View view2) {
            this.f4058a = view;
            this.f4059b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            AlertController.g(nestedScrollView, this.f4058a, this.f4059b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f4061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f4062c;

        public c(View view, View view2) {
            this.f4061b = view;
            this.f4062c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f4061b, this.f4062c);
        }
    }

    public class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f4064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f4065b;

        public d(View view, View view2) {
            this.f4064a = view;
            this.f4065b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.g(absListView, this.f4064a, this.f4065b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f4067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f4068c;

        public e(View view, View view2) {
            this.f4067b = view;
            this.f4068c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f4046g, this.f4067b, this.f4068c);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f4070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f4071b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f4073d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f4075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f4076g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f4077h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f4078i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f4079j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f4080k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f4081l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f4082m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f4083n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f4084o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4072c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4074e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;
        public boolean r = true;

        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f4085b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f4085b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i2]) {
                    this.f4085b.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        public class b extends CursorAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f4087b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f4088c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f4089d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AlertController f4090e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f4089d = recycleListView;
                this.f4090e = alertController;
                Cursor cursor2 = getCursor();
                this.f4087b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f4088c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f4087b));
                this.f4089d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f4088c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f4071b.inflate(this.f4090e.M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlertController f4092b;

            public c(AlertController alertController) {
                this.f4092b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                f.this.x.onClick(this.f4092b.f4041b, i2);
                if (f.this.H) {
                    return;
                }
                this.f4092b.f4041b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f4094b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AlertController f4095c;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f4094b = recycleListView;
                this.f4095c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i2] = this.f4094b.isItemChecked(i2);
                }
                f.this.J.onClick(this.f4095c.f4041b, i2, this.f4094b.isItemChecked(i2));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f4070a = context;
            this.f4071b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.f4076g;
            if (view != null) {
                alertController.m(view);
            } else {
                CharSequence charSequence = this.f4075f;
                if (charSequence != null) {
                    alertController.r(charSequence);
                }
                Drawable drawable = this.f4073d;
                if (drawable != null) {
                    alertController.o(drawable);
                }
                int i2 = this.f4072c;
                if (i2 != 0) {
                    alertController.n(i2);
                }
                int i3 = this.f4074e;
                if (i3 != 0) {
                    alertController.n(alertController.d(i3));
                }
            }
            CharSequence charSequence2 = this.f4077h;
            if (charSequence2 != null) {
                alertController.p(charSequence2);
            }
            CharSequence charSequence3 = this.f4078i;
            if (charSequence3 != null || this.f4079j != null) {
                alertController.l(-1, charSequence3, this.f4080k, null, this.f4079j);
            }
            CharSequence charSequence4 = this.f4081l;
            if (charSequence4 != null || this.f4082m != null) {
                alertController.l(-2, charSequence4, this.f4083n, null, this.f4082m);
            }
            CharSequence charSequence5 = this.f4084o;
            if (charSequence5 != null || this.p != null) {
                alertController.l(-3, charSequence5, this.q, null, this.p);
            }
            if (this.v != null || this.K != null || this.w != null) {
                b(alertController);
            }
            View view2 = this.z;
            if (view2 != null) {
                if (this.E) {
                    alertController.u(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.t(view2);
                    return;
                }
            }
            int i4 = this.y;
            if (i4 != 0) {
                alertController.s(i4);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f4071b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f4070a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f4070a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f4070a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f4070a
                java.lang.CharSequence[] r3 = r10.v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f4046g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }
    }

    public static final class g extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f4097a;

        public g(DialogInterface dialogInterface) {
            this.f4097a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f4097a.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, a.b.k.g gVar, Window window) {
        this.f4040a = context;
        this.f4041b = gVar;
        this.f4042c = window;
        this.R = new g(gVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.F, a.b.a.f30n, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(j.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(j.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(j.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(j.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(j.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(j.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(j.M, true);
        this.f4043d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.d(1);
    }

    public static boolean A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.f29m, typedValue, true);
        return typedValue.data != 0;
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i2) {
        if (i2 == -3) {
            return this.w;
        }
        if (i2 == -2) {
            return this.s;
        }
        if (i2 != -1) {
            return null;
        }
        return this.f4054o;
    }

    public int d(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f4040a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f4046g;
    }

    public void f() {
        this.f4041b.setContentView(k());
        z();
    }

    public boolean h(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public boolean i(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public final ViewGroup j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int k() {
        int i2 = this.K;
        return (i2 != 0 && this.Q == 1) ? i2 : this.J;
    }

    public void l(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        }
    }

    public void m(View view) {
        this.G = view;
    }

    public void n(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i2 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void o(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void p(CharSequence charSequence) {
        this.f4045f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void q(ViewGroup viewGroup, View view, int i2, int i3) {
        View viewFindViewById = this.f4042c.findViewById(a.b.f.v);
        View viewFindViewById2 = this.f4042c.findViewById(a.b.f.u);
        if (Build.VERSION.SDK_INT >= 23) {
            x.D0(view, i2, i3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 == null) {
                return;
            }
        } else {
            if (viewFindViewById != null && (i2 & 1) == 0) {
                viewGroup.removeView(viewFindViewById);
                viewFindViewById = null;
            }
            if (viewFindViewById2 != null && (i2 & 2) == 0) {
                viewGroup.removeView(viewFindViewById2);
                viewFindViewById2 = null;
            }
            if (viewFindViewById == null && viewFindViewById2 == null) {
                return;
            }
            if (this.f4045f != null) {
                this.A.setOnScrollChangeListener(new b(viewFindViewById, viewFindViewById2));
                this.A.post(new c(viewFindViewById, viewFindViewById2));
                return;
            }
            ListView listView = this.f4046g;
            if (listView != null) {
                listView.setOnScrollListener(new d(viewFindViewById, viewFindViewById2));
                this.f4046g.post(new e(viewFindViewById, viewFindViewById2));
                return;
            } else {
                if (viewFindViewById != null) {
                    viewGroup.removeView(viewFindViewById);
                }
                if (viewFindViewById2 == null) {
                    return;
                }
            }
        }
        viewGroup.removeView(viewFindViewById2);
    }

    public void r(CharSequence charSequence) {
        this.f4044e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(int i2) {
        this.f4047h = null;
        this.f4048i = i2;
        this.f4053n = false;
    }

    public void t(View view) {
        this.f4047h = view;
        this.f4048i = 0;
        this.f4053n = false;
    }

    public void u(View view, int i2, int i3, int i4, int i5) {
        this.f4047h = view;
        this.f4048i = 0;
        this.f4053n = true;
        this.f4049j = i2;
        this.f4050k = i3;
        this.f4051l = i4;
        this.f4052m = i5;
    }

    public final void v(ViewGroup viewGroup) {
        int i2;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f4054o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.p) && this.r == null) {
            this.f4054o.setVisibility(8);
            i2 = 0;
        } else {
            this.f4054o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i3 = this.f4043d;
                drawable.setBounds(0, 0, i3, i3);
                this.f4054o.setCompoundDrawables(this.r, null, null, null);
            }
            this.f4054o.setVisibility(0);
            i2 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.t) && this.v == null) {
            this.s.setVisibility(8);
        } else {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i4 = this.f4043d;
                drawable2.setBounds(0, 0, i4, i4);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            i2 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.x) && this.z == null) {
            this.w.setVisibility(8);
        } else {
            this.w.setText(this.x);
            Drawable drawable3 = this.z;
            if (drawable3 != null) {
                int i5 = this.f4043d;
                drawable3.setBounds(0, 0, i5, i5);
                this.w.setCompoundDrawables(this.z, null, null, null);
            }
            this.w.setVisibility(0);
            i2 |= 4;
        }
        if (A(this.f4040a)) {
            if (i2 == 1) {
                button = this.f4054o;
            } else if (i2 == 2) {
                button = this.s;
            } else if (i2 == 4) {
                button = this.w;
            }
            b(button);
        }
        if (i2 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f4042c.findViewById(a.b.f.w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f4045f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f4046g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f4046g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void x(ViewGroup viewGroup) {
        View viewInflate = this.f4047h;
        if (viewInflate == null) {
            viewInflate = this.f4048i != 0 ? LayoutInflater.from(this.f4040a).inflate(this.f4048i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !a(viewInflate)) {
            this.f4042c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f4042c.findViewById(a.b.f.f84n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f4053n) {
            frameLayout.setPadding(this.f4049j, this.f4050k, this.f4051l, this.f4052m);
        }
        if (this.f4046g != null) {
            ((LinearLayout.LayoutParams) ((f0.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void y(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f4042c.findViewById(a.b.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f4042c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f4044e)) || !this.P) {
            this.f4042c.findViewById(a.b.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f4042c.findViewById(a.b.f.f80j);
        this.E = textView;
        textView.setText(this.f4044e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f4042c.findViewById(a.b.f.t);
        int i2 = a.b.f.P;
        View viewFindViewById4 = viewFindViewById3.findViewById(i2);
        int i3 = a.b.f.f83m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i3);
        int i4 = a.b.f.f81k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(a.b.f.f85o);
        x(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i2);
        View viewFindViewById8 = viewGroup.findViewById(i3);
        View viewFindViewById9 = viewGroup.findViewById(i4);
        ViewGroup viewGroupJ = j(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupJ2 = j(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupJ3 = j(viewFindViewById9, viewFindViewById6);
        w(viewGroupJ2);
        v(viewGroupJ3);
        y(viewGroupJ);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (viewGroupJ == null || viewGroupJ.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroupJ3 == null || viewGroupJ3.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupJ2 != null && (viewFindViewById2 = viewGroupJ2.findViewById(a.b.f.K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f4045f == null && this.f4046g == null) ? null : viewGroupJ.findViewById(a.b.f.N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupJ2 != null && (viewFindViewById = viewGroupJ2.findViewById(a.b.f.L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f4046g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z2, z3);
        }
        if (!z) {
            View view = this.f4046g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                q(viewGroupJ2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f4046g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i5 = this.I;
        if (i5 > -1) {
            listView2.setItemChecked(i5, true);
            listView2.setSelection(i5);
        }
    }
}
