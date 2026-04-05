package c.i.a.f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f18077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f18078b = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18079b;

        public a(String str) {
            this.f18079b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().g(this.f18079b);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().h();
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f18082b;

        public c(int i2) {
            this.f18082b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().a(this.f18082b);
            }
        }
    }

    /* JADX INFO: renamed from: c.i.a.f.d$d, reason: collision with other inner class name */
    public class RunnableC0242d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18084b;

        public RunnableC0242d(String str) {
            this.f18084b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().d(this.f18084b);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18086b;

        public e(String str) {
            this.f18086b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().c(this.f18086b);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f18088b;

        public f(int i2) {
            this.f18088b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().onError(this.f18088b);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().m();
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f18091b;

        public h(float f2) {
            this.f18091b = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().l(this.f18091b);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f18093b;

        public i(float f2) {
            this.f18093b = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().k(this.f18093b);
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f18095b;

        public j(float f2) {
            this.f18095b = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c.i.a.f.g> it = d.this.f18077a.b().iterator();
            while (it.hasNext()) {
                it.next().f(this.f18095b);
            }
        }
    }

    public interface k {
        Collection<c.i.a.f.g> b();

        void e();
    }

    public d(k kVar) {
        this.f18077a = kVar;
    }

    public final String b(String str) {
        return str.equalsIgnoreCase("small") ? "small" : str.equalsIgnoreCase("medium") ? "medium" : str.equalsIgnoreCase("large") ? "large" : str.equalsIgnoreCase("hd720") ? "hd720" : str.equalsIgnoreCase("hd1080") ? "hd1080" : str.equalsIgnoreCase("highres") ? "highres" : str.equalsIgnoreCase("default") ? "default" : "unknown";
    }

    public final String c(String str) {
        return str.equalsIgnoreCase("0.25") ? "0.25" : str.equalsIgnoreCase("0.5") ? "0.5" : str.equalsIgnoreCase("1") ? "1" : str.equalsIgnoreCase("1.5") ? "1.5" : str.equalsIgnoreCase("2") ? "2" : "-10";
    }

    public final int d(String str) {
        if (str.equalsIgnoreCase("2")) {
            return 0;
        }
        if (str.equalsIgnoreCase("5")) {
            return 1;
        }
        if (str.equalsIgnoreCase("100")) {
            return 2;
        }
        return (str.equalsIgnoreCase("101") || str.equalsIgnoreCase("150")) ? 3 : -10;
    }

    public final int e(String str) {
        if (str.equalsIgnoreCase("UNSTARTED")) {
            return -1;
        }
        if (str.equalsIgnoreCase("ENDED")) {
            return 0;
        }
        if (str.equalsIgnoreCase("PLAYING")) {
            return 1;
        }
        if (str.equalsIgnoreCase("PAUSED")) {
            return 2;
        }
        if (str.equalsIgnoreCase("BUFFERING")) {
            return 3;
        }
        return str.equalsIgnoreCase("CUED") ? 5 : -10;
    }

    @JavascriptInterface
    public void sendApiChange() {
        this.f18078b.post(new g());
    }

    @JavascriptInterface
    public void sendError(String str) {
        this.f18078b.post(new f(d(str)));
    }

    @JavascriptInterface
    public void sendPlaybackQualityChange(String str) {
        this.f18078b.post(new RunnableC0242d(b(str)));
    }

    @JavascriptInterface
    public void sendPlaybackRateChange(String str) {
        this.f18078b.post(new e(c(str)));
    }

    @JavascriptInterface
    public void sendReady() {
        this.f18078b.post(new b());
    }

    @JavascriptInterface
    public void sendStateChange(String str) {
        this.f18078b.post(new c(e(str)));
    }

    @JavascriptInterface
    public void sendVideoCurrentTime(String str) {
        try {
            this.f18078b.post(new h(Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendVideoDuration(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.f18078b.post(new i(Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendVideoId(String str) {
        this.f18078b.post(new a(str));
    }

    @JavascriptInterface
    public void sendVideoLoadedFraction(String str) {
        try {
            this.f18078b.post(new j(Float.parseFloat(str)));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendYouTubeIframeAPIReady() {
        this.f18077a.e();
    }
}
