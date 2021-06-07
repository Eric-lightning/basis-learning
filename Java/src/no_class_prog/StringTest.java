class StringTest{
    public static void main(String[] args){

		int intd = 0;
		int byted = 0;
		char chard = '0';
        String str0 = "0";
        String str1 = "0";
        String str2 = new String("0");
		String str3 = String.valueOf(chard);
		String str4 = String.valueOf(intd);
		String str5 = String.valueOf(intd);
		String str6 = String.valueOf(byted);

        System.out.println("intd :"+intd+" <- DEFINE INT");
        System.out.println("byted:"+byted+" <- DEFINE BYTE");
        System.out.println("chard:"+chard+" <- DEFINE CHAR");
        System.out.println("---------------------");
        System.out.println("str0:"+str0+" <- DEFINE STRING");
        System.out.println("str1:"+str1+" <- DEFINE STRING");
        System.out.println("str2:"+str2+" <- DEFINE STRING");
        System.out.println("str3:"+str3+" <- CONVERT FROM CHAR 'chard'");
        System.out.println("str4:"+str4+" <- CONVERT FROM INT 'intd'");
        System.out.println("str5:"+str5+" <- CONVERT FROM INT 'intd'");
        System.out.println("str6:"+str6+" <- CONVERT FROM BYTE 'byted'");
        System.out.println("---------------------");
        System.out.println("intd == byted     : "+(intd == byted));
        System.out.println("intd == chard     : "+(intd == chard));
        System.out.println("str0 == str1      : "+(str0 == str1));
        System.out.println("str1 == str2      : "+(str1 == str2));
        System.out.println("str1 == str3      : "+(str1 == str3));
        System.out.println("str1 == str4      : "+(str1 == str4));
        System.out.println("str4 == str5      : "+(str4 == str5));
        System.out.println("str4 == str6      : "+(str4 == str6));
        System.out.println("str1 equals str3  : "+(str1.equals(str3)));
    }
}
