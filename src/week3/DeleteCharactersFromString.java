package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		println(removeAllOccurrences("This is a test", 't'));
		println(removeAllOccurrences("Summer is here!", 'e'));
		println(removeAllOccurrences("---0---", '-'));
	}
	public String removeAllOccurrences (String str, char ch) {
		 return str.replace(String.valueOf(ch), "");
	}
	
}
