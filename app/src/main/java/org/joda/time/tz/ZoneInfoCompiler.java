package org.joda.time.tz;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes2.dex */
public class ZoneInfoCompiler {
    public static Chronology cLenientISO;
    public static DateTimeOfYear cStartOfYear;
    public static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() { // from class: org.joda.time.tz.ZoneInfoCompiler.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    private Map<String, RuleSet> iRuleSets = new HashMap();
    private List<Zone> iZones = new ArrayList();
    private List<String> iLinks = new ArrayList();

    public static class DateTimeOfYear {
        public final boolean iAdvanceDayOfWeek;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final int iMonthOfYear;
        public final char iZoneChar;

        public DateTimeOfYear() {
            this.iMonthOfYear = 1;
            this.iDayOfMonth = 1;
            this.iDayOfWeek = 0;
            this.iAdvanceDayOfWeek = false;
            this.iMillisOfDay = 0;
            this.iZoneChar = 'w';
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DateTimeOfYear(java.util.StringTokenizer r10) {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear.<init>(java.util.StringTokenizer):void");
        }

        public void addCutover(DateTimeZoneBuilder dateTimeZoneBuilder, int i2) {
            dateTimeZoneBuilder.addCutover(i2, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i2, int i3, int i4) {
            dateTimeZoneBuilder.addRecurringSavings(str, i2, i3, i4, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public String toString() {
            return "MonthOfYear: " + this.iMonthOfYear + "\nDayOfMonth: " + this.iDayOfMonth + "\nDayOfWeek: " + this.iDayOfWeek + "\nAdvanceDayOfWeek: " + this.iAdvanceDayOfWeek + "\nMillisOfDay: " + this.iMillisOfDay + "\nZoneChar: " + this.iZoneChar + "\n";
        }
    }

    public static class Rule {
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iFromYear;
        public final String iLetterS;
        public final String iName;
        public final int iSaveMillis;
        public final int iToYear;
        public final String iType;

        public Rule(StringTokenizer stringTokenizer) {
            this.iName = stringTokenizer.nextToken().intern();
            int year = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), 0);
            this.iFromYear = year;
            int year2 = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), year);
            this.iToYear = year2;
            if (year2 < year) {
                throw new IllegalArgumentException();
            }
            this.iType = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iDateTimeOfYear = new DateTimeOfYear(stringTokenizer);
            this.iSaveMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iLetterS = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
        }

        private String formatName(String str) {
            String strConcat;
            int iIndexOf = str.indexOf(47);
            if (iIndexOf > 0) {
                return (this.iSaveMillis == 0 ? str.substring(0, iIndexOf) : str.substring(iIndexOf + 1)).intern();
            }
            int iIndexOf2 = str.indexOf("%s");
            if (iIndexOf2 < 0) {
                return str;
            }
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 2);
            if (this.iLetterS == null) {
                strConcat = strSubstring.concat(strSubstring2);
            } else {
                strConcat = strSubstring + this.iLetterS + strSubstring2;
            }
            return strConcat.intern();
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            this.iDateTimeOfYear.addRecurring(dateTimeZoneBuilder, formatName(str), this.iSaveMillis, this.iFromYear, this.iToYear);
        }

        public String toString() {
            return "[Rule]\nName: " + this.iName + "\nFromYear: " + this.iFromYear + "\nToYear: " + this.iToYear + "\nType: " + this.iType + "\n" + this.iDateTimeOfYear + "SaveMillis: " + this.iSaveMillis + "\nLetterS: " + this.iLetterS + "\n";
        }
    }

    public static class RuleSet {
        private List<Rule> iRules;

        public RuleSet(Rule rule) {
            ArrayList arrayList = new ArrayList();
            this.iRules = arrayList;
            arrayList.add(rule);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            for (int i2 = 0; i2 < this.iRules.size(); i2++) {
                this.iRules.get(i2).addRecurring(dateTimeZoneBuilder, str);
            }
        }

        public void addRule(Rule rule) {
            if (!rule.iName.equals(this.iRules.get(0).iName)) {
                throw new IllegalArgumentException("Rule name mismatch");
            }
            this.iRules.add(rule);
        }
    }

    public static class Zone {
        public final String iFormat;
        public final String iName;
        private Zone iNext;
        public final int iOffsetMillis;
        public final String iRules;
        public final DateTimeOfYear iUntilDateTimeOfYear;
        public final int iUntilYear;

        private Zone(String str, StringTokenizer stringTokenizer) {
            int i2;
            this.iName = str.intern();
            this.iOffsetMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iRules = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iFormat = stringTokenizer.nextToken().intern();
            DateTimeOfYear startOfYear = ZoneInfoCompiler.getStartOfYear();
            if (stringTokenizer.hasMoreTokens()) {
                i2 = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    startOfYear = new DateTimeOfYear(stringTokenizer);
                }
            } else {
                i2 = Integer.MAX_VALUE;
            }
            this.iUntilYear = i2;
            this.iUntilDateTimeOfYear = startOfYear;
        }

        public Zone(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        private static void addToBuilder(Zone zone, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            while (zone != null) {
                dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                String str = zone.iRules;
                if (str == null) {
                    dateTimeZoneBuilder.setFixedSavings(zone.iFormat, 0);
                } else {
                    try {
                        dateTimeZoneBuilder.setFixedSavings(zone.iFormat, ZoneInfoCompiler.parseTime(str));
                    } catch (Exception unused) {
                        RuleSet ruleSet = map.get(zone.iRules);
                        if (ruleSet == null) {
                            throw new IllegalArgumentException("Rules not found: " + zone.iRules);
                        }
                        ruleSet.addRecurring(dateTimeZoneBuilder, zone.iFormat);
                    }
                }
                int i2 = zone.iUntilYear;
                if (i2 == Integer.MAX_VALUE) {
                    return;
                }
                zone.iUntilDateTimeOfYear.addCutover(dateTimeZoneBuilder, i2);
                zone = zone.iNext;
            }
        }

        public void addToBuilder(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            addToBuilder(this, dateTimeZoneBuilder, map);
        }

        public void chain(StringTokenizer stringTokenizer) {
            Zone zone = this.iNext;
            if (zone != null) {
                zone.chain(stringTokenizer);
            } else {
                this.iNext = new Zone(this.iName, stringTokenizer);
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.iName + "\nOffsetMillis: " + this.iOffsetMillis + "\nRules: " + this.iRules + "\nFormat: " + this.iFormat + "\nUntilYear: " + this.iUntilYear + "\n" + this.iUntilDateTimeOfYear;
            if (this.iNext == null) {
                return str;
            }
            return str + "...\n" + this.iNext.toString();
        }
    }

    public static Chronology getLenientISOChronology() {
        if (cLenientISO == null) {
            cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return cLenientISO;
    }

    public static DateTimeOfYear getStartOfYear() {
        if (cStartOfYear == null) {
            cStartOfYear = new DateTimeOfYear();
        }
        return cStartOfYear;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if ("-?".equals(r9[r3]) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        printUsage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void main(java.lang.String[] r9) throws java.io.IOException {
        /*
            int r0 = r9.length
            if (r0 != 0) goto L7
            printUsage()
            return
        L7:
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r9.length
            r6 = 1
            if (r3 >= r5) goto L57
            java.lang.String r5 = "-src"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L24
            java.io.File r0 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L53
            int r3 = r3 + 1
            r5 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            r0.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            goto L43
        L24:
            java.lang.String r5 = "-dst"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L38
            java.io.File r2 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L53
            int r3 = r3 + 1
            r5 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            r2.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            goto L43
        L38:
            java.lang.String r5 = "-verbose"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L45
            r4 = 1
        L43:
            int r3 = r3 + r6
            goto Lc
        L45:
            java.lang.String r5 = "-?"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L57
            printUsage()     // Catch: java.lang.IndexOutOfBoundsException -> L53
            return
        L53:
            printUsage()
            return
        L57:
            int r5 = r9.length
            if (r3 < r5) goto L5e
            printUsage()
            return
        L5e:
            int r5 = r9.length
            int r5 = r5 - r3
            java.io.File[] r5 = new java.io.File[r5]
        L62:
            int r7 = r9.length
            if (r3 >= r7) goto L7a
            java.io.File r7 = new java.io.File
            if (r0 != 0) goto L6f
            r8 = r9[r3]
            r7.<init>(r8)
            goto L74
        L6f:
            r8 = r9[r3]
            r7.<init>(r0, r8)
        L74:
            r5[r1] = r7
            int r3 = r3 + 1
            int r1 = r1 + r6
            goto L62
        L7a:
            java.lang.ThreadLocal<java.lang.Boolean> r9 = org.joda.time.tz.ZoneInfoCompiler.cVerbose
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r9.set(r0)
            org.joda.time.tz.ZoneInfoCompiler r9 = new org.joda.time.tz.ZoneInfoCompiler
            r9.<init>()
            r9.compile(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.ZoneInfoCompiler.main(java.lang.String[]):void");
    }

    public static int parseDayOfWeek(String str) {
        DateTimeField dateTimeFieldDayOfWeek = ISOChronology.getInstanceUTC().dayOfWeek();
        return dateTimeFieldDayOfWeek.get(dateTimeFieldDayOfWeek.set(0L, str, Locale.ENGLISH));
    }

    public static int parseMonth(String str) {
        DateTimeField dateTimeFieldMonthOfYear = ISOChronology.getInstanceUTC().monthOfYear();
        return dateTimeFieldMonthOfYear.get(dateTimeFieldMonthOfYear.set(0L, str, Locale.ENGLISH));
    }

    public static String parseOptional(String str) {
        if (str.equals("-")) {
            return null;
        }
        return str;
    }

    public static int parseTime(String str) {
        DateTimeFormatter dateTimeFormatterHourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, getLenientISOChronology());
        boolean zStartsWith = str.startsWith("-");
        if (dateTimeFormatterHourMinuteSecondFraction.parseInto(mutableDateTime, str, zStartsWith ? 1 : 0) == ((zStartsWith ? 1 : 0) ^ (-1))) {
            throw new IllegalArgumentException(str);
        }
        int millis = (int) mutableDateTime.getMillis();
        return zStartsWith ? -millis : millis;
    }

    public static int parseYear(String str, int i2) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("minimum") || lowerCase.equals("min")) {
            return Integer.MIN_VALUE;
        }
        if (lowerCase.equals("maximum") || lowerCase.equals("max")) {
            return Integer.MAX_VALUE;
        }
        return lowerCase.equals("only") ? i2 : Integer.parseInt(lowerCase);
    }

    public static char parseZoneChar(char c2) {
        if (c2 != 'G') {
            if (c2 != 'S') {
                if (c2 != 'U' && c2 != 'Z' && c2 != 'g') {
                    if (c2 != 's') {
                        if (c2 != 'u' && c2 != 'z') {
                            return 'w';
                        }
                    }
                }
            }
            return 's';
        }
        return 'u';
    }

    private static void printUsage() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
    
        r6 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
        r3 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
        r1 = r12.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ed, code lost:
    
        if (r1 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
    
        r8 = r18.previousTransition(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (r8 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f9, code lost:
    
        if (r8 >= r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
    
        r5 = ((java.lang.Long) r12.get(r1)).longValue() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010b, code lost:
    
        if (r5 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
    
        r1 = java.lang.System.out;
        r3 = new java.lang.StringBuilder();
        r3.append("*r* Error in ");
        r3.append(r18.getID());
        r3.append(" ");
        r3.append(new org.joda.time.DateTime(r8, org.joda.time.chrono.ISOChronology.getInstanceUTC()));
        r3.append(" != ");
        r0 = new org.joda.time.DateTime(r5, org.joda.time.chrono.ISOChronology.getInstanceUTC());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean test(java.lang.String r17, org.joda.time.DateTimeZone r18) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.ZoneInfoCompiler.test(java.lang.String, org.joda.time.DateTimeZone):boolean");
    }

    public static boolean verbose() {
        return cVerbose.get().booleanValue();
    }

    public static void writeZoneInfoMap(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) throws IOException {
        HashMap map2 = new HashMap(map.size());
        TreeMap treeMap = new TreeMap();
        short s = 0;
        for (Map.Entry<String, DateTimeZone> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!map2.containsKey(key)) {
                Short shValueOf = Short.valueOf(s);
                map2.put(key, shValueOf);
                treeMap.put(shValueOf, key);
                s = (short) (s + 1);
                if (s == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
            String id = entry.getValue().getID();
            if (!map2.containsKey(id)) {
                Short shValueOf2 = Short.valueOf(s);
                map2.put(id, shValueOf2);
                treeMap.put(shValueOf2, id);
                s = (short) (s + 1);
                if (s == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
        }
        dataOutputStream.writeShort(treeMap.size());
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            dataOutputStream.writeUTF((String) it.next());
        }
        dataOutputStream.writeShort(map.size());
        for (Map.Entry<String, DateTimeZone> entry2 : map.entrySet()) {
            dataOutputStream.writeShort(((Short) map2.get(entry2.getKey())).shortValue());
            dataOutputStream.writeShort(((Short) map2.get(entry2.getValue().getID())).shortValue());
        }
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) throws IOException {
        if (fileArr != null) {
            for (File file2 : fileArr) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
                parseDataFile(bufferedReader);
                bufferedReader.close();
            }
        }
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Destination directory doesn't exist and cannot be created: " + file);
            }
            if (!file.isDirectory()) {
                throw new IOException("Destination is not a directory: " + file);
            }
        }
        TreeMap treeMap = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i2 = 0; i2 < this.iZones.size(); i2++) {
            Zone zone = this.iZones.get(i2);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            zone.addToBuilder(dateTimeZoneBuilder, this.iRuleSets);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(zone.iName, true);
            if (test(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                if (file == null) {
                    continue;
                } else {
                    if (verbose()) {
                        System.out.println("Writing " + dateTimeZone.getID());
                    }
                    File file3 = new File(file, dateTimeZone.getID());
                    if (!file3.getParentFile().exists()) {
                        file3.getParentFile().mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        dateTimeZoneBuilder.writeTo(zone.iName, fileOutputStream);
                        fileOutputStream.close();
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        DateTimeZone from = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
                        fileInputStream.close();
                        if (!dateTimeZone.equals(from)) {
                            System.out.println("*e* Error in " + dateTimeZone.getID() + ": Didn't read properly from file");
                        }
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i4 = 0; i4 < this.iLinks.size(); i4 += 2) {
                String str = this.iLinks.get(i4);
                String str2 = this.iLinks.get(i4 + 1);
                DateTimeZone dateTimeZone2 = (DateTimeZone) treeMap.get(str);
                if (dateTimeZone2 != null) {
                    treeMap.put(str2, dateTimeZone2);
                } else if (i3 > 0) {
                    System.out.println("Cannot find time zone '" + str + "' to link alias '" + str2 + "' to");
                }
            }
        }
        if (file != null) {
            System.out.println("Writing ZoneInfoMap");
            File file4 = new File(file, "ZoneInfoMap");
            if (!file4.getParentFile().exists()) {
                file4.getParentFile().mkdirs();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file4));
            try {
                TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                treeMap2.putAll(treeMap);
                writeZoneInfoMap(dataOutputStream, treeMap2);
            } finally {
                dataOutputStream.close();
            }
        }
        return treeMap;
    }

    public void parseDataFile(BufferedReader bufferedReader) throws IOException {
        Zone zone;
        loop0: while (true) {
            zone = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                String strTrim = line.trim();
                if (strTrim.length() != 0 && strTrim.charAt(0) != '#') {
                    int iIndexOf = line.indexOf(35);
                    if (iIndexOf >= 0) {
                        line = line.substring(0, iIndexOf);
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \t");
                    if (!Character.isWhitespace(line.charAt(0)) || !stringTokenizer.hasMoreTokens()) {
                        if (zone != null) {
                            this.iZones.add(zone);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            String strNextToken = stringTokenizer.nextToken();
                            if (strNextToken.equalsIgnoreCase("Rule")) {
                                Rule rule = new Rule(stringTokenizer);
                                RuleSet ruleSet = this.iRuleSets.get(rule.iName);
                                if (ruleSet == null) {
                                    this.iRuleSets.put(rule.iName, new RuleSet(rule));
                                } else {
                                    ruleSet.addRule(rule);
                                }
                            } else if (strNextToken.equalsIgnoreCase("Zone")) {
                                zone = new Zone(stringTokenizer);
                            } else if (strNextToken.equalsIgnoreCase("Link")) {
                                this.iLinks.add(stringTokenizer.nextToken());
                                this.iLinks.add(stringTokenizer.nextToken());
                            } else {
                                System.out.println("Unknown line: " + line);
                            }
                        }
                    } else if (zone != null) {
                        zone.chain(stringTokenizer);
                    }
                }
            }
        }
        if (zone != null) {
            this.iZones.add(zone);
        }
    }
}
