package c.i.a.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c.i.a.f.d;
import com.amazonaws.services.s3.util.Mimetypes;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class b extends WebView implements c.i.a.f.c, d.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<g> f18063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f18064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.i.a.f.f f18065d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f18067c;

        public a(String str, float f2) {
            this.f18066b = str;
            this.f18067c = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:loadVideo('" + this.f18066b + "', " + this.f18067c + ")");
        }
    }

    /* JADX INFO: renamed from: c.i.a.f.b$b, reason: collision with other inner class name */
    public class RunnableC0241b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f18070c;

        public RunnableC0241b(String str, float f2) {
            this.f18069b = str;
            this.f18070c = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:cueVideo('" + this.f18069b + "', " + this.f18070c + ")");
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:playVideo()");
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:pauseVideo()");
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f18074b;

        public e(float f2) {
            this.f18074b = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:seekTo(" + this.f18074b + ")");
        }
    }

    public class f extends WebChromeClient {
        public f() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
        }
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f18064c = new Handler(Looper.getMainLooper());
        this.f18063b = new HashSet();
    }

    @Override // c.i.a.f.c
    public void a(String str, float f2) {
        this.f18064c.post(new RunnableC0241b(str, f2));
    }

    @Override // c.i.a.f.d.k
    public Collection<g> b() {
        return Collections.unmodifiableCollection(new HashSet(this.f18063b));
    }

    @Override // c.i.a.f.c
    public void c(float f2) {
        this.f18064c.post(new e(f2));
    }

    @Override // c.i.a.f.c
    public boolean d(g gVar) {
        if (gVar != null) {
            return this.f18063b.add(gVar);
        }
        Log.e("YouTubePlayer", "null YouTubePlayerListener not allowed.");
        return false;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f18063b.clear();
        this.f18064c.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @Override // c.i.a.f.d.k
    public void e() {
        this.f18065d.a(this);
    }

    @Override // c.i.a.f.c
    public void f(String str, float f2) {
        this.f18064c.post(new a(str, f2));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void g() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(2);
        settings.setMediaPlaybackRequiresUserGesture(false);
        addJavascriptInterface(new c.i.a.f.d(this), "YouTubePlayerBridge");
        loadDataWithBaseURL("https://www.youtube.com", i(), Mimetypes.MIMETYPE_HTML, "utf-8", null);
        setWebChromeClient(new f());
    }

    public void h(c.i.a.f.f fVar) {
        this.f18065d = fVar;
        g();
    }

    public final String i() {
        try {
            InputStream inputStreamOpenRawResource = getResources().openRawResource(c.i.a.e.f18062a);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "utf-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    inputStreamOpenRawResource.close();
                    return sb.toString();
                }
                sb.append(line);
                sb.append("\n");
            }
        } catch (Exception unused) {
            throw new RuntimeException("Can't parse HTML file containing the player.");
        }
    }

    @Override // c.i.a.f.c
    public void pause() {
        this.f18064c.post(new d());
    }

    @Override // c.i.a.f.c
    public void play() {
        this.f18064c.post(new c());
    }
}
