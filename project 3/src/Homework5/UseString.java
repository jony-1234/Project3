package Homework5;

public class UseString {

	
		

			private final static Object floatVar = null;
			private final static Object intVar = 23;
			private final static Object stringVar = "jony";

			public static void main(String[] args1) {
				
						String text = "I am a java developer";
						System.out.println(text.toUpperCase());
						System.out.println(text.toLowerCase());
						System.out.println(text.indexOf('e'));
						System.out.println(text.length());
						System.out.println(text.substring(4));
						System.out.println(text.trim());
						System.out.println(text.charAt(2));
						System.out.println(text.isEmpty());
						System.out.println(text.codePointAt(3));
						System.out.println(text.codePointBefore(3));
						System.out.println(text.hashCode());
						System.out.println(text.concat(" jony"));
						System.out.println(text.valueOf(4));
						System.out.println(text.lastIndexOf(5));
						int len=text.length();
						System.out.println("length is: "+len);
						String kaf="is your ";
						System.out.println("what "+kaf+"name");
						String fs;
						fs = String.format("The value of the float variable is " +
						                   "%f, while the value of the integer " +
						                   "variable is %d, and the string " +
						                   "is %s",floatVar, intVar, stringVar);
						System.out.println(fs);
						System.out.printf("The value of the float variable is " +
				                  "%f, while the value of the integer " +
				                  "variable is %d, and the string " +
				                  "is %s", floatVar, intVar, stringVar);
			}

	}


