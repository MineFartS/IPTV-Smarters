package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f31071a = Logger.getLogger(m.class.getName());

    public class a implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f31072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OutputStream f31073c;

        public a(u uVar, OutputStream outputStream) {
            this.f31072b = uVar;
            this.f31073c = outputStream;
        }

        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f31073c.close();
        }

        @Override // l.s, java.io.Flushable
        public void flush() throws IOException {
            this.f31073c.flush();
        }

        @Override // l.s
        public void h(l.c cVar, long j2) throws IOException {
            v.b(cVar.f31048d, 0L, j2);
            while (j2 > 0) {
                this.f31072b.f();
                p pVar = cVar.f31047c;
                int iMin = (int) Math.min(j2, pVar.f31086c - pVar.f31085b);
                this.f31073c.write(pVar.f31084a, pVar.f31085b, iMin);
                int i2 = pVar.f31085b + iMin;
                pVar.f31085b = i2;
                long j3 = iMin;
                j2 -= j3;
                cVar.f31048d -= j3;
                if (i2 == pVar.f31086c) {
                    cVar.f31047c = pVar.b();
                    q.a(pVar);
                }
            }
        }

        @Override // l.s
        public u timeout() {
            return this.f31072b;
        }

        public String toString() {
            return "sink(" + this.f31073c + ")";
        }
    }

    public class b implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f31074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InputStream f31075c;

        public b(u uVar, InputStream inputStream) {
            this.f31074b = uVar;
            this.f31075c = inputStream;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f31075c.close();
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (j2 == 0) {
                return 0L;
            }
            try {
                this.f31074b.f();
                p pVarK0 = cVar.K0(1);
                int i2 = this.f31075c.read(pVarK0.f31084a, pVarK0.f31086c, (int) Math.min(j2, 8192 - pVarK0.f31086c));
                if (i2 == -1) {
                    return -1L;
                }
                pVarK0.f31086c += i2;
                long j3 = i2;
                cVar.f31048d += j3;
                return j3;
            } catch (AssertionError e2) {
                if (m.d(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }

        @Override // l.t
        public u timeout() {
            return this.f31074b;
        }

        public String toString() {
            return "source(" + this.f31075c + ")";
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class c extends l.a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Socket f31076k;

        public c(Socket socket) {
            this.f31076k = socket;
        }

        @Override // l.a
        public IOException o(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // l.a
        public void t() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Throwable th;
            try {
                this.f31076k.close();
            } catch (AssertionError e2) {
                if (!m.d(e2)) {
                    throw e2;
                }
                Logger logger2 = m.f31071a;
                level = Level.WARNING;
                sb = new StringBuilder();
                th = e2;
                logger = logger2;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f31076k);
                logger.log(level, sb.toString(), th);
            } catch (Exception e3) {
                Logger logger3 = m.f31071a;
                level = Level.WARNING;
                sb = new StringBuilder();
                th = e3;
                logger = logger3;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f31076k);
                logger.log(level, sb.toString(), th);
            }
        }
    }

    public static s a(File file) {
        if (file != null) {
            return f(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static d b(s sVar) {
        return new n(sVar);
    }

    public static e c(t tVar) {
        return new o(tVar);
    }

    public static boolean d(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static s e(File file) {
        if (file != null) {
            return f(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static s f(OutputStream outputStream) {
        return g(outputStream, new u());
    }

    public static s g(OutputStream outputStream, u uVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (uVar != null) {
            return new a(uVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static s h(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        l.a aVarM = m(socket);
        return aVarM.r(g(socket.getOutputStream(), aVarM));
    }

    public static t i(File file) {
        if (file != null) {
            return j(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static t j(InputStream inputStream) {
        return k(inputStream, new u());
    }

    public static t k(InputStream inputStream, u uVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (uVar != null) {
            return new b(uVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static t l(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        l.a aVarM = m(socket);
        return aVarM.s(k(socket.getInputStream(), aVarM));
    }

    public static l.a m(Socket socket) {
        return new c(socket);
    }
}
