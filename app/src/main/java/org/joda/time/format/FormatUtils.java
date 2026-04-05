package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(Appendable appendable, int i2, int i3) throws IOException {
        if (i2 < 0) {
            appendable.append('-');
            if (i2 == Integer.MIN_VALUE) {
                while (i3 > 10) {
                    appendable.append('0');
                    i3--;
                }
                appendable.append("2147483648");
                return;
            }
            i2 = -i2;
        }
        if (i2 < 10) {
            while (i3 > 1) {
                appendable.append('0');
                i3--;
            }
        } else {
            if (i2 >= 100) {
                int iLog = i2 < 1000 ? 3 : i2 < 10000 ? 4 : ((int) (Math.log(i2) / LOG_10)) + 1;
                while (i3 > iLog) {
                    appendable.append('0');
                    i3--;
                }
                appendable.append(Integer.toString(i2));
                return;
            }
            while (i3 > 2) {
                appendable.append('0');
                i3--;
            }
            int i4 = ((i2 + 1) * 13421772) >> 27;
            appendable.append((char) (i4 + 48));
            i2 = (i2 - (i4 << 3)) - (i4 << 1);
        }
        appendable.append((char) (i2 + 48));
    }

    public static void appendPaddedInteger(Appendable appendable, long j2, int i2) throws IOException {
        int i3 = (int) j2;
        if (i3 == j2) {
            appendPaddedInteger(appendable, i3, i2);
            return;
        }
        if (i2 > 19) {
            if (j2 < 0) {
                appendable.append('-');
                if (j2 == Long.MIN_VALUE) {
                    while (i2 > 19) {
                        appendable.append('0');
                        i2--;
                    }
                    appendable.append("9223372036854775808");
                    return;
                }
                j2 = -j2;
            }
            int iLog = ((int) (Math.log(j2) / LOG_10)) + 1;
            while (i2 > iLog) {
                appendable.append('0');
                i2--;
            }
        }
        appendable.append(Long.toString(j2));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i2, int i3) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i2, i3);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j2, int i2) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j2, i2);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i2) throws IOException {
        if (i2 < 0) {
            appendable.append('-');
            if (i2 == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i2 = -i2;
        }
        if (i2 >= 10) {
            if (i2 >= 100) {
                appendable.append(Integer.toString(i2));
                return;
            } else {
                int i3 = ((i2 + 1) * 13421772) >> 27;
                appendable.append((char) (i3 + 48));
                i2 = (i2 - (i3 << 3)) - (i3 << 1);
            }
        }
        appendable.append((char) (i2 + 48));
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j2) throws IOException {
        int i2 = (int) j2;
        if (i2 == j2) {
            appendUnpaddedInteger(appendable, i2);
        } else {
            appendable.append(Long.toString(j2));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i2) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i2);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j2) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j2);
        } catch (IOException unused) {
        }
    }

    public static int calculateDigitCount(long j2) {
        if (j2 < 0) {
            if (j2 != Long.MIN_VALUE) {
                return calculateDigitCount(-j2) + 1;
            }
            return 20;
        }
        if (j2 < 10) {
            return 1;
        }
        if (j2 < 100) {
            return 2;
        }
        if (j2 < 1000) {
            return 3;
        }
        if (j2 < 10000) {
            return 4;
        }
        return 1 + ((int) (Math.log(j2) / LOG_10));
    }

    public static String createErrorMessage(String str, int i2) {
        StringBuilder sb;
        int i3 = i2 + 32;
        String strConcat = str.length() <= i3 + 3 ? str : str.substring(0, i3).concat("...");
        if (i2 <= 0) {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(strConcat);
        } else {
            if (i2 >= str.length()) {
                sb = new StringBuilder();
                sb.append("Invalid format: \"");
                sb.append(strConcat);
                sb.append("\" is too short");
                return sb.toString();
            }
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(strConcat);
            sb.append("\" is malformed at \"");
            sb.append(strConcat.substring(i2));
        }
        sb.append('\"');
        return sb.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i2) {
        int iCharAt = charSequence.charAt(i2) - '0';
        return (((iCharAt << 3) + (iCharAt << 1)) + charSequence.charAt(i2 + 1)) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i2, int i3) throws IOException {
        if (i2 < 0) {
            writer.write(45);
            if (i2 == Integer.MIN_VALUE) {
                while (i3 > 10) {
                    writer.write(48);
                    i3--;
                }
                writer.write("2147483648");
                return;
            }
            i2 = -i2;
        }
        if (i2 < 10) {
            while (i3 > 1) {
                writer.write(48);
                i3--;
            }
        } else {
            if (i2 >= 100) {
                int iLog = i2 < 1000 ? 3 : i2 < 10000 ? 4 : ((int) (Math.log(i2) / LOG_10)) + 1;
                while (i3 > iLog) {
                    writer.write(48);
                    i3--;
                }
                writer.write(Integer.toString(i2));
                return;
            }
            while (i3 > 2) {
                writer.write(48);
                i3--;
            }
            int i4 = ((i2 + 1) * 13421772) >> 27;
            writer.write(i4 + 48);
            i2 = (i2 - (i4 << 3)) - (i4 << 1);
        }
        writer.write(i2 + 48);
    }

    public static void writePaddedInteger(Writer writer, long j2, int i2) throws IOException {
        int i3 = (int) j2;
        if (i3 == j2) {
            writePaddedInteger(writer, i3, i2);
            return;
        }
        if (i2 > 19) {
            if (j2 < 0) {
                writer.write(45);
                if (j2 == Long.MIN_VALUE) {
                    while (i2 > 19) {
                        writer.write(48);
                        i2--;
                    }
                    writer.write("9223372036854775808");
                    return;
                }
                j2 = -j2;
            }
            int iLog = ((int) (Math.log(j2) / LOG_10)) + 1;
            while (i2 > iLog) {
                writer.write(48);
                i2--;
            }
        }
        writer.write(Long.toString(j2));
    }

    public static void writeUnpaddedInteger(Writer writer, int i2) throws IOException {
        if (i2 < 0) {
            writer.write(45);
            if (i2 == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i2 = -i2;
        }
        if (i2 >= 10) {
            if (i2 >= 100) {
                writer.write(Integer.toString(i2));
                return;
            } else {
                int i3 = ((i2 + 1) * 13421772) >> 27;
                writer.write(i3 + 48);
                i2 = (i2 - (i3 << 3)) - (i3 << 1);
            }
        }
        writer.write(i2 + 48);
    }

    public static void writeUnpaddedInteger(Writer writer, long j2) throws IOException {
        int i2 = (int) j2;
        if (i2 == j2) {
            writeUnpaddedInteger(writer, i2);
        } else {
            writer.write(Long.toString(j2));
        }
    }
}
