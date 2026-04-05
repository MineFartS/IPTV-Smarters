package androidx.leanback.widget;

import a.n.q.w0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SearchOrbView;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4532b = SearchBar.class.getSimpleName();
    public boolean A;
    public final Context B;
    public AudioManager C;
    public l D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f4533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SearchEditText f4534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SpeechOrbView f4535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f4536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f4540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f4541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InputMethodManager f4542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f4544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f4545o;
    public final int p;
    public final int q;
    public final int r;
    public int s;
    public int t;
    public int u;
    public SpeechRecognizer v;
    public w0 w;
    public boolean x;
    public SoundPool y;
    public SparseIntArray z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4546b;

        public a(int i2) {
            this.f4546b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar.this.y.play(SearchBar.this.z.get(this.f4546b), 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchBar searchBar = SearchBar.this;
            if (z) {
                searchBar.h();
            } else {
                searchBar.a();
            }
            SearchBar.this.n(z);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar searchBar = SearchBar.this;
            searchBar.setSearchQueryInternal(searchBar.f4534d.getText().toString());
        }
    }

    public class d implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f4550b;

        public d(Runnable runnable) {
            this.f4550b = runnable;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchBar searchBar = SearchBar.this;
            if (searchBar.A) {
                return;
            }
            searchBar.f4541k.removeCallbacks(this.f4550b);
            SearchBar.this.f4541k.post(this.f4550b);
        }
    }

    public class e implements SearchEditText.a {
        public e() {
        }

        @Override // androidx.leanback.widget.SearchEditText.a
        public void a() {
            SearchBar searchBar = SearchBar.this;
            k kVar = searchBar.f4533c;
            if (kVar != null) {
                kVar.c(searchBar.f4537g);
            }
        }
    }

    public class f implements TextView.OnEditorActionListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar.this.k();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f4533c.c(searchBar.f4537g);
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f4543m = true;
                searchBar.f4535e.requestFocus();
            }
        }

        public f() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
        @Override // android.widget.TextView.OnEditorActionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onEditorAction(android.widget.TextView r4, int r5, android.view.KeyEvent r6) {
            /*
                r3 = this;
                r4 = 1
                r0 = 500(0x1f4, double:2.47E-321)
                r6 = 3
                if (r6 == r5) goto L8
                if (r5 != 0) goto L1e
            L8:
                androidx.leanback.widget.SearchBar r6 = androidx.leanback.widget.SearchBar.this
                androidx.leanback.widget.SearchBar$k r2 = r6.f4533c
                if (r2 == 0) goto L1e
                r6.a()
                androidx.leanback.widget.SearchBar r5 = androidx.leanback.widget.SearchBar.this
                android.os.Handler r5 = r5.f4541k
                androidx.leanback.widget.SearchBar$f$a r6 = new androidx.leanback.widget.SearchBar$f$a
                r6.<init>()
            L1a:
                r5.postDelayed(r6, r0)
                goto L46
            L1e:
                if (r4 != r5) goto L33
                androidx.leanback.widget.SearchBar r6 = androidx.leanback.widget.SearchBar.this
                androidx.leanback.widget.SearchBar$k r2 = r6.f4533c
                if (r2 == 0) goto L33
                r6.a()
                androidx.leanback.widget.SearchBar r5 = androidx.leanback.widget.SearchBar.this
                android.os.Handler r5 = r5.f4541k
                androidx.leanback.widget.SearchBar$f$b r6 = new androidx.leanback.widget.SearchBar$f$b
                r6.<init>()
                goto L1a
            L33:
                r6 = 2
                if (r6 != r5) goto L45
                androidx.leanback.widget.SearchBar r5 = androidx.leanback.widget.SearchBar.this
                r5.a()
                androidx.leanback.widget.SearchBar r5 = androidx.leanback.widget.SearchBar.this
                android.os.Handler r5 = r5.f4541k
                androidx.leanback.widget.SearchBar$f$c r6 = new androidx.leanback.widget.SearchBar$f$c
                r6.<init>()
                goto L1a
            L45:
                r4 = 0
            L46:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.SearchBar.f.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchBar.this.l();
        }
    }

    public class h implements View.OnFocusChangeListener {
        public h() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchBar searchBar = SearchBar.this;
            if (z) {
                searchBar.a();
                SearchBar searchBar2 = SearchBar.this;
                if (searchBar2.f4543m) {
                    searchBar2.i();
                    SearchBar.this.f4543m = false;
                }
            } else {
                searchBar.j();
            }
            SearchBar.this.n(z);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar.this.f4534d.requestFocusFromTouch();
            SearchBar.this.f4534d.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, SearchBar.this.f4534d.getWidth(), SearchBar.this.f4534d.getHeight(), 0));
            SearchBar.this.f4534d.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, SearchBar.this.f4534d.getWidth(), SearchBar.this.f4534d.getHeight(), 0));
        }
    }

    public class j implements RecognitionListener {
        public j() {
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onError(int i2) {
            String str;
            String str2;
            switch (i2) {
                case 1:
                    str = SearchBar.f4532b;
                    str2 = "recognizer network timeout";
                    Log.w(str, str2);
                    break;
                case 2:
                    str = SearchBar.f4532b;
                    str2 = "recognizer network error";
                    Log.w(str, str2);
                    break;
                case 3:
                    str = SearchBar.f4532b;
                    str2 = "recognizer audio error";
                    Log.w(str, str2);
                    break;
                case 4:
                    str = SearchBar.f4532b;
                    str2 = "recognizer server error";
                    Log.w(str, str2);
                    break;
                case 5:
                    str = SearchBar.f4532b;
                    str2 = "recognizer client error";
                    Log.w(str, str2);
                    break;
                case 6:
                    str = SearchBar.f4532b;
                    str2 = "recognizer speech timeout";
                    Log.w(str, str2);
                    break;
                case 7:
                    str = SearchBar.f4532b;
                    str2 = "recognizer no match";
                    Log.w(str, str2);
                    break;
                case 8:
                    str = SearchBar.f4532b;
                    str2 = "recognizer busy";
                    Log.w(str, str2);
                    break;
                case 9:
                    str = SearchBar.f4532b;
                    str2 = "recognizer insufficient permissions";
                    Log.w(str, str2);
                    break;
                default:
                    Log.d(SearchBar.f4532b, "recognizer other error");
                    break;
            }
            SearchBar.this.j();
            SearchBar.this.e();
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int i2, Bundle bundle) {
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList == null || stringArrayList.size() == 0) {
                return;
            }
            SearchBar.this.f4534d.g(stringArrayList.get(0), stringArrayList.size() > 1 ? stringArrayList.get(1) : null);
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle bundle) {
            SearchBar.this.f4535e.f();
            SearchBar.this.f();
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null) {
                SearchBar.this.f4537g = stringArrayList.get(0);
                SearchBar searchBar = SearchBar.this;
                searchBar.f4534d.setText(searchBar.f4537g);
                SearchBar.this.k();
            }
            SearchBar.this.j();
            SearchBar.this.g();
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float f2) {
            SearchBar.this.f4535e.setSoundLevel(f2 < 0.0f ? 0 : (int) (f2 * 10.0f));
        }
    }

    public interface k {
        void a(String str);

        void b(String str);

        void c(String str);
    }

    public interface l {
        void a();
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4541k = new Handler();
        this.f4543m = false;
        this.z = new SparseIntArray();
        this.A = false;
        this.B = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(a.n.h.f2639j, (ViewGroup) this, true);
        this.u = getResources().getDimensionPixelSize(a.n.c.u);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.u);
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f4537g = BuildConfig.FLAVOR;
        this.f4542l = (InputMethodManager) context.getSystemService("input_method");
        this.p = resources.getColor(a.n.b.f2574i);
        this.f4545o = resources.getColor(a.n.b.f2573h);
        this.t = resources.getInteger(a.n.g.f2626b);
        this.s = resources.getInteger(a.n.g.f2627c);
        this.r = resources.getColor(a.n.b.f2572g);
        this.q = resources.getColor(a.n.b.f2571f);
        this.C = (AudioManager) context.getSystemService("audio");
    }

    public void a() {
        this.f4542l.hideSoftInputFromWindow(this.f4534d.getWindowToken(), 0);
    }

    public final boolean b() {
        return this.f4535e.isFocused();
    }

    public final void c(Context context) {
        int[] iArr = {a.n.i.f2645a, a.n.i.f2647c, a.n.i.f2646b, a.n.i.f2648d};
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[i2];
            this.z.put(i3, this.y.load(context, i3, 1));
        }
    }

    public final void d(int i2) {
        this.f4541k.post(new a(i2));
    }

    public void e() {
        d(a.n.i.f2645a);
    }

    public void f() {
        d(a.n.i.f2647c);
    }

    public void g() {
        d(a.n.i.f2648d);
    }

    public Drawable getBadgeDrawable() {
        return this.f4540j;
    }

    public CharSequence getHint() {
        return this.f4538h;
    }

    public String getTitle() {
        return this.f4539i;
    }

    public void h() {
        this.f4541k.post(new i());
    }

    public void i() {
        l lVar;
        if (this.A) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.w != null) {
            this.f4534d.setText(BuildConfig.FLAVOR);
            this.f4534d.setHint(BuildConfig.FLAVOR);
            this.w.a();
            this.A = true;
            return;
        }
        if (this.v == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT < 23 || (lVar = this.D) == null) {
                throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
            }
            lVar.a();
            return;
        }
        this.A = true;
        this.f4534d.setText(BuildConfig.FLAVOR);
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.v.setRecognitionListener(new j());
        this.x = true;
        this.v.startListening(intent);
    }

    public void j() {
        if (this.A) {
            this.f4534d.setText(this.f4537g);
            this.f4534d.setHint(this.f4538h);
            this.A = false;
            if (this.w != null || this.v == null) {
                return;
            }
            this.f4535e.g();
            if (this.x) {
                this.v.cancel();
                this.x = false;
            }
            this.v.setRecognitionListener(null);
        }
    }

    public void k() {
        k kVar;
        if (TextUtils.isEmpty(this.f4537g) || (kVar = this.f4533c) == null) {
            return;
        }
        kVar.b(this.f4537g);
    }

    public void l() {
        if (this.A) {
            j();
        } else {
            i();
        }
    }

    public final void m() {
        String string = getResources().getString(a.n.j.f2649a);
        if (!TextUtils.isEmpty(this.f4539i)) {
            string = b() ? getResources().getString(a.n.j.f2652d, this.f4539i) : getResources().getString(a.n.j.f2651c, this.f4539i);
        } else if (b()) {
            string = getResources().getString(a.n.j.f2650b);
        }
        this.f4538h = string;
        SearchEditText searchEditText = this.f4534d;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public void n(boolean z) {
        SearchEditText searchEditText;
        int i2;
        SearchEditText searchEditText2;
        int i3;
        if (z) {
            this.f4544n.setAlpha(this.t);
            if (b()) {
                searchEditText2 = this.f4534d;
                i3 = this.r;
            } else {
                searchEditText2 = this.f4534d;
                i3 = this.p;
            }
            searchEditText2.setTextColor(i3);
            searchEditText = this.f4534d;
            i2 = this.r;
        } else {
            this.f4544n.setAlpha(this.s);
            this.f4534d.setTextColor(this.f4545o);
            searchEditText = this.f4534d;
            i2 = this.q;
        }
        searchEditText.setHintTextColor(i2);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = new SoundPool(2, 1, 0);
        c(this.B);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        j();
        this.y.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4544n = ((RelativeLayout) findViewById(a.n.f.q)).getBackground();
        this.f4534d = (SearchEditText) findViewById(a.n.f.t);
        ImageView imageView = (ImageView) findViewById(a.n.f.p);
        this.f4536f = imageView;
        Drawable drawable = this.f4540j;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f4534d.setOnFocusChangeListener(new b());
        this.f4534d.addTextChangedListener(new d(new c()));
        this.f4534d.setOnKeyboardDismissListener(new e());
        this.f4534d.setOnEditorActionListener(new f());
        this.f4534d.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(a.n.f.r);
        this.f4535e = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new g());
        this.f4535e.setOnFocusChangeListener(new h());
        n(hasFocus());
        m();
    }

    public void setBadgeDrawable(Drawable drawable) {
        ImageView imageView;
        int i2;
        this.f4540j = drawable;
        ImageView imageView2 = this.f4536f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
            if (drawable != null) {
                imageView = this.f4536f;
                i2 = 0;
            } else {
                imageView = this.f4536f;
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i2) {
        this.f4535e.setNextFocusDownId(i2);
        this.f4534d.setNextFocusDownId(i2);
    }

    public void setPermissionListener(l lVar) {
        this.D = lVar;
    }

    public void setSearchAffordanceColors(SearchOrbView.c cVar) {
        SpeechOrbView speechOrbView = this.f4535e;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(cVar);
        }
    }

    public void setSearchAffordanceColorsInListening(SearchOrbView.c cVar) {
        SpeechOrbView speechOrbView = this.f4535e;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(cVar);
        }
    }

    public void setSearchBarListener(k kVar) {
        this.f4533c = kVar;
    }

    public void setSearchQuery(String str) {
        j();
        this.f4534d.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.f4537g, str)) {
            return;
        }
        this.f4537g = str;
        k kVar = this.f4533c;
        if (kVar != null) {
            kVar.a(str);
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(w0 w0Var) {
        this.w = w0Var;
        if (w0Var != null && this.v != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        j();
        SpeechRecognizer speechRecognizer2 = this.v;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.x) {
                this.v.cancel();
                this.x = false;
            }
        }
        this.v = speechRecognizer;
        if (this.w != null && speechRecognizer != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setTitle(String str) {
        this.f4539i = str;
        m();
    }
}
