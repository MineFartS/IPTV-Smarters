package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class aea implements akl<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19343a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    public static final Long b(InputStream inputStream) throws IOException {
        String line = new BufferedReader(new InputStreamReader(inputStream, arm.f20427b)).readLine();
        try {
            Matcher matcher = f19343a.matcher(line);
            if (!matcher.matches()) {
                String strValueOf = String.valueOf(line);
                throw new lb(strValueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(strValueOf) : new String("Couldn't parse timestamp: "));
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j2 = true != "+".equals(matcher.group(4)) ? -1L : 1L;
                long j3 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= j2 * (((j3 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
            }
            return Long.valueOf(time);
        } catch (ParseException e2) {
            throw new lb(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akl
    public final /* bridge */ /* synthetic */ Long a(Uri uri, InputStream inputStream) {
        return b(inputStream);
    }
}
