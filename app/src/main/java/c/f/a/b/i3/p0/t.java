package c.f.a.b.i3.p0;

import c.f.a.b.j3.x0;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f9051h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f9052i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f9053j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public t(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    public static t o(File file, long j2, long j3, m mVar) {
        File file2;
        String strK;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileT = t(file, mVar);
            if (fileT == null) {
                return null;
            }
            file2 = fileT;
            name = fileT.getName();
        }
        Matcher matcher = f9053j.matcher(name);
        if (!matcher.matches() || (strK = mVar.k(Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(1))))) == null) {
            return null;
        }
        long length = j2 == -1 ? file2.length() : j2;
        if (length == 0) {
            return null;
        }
        return new t(strK, Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(2))), length, j3 == -9223372036854775807L ? Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(3))) : j3, file2);
    }

    public static t p(File file, long j2, m mVar) {
        return o(file, j2, -9223372036854775807L, mVar);
    }

    public static t q(String str, long j2, long j3) {
        return new t(str, j2, j3, -9223372036854775807L, null);
    }

    public static t r(String str, long j2) {
        return new t(str, j2, -1L, -9223372036854775807L, null);
    }

    public static File s(File file, int i2, long j2, long j3) {
        return new File(file, i2 + InstructionFileId.DOT + j2 + InstructionFileId.DOT + j3 + ".v3.exo");
    }

    public static File t(File file, m mVar) {
        String strF1;
        String name = file.getName();
        Matcher matcher = f9052i.matcher(name);
        if (matcher.matches()) {
            strF1 = x0.f1((String) c.f.a.b.j3.g.e(matcher.group(1)));
        } else {
            matcher = f9051h.matcher(name);
            strF1 = matcher.matches() ? (String) c.f.a.b.j3.g.e(matcher.group(1)) : null;
        }
        if (strF1 == null) {
            return null;
        }
        File fileS = s((File) c.f.a.b.j3.g.i(file.getParentFile()), mVar.f(strF1), Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(2))), Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(3))));
        if (file.renameTo(fileS)) {
            return fileS;
        }
        return null;
    }

    public t i(File file, long j2) {
        c.f.a.b.j3.g.g(this.f8994e);
        return new t(this.f8991b, this.f8992c, this.f8993d, j2, file);
    }
}
