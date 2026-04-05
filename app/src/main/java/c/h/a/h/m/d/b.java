package c.h.a.h.m.d;

import com.amazonaws.services.s3.internal.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServerSocket f16970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Socket> f16971d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f16972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC0221b f16973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f16974g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c.h.a.h.m.d.b$a$a, reason: collision with other inner class name */
        public class RunnableC0220a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Socket f16976b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InputStream f16977c;

            public RunnableC0220a(Socket socket, InputStream inputStream) {
                this.f16976b = socket;
                this.f16977c = inputStream;
            }

            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream = null;
                try {
                    try {
                        outputStream = this.f16976b.getOutputStream();
                        h hVar = b.this.new h(b.this.f16974g.a(), this.f16977c, outputStream, this.f16976b.getInetAddress());
                        while (!this.f16976b.isClosed()) {
                            hVar.e();
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof SocketException) || !"NanoHttpd Shutdown".equals(e2.getMessage())) {
                            e2.printStackTrace();
                        }
                    }
                } finally {
                    b.i(outputStream);
                    b.i(this.f16977c);
                    b.k(this.f16976b);
                    b.this.q(this.f16976b);
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                    Socket socketAccept = b.this.f16970c.accept();
                    b.this.h(socketAccept);
                    socketAccept.setSoTimeout(5000);
                    b.this.f16973f.a(new RunnableC0220a(socketAccept, socketAccept.getInputStream()));
                } catch (IOException unused) {
                }
            } while (!b.this.f16970c.isClosed());
        }
    }

    /* JADX INFO: renamed from: c.h.a.h.m.d.b$b, reason: collision with other inner class name */
    public interface InterfaceC0221b {
        void a(Runnable runnable);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f16981c;

        public String a() {
            return String.format("%s=%s; expires=%s", this.f16979a, this.f16980b, this.f16981c);
        }
    }

    public class d implements Iterable<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, String> f16982b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<c> f16983c = new ArrayList<>();

        public d(Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] strArrSplit = str2.trim().split("=");
                    if (strArrSplit.length == 2) {
                        this.f16982b.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        }

        public void a(k kVar) {
            Iterator<c> it = this.f16983c.iterator();
            while (it.hasNext()) {
                kVar.a("Set-Cookie", it.next().a());
            }
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f16982b.keySet().iterator();
        }
    }

    public static class e implements InterfaceC0221b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f16985a;

        @Override // c.h.a.h.m.d.b.InterfaceC0221b
        public void a(Runnable runnable) {
            this.f16985a++;
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f16985a + ")");
            thread.start();
        }
    }

    public static class f implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16986a = System.getProperty("java.io.tmpdir");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<m> f16987b = new ArrayList();

        @Override // c.h.a.h.m.d.b.n
        public void clear() {
            Iterator<m> it = this.f16987b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception unused) {
                }
            }
            this.f16987b.clear();
        }
    }

    public class g implements o {
        public g() {
        }

        public /* synthetic */ g(b bVar, a aVar) {
            this();
        }

        @Override // c.h.a.h.m.d.b.o
        public n a() {
            return new f();
        }
    }

    public class h implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f16989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OutputStream f16990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PushbackInputStream f16991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f16994f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public j f16995g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map<String, String> f16996h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Map<String, String> f16997i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public d f16998j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f16999k;

        public h(n nVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.f16989a = nVar;
            this.f16991c = new PushbackInputStream(inputStream, 8192);
            this.f16990b = outputStream;
            String string = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            HashMap map = new HashMap();
            this.f16997i = map;
            map.put("remote-addr", string);
            this.f16997i.put("http-client-ip", string);
        }

        @Override // c.h.a.h.m.d.b.i
        public final String a() {
            return this.f16994f;
        }

        @Override // c.h.a.h.m.d.b.i
        public final Map<String, String> b() {
            return this.f16996h;
        }

        public final void c(BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws l {
            b bVar;
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new l(k.EnumC0222b.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new l(k.EnumC0222b.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(63);
                if (iIndexOf >= 0) {
                    d(strNextToken.substring(iIndexOf + 1), map2);
                    bVar = b.this;
                    strNextToken = strNextToken.substring(0, iIndexOf);
                } else {
                    bVar = b.this;
                }
                String strG = bVar.g(strNextToken);
                if (stringTokenizer.hasMoreTokens()) {
                    while (true) {
                        String line2 = bufferedReader.readLine();
                        if (line2 == null || line2.trim().length() <= 0) {
                            break;
                        }
                        int iIndexOf2 = line2.indexOf(58);
                        if (iIndexOf2 >= 0) {
                            map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                        }
                    }
                }
                map.put("uri", strG);
            } catch (IOException e2) {
                throw new l(k.EnumC0222b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e2.getMessage(), e2);
            }
        }

        public final void d(String str, Map<String, String> map) {
            if (str == null) {
                this.f16999k = BuildConfig.FLAVOR;
                return;
            }
            this.f16999k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf >= 0) {
                    map.put(b.this.g(strNextToken.substring(0, iIndexOf)).trim(), b.this.g(strNextToken.substring(iIndexOf + 1)));
                } else {
                    map.put(b.this.g(strNextToken).trim(), BuildConfig.FLAVOR);
                }
            }
        }

        public void e() {
            OutputStream outputStream;
            byte[] bArr;
            try {
                try {
                    try {
                        bArr = new byte[8192];
                        this.f16992d = 0;
                        this.f16993e = 0;
                    } catch (l e2) {
                        new k(e2.a(), "text/plain", e2.getMessage()).c(this.f16990b);
                        outputStream = this.f16990b;
                        b.i(outputStream);
                    } catch (IOException e3) {
                        new k(k.EnumC0222b.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e3.getMessage()).c(this.f16990b);
                        outputStream = this.f16990b;
                        b.i(outputStream);
                    }
                    try {
                        int i2 = this.f16991c.read(bArr, 0, 8192);
                        if (i2 == -1) {
                            b.i(this.f16991c);
                            b.i(this.f16990b);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                        while (i2 > 0) {
                            int i3 = this.f16993e + i2;
                            this.f16993e = i3;
                            int iF = f(bArr, i3);
                            this.f16992d = iF;
                            if (iF > 0) {
                                break;
                            }
                            PushbackInputStream pushbackInputStream = this.f16991c;
                            int i4 = this.f16993e;
                            i2 = pushbackInputStream.read(bArr, i4, 8192 - i4);
                        }
                        int i5 = this.f16992d;
                        int i6 = this.f16993e;
                        if (i5 < i6) {
                            this.f16991c.unread(bArr, i5, i6 - i5);
                        }
                        this.f16996h = new HashMap();
                        if (this.f16997i == null) {
                            this.f16997i = new HashMap();
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f16993e)));
                        HashMap map = new HashMap();
                        c(bufferedReader, map, this.f16996h, this.f16997i);
                        j jVarLookup = j.lookup(map.get("method"));
                        this.f16995g = jVarLookup;
                        if (jVarLookup == null) {
                            throw new l(k.EnumC0222b.BAD_REQUEST, "BAD REQUEST: Syntax error.");
                        }
                        this.f16994f = map.get("uri");
                        this.f16998j = b.this.new d(this.f16997i);
                        k kVarL = b.this.l(this);
                        if (kVarL == null) {
                            throw new l(k.EnumC0222b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                        }
                        this.f16998j.a(kVarL);
                        kVarL.h(this.f16995g);
                        kVarL.c(this.f16990b);
                    } catch (Exception unused) {
                        b.i(this.f16991c);
                        b.i(this.f16990b);
                        throw new SocketException("NanoHttpd Shutdown");
                    }
                } catch (SocketException e4) {
                    throw e4;
                } catch (SocketTimeoutException e5) {
                    throw e5;
                }
            } finally {
                this.f16989a.clear();
            }
        }

        public final int f(byte[] bArr, int i2) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 3;
                if (i4 >= i2) {
                    return 0;
                }
                if (bArr[i3] == 13 && bArr[i3 + 1] == 10 && bArr[i3 + 2] == 13 && bArr[i4] == 10) {
                    return i3 + 4;
                }
                i3++;
            }
        }

        @Override // c.h.a.h.m.d.b.i
        public final Map<String, String> getHeaders() {
            return this.f16997i;
        }

        @Override // c.h.a.h.m.d.b.i
        public final j getMethod() {
            return this.f16995g;
        }
    }

    public interface i {
        String a();

        Map<String, String> b();

        Map<String, String> getHeaders();

        j getMethod();
    }

    public enum j {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS;

        public static j lookup(String str) {
            for (j jVar : values()) {
                if (jVar.toString().equalsIgnoreCase(str)) {
                    return jVar;
                }
            }
            return null;
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f17001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InputStream f17003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<String, String> f17004d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f17005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17006f;

        public interface a {
            String getDescription();
        }

        /* JADX INFO: renamed from: c.h.a.h.m.d.b$k$b, reason: collision with other inner class name */
        public enum EnumC0222b implements a {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            REDIRECT(Constants.BUCKET_REDIRECT_STATUS_CODE, "Moved Permanently"),
            NOT_MODIFIED(304, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE, "Forbidden"),
            NOT_FOUND(Constants.NO_SUCH_BUCKET_STATUS_CODE, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(500, "Internal Server Error");

            private final String description;
            private final int requestStatus;

            EnumC0222b(int i2, String str) {
                this.requestStatus = i2;
                this.description = str;
            }

            @Override // c.h.a.h.m.d.b.k.a
            public String getDescription() {
                return BuildConfig.FLAVOR + this.requestStatus + " " + this.description;
            }

            public int getRequestStatus() {
                return this.requestStatus;
            }
        }

        public k(a aVar, String str, InputStream inputStream) {
            this.f17001a = aVar;
            this.f17002b = str;
            this.f17003c = inputStream;
        }

        public k(a aVar, String str, String str2) {
            ByteArrayInputStream byteArrayInputStream;
            this.f17001a = aVar;
            this.f17002b = str;
            if (str2 != null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(str2.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                    return;
                }
            } else {
                byteArrayInputStream = null;
            }
            this.f17003c = byteArrayInputStream;
        }

        public void a(String str, String str2) {
            this.f17004d.put(str, str2);
        }

        public final boolean b(Map<String, String> map, String str) {
            Iterator<String> it = map.keySet().iterator();
            boolean zEqualsIgnoreCase = false;
            while (it.hasNext()) {
                zEqualsIgnoreCase |= it.next().equalsIgnoreCase(str);
            }
            return zEqualsIgnoreCase;
        }

        public void c(OutputStream outputStream) {
            String str = this.f17002b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f17001a == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.print("HTTP/1.1 " + this.f17001a.getDescription() + " \r\n");
                if (str != null) {
                    printWriter.print("Content-Type: " + str + "\r\n");
                }
                Map<String, String> map = this.f17004d;
                if (map == null || map.get("Date") == null) {
                    printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
                }
                Map<String, String> map2 = this.f17004d;
                if (map2 != null) {
                    for (String str2 : map2.keySet()) {
                        printWriter.print(str2 + ": " + this.f17004d.get(str2) + "\r\n");
                    }
                }
                f(printWriter, this.f17004d);
                if (this.f17005e == j.HEAD || !this.f17006f) {
                    InputStream inputStream = this.f17003c;
                    int iAvailable = inputStream != null ? inputStream.available() : 0;
                    g(printWriter, this.f17004d, iAvailable);
                    printWriter.print("\r\n");
                    printWriter.flush();
                    e(outputStream, iAvailable);
                } else {
                    d(outputStream, printWriter);
                }
                outputStream.flush();
                b.i(this.f17003c);
            } catch (IOException unused) {
            }
        }

        public final void d(OutputStream outputStream, PrintWriter printWriter) throws IOException {
            printWriter.print("Transfer-Encoding: chunked\r\n");
            printWriter.print("\r\n");
            printWriter.flush();
            byte[] bytes = "\r\n".getBytes();
            byte[] bArr = new byte[262144];
            while (true) {
                int i2 = this.f17003c.read(bArr);
                if (i2 <= 0) {
                    outputStream.write(String.format("0\r\n\r\n", new Object[0]).getBytes());
                    return;
                } else {
                    outputStream.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
                    outputStream.write(bArr, 0, i2);
                    outputStream.write(bytes);
                }
            }
        }

        public final void e(OutputStream outputStream, int i2) throws IOException {
            if (this.f17005e == j.HEAD || this.f17003c == null) {
                return;
            }
            byte[] bArr = new byte[262144];
            while (i2 > 0) {
                int i3 = this.f17003c.read(bArr, 0, i2 > 262144 ? 262144 : i2);
                if (i3 <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, i3);
                i2 -= i3;
            }
        }

        public void f(PrintWriter printWriter, Map<String, String> map) {
            if (b(map, "connection")) {
                return;
            }
            printWriter.print("Connection: keep-alive\r\n");
        }

        public void g(PrintWriter printWriter, Map<String, String> map, int i2) {
            if (b(map, "content-length")) {
                return;
            }
            printWriter.print("Content-Length: " + i2 + "\r\n");
        }

        public void h(j jVar) {
            this.f17005e = jVar;
        }
    }

    public static final class l extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k.EnumC0222b f17007b;

        public l(k.EnumC0222b enumC0222b, String str) {
            super(str);
            this.f17007b = enumC0222b;
        }

        public l(k.EnumC0222b enumC0222b, String str, Exception exc) {
            super(str, exc);
            this.f17007b = enumC0222b;
        }

        public k.EnumC0222b a() {
            return this.f17007b;
        }
    }

    public interface m {
        void a();
    }

    public interface n {
        void clear();
    }

    public interface o {
        n a();
    }

    public b(String str, int i2) {
        this.f16968a = str;
        this.f16969b = i2;
        n(new g(this, null));
        m(new e());
    }

    public static final void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void j(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void k(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public synchronized void f() {
        Iterator<Socket> it = this.f16971d.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
    }

    public String g(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public synchronized void h(Socket socket) {
        this.f16971d.add(socket);
    }

    public abstract k l(i iVar);

    public void m(InterfaceC0221b interfaceC0221b) {
        this.f16973f = interfaceC0221b;
    }

    public void n(o oVar) {
        this.f16974g = oVar;
    }

    public void o() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        this.f16970c = serverSocket;
        serverSocket.bind(this.f16968a != null ? new InetSocketAddress(this.f16968a, this.f16969b) : new InetSocketAddress(this.f16969b));
        Thread thread = new Thread(new a());
        this.f16972e = thread;
        thread.setDaemon(true);
        this.f16972e.setName("NanoHttpd Main Listener");
        this.f16972e.start();
    }

    public void p() {
        try {
            j(this.f16970c);
            f();
            Thread thread = this.f16972e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void q(Socket socket) {
        this.f16971d.remove(socket);
    }
}
