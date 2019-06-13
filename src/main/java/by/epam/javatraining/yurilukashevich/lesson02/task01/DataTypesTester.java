package by.epam.javatraining.yurilukashevich.lesson02.task01;

public class DataTypesTester {
    public static void testByte() {
        byte a = 5;
        byte b = 2;
        byte c;

        System.out.println("\n***** Arithmetical Operators for byte type *****");
        // addition
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
//        unary minus
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);
//        unary plus
        c = (byte) +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        c = (byte) (a & b); // bitwise AND
        System.out.printf("%d & %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s & %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = (byte) (a | b); // bitwise OR
        System.out.printf("%d | %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s | %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = (byte) (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s ^ %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = (byte) ~a; // bitwise unary compliment
        System.out.printf("~%d = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("~%s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        c = (byte) (a << 1); // Left shift
        System.out.printf("%d << 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s << 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        c = (byte) (a >> 1); // Right shift
        System.out.printf("%d >> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = -5;
        c = (byte) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = 5;
        c = (byte) (a >>> 1); // zero fiLL right shift
        System.out.printf("%d >>> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = -5;
        c = (byte) (a >>> 1); // zero fiLL right shift
        System.out.printf("%d >>> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        System.out.println("\n***** Assignment Operators *****\n");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        c = 7;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        c = 7;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        c = 7;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 7;
        System.out.printf("%d >> = 1 --> c = %d\n", c, c >>= 1);
        c = 7;
        System.out.printf("%d << = 1 --> c = %d\n", c, c <<= 1);
        c = 7;
        System.out.printf("%d >>> = 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // Less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // Logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise Logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // Logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise Logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // Logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // Logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("Condition Operator:\n");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        short sh = -32000;
        char ch = '\u0032';
        int in = 115488744;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (byte) sh;
        System.out.printf("byte = short: c = (byte) %d --> c = %d\n", sh, c);
        c = (byte) in;
        System.out.printf("byte = int: c = (byte) %d --> c = %d\n", in, c);
        c = (byte) ch;
        System.out.printf("byte = char: c = (byte) '%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
//        c = (int) bool;
        System.out.printf("byte  = boolean: c = (byte)%b --> Compile Error\n",
                bool);
    }

    public static void testShort() {
        short a = 5;
        short b = 2;
        short c;

        System.out.println("\n***** Arithmetical Operators for short type *****");
        // addition
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
//        unary minus
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);
//        unary plus
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        c = (short) (a & b); // bitwise AND
        System.out.printf("%d & %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s & %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = (short) (a | b); // bitwise OR
        System.out.printf("%d | %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s | %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = (short) (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s ^ %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = (short) ~a; // bitwise unary compliment
        System.out.printf("~%d = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("~%s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        c = (short) (a << 1); // Left shift
        System.out.printf("%d << 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s << 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        c = (short) (a >> 1); // Right shift
        System.out.printf("%d >> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = -5;
        c = (short) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = 5;
        c = (short) (a >>> 1); // zero fiLL right shift
        System.out.printf("%d >>> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = -5;
        c = (short) (a >>> 1); // zero fiLL right shift
        System.out.printf("%d >>> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 7;
        System.out.printf("%d >> = 1 --> c = %d\n", c, c >>= 1);
        c = 7;
        System.out.printf("%d << = 1 --> c = %d\n", c, c <<= 1);
        c = 7;
        System.out.printf("%d >>> = 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // Less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // Logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise Logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // Logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise Logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // Logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // Logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 127;
        int in = 1253456900;
        char ch = '\u0033';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = (short) in;
        System.out.printf("short = int: c = (short) %d --> c = %d\n", in, c);
        c = (short) ch;
        System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
//        c = (int) bool;
        System.out.printf("short  = boolean: c = (short)%b --> Compile Error\n",
                bool);
    }

    public static void testInt() {
        int a = 5;
        int b = 2;
        int c;

        System.out.println("\n***** Arithmetical Operators for integer type *****");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
//        unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
//        unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        c = (a & b); // bitwise AND
        System.out.printf("%d & %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s & %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = (a | b); // bitwise OR
        System.out.printf("%d | %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s | %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s ^ %s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c), c);

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("~%s = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        c = (a << 1); // Left shift
        System.out.printf("%d << 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s << 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        c = (a >> 1); // Right shift
        System.out.printf("%d >> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = -5;
        c = (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = 5;
        c = (a >>> 1); // zero fiLL right shift
        System.out.printf("%d >>> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        a = -5;
        c = (a >>> 1); // zero fiLL right shift
        System.out.printf("%d >>> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s = %d(10)\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c), c);

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 7;
        System.out.printf("%d >> = 1 --> c = %d\n", c, c >>= 1);
        c = 7;
        System.out.printf("%d << = 1 --> c = %d\n", c, c <<= 1);
        c = 7;
        System.out.printf("%d >>> = 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // Less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // Logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise Logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // Logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise Logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // Logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // Logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("Condition Operator:\n");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:\n");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0033';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
//        c = (int) bool;
        System.out.printf("int  = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void testLong() {
        long a = 5L;
        long b = 2L;
        long c;

        System.out.println("\n***** Arithmetical Operators for long type *****");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
//        unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
//        unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 5L;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5L;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5L;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5L;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        c = (a & b); // bitwise AND
        System.out.printf("%d & %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s & %s = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c), c);

        c = (a | b); // bitwise OR
        System.out.printf("%d | %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s | %s = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c), c);

        c = (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s ^ %s = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c), c);

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("~%s = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(c), c);

        c = (a << 1); // Left shift
        System.out.printf("%d << 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s << 1 = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(c), c);

        c = (a >> 1); // Right shift
        System.out.printf("%d >> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(c), c);

        a = -5L;
        c = (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(c), c);

        a = 5L;
        c = (a >>> 1); // zero fiLL right shift
        System.out.printf("%d >>> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(c), c);

        a = -5L;
        c = (a >>> 1); // zero fiLL right shift
        System.out.printf("%d >>> 1 = %d ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s = %d(10)\n", Long.toBinaryString(a),
                Long.toBinaryString(c), c);

        System.out.println("\n***** Assignment Operators *****");

        c = 7L;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        c = 7L;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = 7L;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        c = 7L;
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        c = 7L;
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // Less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // Logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise Logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // Logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise Logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // Logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // Logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("Condition Operator:\n");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 127;
        short sh = -32000;
        char ch = '\u0045';
        int in = 1848000000;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = in;
        System.out.printf("long = int: c = %d --> c = %d\n", in, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
//        c = (long) bool;
        System.out.printf("long  = boolean: c = (long)%b --> Compile Error\n",
                bool);
    }

    public static void testFloat() {
        float a = 5.0F;
        float b = 2.0F;
        float c;

        System.out.println("\n***** Arithmetical Operators for float type *****");
        // addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
//        unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
//        unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%f = %f\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%f++ = %f\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%f = %f\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

//        c = a & b; // bitwise AND
//        c = a | b; // bitwise OR
//        c = a ^ b; // bitwise XOR
//        c = ~a; // bitwise unary compliment
//        c = a << 1; // Left shift
//        c = a >> 1; // Right shift
//        c = a >> 1; // right shift
//        c = a >>> 1; // zero fiLL right shift
//        c = a >>> 1; // zero fiLL right shift

        System.out.println("\n***** Assignment Operators *****");

        c = 7.0F;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
//
//        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
//        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
//        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
//        System.out.printf("%d >> = 1 --> c = %d\n", c, c >>= 1);
//        System.out.printf("%d << = 1 --> c = %d\n", c, c <<= 1);
//        System.out.printf("%d >>> = 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // Less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // Logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise Logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // Logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise Logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // Logical XOR
        System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // Logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("Condition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0054';
        int in = 1848000000;
        double d = 1.9D;
        long l = 1234567000000000089L;
        boolean bool = true;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = in;
        System.out.printf("float = int: c = %d --> c = %f\n", in, c);
        c = l;
        System.out.printf("float = long: c = %d --> c = %f\n", l, c);
        c = (float) d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
//        c = (float) bool;
        System.out.printf("float  = boolean: c = (float)%b --> Compile Error\n",
                bool);
    }

    public static void testDouble() {
        double a = 5.0;
        double b = 2.0;
        double c;

        System.out.println("\n***** Arithmetical Operators for double type*****");
        // addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        // prefix increment
        a = 5.0;
        System.out.printf("++%f = %f\n", a, ++a);
        // postfix increment
        a = 5.0;
        System.out.printf("%f++ = %f\n", a, a++);
        // prefix decrement
        a = 5.0;
        System.out.printf("--%f = %f\n", a, --a);
        // postfix decrement
        a = 5.0;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

//        c = a & b; // bitwise AND
//        c = a | b; // bitwise OR
//        c = a ^ b; // bitwise XOR
//        c = ~a; // bitwise unary compliment
//        c = a << 1; // Left shift
//        c = a >> 1; // Right shift
//        c = a >> 1; // right shift
//        c = a >>> 1; // zero fiLL right shift
//        c = a >>> 1; // zero fiLL right shift

        System.out.println("\n***** Assignment Operators *****");

        c = 7.0D;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

//        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
//        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
//        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
//        System.out.printf("%d >> = 1 --> c = %d\n", c, c >>= 1);
//        System.out.printf("%d << = 1 --> c = %d\n", c, c <<= 1);
//        System.out.printf("%d >>> = 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // Logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise Logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // Logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise Logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // Logical XOR
        System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // Logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("Condition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0032';
        int in = 1848000000;
        float f = 1.9F;
        long l = 1234567000000000089L;
        boolean bool = true;
        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
        c = in;
        System.out.printf("double = int: c = %d --> c = %f\n", in, c);
        c = l;
        System.out.printf("double = long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("double = float: c = %f --> c = %f\n", f, c);
//        c = (float) bool;
        System.out.printf("double  = boolean: c = (double)%b --> Compile Error\n",
                bool);
    }

    public static void testBoolean() {
        boolean a = true;
        boolean b = false;
        boolean c;

        System.out.println("\n***** Arithmetical Operators for boolean type*****");

//         c = a + b; // addition
//         c = a - b; // subtraction
//         c = a * b; // multiplication
//         c = a / b; // division
//         c = a % b; // modulus
//         c = -a; // unary minus
//         c = +a; // unary plus
//         c = ++0; // prefix increment
//         c = a++; // postfix increment
//         c = --a; // prefix decrement
//         c = a--; // postfix decrement

        System.out.println("\n***** Bitwise Operators *****");

        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);

//         c = -a; // bitwise unary compliment
//         c = a << 1; // Left shift
//         c = a >> 1; //right shift
//         c = a >>> 1; // zero fiLL right shift

        System.out.println("\n***** Assignment Operators *****");

        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

//         c += a;
//         c -= a;
//         c *= a;
//         c /= a;
//         c %= a;
//         c >> = 1;
//         c << = 1;
//         c >>> = 1;

        System.out.println("\n***** Relational Operators *****");

        // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);

        // c = a > b; // greater than
        // c = a >= b; // greater than or equal to
        // c = a < b; // Less than
        // c = a <= b; // Less than or equal to

        System.out.println("\n***** Logical Operations *****");

        c = a && b; // Logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b; // Logical OR
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a ^ b; // Logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // Logical NOT
        System.out.printf("!%b --> %b\n", a, !a);

        System.out.println("\n***** Misc. Operators *****");

        System.out.println("\nCondition Operator:");

        System.out.printf("(%b ? %b) :  %b --> %b\n", c, a, b, (c ? a : b));

        System.out.println("\nType Cast Operator:");

//        byte bt = 1;
//        short sh = -32000;
//        char ch = '\u0033';
//        long l = 100000000000000000L;
//        float f = 1.9f;
//        double d = 123456789.625;
        boolean bool = true;
//        c = (boolean) bt;
//        c = (boolean) sh;
//        c = (boolean) ch;
//        c = (boolean) l;
//        c = (boolean) f;
//        c = (boolean) d;
        c = bool;
        System.out.printf("boolean  = boolean: c = %b --> %b\n",
                c, bool);
    }

    public static void testChar() {
        char a = 'A';
        char b = 'D';
        char c;

        System.out.println("\n***** Arithmetical Operators for char type *****");
        // addition
        c = (char) (a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);
        // subtraction
        c = (char) (a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);
        // multiplication
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);
        // division
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);
        // modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);
//        unary minus
        c = (char) -a;
        System.out.printf("-%c = %c\n", a, c);
//        unary plus
        c = (char) +a;
        System.out.printf("+%c = %c\n", a, c);
        // prefix increment
        a = 'B';
        System.out.printf("++%c = %c\n", a, ++a);
        // postfix increment
        a = 'B';
        System.out.printf("%c++ = %c\n", a, a++);
        // prefix decrement
        a = 69;
        System.out.printf("--%c = %c\n", a, --a);
        // postfix decrement
        a = 69;
        System.out.printf("%c-- = %c\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        c = (char) (a & b); // bitwise AND
        System.out.printf("%c & %c = %c ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char) (a | b); // bitwise OR
        System.out.printf("%c | %c = %c ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char) (a ^ b); // bitwise XOR
        System.out.printf("%c ^ %c = %c ", a, b, c);
        System.out.print("in binary form: ");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char) ~a; // bitwise unary compliment
        System.out.printf("~%c = %c ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = (char) (a << 1); // Left shift
        System.out.printf("%c << 1 = %c ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (char) (a >> 1); // Right shift
        System.out.printf("%c >> 1 = %c ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //a = -5;
        c = (char) (a >> 1); // right shift
        System.out.printf("%c >> 1 = %c ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 67;
        c = (char) (a >>> 1); // zero fiLL right shift
        System.out.printf("%c >>> 1 = %c ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //a = -5;
        c = (char) (a >>> 1); // zero fiLL right shift
        System.out.printf("%c >>> 1 = %c ", a, c);
        System.out.print("in binary form: ");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 67;
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        c = 67;
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        c = 67;
        System.out.printf("%c >> = 1 --> c = %c\n", c, c >>= 1);
        c = 67;
        System.out.printf("%c << = 1 --> c = %c\n", c, c <<= 1);
        c = 67;
        System.out.printf("%c >>> = 1 --> c = %c\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        // Less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // Logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));

        // bitwise Logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // Logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise Logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // Logical XOR
        System.out.printf("(%c >= %c) ^ (%c != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // Logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 125;
        short sh = -32000;
        int in = 1254875674;
        long l = 100000000000000000L;
//        float f = 1.9f;
//        double d = 123456789.625;
        boolean bool = true;
        c = (char) bt;
        System.out.printf("char = byte: c = (char)%d --> c = %c\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
        c = (char) in;
        System.out.printf("char = int: c = (char)%d --> c = %c\n", in, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
//        c = (char) f;
//        System.out.printf("char = float: c = (char)%d --> c = %c\n", f, c);
//        c = (char) d;
//        System.out.printf("char = double: c = (char)%d --> c = %c\n", d, c);
//        c = (char) bool;
        System.out.printf("char  = boolean: c = (char)%b --> Compile Error\n",
                bool);
    }

    public static void testString() {

        String a = "Hello";
        String b = "World";
        String c;


        System.out.println("\n***** Arithmetical Operators for String type *****");
        // addition
        c = a + b;
        System.out.printf("%s + %s = %s\n", a, b, c);

        a += b;
        System.out.printf("%s += %s --> a = %s", a, b, a);

        System.out.println("\n***** Assignment Operators *****");
        System.out.println("***** Relational Operators *****");

        // equal to
        System.out.printf("%s == %s --> %b\n", b, b, b == b);
        // equal to
        System.out.printf("%s.equals(%s) --> %b\n", b, b, b.equals(b));

        // not equal to
        System.out.printf("%s != %s --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        System.out.println("***** Misc Operators *****");
        System.out.println("Condition Operator:");
        System.out.println("Type Cast Operator:");

        byte bt = 125;
        short sh = -32000;
        int in = 1254875674;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = Byte.toString(bt);
        System.out.printf("String = byte: c = %d --> c = %s\n", bt, c);
        c = Short.toString(sh);
        System.out.printf("String = short: c = %d --> c = %s\n", sh, c);
        c = Integer.toString(in);
        System.out.printf("String = int: c = %d --> c = %s\n", in, c);
        c = Long.toString(l);
        System.out.printf("String = long: c = %d --> c = %s\n", l, c);
        c = Float.toString(f);
        System.out.printf("String = float: c = %f --> c = %s\n", f, c);
        c = Double.toString(d);
        System.out.printf("String = double: c = %f --> c = %s\n", d, c);
        c = Boolean.toString(bool);
        System.out.printf("String  = boolean: c = %b --> c = %s\n", bool, c);

    }

    public static void testObject() {
        System.out.println("\n***Operators for Object type***");

        Student studentFirst = new Student("Petr", 15, 4.5);
        Student studentSecond = null;

        System.out.println("***Initial state for variables***");
        System.out.println("studentFirst = " + studentFirst);
        System.out.println("studentSecond = " + studentSecond);

        System.out.println("\n***Operators for Object type ***\n");

        studentSecond = studentFirst;

        System.out.println("Using toString() method for students: ");

        System.out.println("studentFirst = " + studentFirst);
        System.out.println("studentSecond = " + studentSecond);

        System.out.println("\nUsing instanceof for Student Object = is studentFirst instanceof Student? ---> "
                + (studentFirst instanceof Student));

        System.out.println("Is studentFirst == studentSecond ? --->  " + (studentFirst == studentSecond));
        System.out.println("Is studentFirst.equals(studentSecond)  ? --->  " + (studentFirst.equals(studentSecond)));
        Student studentThird = new Student("Mitya", 16);

        System.out.println("\nstudentFirst = " + studentFirst);
        System.out.println("studentSecond = " + studentSecond);
        System.out.println("studentThird = " + studentThird);

        System.out.println("\nIs studentThird equals studentSecond> ? --->  "
                + studentSecond.equals(studentThird));

        System.out.println("\nHash code for studentFirst --->  " + studentFirst + " = "
                + studentFirst.hashCode());

        System.out.println("Hash code for studentSecond --->  " + studentSecond + " = "
                + studentSecond.hashCode());

        System.out.println("\nHash code for studentFirst == studentSecond --->  "
                + (studentFirst.hashCode() == studentSecond.hashCode()));

        System.out.println("\nHash code for studentThird --->  " + studentThird + " = "
                + studentThird.hashCode());

        Student studentForth = new Student("Mitya", 16);
        System.out.println("\nNew object studentForth = " + studentForth);
        System.out.println("StudentThird == studentForth --->  "
                + (studentThird == studentForth));

        System.out.println("Is StudentThird.equals(studentForth)  ? --->  "
                + (studentThird.equals(studentForth)));

        System.out.println("Hash code for studentThird == studentForth --->  "
                + (studentThird.hashCode() == studentForth.hashCode()));

        studentSecond = null;
        System.out.println("\nIs studentFirst equals studentSecond when studentSecond==null> ? --->  "
                + studentFirst.equals(studentSecond));
    }
}
