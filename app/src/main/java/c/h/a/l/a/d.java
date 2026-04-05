package c.h.a.l.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import d.a.a.d.c;
import d.a.a.d.v;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;

/* JADX INFO: loaded from: classes2.dex */
public class d extends AsyncTask<Void, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f17950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f17951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileInputStream f17952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17955f;

    public interface a {
        void a();

        void b(String str);
    }

    public d(Context context, FileInputStream fileInputStream, String str, String str2, String str3, a aVar) {
        this.f17950a = new WeakReference<>(context);
        this.f17951b = aVar;
        this.f17952c = fileInputStream;
        this.f17953d = str;
        this.f17954e = str2;
        this.f17955f = str3;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voidArr) {
        a aVar;
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f17952c));
            d.a.a.d.c cVar = new d.a.a.d.c();
            cVar.o(bufferedReader, this.f17954e, this.f17955f, this.f17950a.get());
            d.a.a.a aVarF = cVar.f();
            v vVarG = v.g(this.f17950a.get());
            aVarF.f30070f = this.f17953d;
            aVarF.l0 = "com.nst.iptvsmarterstvbox";
            aVarF.D = null;
            aVarF.C = null;
            vVarG.a(aVarF);
            vVarG.o(this.f17950a.get(), aVarF);
            vVarG.q(this.f17950a.get());
            return Boolean.TRUE;
        } catch (c.a unused) {
            cancel(true);
            aVar = this.f17951b;
            str = "ConfigParseError";
            aVar.b(str);
            return Boolean.FALSE;
        } catch (MalformedURLException unused2) {
            cancel(true);
            aVar = this.f17951b;
            str = "MalformedURLException";
            aVar.b(str);
            return Boolean.FALSE;
        } catch (IOException unused3) {
            cancel(true);
            aVar = this.f17951b;
            str = "IOException";
            aVar.b(str);
            return Boolean.FALSE;
        }
    }

    public final boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (bool.booleanValue()) {
            this.f17951b.a();
        } else {
            this.f17951b.b("unknown error");
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        Context context = this.f17950a.get();
        if (context == null || this.f17951b == null) {
            cancel(true);
        } else {
            if (b(context)) {
                return;
            }
            cancel(true);
            this.f17951b.b("No Network");
        }
    }
}
