package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverTest {

	public static void main(String[] args) throws IOException {
//		크롤링(crawling)
		
		int pages = 5;
		
		for(int i = 1; i < pages; i++) {
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=249&sid1=102&date=20220502&page=" + i;
			
			Document doc = Jsoup.connect(url).get(); //예외처리 안하면 빨간줄 뜸
//			System.out.println(doc);
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
			Element element = elements.get(0);
//			System.out.println(element);
			
//			배열을 연상시킬 것
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");
//			System.out.println(photoElements);
			
			for(int j = 0; j < photoElements.size(); j++) {		
//				1차 필터링
				Element articleElement = photoElements.get(j);
//				System.out.println(articleElement);
				
//				2차 필터링
				Elements aElements = articleElement.select("a");
				Element aElement = aElements.get(0);
//				System.out.println(aElements);
				
//				기사들의 링크만 추출
				String newsUrl = aElement.attr("href");
//				System.out.println(newsUrl);
				
//				기사에 첨부된 이미지들의 링크만 추출
				Element imgElement = aElement.select("img").get(0);
				String imgUrl = imgElement.attr("src");
//				System.out.println(imgUrl);
				
//				기사들의 제목만 추출
				String title = imgElement.attr("alt");
//				System.out.println(title);
				
//				기사들의 내용만 추출
				Document detailDoc = Jsoup.connect(newsUrl).get();
				Element contentElement = detailDoc.getElementById("dic_area");
//				System.out.println(contentElement);
				String content = contentElement.text(); //html tag들을 제거해줌.
				System.out.println(content);
				
				System.out.println();
			} //end of for j
		} //end of for i
	}//end of main
}
