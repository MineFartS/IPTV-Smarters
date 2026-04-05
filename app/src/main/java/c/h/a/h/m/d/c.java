package c.h.a.h.m.d;

import android.support.v4.media.session.PlaybackStateCompat;
import c.h.a.h.m.d.b;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.regions.ServiceAbbreviations;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.amazonaws.services.s3.util.Mimetypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class c extends c.h.a.h.m.d.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<String> f17008h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map<String, String> f17009i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Map<String, c.h.a.h.m.d.d> f17010j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<File> f17011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f17012l;

    public static class a extends ArrayList<String> {
        public a() {
            add("index.html");
            add("index.htm");
        }
    }

    public static class b extends HashMap<String, String> {
        public b() {
            put("css", "text/css");
            put("htm", Mimetypes.MIMETYPE_HTML);
            put("html", Mimetypes.MIMETYPE_HTML);
            put("xml", "text/xml");
            put("java", "text/x-java-source, text/java");
            put("md", "text/plain");
            put("txt", "text/plain");
            put("asc", "text/plain");
            put("gif", "image/gif");
            put("jpg", "image/jpeg");
            put("jpeg", "image/jpeg");
            put("png", "image/png");
            put("mp3", "audio/mpeg");
            put("m3u", "audio/mpeg-url");
            put("mp4", "video/mp4");
            put("ogv", "video/ogg");
            put("flv", "video/x-flv");
            put("mov", "video/quicktime");
            put(ServiceAbbreviations.SimpleWorkflow, "application/x-shockwave-flash");
            put("js", "application/javascript");
            put("pdf", "application/pdf");
            put("doc", "application/msword");
            put("ogg", "application/x-ogg");
            put("zip", Mimetypes.MIMETYPE_OCTET_STREAM);
            put("exe", Mimetypes.MIMETYPE_OCTET_STREAM);
            put(Name.LABEL, Mimetypes.MIMETYPE_OCTET_STREAM);
        }
    }

    /* JADX INFO: renamed from: c.h.a.h.m.d.c$c, reason: collision with other inner class name */
    public class C0223c extends FileInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f17013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0223c(File file, long j2) {
            super(file);
            this.f17013b = j2;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() {
            return (int) this.f17013b;
        }
    }

    public class d implements FilenameFilter {
        public d() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return new File(file, str).isFile();
        }
    }

    public class e implements FilenameFilter {
        public e() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return new File(file, str).isDirectory();
        }
    }

    public c(String str, int i2, File file, boolean z) {
        super(str, i2);
        this.f17012l = z;
        ArrayList arrayList = new ArrayList();
        this.f17011k = arrayList;
        arrayList.add(file);
        B();
    }

    public final List<File> A() {
        return this.f17011k;
    }

    public void B() {
    }

    public String C(String str, File file) {
        String str2;
        String strSubstring;
        int iLastIndexOf;
        String str3 = "Directory " + str;
        StringBuilder sb = new StringBuilder("<html><head><title>" + str3 + "</title><style><!--\nspan.dirname { font-weight: bold; }\nspan.filesize { font-size: 75%; }\n// -->\n</style></head><body><h1>" + str3 + "</h1>");
        String strSubstring2 = (str.length() <= 1 || (iLastIndexOf = (strSubstring = str.substring(0, str.length() - 1)).lastIndexOf(47)) < 0 || iLastIndexOf >= strSubstring.length()) ? null : str.substring(0, iLastIndexOf + 1);
        List<String> listAsList = Arrays.asList(file.list(new d()));
        Collections.sort(listAsList);
        List listAsList2 = Arrays.asList(file.list(new e()));
        Collections.sort(listAsList2);
        if (strSubstring2 != null || listAsList2.size() + listAsList.size() > 0) {
            sb.append("<ul>");
            if (strSubstring2 != null || listAsList2.size() > 0) {
                sb.append("<section class=\"directories\">");
                if (strSubstring2 != null) {
                    sb.append("<li><a rel=\"directory\" href=\"");
                    sb.append(strSubstring2);
                    sb.append("\"><span class=\"dirname\">..</span></a></b></li>");
                }
                Iterator it = listAsList2.iterator();
                while (it.hasNext()) {
                    String str4 = ((String) it.next()) + "/";
                    sb.append("<li><a rel=\"directory\" href=\"");
                    sb.append(u(str + str4));
                    sb.append("\"><span class=\"dirname\">");
                    sb.append(str4);
                    sb.append("</span></a></b></li>");
                }
                sb.append("</section>");
            }
            if (listAsList.size() > 0) {
                sb.append("<section class=\"files\">");
                for (String str5 : listAsList) {
                    sb.append("<li><a href=\"");
                    sb.append(u(str + str5));
                    sb.append("\"><span class=\"filename\">");
                    sb.append(str5);
                    sb.append("</span></a>");
                    long length = new File(file, str5).length();
                    sb.append("&nbsp;<span class=\"filesize\">(");
                    if (length < 1024) {
                        sb.append(length);
                        str2 = " bytes";
                    } else if (length < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        sb.append(length / 1024);
                        sb.append(InstructionFileId.DOT);
                        sb.append(((length % 1024) / 10) % 100);
                        str2 = " KB";
                    } else {
                        sb.append(length / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                        sb.append(InstructionFileId.DOT);
                        sb.append(((length % PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 10) % 100);
                        str2 = " MB";
                    }
                    sb.append(str2);
                    sb.append(")</span></li>");
                }
                sb.append("</section>");
            }
            sb.append("</ul>");
        }
        sb.append("</body></html>");
        return sb.toString();
    }

    public final b.k D(Map<String, String> map, b.i iVar, String str) {
        b.k kVarE;
        String strReplace = str.trim().replace(File.separatorChar, '/');
        boolean zR = false;
        if (strReplace.indexOf(63) >= 0) {
            strReplace = strReplace.substring(0, strReplace.indexOf(63));
        }
        String str2 = strReplace;
        if (str2.startsWith("src/main") || str2.endsWith("src/main") || str2.contains("../")) {
            return w("Won't serve ../ for security reasons.");
        }
        File file = null;
        List<File> listA = A();
        for (int i2 = 0; !zR && i2 < listA.size(); i2++) {
            file = listA.get(i2);
            zR = r(str2, file);
        }
        if (!zR) {
            return z();
        }
        File file2 = new File(file, str2);
        if (file2.isDirectory() && !str2.endsWith("/")) {
            String str3 = str2 + "/";
            b.k kVarT = t(b.k.EnumC0222b.REDIRECT, Mimetypes.MIMETYPE_HTML, "<html><body>Redirected: <a href=\"" + str3 + "\">" + str3 + "</a></body></html>");
            kVarT.a(HttpHeader.LOCATION, str3);
            return kVarT;
        }
        if (file2.isDirectory()) {
            String strV = v(file2);
            if (strV == null) {
                return file2.canRead() ? t(b.k.EnumC0222b.OK, Mimetypes.MIMETYPE_HTML, C(str2, file2)) : w("No directory listing.");
            }
            return D(map, iVar, str2 + strV);
        }
        String strY = y(str2);
        c.h.a.h.m.d.d dVar = f17010j.get(strY);
        if (dVar != null) {
            kVarE = dVar.a(str2, map, iVar, file2, strY);
            if (kVarE != null && (kVarE instanceof c.h.a.h.m.d.a)) {
                c.h.a.h.m.d.a aVar = (c.h.a.h.m.d.a) kVarE;
                return D(aVar.i(), iVar, aVar.j());
            }
        } else {
            kVarE = E(str2, map, file2, strY);
        }
        return kVarE != null ? kVarE : z();
    }

    public b.k E(String str, Map<String, String> map, File file, String str2) {
        long j2;
        b.k kVarS;
        int iIndexOf;
        try {
            String hexString = Integer.toHexString((file.getAbsolutePath() + file.lastModified() + BuildConfig.FLAVOR + file.length()).hashCode());
            long j3 = -1;
            String strSubstring = map.get("range");
            long j4 = 0;
            if (strSubstring == null || !strSubstring.startsWith("bytes=") || (iIndexOf = (strSubstring = strSubstring.substring(6)).indexOf(45)) <= 0) {
                j2 = 0;
            } else {
                try {
                    j2 = Long.parseLong(strSubstring.substring(0, iIndexOf));
                    try {
                        j3 = Long.parseLong(strSubstring.substring(iIndexOf + 1));
                    } catch (NumberFormatException unused) {
                    }
                } catch (NumberFormatException unused2) {
                    j2 = 0;
                }
            }
            long length = file.length();
            String str3 = Headers.ETAG;
            if (strSubstring == null || j2 < 0) {
                if (hexString.equals(map.get("if-none-match"))) {
                    return t(b.k.EnumC0222b.NOT_MODIFIED, str2, BuildConfig.FLAVOR);
                }
                b.k kVarS2 = s(b.k.EnumC0222b.OK, str2, new FileInputStream(file));
                kVarS2.a("Content-Length", BuildConfig.FLAVOR + length);
                kVarS2.a(Headers.ETAG, hexString);
                return kVarS2;
            }
            if (j2 >= length) {
                kVarS = t(b.k.EnumC0222b.RANGE_NOT_SATISFIABLE, "text/plain", BuildConfig.FLAVOR);
                kVarS.a(Headers.CONTENT_RANGE, "bytes 0-0/" + length);
            } else {
                if (j3 < 0) {
                    j3 = length - 1;
                }
                long j5 = (j3 - j2) + 1;
                if (j5 >= 0) {
                    j4 = j5;
                }
                C0223c c0223c = new C0223c(file, j4);
                c0223c.skip(j2);
                kVarS = s(b.k.EnumC0222b.PARTIAL_CONTENT, str2, c0223c);
                kVarS.a("Content-Length", BuildConfig.FLAVOR + j4);
                kVarS.a(Headers.CONTENT_RANGE, "bytes " + j2 + "-" + j3 + "/" + length);
                str3 = Headers.ETAG;
            }
            kVarS.a(str3, hexString);
            return kVarS;
        } catch (IOException unused3) {
            return w("Reading file failed.");
        }
    }

    @Override // c.h.a.h.m.d.b
    public b.k l(b.i iVar) {
        Map<String, String> headers = iVar.getHeaders();
        Map<String, String> mapB = iVar.b();
        String strA = iVar.a();
        if (!this.f17012l) {
            System.out.println(iVar.getMethod() + " '" + strA + "' ");
            for (String str : headers.keySet()) {
                System.out.println("  HDR: '" + str + "' = '" + headers.get(str) + "'");
            }
            for (String str2 : mapB.keySet()) {
                System.out.println("  PRM: '" + str2 + "' = '" + mapB.get(str2) + "'");
            }
        }
        for (File file : A()) {
            if (!file.isDirectory()) {
                return x("given path is not a directory (" + file + ").");
            }
        }
        return D(Collections.unmodifiableMap(headers), iVar, strA);
    }

    public final boolean r(String str, File file) {
        boolean zExists = new File(file, str).exists();
        if (zExists) {
            return zExists;
        }
        c.h.a.h.m.d.d dVar = f17010j.get(y(str));
        return dVar != null ? dVar.b(str, file) : zExists;
    }

    public final b.k s(b.k.EnumC0222b enumC0222b, String str, InputStream inputStream) {
        b.k kVar = new b.k(enumC0222b, str, inputStream);
        kVar.a("Accept-Ranges", "bytes");
        return kVar;
    }

    public final b.k t(b.k.EnumC0222b enumC0222b, String str, String str2) {
        b.k kVar = new b.k(enumC0222b, str, str2);
        kVar.a("Accept-Ranges", "bytes");
        return kVar;
    }

    public final String u(String str) {
        StringBuilder sb;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "/ ", true);
        String string = BuildConfig.FLAVOR;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("/")) {
                sb = new StringBuilder();
                sb.append(string);
                sb.append("/");
            } else if (strNextToken.equals(" ")) {
                sb = new StringBuilder();
                sb.append(string);
                sb.append("%20");
            } else {
                try {
                    string = string + URLEncoder.encode(strNextToken, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
            }
            string = sb.toString();
        }
        return string;
    }

    public final String v(File file) {
        for (String str : f17008h) {
            if (new File(file, str).exists()) {
                return str;
            }
        }
        return null;
    }

    public b.k w(String str) {
        return t(b.k.EnumC0222b.FORBIDDEN, "text/plain", "FORBIDDEN: " + str);
    }

    public b.k x(String str) {
        return t(b.k.EnumC0222b.INTERNAL_ERROR, "text/plain", "INTERNAL ERRROR: " + str);
    }

    public final String y(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        String str2 = iLastIndexOf >= 0 ? f17009i.get(str.substring(iLastIndexOf + 1).toLowerCase()) : null;
        return str2 == null ? Mimetypes.MIMETYPE_OCTET_STREAM : str2;
    }

    public b.k z() {
        return t(b.k.EnumC0222b.NOT_FOUND, "text/plain", "Error 404, file not found.");
    }
}
