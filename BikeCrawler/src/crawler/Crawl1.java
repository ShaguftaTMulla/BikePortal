package crawler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//public String NewsMethod()
		{
			
		try {

			Document doc,doc1;
			doc = Jsoup.connect("http://www.yamaha-motor-india.com/news-latest.html").get();
	
			List<String> News=new ArrayList<String>();
			
		
			Elements newsHeadlines=doc.select("div#news-carousel");
			Elements news1=newsHeadlines.select("div.news-item");
			Elements titles=news1.select("h2.title");
			Elements newsbox=news1.select("p");
				for(int i=0;i<5;i++)
				{
					Element news2=news1.select("a[href]").get(i);
					Element title=titles.select("h2.title").get(i);
					Element newsBoxx=newsbox.select("p").get(i);
					//News.add(news2.attr("href"));
				//	News.add(title.text());
				//	News.add(newsBoxx.text());
					System.out.println(news2.attr("href"));
				}
			System.out.println(News);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
		}
}
	



