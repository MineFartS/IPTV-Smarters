package c.h.a.h.n;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import c.h.a.i.q.m;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.Jsoup;

/* JADX INFO: loaded from: classes2.dex */
public class b extends AsyncTask<Void, String, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17053b;

    public b(Context context) {
        this.f17053b = BuildConfig.FLAVOR;
        this.f17052a = context;
        try {
            this.f17053b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public String a(String str) {
        return str.replaceAll("[\\-\\+\\.\\^:,]", BuildConfig.FLAVOR);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        try {
            return Jsoup.connect("https://play.google.com/store/apps/details?id=minefarts.iptvsmarters&hl=en").timeout(3000).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").referrer("http://www.google.com").get().select(" div.hAyfc:nth-child(4) > span:nth-child(2) >div:nth-child(1) > span:nth-child(1)").first().ownText();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        int i2;
        int i3;
        super.onPostExecute(str);
        if (str == null || str.isEmpty()) {
            m.Q(false, this.f17052a);
            m.P(false, this.f17052a);
            return;
        }
        m.P(true, this.f17052a);
        if (str.matches("\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d\\.\\d")) {
            String strA = a(str);
            String strA2 = a(this.f17053b);
            if (strA.length() > strA2.length()) {
                int length = strA.length() - strA2.length();
                StringBuffer stringBuffer = new StringBuffer(strA2);
                for (int i4 = 0; i4 < length; i4++) {
                    stringBuffer.append(0);
                }
                strA2 = stringBuffer.toString();
            } else if (strA.length() < strA2.length()) {
                int length2 = strA2.length() - strA.length();
                StringBuffer stringBuffer2 = new StringBuffer(strA);
                for (int i5 = 0; i5 < length2; i5++) {
                    stringBuffer2.append(0);
                }
                strA = stringBuffer2.toString();
            }
            try {
                i2 = Integer.parseInt(strA);
                i3 = Integer.parseInt(strA2);
            } catch (NumberFormatException unused) {
                i2 = 1;
                i3 = 1;
            }
            if (i2 > i3) {
                m.Q(true, this.f17052a);
                return;
            }
        }
        m.Q(false, this.f17052a);
    }
}
