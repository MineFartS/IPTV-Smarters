package d.a.a.d;

import d.a.a.d.z;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f30158b = Pattern.compile("(\\d+).(\\d+) ([0-9a-f])+ (.*)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f30159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Process f30160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OpenVPNService f30163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30165i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f30166j = false;

    public q(OpenVPNService openVPNService, String[] strArr, String str, String str2) {
        this.f30159c = strArr;
        this.f30161e = str;
        this.f30162f = str2;
        this.f30163g = openVPNService;
    }

    public final String a(String[] strArr, ProcessBuilder processBuilder) {
        String str;
        String strReplaceFirst = strArr[0].replaceFirst("/cache/.*$", "/lib");
        String str2 = processBuilder.environment().get("LD_LIBRARY_PATH");
        if (str2 == null) {
            str = strReplaceFirst;
        } else {
            str = strReplaceFirst + ":" + str2;
        }
        if (strReplaceFirst.equals(this.f30161e)) {
            return str;
        }
        return this.f30161e + ":" + str;
    }

    public void b() {
        this.f30166j = true;
    }

    public final void c(String[] strArr) {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, strArr);
        ProcessBuilder processBuilder = new ProcessBuilder(linkedList);
        processBuilder.environment().put("LD_LIBRARY_PATH", a(strArr, processBuilder));
        processBuilder.environment().put("TMPDIR", this.f30162f);
        processBuilder.redirectErrorStream(true);
        try {
            Process processStart = processBuilder.start();
            this.f30160d = processStart;
            processStart.getOutputStream().close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f30160d.getInputStream()));
            do {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                if (line.startsWith("Dump path: ")) {
                    this.f30164h = line.substring(11);
                }
                if (line.startsWith("/data/data/de.blinkt.openvpn/cache/pievpn") || line.contains("syntax error")) {
                    this.f30165i = true;
                }
                Matcher matcher = f30158b.matcher(line);
                if (matcher.matches()) {
                    int i2 = Integer.parseInt(matcher.group(3), 16);
                    String strGroup = matcher.group(4);
                    int iMax = i2 & 15;
                    z.c cVar = z.c.INFO;
                    if ((i2 & 16) != 0) {
                        cVar = z.c.ERROR;
                    } else if ((i2 & 32) != 0 || (i2 & 64) != 0) {
                        cVar = z.c.WARNING;
                    } else if ((i2 & 128) != 0) {
                        cVar = z.c.VERBOSE;
                    }
                    if (strGroup.startsWith("MANAGEMENT: CMD")) {
                        iMax = Math.max(4, iMax);
                    }
                    boolean z = (strGroup.endsWith("md too weak") && strGroup.startsWith("OpenSSL: error")) || strGroup.contains("error:140AB18E");
                    z.x(cVar, iMax, strGroup);
                    if (z) {
                        z.p("OpenSSL reported a certificate with a weak hash, please the in app FAQ about weak hashes");
                    }
                } else {
                    z.u("P:" + line);
                }
            } while (!Thread.interrupted());
            throw new InterruptedException("OpenVpn process was killed form java code");
        } catch (IOException | InterruptedException e2) {
            z.s("Error reading from output of OpenVPN process", e2);
            d();
        }
    }

    public void d() {
        this.f30160d.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d A[Catch: InterruptedException -> 0x0252, IllegalThreadStateException -> 0x0267, TRY_LEAVE, TryCatch #12 {IllegalThreadStateException -> 0x0267, InterruptedException -> 0x0252, blocks: (B:77:0x0249, B:79:0x024d), top: B:122:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.d.q.run():void");
    }
}
