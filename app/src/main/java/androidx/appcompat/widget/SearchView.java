package androidx.appcompat.widget;

import a.b.q.a1;
import a.b.q.f0;
import a.b.q.o0;
import a.b.q.u0;
import a.b.q.w0;
import a.i.r.x;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends f0 implements a.b.p.c {
    public static final n q;
    public p A;
    public Rect B;
    public Rect C;
    public int[] D;
    public int[] E;
    public final ImageView F;
    public final Drawable G;
    public final int H;
    public final int I;
    public final Intent J;
    public final Intent K;
    public final CharSequence L;
    public l M;
    public k N;
    public View.OnFocusChangeListener O;
    public m P;
    public View.OnClickListener Q;
    public boolean R;
    public boolean S;
    public a.j.a.a T;
    public boolean U;
    public CharSequence V;
    public boolean W;
    public boolean f0;
    public int g0;
    public boolean h0;
    public CharSequence i0;
    public CharSequence j0;
    public boolean k0;
    public int l0;
    public SearchableInfo m0;
    public Bundle n0;
    public final Runnable o0;
    public Runnable p0;
    public final WeakHashMap<String, Drawable.ConstantState> q0;
    public final SearchAutoComplete r;
    public final View.OnClickListener r0;
    public final View s;
    public View.OnKeyListener s0;
    public final View t;
    public final TextView.OnEditorActionListener t0;
    public final View u;
    public final AdapterView.OnItemClickListener u0;
    public final ImageView v;
    public final AdapterView.OnItemSelectedListener v0;
    public final ImageView w;
    public TextWatcher w0;
    public final ImageView x;
    public final ImageView y;
    public final View z;

    public static class SearchAutoComplete extends a.b.q.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f4195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f4196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Runnable f4197h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.b.a.p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f4197h = new a();
            this.f4194e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.q.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void c() {
            if (this.f4196g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f4196g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f4194e <= 0 || super.enoughToFilter();
        }

        @Override // a.b.q.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4196g) {
                removeCallbacks(this.f4197h);
                post(this.f4197h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            this.f4195f.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f4195f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f4195f.hasFocus() && getVisibility() == 0) {
                this.f4196g = true;
                if (SearchView.M(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f4196g = false;
                removeCallbacks(this.f4197h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f4196g = true;
                    return;
                }
                this.f4196g = false;
                removeCallbacks(this.f4197h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4195f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f4194e = i2;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.Y(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.j.a.a aVar = SearchView.this.T;
            if (aVar instanceof o0) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.B();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.v) {
                searchView.V();
                return;
            }
            if (view == searchView.x) {
                searchView.R();
                return;
            }
            if (view == searchView.w) {
                searchView.W();
            } else if (view == searchView.y) {
                searchView.a0();
            } else if (view == searchView.r) {
                searchView.H();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.m0 == null) {
                return false;
            }
            if (searchView.r.isPopupShowing() && SearchView.this.r.getListSelection() != -1) {
                return SearchView.this.X(view, i2, keyEvent);
            }
            if (SearchView.this.r.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.r.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.S(i2, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.T(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    public static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f4209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f4210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f4211c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            this.f4209a = null;
            this.f4210b = null;
            this.f4211c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f4209a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f4210b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f4211c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f4210b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f4209a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f4211c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class o extends a.k.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4212d;

        public class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i2) {
                return new o[i2];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4212d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4212d + "}";
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f4212d));
        }
    }

    public static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f4213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f4214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f4215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f4216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4218f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f4217e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f4214b = new Rect();
            this.f4216d = new Rect();
            this.f4215c = new Rect();
            a(rect, rect2);
            this.f4213a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f4214b.set(rect);
            this.f4216d.set(rect);
            Rect rect3 = this.f4216d;
            int i2 = this.f4217e;
            rect3.inset(-i2, -i2);
            this.f4215c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float width;
            int height;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f4218f;
                    if (z2 && !this.f4216d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f4218f;
                        this.f4218f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f4214b.contains(x, y)) {
                    this.f4218f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f4215c.contains(x, y)) {
                Rect rect = this.f4215c;
                width = x - rect.left;
                height = y - rect.top;
            } else {
                width = this.f4213a.getWidth() / 2;
                height = this.f4213a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f4213a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        q = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.M);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.B = new Rect();
        this.C = new Rect();
        this.D = new int[2];
        this.E = new int[2];
        this.o0 = new b();
        this.p0 = new c();
        this.q0 = new WeakHashMap<>();
        f fVar = new f();
        this.r0 = fVar;
        this.s0 = new g();
        h hVar = new h();
        this.t0 = hVar;
        i iVar = new i();
        this.u0 = iVar;
        j jVar = new j();
        this.v0 = jVar;
        this.w0 = new a();
        u0 u0VarV = u0.v(context, attributeSet, a.b.j.q2, i2, 0);
        LayoutInflater.from(context).inflate(u0VarV.n(a.b.j.A2, a.b.g.r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.b.f.D);
        this.r = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.s = findViewById(a.b.f.z);
        View viewFindViewById = findViewById(a.b.f.C);
        this.t = viewFindViewById;
        View viewFindViewById2 = findViewById(a.b.f.J);
        this.u = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(a.b.f.x);
        this.v = imageView;
        ImageView imageView2 = (ImageView) findViewById(a.b.f.A);
        this.w = imageView2;
        ImageView imageView3 = (ImageView) findViewById(a.b.f.y);
        this.x = imageView3;
        ImageView imageView4 = (ImageView) findViewById(a.b.f.E);
        this.y = imageView4;
        ImageView imageView5 = (ImageView) findViewById(a.b.f.B);
        this.F = imageView5;
        x.s0(viewFindViewById, u0VarV.g(a.b.j.B2));
        x.s0(viewFindViewById2, u0VarV.g(a.b.j.F2));
        int i3 = a.b.j.E2;
        imageView.setImageDrawable(u0VarV.g(i3));
        imageView2.setImageDrawable(u0VarV.g(a.b.j.y2));
        imageView3.setImageDrawable(u0VarV.g(a.b.j.v2));
        imageView4.setImageDrawable(u0VarV.g(a.b.j.H2));
        imageView5.setImageDrawable(u0VarV.g(i3));
        this.G = u0VarV.g(a.b.j.D2);
        w0.a(imageView, getResources().getString(a.b.h.f114n));
        this.H = u0VarV.n(a.b.j.G2, a.b.g.q);
        this.I = u0VarV.n(a.b.j.w2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.w0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.s0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u0VarV.a(a.b.j.z2, true));
        int iF = u0VarV.f(a.b.j.s2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.L = u0VarV.p(a.b.j.x2);
        this.V = u0VarV.p(a.b.j.C2);
        int iK = u0VarV.k(a.b.j.u2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = u0VarV.k(a.b.j.t2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(u0VarV.a(a.b.j.r2, true));
        u0VarV.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.J = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.K = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.z = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.R);
        g0();
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.b.d.f47g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.b.d.f48h);
    }

    private void setQuery(CharSequence charSequence) {
        this.r.setText(charSequence);
        this.r.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void B() {
        if (this.z.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.t.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = a1.b(this);
            int dimensionPixelSize = this.R ? resources.getDimensionPixelSize(a.b.d.f45e) + resources.getDimensionPixelSize(a.b.d.f46f) : 0;
            this.r.getDropDownBackground().getPadding(rect);
            int i2 = rect.left;
            this.r.setDropDownHorizontalOffset(zB ? -i2 : paddingLeft - (i2 + dimensionPixelSize));
            this.r.setDropDownWidth((((this.z.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.j0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.n0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.m0.getSearchActivity());
        return intent;
    }

    public final Intent D(Cursor cursor, int i2, String str) {
        int position;
        String strO;
        try {
            String strO2 = o0.o(cursor, "suggest_intent_action");
            if (strO2 == null) {
                strO2 = this.m0.getSuggestIntentAction();
            }
            if (strO2 == null) {
                strO2 = "android.intent.action.SEARCH";
            }
            String str2 = strO2;
            String strO3 = o0.o(cursor, "suggest_intent_data");
            if (strO3 == null) {
                strO3 = this.m0.getSuggestIntentData();
            }
            if (strO3 != null && (strO = o0.o(cursor, "suggest_intent_data_id")) != null) {
                strO3 = strO3 + "/" + Uri.encode(strO);
            }
            return C(str2, strO3 == null ? null : Uri.parse(strO3), o0.o(cursor, "suggest_intent_extra_data"), o0.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    public final Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.n0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void G() {
        this.r.dismissDropDown();
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.r.refreshAutoCompleteResults();
            return;
        }
        n nVar = q;
        nVar.b(this.r);
        nVar.a(this.r);
    }

    public final void I(View view, Rect rect) {
        view.getLocationInWindow(this.D);
        getLocationInWindow(this.E);
        int[] iArr = this.D;
        int i2 = iArr[1];
        int[] iArr2 = this.E;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    public final CharSequence J(CharSequence charSequence) {
        if (!this.R || this.G == null) {
            return charSequence;
        }
        double textSize = this.r.getTextSize();
        Double.isNaN(textSize);
        int i2 = (int) (textSize * 1.25d);
        this.G.setBounds(0, 0, i2, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.G), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean K() {
        SearchableInfo searchableInfo = this.m0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.m0.getVoiceSearchLaunchWebSearch()) {
            intent = this.J;
        } else if (this.m0.getVoiceSearchLaunchRecognizer()) {
            intent = this.K;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean L() {
        return this.S;
    }

    public final boolean N() {
        return (this.U || this.h0) && !L();
    }

    public final void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    public void P(int i2, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    public final boolean Q(int i2, int i3, String str) {
        Cursor cursorB = this.T.b();
        if (cursorB == null || !cursorB.moveToPosition(i2)) {
            return false;
        }
        O(D(cursorB, i3, str));
        return true;
    }

    public void R() {
        if (!TextUtils.isEmpty(this.r.getText())) {
            this.r.setText(BuildConfig.FLAVOR);
            this.r.requestFocus();
            this.r.setImeVisibility(true);
        } else if (this.R) {
            k kVar = this.N;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    public boolean S(int i2, int i3, String str) {
        m mVar = this.P;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        Q(i2, 0, null);
        this.r.setImeVisibility(false);
        G();
        return true;
    }

    public boolean T(int i2) {
        m mVar = this.P;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        c0(i2);
        return true;
    }

    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void V() {
        k0(false);
        this.r.requestFocus();
        this.r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void W() {
        Editable text = this.r.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.M;
        if (lVar == null || !lVar.onQueryTextSubmit(text.toString())) {
            if (this.m0 != null) {
                P(0, null, text.toString());
            }
            this.r.setImeVisibility(false);
            G();
        }
    }

    public boolean X(View view, int i2, KeyEvent keyEvent) {
        if (this.m0 != null && this.T != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return S(this.r.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.r.setSelection(i2 == 21 ? 0 : this.r.length());
                this.r.setListSelection(0);
                this.r.clearListSelection();
                this.r.a();
                return true;
            }
            if (i2 != 19 || this.r.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    public void Y(CharSequence charSequence) {
        Editable text = this.r.getText();
        this.j0 = text;
        boolean z = !TextUtils.isEmpty(text);
        j0(z);
        l0(!z);
        e0();
        i0();
        if (this.M != null && !TextUtils.equals(charSequence, this.i0)) {
            this.M.onQueryTextChange(charSequence.toString());
        }
        this.i0 = charSequence.toString();
    }

    public void Z() {
        k0(L());
        b0();
        if (this.r.hasFocus()) {
            H();
        }
    }

    public void a0() {
        Intent intentE;
        SearchableInfo searchableInfo = this.m0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentE = F(this.J, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentE = E(this.K, searchableInfo);
            }
            getContext().startActivity(intentE);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void b0() {
        post(this.o0);
    }

    @Override // a.b.p.c
    public void c() {
        if (this.k0) {
            return;
        }
        this.k0 = true;
        int imeOptions = this.r.getImeOptions();
        this.l0 = imeOptions;
        this.r.setImeOptions(imeOptions | 33554432);
        this.r.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    public final void c0(int i2) {
        CharSequence charSequenceC;
        Editable text = this.r.getText();
        Cursor cursorB = this.T.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i2) || (charSequenceC = this.T.c(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceC);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f0 = true;
        super.clearFocus();
        this.r.clearFocus();
        this.r.setImeVisibility(false);
        this.f0 = false;
    }

    public void d0(CharSequence charSequence, boolean z) {
        this.r.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.r;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.j0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    public final void e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.r.getText());
        if (!z2 && (!this.R || this.k0)) {
            z = false;
        }
        this.x.setVisibility(z ? 0 : 8);
        Drawable drawable = this.x.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // a.b.p.c
    public void f() {
        d0(BuildConfig.FLAVOR, false);
        clearFocus();
        k0(true);
        this.r.setImeOptions(this.l0);
        this.k0 = false;
    }

    public void f0() {
        int[] iArr = this.r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.t.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.u.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.r;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    public int getImeOptions() {
        return this.r.getImeOptions();
    }

    public int getInputType() {
        return this.r.getInputType();
    }

    public int getMaxWidth() {
        return this.g0;
    }

    public CharSequence getQuery() {
        return this.r.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.m0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.L : getContext().getText(this.m0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.I;
    }

    public int getSuggestionRowLayout() {
        return this.H;
    }

    public a.j.a.a getSuggestionsAdapter() {
        return this.T;
    }

    public final void h0() {
        this.r.setThreshold(this.m0.getSuggestThreshold());
        this.r.setImeOptions(this.m0.getImeOptions());
        int inputType = this.m0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.m0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.r.setInputType(inputType);
        a.j.a.a aVar = this.T;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.m0.getSuggestAuthority() != null) {
            o0 o0Var = new o0(getContext(), this, this.m0, this.q0);
            this.T = o0Var;
            this.r.setAdapter(o0Var);
            ((o0) this.T).x(this.W ? 2 : 1);
        }
    }

    public final void i0() {
        this.u.setVisibility((N() && (this.w.getVisibility() == 0 || this.y.getVisibility() == 0)) ? 0 : 8);
    }

    public final void j0(boolean z) {
        this.w.setVisibility((this.U && N() && hasFocus() && (z || !this.h0)) ? 0 : 8);
    }

    public final void k0(boolean z) {
        this.S = z;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.r.getText());
        this.v.setVisibility(i2);
        j0(z2);
        this.s.setVisibility(z ? 8 : 0);
        this.F.setVisibility((this.F.getDrawable() == null || this.R) ? 8 : 0);
        e0();
        l0(!z2);
        i0();
    }

    public final void l0(boolean z) {
        int i2 = 8;
        if (this.h0 && !L() && z) {
            this.w.setVisibility(8);
            i2 = 0;
        }
        this.y.setVisibility(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.o0);
        post(this.p0);
        super.onDetachedFromWindow();
    }

    @Override // a.b.q.f0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            I(this.r, this.B);
            Rect rect = this.C;
            Rect rect2 = this.B;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.A;
            if (pVar != null) {
                pVar.a(this.C, this.B);
                return;
            }
            p pVar2 = new p(this.C, this.B, this.r);
            this.A = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // a.b.q.f0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.g0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.g0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.g0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.b());
        k0(oVar.f4212d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f4212d = L();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.f0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.r.requestFocus(i2, rect);
        if (zRequestFocus) {
            k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.n0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.R == z) {
            return;
        }
        this.R = z;
        k0(z);
        g0();
    }

    public void setImeOptions(int i2) {
        this.r.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.r.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.g0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.N = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.M = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.Q = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.P = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.V = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.W = z;
        a.j.a.a aVar = this.T;
        if (aVar instanceof o0) {
            ((o0) aVar).x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.m0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean zK = K();
        this.h0 = zK;
        if (zK) {
            this.r.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.U = z;
        k0(L());
    }

    public void setSuggestionsAdapter(a.j.a.a aVar) {
        this.T = aVar;
        this.r.setAdapter(aVar);
    }
}
