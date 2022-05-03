interface Parseable { //구문 분석 작업 수행
	public abstract void parse(String fileName);
}

class ParserManager { //return type = Parseable interface
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
//		구문분석작업을 수행하는 코드는 알아서 적으시오.
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
//		22.
		System.out.println(fileName + "- HTML parsing completed.");
	}
}

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document1.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
