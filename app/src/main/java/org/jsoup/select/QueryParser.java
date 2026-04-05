package org.jsoup.select;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.StructuralEvaluator;

/* JADX INFO: loaded from: classes2.dex */
public class QueryParser {
    private List<Evaluator> evals = new ArrayList();
    private String query;
    private TokenQueue tq;
    private static final String[] combinators = {",", ">", "+", "~", " "};
    private static final String[] AttributeEvals = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern NTH_AB = Pattern.compile("((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?", 2);
    private static final Pattern NTH_B = Pattern.compile("(\\+|-)?(\\d+)");

    private QueryParser(String str) {
        this.query = str;
        this.tq = new TokenQueue(str);
    }

    private void allElements() {
        this.evals.add(new Evaluator.AllElements());
    }

    private void byAttribute() {
        List<Evaluator> list;
        Evaluator attributeWithValueMatching;
        List<Evaluator> list2;
        Evaluator attribute;
        TokenQueue tokenQueue = new TokenQueue(this.tq.chompBalanced('[', ']'));
        String strConsumeToAny = tokenQueue.consumeToAny(AttributeEvals);
        Validate.notEmpty(strConsumeToAny);
        tokenQueue.consumeWhitespace();
        if (tokenQueue.isEmpty()) {
            if (strConsumeToAny.startsWith("^")) {
                list2 = this.evals;
                attribute = new Evaluator.AttributeStarting(strConsumeToAny.substring(1));
            } else {
                list2 = this.evals;
                attribute = new Evaluator.Attribute(strConsumeToAny);
            }
            list2.add(attribute);
            return;
        }
        if (tokenQueue.matchChomp("=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValue(strConsumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("!=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueNot(strConsumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("^=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueStarting(strConsumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("$=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueEnding(strConsumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("*=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueContaining(strConsumeToAny, tokenQueue.remainder());
        } else {
            if (!tokenQueue.matchChomp("~=")) {
                throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.query, tokenQueue.remainder());
            }
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueMatching(strConsumeToAny, Pattern.compile(tokenQueue.remainder()));
        }
        list.add(attributeWithValueMatching);
    }

    private void byClass() {
        String strConsumeCssIdentifier = this.tq.consumeCssIdentifier();
        Validate.notEmpty(strConsumeCssIdentifier);
        this.evals.add(new Evaluator.Class(strConsumeCssIdentifier.trim().toLowerCase()));
    }

    private void byId() {
        String strConsumeCssIdentifier = this.tq.consumeCssIdentifier();
        Validate.notEmpty(strConsumeCssIdentifier);
        this.evals.add(new Evaluator.Id(strConsumeCssIdentifier));
    }

    private void byTag() {
        String strConsumeElementSelector = this.tq.consumeElementSelector();
        Validate.notEmpty(strConsumeElementSelector);
        if (strConsumeElementSelector.contains("|")) {
            strConsumeElementSelector = strConsumeElementSelector.replace("|", ":");
        }
        this.evals.add(new Evaluator.Tag(strConsumeElementSelector.trim().toLowerCase()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void combinator(char r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.combinator(char):void");
    }

    private int consumeIndex() {
        String strTrim = this.tq.chompTo(")").trim();
        Validate.isTrue(StringUtil.isNumeric(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    private String consumeSubQuery() {
        String str;
        StringBuilder sb = new StringBuilder();
        while (!this.tq.isEmpty()) {
            if (this.tq.matches("(")) {
                sb.append("(");
                sb.append(this.tq.chompBalanced('(', ')'));
                str = ")";
            } else if (this.tq.matches("[")) {
                sb.append("[");
                sb.append(this.tq.chompBalanced('[', ']'));
                str = "]";
            } else {
                if (this.tq.matchesAny(combinators)) {
                    break;
                }
                sb.append(this.tq.consume());
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private void contains(boolean z) {
        List<Evaluator> list;
        Evaluator containsText;
        this.tq.consume(z ? ":containsOwn" : ":contains");
        String strUnescape = TokenQueue.unescape(this.tq.chompBalanced('(', ')'));
        Validate.notEmpty(strUnescape, ":contains(text) query must not be empty");
        if (z) {
            list = this.evals;
            containsText = new Evaluator.ContainsOwnText(strUnescape);
        } else {
            list = this.evals;
            containsText = new Evaluator.ContainsText(strUnescape);
        }
        list.add(containsText);
    }

    private void cssNthChild(boolean z, boolean z2) {
        List<Evaluator> list;
        Evaluator isNthChild;
        String lowerCase = this.tq.chompTo(")").trim().toLowerCase();
        Matcher matcher = NTH_AB.matcher(lowerCase);
        Matcher matcher2 = NTH_B.matcher(lowerCase);
        int i2 = 2;
        if ("odd".equals(lowerCase)) {
            i = 1;
        } else if (!"even".equals(lowerCase)) {
            if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", BuildConfig.FLAVOR)) : 1;
                i = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", BuildConfig.FLAVOR)) : 0;
                i2 = i3;
            } else {
                if (!matcher2.matches()) {
                    throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", lowerCase);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", BuildConfig.FLAVOR));
                i2 = 0;
            }
        }
        if (z2) {
            if (z) {
                list = this.evals;
                isNthChild = new Evaluator.IsNthLastOfType(i2, i);
            } else {
                list = this.evals;
                isNthChild = new Evaluator.IsNthOfType(i2, i);
            }
        } else if (z) {
            list = this.evals;
            isNthChild = new Evaluator.IsNthLastChild(i2, i);
        } else {
            list = this.evals;
            isNthChild = new Evaluator.IsNthChild(i2, i);
        }
        list.add(isNthChild);
    }

    private void findElements() {
        List<Evaluator> list;
        Evaluator isRoot;
        if (this.tq.matchChomp("#")) {
            byId();
            return;
        }
        if (this.tq.matchChomp(InstructionFileId.DOT)) {
            byClass();
            return;
        }
        if (this.tq.matchesWord()) {
            byTag();
            return;
        }
        if (this.tq.matches("[")) {
            byAttribute();
            return;
        }
        if (this.tq.matchChomp("*")) {
            allElements();
            return;
        }
        if (this.tq.matchChomp(":lt(")) {
            indexLessThan();
            return;
        }
        if (this.tq.matchChomp(":gt(")) {
            indexGreaterThan();
            return;
        }
        if (this.tq.matchChomp(":eq(")) {
            indexEquals();
            return;
        }
        if (this.tq.matches(":has(")) {
            has();
            return;
        }
        if (this.tq.matches(":contains(")) {
            contains(false);
            return;
        }
        if (this.tq.matches(":containsOwn(")) {
            contains(true);
            return;
        }
        if (this.tq.matches(":matches(")) {
            matches(false);
            return;
        }
        if (this.tq.matches(":matchesOwn(")) {
            matches(true);
            return;
        }
        if (this.tq.matches(":not(")) {
            not();
            return;
        }
        if (this.tq.matchChomp(":nth-child(")) {
            cssNthChild(false, false);
            return;
        }
        if (this.tq.matchChomp(":nth-last-child(")) {
            cssNthChild(true, false);
            return;
        }
        if (this.tq.matchChomp(":nth-of-type(")) {
            cssNthChild(false, true);
            return;
        }
        if (this.tq.matchChomp(":nth-last-of-type(")) {
            cssNthChild(true, true);
            return;
        }
        if (this.tq.matchChomp(":first-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsFirstChild();
        } else if (this.tq.matchChomp(":last-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsLastChild();
        } else if (this.tq.matchChomp(":first-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsFirstOfType();
        } else if (this.tq.matchChomp(":last-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsLastOfType();
        } else if (this.tq.matchChomp(":only-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsOnlyChild();
        } else if (this.tq.matchChomp(":only-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsOnlyOfType();
        } else if (this.tq.matchChomp(":empty")) {
            list = this.evals;
            isRoot = new Evaluator.IsEmpty();
        } else {
            if (!this.tq.matchChomp(":root")) {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.query, this.tq.remainder());
            }
            list = this.evals;
            isRoot = new Evaluator.IsRoot();
        }
        list.add(isRoot);
    }

    private void has() {
        this.tq.consume(":has");
        String strChompBalanced = this.tq.chompBalanced('(', ')');
        Validate.notEmpty(strChompBalanced, ":has(el) subselect must not be empty");
        this.evals.add(new StructuralEvaluator.Has(parse(strChompBalanced)));
    }

    private void indexEquals() {
        this.evals.add(new Evaluator.IndexEquals(consumeIndex()));
    }

    private void indexGreaterThan() {
        this.evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
    }

    private void indexLessThan() {
        this.evals.add(new Evaluator.IndexLessThan(consumeIndex()));
    }

    private void matches(boolean z) {
        List<Evaluator> list;
        Evaluator matches;
        this.tq.consume(z ? ":matchesOwn" : ":matches");
        String strChompBalanced = this.tq.chompBalanced('(', ')');
        Validate.notEmpty(strChompBalanced, ":matches(regex) query must not be empty");
        if (z) {
            list = this.evals;
            matches = new Evaluator.MatchesOwn(Pattern.compile(strChompBalanced));
        } else {
            list = this.evals;
            matches = new Evaluator.Matches(Pattern.compile(strChompBalanced));
        }
        list.add(matches);
    }

    private void not() {
        this.tq.consume(":not");
        String strChompBalanced = this.tq.chompBalanced('(', ')');
        Validate.notEmpty(strChompBalanced, ":not(selector) subselect must not be empty");
        this.evals.add(new StructuralEvaluator.Not(parse(strChompBalanced)));
    }

    public static Evaluator parse(String str) {
        return new QueryParser(str).parse();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        findElements();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:5:0x0019). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0041 -> B:6:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.jsoup.select.Evaluator parse() {
        /*
            r3 = this;
            org.jsoup.parser.TokenQueue r0 = r3.tq
            r0.consumeWhitespace()
            org.jsoup.parser.TokenQueue r0 = r3.tq
            java.lang.String[] r1 = org.jsoup.select.QueryParser.combinators
            boolean r0 = r0.matchesAny(r1)
            if (r0 == 0) goto L23
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.evals
            org.jsoup.select.StructuralEvaluator$Root r1 = new org.jsoup.select.StructuralEvaluator$Root
            r1.<init>()
            r0.add(r1)
        L19:
            org.jsoup.parser.TokenQueue r0 = r3.tq
            char r0 = r0.consume()
        L1f:
            r3.combinator(r0)
            goto L26
        L23:
            r3.findElements()
        L26:
            org.jsoup.parser.TokenQueue r0 = r3.tq
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L44
            org.jsoup.parser.TokenQueue r0 = r3.tq
            boolean r0 = r0.consumeWhitespace()
            org.jsoup.parser.TokenQueue r1 = r3.tq
            java.lang.String[] r2 = org.jsoup.select.QueryParser.combinators
            boolean r1 = r1.matchesAny(r2)
            if (r1 == 0) goto L3f
            goto L19
        L3f:
            if (r0 == 0) goto L23
            r0 = 32
            goto L1f
        L44:
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.evals
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L57
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.evals
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.jsoup.select.Evaluator r0 = (org.jsoup.select.Evaluator) r0
            return r0
        L57:
            org.jsoup.select.CombiningEvaluator$And r0 = new org.jsoup.select.CombiningEvaluator$And
            java.util.List<org.jsoup.select.Evaluator> r1 = r3.evals
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.parse():org.jsoup.select.Evaluator");
    }
}
