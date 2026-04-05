package c.h.a.k.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import c.h.a.i.q.f;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.SAXParserFactory;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes2.dex */
public class c extends DefaultHandler {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f17899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f17900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f17901i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SimpleDateFormat f17904l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17894b = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17895c = "XMLHelper";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f17896d = Boolean.FALSE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17897e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public XMLTVProgrammePojo f17898f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17902j = "0";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17903k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<XMLTVProgrammePojo> f17905m = new ArrayList<>();

    public void a(Context context) {
        this.f17900h = context;
        this.f17901i = new f(context);
        try {
            c.h.a.h.n.a.q0 = true;
            this.f17899g = context.getSharedPreferences("loginPrefs", 0);
            this.f17904l = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            ArrayList<c.h.a.i.q.c> arrayListS0 = this.f17901i.S0();
            if (arrayListS0 != null && arrayListS0.size() > 0) {
                this.f17894b = arrayListS0.get(0).b();
                this.f17902j = String.valueOf(arrayListS0.get(0).c());
            }
            String str = this.f17894b;
            if (str == null || str.isEmpty() || this.f17894b.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                return;
            }
            if (!this.f17894b.contains(".gz")) {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                xMLReader.setContentHandler(this);
                InputStream inputStreamOpenStream = new URL(this.f17894b).openStream();
                InputSource inputSource = new InputSource(inputStreamOpenStream);
                inputSource.setEncoding("UTF-8");
                xMLReader.parse(inputSource);
                inputStreamOpenStream.close();
                return;
            }
            File file = new File(context.getFilesDir() + "/epgZip.xml");
            File file2 = new File(String.valueOf(file));
            if (file2.exists()) {
                file2.delete();
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new InputSource(new GZIPInputStream(new URL(this.f17894b).openConnection().getInputStream())).getByteStream());
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[2097152];
                while (true) {
                    int i2 = bufferedInputStream.read(bArr);
                    if (i2 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        bufferedInputStream.close();
                        XMLReader xMLReader2 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                        xMLReader2.setContentHandler(this);
                        InputSource inputSource2 = new InputSource(new FileInputStream(file.getPath()));
                        inputSource2.setEncoding("UTF-8");
                        xMLReader2.parse(inputSource2);
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } catch (Exception e2) {
                Log.e("honey", "Exception: " + e2.getMessage());
            }
        } catch (Exception e3) {
            Log.e(this.f17895c, "Exception: " + e3.getMessage());
        }
    }

    public ArrayList<XMLTVProgrammePojo> b() {
        return this.f17905m;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i2, int i3) {
        if (this.f17896d.booleanValue()) {
            try {
                this.f17897e += new String(cArr, i2, i3);
            } catch (Exception unused) {
                this.f17897e = BuildConfig.FLAVOR;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.f17896d = Boolean.FALSE;
        XMLTVProgrammePojo xMLTVProgrammePojo = this.f17898f;
        if (xMLTVProgrammePojo != null) {
            xMLTVProgrammePojo.w(this.f17902j);
        }
        if (str2.equalsIgnoreCase(ChartFactory.TITLE)) {
            XMLTVProgrammePojo xMLTVProgrammePojo2 = this.f17898f;
            if (xMLTVProgrammePojo2 != null) {
                xMLTVProgrammePojo2.A(this.f17897e);
                Log.e("honey", "title: " + this.f17897e);
                return;
            }
            return;
        }
        if (str2.equalsIgnoreCase("desc")) {
            XMLTVProgrammePojo xMLTVProgrammePojo3 = this.f17898f;
            if (xMLTVProgrammePojo3 != null) {
                xMLTVProgrammePojo3.p(this.f17897e);
                return;
            }
            return;
        }
        if (str2.equalsIgnoreCase("programme")) {
            this.f17905m.add(this.f17898f);
            int i2 = this.f17903k + 1;
            this.f17903k = i2;
            if (i2 > 10000) {
                this.f17903k = 0;
                f fVar = this.f17901i;
                if (fVar != null && fVar.r(this.f17905m)) {
                    this.f17905m.clear();
                }
            }
            this.f17898f = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startElement(java.lang.String r9, java.lang.String r10, java.lang.String r11, org.xml.sax.Attributes r12) throws c.h.a.k.h.a {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.h.c.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }
}
